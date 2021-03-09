package com.csu.ed3d.persistence;

import com.csu.ed3d.domain.KeyPoint;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KeyPointDAO {

    List<KeyPoint> findKeyPointsByCourseId(Integer course_id);
}
