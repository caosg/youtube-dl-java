package com.caosg.ytbdl.service.mapper;

import com.caosg.ytbdl.crawler.dto.VideoInfo;
import com.caosg.ytbdl.domain.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * Created by shuguangcao on 2017/7/10.
 */
@Mapper
public interface VideoMapper {

    VideoMapper MAPPER = Mappers.getMapper(VideoMapper.class);

    @Mappings({
        @Mapping(target = "id",ignore = true),
        @Mapping(source = "id",target = "vid")
    })
    Video toVideo(VideoInfo videoInfo);
}
