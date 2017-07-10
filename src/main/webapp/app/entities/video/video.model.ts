import { BaseEntity } from './../../shared';

export class Video implements BaseEntity {
    constructor(
        public id?: number,
        public extractor?: string,
        public protocol?: string,
        public uploader?: string,
        public duration?: number,
        public vid?: string,
        public format?: string,
        public title?: string,
        public url?: string,
        public width?: number,
        public height?: number,
        public ext?: string,
        public filesize?: number,
        public thumbnail?: string,
        public tags?: string,
        public webpageUrl?: string,
    ) {
    }
}
