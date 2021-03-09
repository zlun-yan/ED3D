package com.csu.ed3d.persistence;

import com.csu.ed3d.domain.VideoSource;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoSourceDAO {

    VideoSource findVideoSourceByVideoId(Integer id);
}
