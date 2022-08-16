package com.sun.config;

import com.sun.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private final static SessionFactory FACTORY ;
    static{
        Configuration config  =  new Configuration();
        config
                .setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect")
                .setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver")
                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/demo")
                .setProperty("hibernate.connection.username","root")
                .setProperty("hibernate.connection.password","Huyen.26122001")
                .setProperty("hibernate.show_sql","true")
                .setProperty("hibernate.hbm2ddl.auto","update")
                .addAnnotatedClass(Type.class)
                .addAnnotatedClass(TypeBook.class)
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(HistoryDetail.class)
                .addAnnotatedClass(Histories.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Comment.class)
                ;
        FACTORY = config.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return FACTORY;
    }
}
