import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { VideoComponent } from './video.component';
import { VideoDetailComponent } from './video-detail.component';
import { VideoPopupComponent } from './video-dialog.component';
import { VideoDeletePopupComponent } from './video-delete-dialog.component';

import { Principal } from '../../shared';

@Injectable()
export class VideoResolvePagingParams implements Resolve<any> {

    constructor(private paginationUtil: JhiPaginationUtil) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
        const page = route.queryParams['page'] ? route.queryParams['page'] : '1';
        const sort = route.queryParams['sort'] ? route.queryParams['sort'] : 'id,asc';
        return {
            page: this.paginationUtil.parsePage(page),
            predicate: this.paginationUtil.parsePredicate(sort),
            ascending: this.paginationUtil.parseAscending(sort)
      };
    }
}

export const videoRoute: Routes = [
    {
        path: 'video',
        component: VideoComponent,
        resolve: {
            'pagingParams': VideoResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'video/:id',
        component: VideoDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'video/parse/:videoUrl',
        component: VideoDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const videoPopupRoute: Routes = [
    {
        path: 'video-new',
        component: VideoPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'video/:id/edit',
        component: VideoPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'video/:id/delete',
        component: VideoDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'youtubedlApp.video.home.title'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
