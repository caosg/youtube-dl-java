/**
 * Created by shuguangcao on 2017/7/11.
 */
import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiAlertService } from 'ng-jhipster';

import { Video } from './video.model';
import { VideoPopupService } from './video-popup.service';

@Component({
    selector: 'jhi-video-play',
    templateUrl: './video-play.component.html'
})
export class VideoPlayComponent implements OnInit {

    video: Video;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService
    ) {
    }

    ngOnInit() {

    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}

@Component({
    selector: 'jhi-video-play-popup',
    template: ''
})
export class VideoPlayPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private videoPopupService: VideoPopupService,
        private alertService: JhiAlertService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.videoPopupService
                    .play(VideoPlayComponent, params['id']);
            } else {
               this.alertService.error('video.error.playIsNull');
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
