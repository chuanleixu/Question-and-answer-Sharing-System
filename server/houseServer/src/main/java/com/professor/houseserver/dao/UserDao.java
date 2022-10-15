package com.professor.houseserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.professor.houseserver.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author xuchuanlei
 * @since 2022/8/13-14:30
 **/
@Repository
public interface UserDao extends BaseMapper<User> {
}
