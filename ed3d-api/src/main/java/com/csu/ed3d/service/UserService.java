package com.csu.ed3d.service;

import com.csu.ed3d.domain.User;

public interface UserService {

    User login(String loginName, String loginPwd);
}
