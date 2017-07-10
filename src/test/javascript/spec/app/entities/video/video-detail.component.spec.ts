/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async, inject } from '@angular/core/testing';
import { OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils, JhiDataUtils, JhiEventManager } from 'ng-jhipster';
import { YoutubedlTestModule } from '../../../test.module';
import { MockActivatedRoute } from '../../../helpers/mock-route.service';
import { VideoDetailComponent } from '../../../../../../main/webapp/app/entities/video/video-detail.component';
import { VideoService } from '../../../../../../main/webapp/app/entities/video/video.service';
import { Video } from '../../../../../../main/webapp/app/entities/video/video.model';

describe('Component Tests', () => {

    describe('Video Management Detail Component', () => {
        let comp: VideoDetailComponent;
        let fixture: ComponentFixture<VideoDetailComponent>;
        let service: VideoService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [YoutubedlTestModule],
                declarations: [VideoDetailComponent],
                providers: [
                    JhiDateUtils,
                    JhiDataUtils,
                    DatePipe,
                    {
                        provide: ActivatedRoute,
                        useValue: new MockActivatedRoute({id: 123})
                    },
                    VideoService,
                    JhiEventManager
                ]
            }).overrideTemplate(VideoDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(VideoDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(VideoService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
            // GIVEN

            spyOn(service, 'find').and.returnValue(Observable.of(new Video(10)));

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.find).toHaveBeenCalledWith(123);
            expect(comp.video).toEqual(jasmine.objectContaining({id: 10}));
            });
        });
    });

});
