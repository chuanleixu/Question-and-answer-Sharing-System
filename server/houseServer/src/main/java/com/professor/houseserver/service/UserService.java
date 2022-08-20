package com.professor.houseserver.service;

import com.professor.houseserver.domain.wxresponse.Code2Session;

public interface UserService {
    Code2Session login(String jsCode);
}
