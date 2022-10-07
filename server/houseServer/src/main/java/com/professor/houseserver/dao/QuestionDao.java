package com.professor.houseserver.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.professor.houseserver.domain.Question;
import com.professor.houseserver.domain.vo.QuestionAnswerDTO;
import com.professor.houseserver.domain.vo.QuestionQueryVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xuchuanlei
 * @since 2022/8/20-15:00
 **/
@Repository
public interface QuestionDao extends BaseMapper<Question> {

    Page<QuestionAnswerDTO> selectPage(@Param("page") Page<QuestionAnswerDTO> page, QuestionQueryVo questionQueryVo);
}
