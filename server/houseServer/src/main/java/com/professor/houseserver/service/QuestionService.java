package com.professor.houseserver.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import com.professor.houseserver.domain.Question;
import com.professor.houseserver.domain.vo.QuestionAnswerDTO;
import com.professor.houseserver.domain.vo.QuestionQueryVo;

public interface QuestionService extends IService<Question> {


    Page<QuestionAnswerDTO> selectPage(Page<QuestionAnswerDTO> teacherPage, QuestionQueryVo questionQueryVo);
}
