package com.professor.houseserver.service.impl;

import cn.hutool.json.JSONUtil;
import com.professor.houseserver.domain.wxresponse.Code2Session;
import com.professor.houseserver.properties.WXProperties;
import com.professor.houseserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author xuchuanlei
 * @since 2022/8/13-14:29
 **/
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private WXProperties wxProperties;

    @Override
    public Code2Session login(String jsCode) {

        log.info("携带用户临时code，换取临时密钥");
        String result = restTemplate.getForObject(wxProperties.getApiUrl()+"/sns/jscode2session?appid="+wxProperties.getAppId()+
                "&secret="+wxProperties.getSecret()+"&js_code="+jsCode+"&grant_type=authorization_code",String.class);
            log.info(result);
        Code2Session code2Session = JSONUtil.toBean(result, Code2Session.class);

        return code2Session;
    }
}
