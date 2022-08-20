package com.professor.houseserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.professor.houseserver.dao.QuestionDao;
import com.professor.houseserver.domain.Question;
import com.professor.houseserver.service.QuestionService;
import org.springframework.stereotype.Service;

/**
 * @author xuchuanlei
 * @since 2022/8/20-14:54
 **/
@Service
public class QuestionServiceImpl  extends ServiceImpl<QuestionDao, Question> implements QuestionService {

}
