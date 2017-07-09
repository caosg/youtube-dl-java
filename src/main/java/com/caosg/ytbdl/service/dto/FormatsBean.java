package com.caosg.ytbdl.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by csg on 2017/7/9.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormatsBean {
    @JsonProperty("protocol")
    private String protocol; // FIXME check this code
    private String format;
    private String url;
    @JsonProperty("http_headers")
    @JsonIgnore
    private HttpHeadersBean httpHeaders;
    private int height;
    private int width;
    private String ext;
    private int filesize;
    @JsonProperty("format_id")
    private String formatId;

    public String getProtocol() {
        return protocol;
    }

    public void set_$Protocol258(String protocol) {
        this.protocol = protocol;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpHeadersBean getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(HttpHeadersBean httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    @Override
    public String toString() {
        return "FormatsBean{" +
            "protocol='" + protocol + '\'' +
            ", format='" + format + '\'' +
            ", url='" + url + '\'' +
            ", httpHeaders=" + httpHeaders +
            ", height=" + height +
            ", width=" + width +
            ", ext='" + ext + '\'' +
            ", filesize=" + filesize +
            ", formatId='" + formatId + '\'' +
            '}';
    }
}
