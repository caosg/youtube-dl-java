package com.caosg.ytbdl.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by csg on 2017/7/9.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThumbnailsBean {
    /**
     * url : https://r1.ykimg.com/0541040859073A661F8869289B0A987B
     * id : 0
     */

    private String url;
    private String id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ThumbnailsBean{" +
            "url='" + url + '\'' +
            ", id='" + id + '\'' +
            '}';
    }
}
