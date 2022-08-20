package com.professor.houseserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.professor.houseserver.domain.Question;
import org.springframework.stereotype.Repository;

/**
 * @author xuchuanlei
 * @since 2022/8/20-15:00
 **/
@Repository
public interface QuestionDao extends BaseMapper<Question> {
}
