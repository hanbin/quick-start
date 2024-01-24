package cn.com.hanbinit.quickstart.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 基础权限校验
 * @author han_bin@outlook.com
 * @Description TODO
 */
@Slf4j
@Service
public class AuthService {

    /**
     * 校验token
     * @param token
     * @return
     */
    public Boolean validate(String token){
        if("test_token".equals(token)){
            return true;
        }
        return true;
    }
}
