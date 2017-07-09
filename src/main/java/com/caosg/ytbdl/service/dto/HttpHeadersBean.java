package com.caosg.ytbdl.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by csg on 2017/7/9.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpHeadersBean {
    @JsonProperty("Accept-Language")
    private String acceptLanguage; // FIXME check this code
    @JsonProperty("Accept-Encoding")
    private String acceptEncoding;
    private String accept;
    @JsonProperty("User-Agent")
    private String userAgent;
    @JsonProperty("Accept-Charset")
    private String acceptCharset;
    private String cookie;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String accept) {
        this.acceptLanguage = acceptLanguage;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getAcceptCharset() {
        return acceptCharset;
    }

    public void setAcceptCharset(String acceptCharset) {
        this.acceptCharset = acceptCharset;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @Override
    public String toString() {
        return "HttpHeadersBean{" +
            "acceptLanguage='" + acceptLanguage + '\'' +
            ", acceptEncoding='" + acceptEncoding + '\'' +
            ", accept='" + accept + '\'' +
            ", userAgent='" + userAgent + '\'' +
            ", acceptCharset='" + acceptCharset + '\'' +
            ", cookie='" + cookie + '\'' +
            '}';
    }
}
