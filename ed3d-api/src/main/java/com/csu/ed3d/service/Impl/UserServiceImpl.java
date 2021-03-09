package com.csu.ed3d.service.Impl;

import com.csu.ed3d.domain.User;
import com.csu.ed3d.persistence.UserDAO;
import com.csu.ed3d.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User login(String loginName, String loginPwd) {
        User loginUser = userDAO.findByLoginName(loginName);

        if (loginUser == null) {
            System.out.println("该用户【" + loginName + "】不存在");

            return null;
        } else {
            if (loginUser.getLogin_pwd().equals(loginPwd)) {
                return loginUser;
            }
        }

        System.out.println("该用户【" + loginName + "】密码错误");
        return null;
    }
}
