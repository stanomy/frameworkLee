package com.sy.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by yy on 2017/8/31.
 */
@WebServlet(urlPatterns = "/druid/*",
    initParams = {
            @WebInitParam(name = "allow",value = "127.0.0.1"),//ip白名单
            @WebInitParam(name = "loginUsername",value ="sy" ),
            @WebInitParam(name="loginPassword",value = "sy"),
            @WebInitParam(name = "resetEnable",value = "false")//禁用页面"rest all"功能
    })
public class StatViewServlet extends com.alibaba.druid.support.http.StatViewServlet {
}
