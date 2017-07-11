import { Component, OnInit, OnDestroy } from '@angular/core';
import { Location } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Video } from './video.model';
import { VideoService } from './video.service';

@Component({
    selector: 'jhi-video-detail',
    templateUrl: './video-detail.component.html'
})
export class VideoDetailComponent implements OnInit, OnDestroy {

    video: Video;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private videoService: VideoService,
        private location: Location,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {

        this.subscription = this.route.params.subscribe((params) => {
                if (this.location.path().match('parse')) {
                    this.parseVideo(params['videoUrl']);
                } else {
                    this.load(params['id']);
                }
        });

        this.registerChangeInVideos();
    }

    load(id) {
        this.videoService.find(id).subscribe((video) => {
            this.video = video;
        });
    }

    parseVideo(videoUrl) {
        this.videoService.parseVideo(videoUrl).subscribe((video) => {
            this.video = video;
        });
    }

    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInVideos() {
        this.eventSubscriber = this.eventManager.subscribe(
            'videoListModification',
            (response) => this.load(this.video.id)
        );
    }
}
