package com.csu.ed3d.persistence;

import com.csu.ed3d.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {

    User findByLoginName(String loginName);
}
