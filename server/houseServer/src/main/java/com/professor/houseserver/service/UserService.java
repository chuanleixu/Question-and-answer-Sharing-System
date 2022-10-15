package com.professor.houseserver.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.professor.houseserver.domain.User;
import com.professor.houseserver.domain.wxresponse.Code2Session;

import java.util.List;

public interface UserService extends IService<User> {
    Code2Session login(String jsCode);

    List<User> listQuesd();

}
