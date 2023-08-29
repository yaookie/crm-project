package com.yaookie.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yaookie
 * @date 2023/08/22 16:46
 */
@Controller
public class IndexController {
    /**
     * 返回首页
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
