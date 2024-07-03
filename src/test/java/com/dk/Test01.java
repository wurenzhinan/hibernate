/*
 *   Copyright © 2018 重庆市信息通信咨询设计院有限公司版权所有.
 *
 *   项目名称：studying
 *   文件名称：com.dk.Test01
 *
 *   创建人：  LI WEI
 *   创建日期：2024/7/3
 *
 *   版权描述：此软件未经重庆市信息通信咨询设计院有限公司许可，严禁发布、传播、使用.
 *   公司地址：重庆市九龙坡区科园四路257号,400041.
 *
 */


package com.dk;

import com.dk.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.List;

/**
 * 类描述： Test01
 **/
public class Test01 {
    public static void main(String[] args) {
        //创建Hibernate核心类
        Configuration cfg=new Configuration();
        //读取核心配置文件
        cfg.configure("hibernate.cfg.xml");
        //创建session工厂
        SessionFactory sf=cfg.buildSessionFactory();
        //获取session
        Session session=sf.openSession();
        //开启事务
        Transaction ts=session.beginTransaction();
        //操作数据
        //添加
        Student student=new Student();
        student.setName("小秦");
        student.setScore(99.2);
        session.save(student);
        //查询
//        String sql01="from Student";
//        Query query01= (Query) session.createQuery(sql01);
//        List<Student> list01=query01.list();
//        list01.forEach(System.out::println);

        //提交
        ts.commit();
        //关闭session
        session.close();
    }
}