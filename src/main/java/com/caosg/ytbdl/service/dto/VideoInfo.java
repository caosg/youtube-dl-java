package com.caosg.ytbdl.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by csg on 2017/7/9.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoInfo {

    @JsonProperty("display_id")
    private String displayId; // FIXME check this code
    private String extractor;
    private String protocol;
    @JsonProperty("_filename")
    private String Filename;
    @JsonProperty("requested_subtitles")
    private Object requestedSubtitles;
    private int height;
    private String uploader;
    private int duration;
    @JsonProperty("format_id")
    private String formatId;
    private String id;
    @JsonProperty("http_headers")
    @JsonIgnore
    private HttpHeadersBean httpHeaders;
    private Object playlist;
    private String title;
    private String url;
    @JsonProperty("extractor_key")
    private String extractorKey;
    private String format;
    @JsonProperty("uploader_id")
    private String uploaderId;
    private int width;
    private String ext;
    @JsonProperty("uploader_url")
    private String uploaderUrl;
    private int filesize;
    @JsonProperty("webpage_url")
    private String webpageUrl;
    private String fulltitle;
    private String thumbnail;
    @JsonProperty("webpage_url_basename")
    private String urlBasename;
    @JsonProperty("playlist_index")
    @JsonIgnore
    private Object playlistIndex;
    private List<String> tags;
    private List<ThumbnailsBean> thumbnails;
    private List<FormatsBean> formats;

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getExtractor() {
        return extractor;
    }

    public void setExtractor(String extractor) {
        this.extractor = extractor;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    public Object getRequestedSubtitles() {
        return requestedSubtitles;
    }

    public void setRequestedSubtitles(Object requestedSubtitles) {
        this.requestedSubtitles = requestedSubtitles;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HttpHeadersBean getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeadersBean httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public Object getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Object playlist) {
        this.playlist = playlist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getExtractorKey() {
        return extractorKey;
    }

    public void setExtractorKey(String extractorKey) {
        this.extractorKey = extractorKey;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getUploaderUrl() {
        return uploaderUrl;
    }

    public void setUploaderUrl(String uploaderUrl) {
        this.uploaderUrl = uploaderUrl;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public String getWebpageUrl() {
        return webpageUrl;
    }

    public void setWebpageUrl(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    public String getFulltitle() {
        return fulltitle;
    }

    public void setFulltitle(String fulltitle) {
        this.fulltitle = fulltitle;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrlBasename() {
        return urlBasename;
    }

    public void setUrlBasename(String urlBasename) {
        this.urlBasename = urlBasename;
    }

    public Object getPlaylistIndex() {
        return playlistIndex;
    }

    public void setPlaylistIndex(Object playlistIndex) {
        this.playlistIndex = playlistIndex;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<ThumbnailsBean> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<ThumbnailsBean> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public List<FormatsBean> getFormats() {
        return formats;
    }

    public void setFormats(List<FormatsBean> formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
            "displayId='" + displayId + '\'' +
            ", extractor='" + extractor + '\'' +
            ", protocol='" + protocol + '\'' +
            ", Filename='" + Filename + '\'' +
            ", requestedSubtitles=" + requestedSubtitles +
            ", height=" + height +
            ", uploader='" + uploader + '\'' +
            ", duration=" + duration +
            ", formatId='" + formatId + '\'' +
            ", id='" + id + '\'' +
            ", httpHeaders=" + httpHeaders +
            ", playlist=" + playlist +
            ", title='" + title + '\'' +
            ", url='" + url + '\'' +
            ", extractorKey='" + extractorKey + '\'' +
            ", format='" + format + '\'' +
            ", uploaderId='" + uploaderId + '\'' +
            ", width=" + width +
            ", ext='" + ext + '\'' +
            ", uploaderUrl='" + uploaderUrl + '\'' +
            ", filesize=" + filesize +
            ", webpageUrl='" + webpageUrl + '\'' +
            ", fulltitle='" + fulltitle + '\'' +
            ", thumbnail='" + thumbnail + '\'' +
            ", urlBasename='" + urlBasename + '\'' +
            ", playlistIndex=" + playlistIndex +
            ", tags=" + tags +
            ", thumbnails=" + thumbnails +
            ", formats=" + formats +
            '}';
    }
}
