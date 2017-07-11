import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { Video } from './video.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class VideoService {

    private resourceUrl = 'api/videos';

    constructor(private http: Http) { }

    create(video: Video): Observable<Video> {
        const copy = this.convert(video);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            return res.json();
        });
    }

    update(video: Video): Observable<Video> {
        const copy = this.convert(video);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            return res.json();
        });
    }

    find(id: number): Observable<Video> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            return res.json();
        });
    }

    parseVideo(videoUrl: String): Observable<Video> {
        return this.http.get(`${this.resourceUrl}/parse`, { params: { url: `${videoUrl}` } }).map((res: Response) => {
            return res.json();
        });
    }

    query(req?: any): Observable<ResponseWrapper> {
        const options = createRequestOption(req);
        return this.http.get(this.resourceUrl, options)
            .map((res: Response) => this.convertResponse(res));
    }

    delete(id: number): Observable<Response> {
        return this.http.delete(`${this.resourceUrl}/${id}`);
    }

    private convertResponse(res: Response): ResponseWrapper {
        const jsonResponse = res.json();
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }

    private convert(video: Video): Video {
        const copy: Video = Object.assign({}, video);
        return copy;
    }
}
