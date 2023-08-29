package com.yaookie.crm.settings.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yaookie
 * @date 2023/08/22 17:14
 */
@Controller
public class UserController {
    /**
     * url要和controller方法处理完请求之后，响应信息 返回的页面的资源目录 保持一致
     * @return
     */
    @RequestMapping("/settings/qx/user/toLogin.do")
    public String toLogin() {
        return "/settings/qx/user/login";
    }
}
