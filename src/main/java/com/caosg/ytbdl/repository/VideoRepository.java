package com.caosg.ytbdl.repository;

import com.caosg.ytbdl.domain.Video;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;

import java.util.Optional;


/**
 * Spring Data JPA repository for the Video entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VideoRepository extends JpaRepository<Video,Long> {
   Optional<Video> findOneBywebpageUrl(String webpageUrl);
}
