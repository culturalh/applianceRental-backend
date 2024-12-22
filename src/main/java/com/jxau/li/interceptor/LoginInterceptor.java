package com.jxau.li.interceptor;

import cn.hutool.core.util.ObjectUtil;
//import com.example.common.Constants;
//import com.example.common.enums.ResultCodeEnum;
//import com.example.common.enums.RoleEnum;
//import com.example.entity.Account;
//import com.example.exception.CustomException;
//import com.example.mapper.AdminMapper;
//import com.example.mapper.UserMapper;
//import com.example.utils.JwtUtil;
//import com.example.utils.ThreadLocalUtil;
import com.jxau.li.common.result.Constants;
import com.jxau.li.enums.ResultCodeEnum;
import com.jxau.li.enums.RoleEnum;
import com.jxau.li.exception.CustomException;
import com.jxau.li.utils.JwtUtil;
import com.jxau.li.utils.ThreadLocalUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * jwt拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

//    @Resource
//    private AdminMapper adminMapper;
//    @Resource
//    private UserMapper userMapper;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//        // 1. 从http请求的header中获取token
//        String token = request.getHeader(Constants.TOKEN);
//        if (ObjectUtil.isEmpty(token)) {
//            // 如果没拿到，从参数里再拿一次
//            token = request.getParameter(Constants.TOKEN);
//        }
//        // 2. 开始执行认证
//        if (ObjectUtil.isEmpty(token)) {
//            throw new CustomException(ResultCodeEnum.TOKEN_INVALID_ERROR);
//        }
//        Account account = null;
//        try {
            // 解析token获取存储的数据
//            Map<String, Object> claims = JwtUtil.getJSONObject(token);
//            ThreadLocalUtil.set(claims);
//            String role = claims.get("role").toString();
//            String userId = claims.get("userId").toString();
//            if (RoleEnum.ROLE_ADMIN.getMSG().equals(role)) {
//                account = adminMapper.selectById(Integer.valueOf(userId));
//            } else if (RoleEnum.ROLE_USER.getMSG().equals(role)) {
//                account = userMapper.selectById(Integer.valueOf(userId));
//            }
//        } catch (Exception e) {
//            throw new CustomException(ResultCodeEnum.TOKEN_CHECK_ERROR);
//        }
//        if (ObjectUtil.isNull(account)) {
//            throw new CustomException(ResultCodeEnum.USER_NOT_EXIST_ERROR);
//        }
//        return true;
//    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtil.remove();
    }
}