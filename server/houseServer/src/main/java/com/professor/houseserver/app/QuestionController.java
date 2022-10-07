package com.professor.houseserver.app;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.professor.houseserver.domain.Question;
import com.professor.houseserver.domain.vo.QuestionAnswerDTO;
import com.professor.houseserver.domain.vo.QuestionQueryVo;
import com.professor.houseserver.result.R;
import com.professor.houseserver.service.QuestionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * @author xuchuanlei
 * @since 2022/8/20-14:53
 **/
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Resource
    private QuestionService questionService;

    @ApiOperation(value = "提问列表",notes = "根据某种排序列出问题的相关列表")
    @GetMapping("list/{page}/{limit}")
    public R listPage(@ApiParam(value = "当前页码", required = true) @PathVariable Long page,
                      @ApiParam(value = "每页记录数", required = true) @PathVariable Long limit,
                      @ApiParam("问题列表查询对象") QuestionQueryVo questionQueryVo){


        Page<QuestionAnswerDTO> questionPage = new Page<>(page, limit);

        Page<QuestionAnswerDTO> questionAnswerDTOPage = questionService.selectPage(questionPage, questionQueryVo);

        return R.ok().setData(questionAnswerDTOPage);
    }


    @ApiOperation(value = "新增提问",notes = "用户新增提问问题")
    @PostMapping("save")
    public R save(@RequestBody Question question){

        questionService.save(question);

        return R.ok();
    }

    @ApiOperation(value = "删除提问",notes = "删除问题")
    @DeleteMapping("remove")
    public R remove(Long [] ids){

        questionService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }
}
