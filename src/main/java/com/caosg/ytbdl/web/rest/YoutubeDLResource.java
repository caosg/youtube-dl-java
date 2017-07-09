package com.caosg.ytbdl.web.rest;

import com.caosg.ytbdl.service.YoutubeDL;
import com.caosg.ytbdl.service.YoutubeDLException;
import com.caosg.ytbdl.service.dto.VideoInfo;
import com.codahale.metrics.annotation.Timed;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by csg on 2017/7/9.
 */
@RestController
@RequestMapping("/api/youtube-dl")
public class YoutubeDLResource {

    private final Logger log = LoggerFactory.getLogger(YoutubeDLResource.class);

    @GetMapping("/video-info")
    @Timed
    public ResponseEntity<VideoInfo> getVideoInfo(@RequestParam("url")String videoUrl){

        log.debug("REST request to get video info by url : {}", videoUrl);
        VideoInfo videoInfo = null;
        try {
            videoInfo = YoutubeDL.getVideoInfo(videoUrl);
        } catch (YoutubeDLException e) {
            log.error(" get video info was error:{}",e.getMessage());
        }
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(videoInfo));

    }
}
