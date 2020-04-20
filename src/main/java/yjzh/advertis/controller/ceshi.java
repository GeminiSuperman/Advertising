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

    /*user审核列表--预约审核auditpublish*/
    @RequestMapping("/audit")
    public String audit() {
        return "/useraudit/auditappointment";
    }

    /*user审核列表--发布审核*/
    @RequestMapping("/auditpublish")
    public String auditpublish() {
        return "/useraudit/auditpublish";
    }
    /*user审核列表--发布审核*/
    @RequestMapping("/auditopen")
    public String auditopen() {
        return "/useraudit/auditopen";
    }

    /*admin审核列表*/
    @RequestMapping("/ADaudit")
    public String adminaudit() {
        return "/adminaudit/adminaudit";
    }

    /*admin审核推广列表adminlocation.html*/
    @RequestMapping("/generalize")
    public String generalize() {
        return "/adminaudit/generalize";
    }

    /*admin广告位置管理列表*/
    @RequestMapping("/adminlocation")
    public String adminlocation() {
        return "/locationdetails/adminlocation";
    }

    /*user广告位置管理列表*/
    @RequestMapping("/userlocation")
    public String userlocation() {
        return "/locationdetails/userlocation";
    }

    /*数据中心--收入报表*/
    @RequestMapping("/incomereport")
    public String incomereport() {
        return "/idc/incomereport";
    }

    /*数据中心--激活报表userreport*/
    @RequestMapping("/activatereport")
    public String activatereport() {
        return "/idc/activatereport";
    }

    /*数据中心--用户报表*/
    @RequestMapping("/userreport")
    public String userreport() {
        return "/idc/userreport";
    }

    /*数据中心--广告位置排行*/
    @RequestMapping("/locationranking")
    public String locationranking() {
        return "/idc/locationranking";
    }


}
