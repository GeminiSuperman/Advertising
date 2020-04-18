package yjzh.advertis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ceshi {

    /*进入主页面的路径*/
    @RequestMapping("/head")
    public String head() {
        return "/head";
    }

    /*首页*/
    @RequestMapping("/home")
    public String homepage() {
        return "/home/homepage";
    }

    /*广告发布*/
    @RequestMapping("/adissue")
    public String adissue() {
        return "/admanagement/adissue";
    }

    /*创建广告*/
    @RequestMapping("/adestablish")
    public String adestablish() {
        return "/admanagement/adestablish";
    }

    /*我的创建*/
    @RequestMapping("/myestablish")
    public String myestablish() {
        return "/admanagement/myestablish";
    }

    /*我的创建--单独页面*/
    @RequestMapping("/myestablishvie")
    public String myestablishvie() {
        return "/utilview/myestablishvie";
    }

    /*文件管理*/
    @RequestMapping("/filemanagement")
    public String filemanagement() {
        return "/filemanagement/filemanagement";
    }

    /*user审核列表*/
    @RequestMapping("/audit")
    public String audit() {
        return "/useraudit/audit";
    }

    /*admin审核列表*/
    @RequestMapping("/ADaudit")
    public String adminaudit() {
        return "/adminaudit/adminaudit";
    }

    /*admin审核推广列表*/
    @RequestMapping("/generalize")
    public String generalize() {
        return "/adminaudit/generalize";
    }

}
