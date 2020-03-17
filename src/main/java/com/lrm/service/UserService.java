package com.lrm.service;

import com.lrm.po.User;

public interface UserService {
    User CheckUser(String username,String password);
}
