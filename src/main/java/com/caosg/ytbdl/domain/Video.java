package com.caosg.ytbdl.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A Video.
 */
@Entity
@Table(name = "video")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 40)
    @Column(name = "extractor", length = 40, nullable = false)
    private String extractor;

    @Column(name = "protocol")
    private String protocol;

    @Column(name = "uploader")
    private String uploader;

    @Column(name = "duration")
    private Float duration;

    @Column(name = "vid")
    private String vid;

    @Column(name = "format")
    private String format;

    @NotNull
    @Size(max = 255)
    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @Column(name = "url")
    private String url;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @NotNull
    @Size(max = 16)
    @Column(name = "ext", length = 16, nullable = false)
    private String ext;

    @Column(name = "filesize")
    private Long filesize;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Convert(converter = StringSetConverter.class)
    @Column(name = "tags")
    @JsonDeserialize(using = String2SetDeserializer.class)
    private Set<String> tags;

    @Column(name = "webpage_url",unique = true)
    private String webpageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExtractor() {
        return extractor;
    }

    public Video extractor(String extractor) {
        this.extractor = extractor;
        return this;
    }

    public void setExtractor(String extractor) {
        this.extractor = extractor;
    }

    public String getProtocol() {
        return protocol;
    }

    public Video protocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getUploader() {
        return uploader;
    }

    public Video uploader(String uploader) {
        this.uploader = uploader;
        return this;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public Float getDuration() {
        return duration;
    }

    public Video duration(Float duration) {
        this.duration = duration;
        return this;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getVid() {
        return vid;
    }

    public Video vid(String vid) {
        this.vid = vid;
        return this;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getFormat() {
        return format;
    }

    public Video format(String format) {
        this.format = format;
        return this;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public Video title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public Video url(String url) {
        this.url = url;
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getWidth() {
        return width;
    }

    public Video width(Integer width) {
        this.width = width;
        return this;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public Video height(Integer height) {
        this.height = height;
        return this;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getExt() {
        return ext;
    }

    public Video ext(String ext) {
        this.ext = ext;
        return this;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Long getFilesize() {
        return filesize;
    }

    public Video filesize(Long filesize) {
        this.filesize = filesize;
        return this;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public Video thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Set<String> getTags() {
        return tags;
    }

    public Video tags(Set<String> tags) {
        this.tags = tags;
        return this;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public String getWebpageUrl() {
        return webpageUrl;
    }

    public Video webpageUrl(String webpageUrl) {
        this.webpageUrl = webpageUrl;
        return this;
    }

    public void setWebpageUrl(String webpageUrl) {
        this.webpageUrl = webpageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Video video = (Video) o;
        if (video.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), video.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Video{" +
            "id=" + getId() +
            ", extractor='" + getExtractor() + "'" +
            ", protocol='" + getProtocol() + "'" +
            ", uploader='" + getUploader() + "'" +
            ", duration='" + getDuration() + "'" +
            ", vid='" + getVid() + "'" +
            ", format='" + getFormat() + "'" +
            ", title='" + getTitle() + "'" +
            ", url='" + getUrl() + "'" +
            ", width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            ", ext='" + getExt() + "'" +
            ", filesize='" + getFilesize() + "'" +
            ", thumbnail='" + getThumbnail() + "'" +
            ", tags='" + getTags() + "'" +
            ", webpageUrl='" + getWebpageUrl() + "'" +
            "}";
    }
}
