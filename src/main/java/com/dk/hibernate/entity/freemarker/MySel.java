/*
 *   Copyright © 2018 重庆市信息通信咨询设计院有限公司版权所有.
 *
 *   项目名称：studying
 *   文件名称：com.dk.hibernate.entity.freemarker.MySel
 *
 *   创建人：  LI WEI
 *   创建日期：2024/7/3
 *
 *   版权描述：此软件未经重庆市信息通信咨询设计院有限公司许可，严禁发布、传播、使用.
 *   公司地址：重庆市九龙坡区科园四路257号,400041.
 *
 */


package com.dk.hibernate.entity.freemarker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 类描述： MySel
 **/
@WebServlet("/se1")
public class MySel extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("msg","Hello FreeMarker!");
        req.getRequestDispatcher("template/index.ftl").forward(req,resp);
    }
}