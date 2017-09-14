package com.py.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * HelloController
 * 模板测试
 * @author pysasuke
 * @date 2017/9/13
 */
@Controller
public class HelloController {
    /**
     * 主页跳转
     *
     * @param map
     * @return
     */
    @ApiIgnore//api中不展示
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("host", "https://github.com/pysasuke");
        return "index";
    }

    /**
     * thymeleaf模板测试
     *
     * @param map
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/thymeleaf_test", method = RequestMethod.GET)
    public String thymeleaf_test(ModelMap map) {
        map.addAttribute("hello", "Hello Thymeleaf");
        return "thymeleaf_test";
    }

    /**
     * freemarker模板测试
     *
     * @param map
     * @return
     */
    @ApiIgnore
    @RequestMapping(value = "/freemarker_test", method = RequestMethod.GET)
    public String freemarker_test(ModelMap map) {
        map.addAttribute("hello", "Hello Freemarker");
        return "freemarker_test";
    }
}
