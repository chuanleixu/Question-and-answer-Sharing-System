package com.professor.houseserver.app;

import com.professor.houseserver.domain.wxresponse.Code2Session;
import com.professor.houseserver.result.R;
import com.professor.houseserver.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuchuanlei
 * @since 2022/8/13-14:17
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list")
    public R listAll(){

        return R.ok();
    }


    @ApiOperation(value = "微信验证登陆",notes = "根据临时登陆凭证code登陆")
    @GetMapping("login")
    public R login(@ApiParam(value = "临时登录凭证 code",required = true) @RequestParam("jsCode") String jsCode){

        Code2Session code2Session = userService.login(jsCode);
        return R.ok().setData(code2Session);

    }




}
