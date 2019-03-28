package com.cb.legou.controller;

import com.cb.legou.common.AjaxResult;
import com.cb.legou.domain.Star;
import com.cb.legou.service.IStarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * 这个就是用来发布服务的，然后把这个服务注册到服务中心
 */
@RestController
@RequestMapping("/plat")
public class StarController {

    @Autowired
    IStarService starServiceImpl;

    //这里使用restful风格来获取参数
    @RequestMapping(value = "/login", method = RequestMethod.POST)
//@HystrixCommand(fallbackMethod = "fallbackMethod")//这个是回调方法，就是在出错了之后，发生熔断，掉哪一个方法
    public AjaxResult login(@RequestBody Star star) {
        Star star1 = starServiceImpl.findByName(star);
        System.out.println(star1);
//这里判断，就是查的出来数据，并且从前台传来的名字不为空，密码不为空
        if (star1 != null && !StringUtils.isEmpty(star.getName()) && !StringUtils.isEmpty(star.getPassword())) {
            return AjaxResult.me().setMsg("成了");
        } else {
            return AjaxResult.me().setSuccess(false).setMsg("用户名或密码错误");
        }


    }


}
