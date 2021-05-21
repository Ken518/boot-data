package com.example.bootdata.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * user: ken
 * data: 2021/5/20 10:35
 */
@Component
@Slf4j
public class MyTasks {

    @Autowired
    JavaMailSender javaMailSender;


//    @Scheduled(cron = "*/5 * * * * ?")
//    public void test1(){
//        log.info("hello===============>");
//    }


    @Scheduled(cron = "*/10 * * * * ?")
    public void test3(){
        log.info("world===============>");
        sendSimpleMail();
    }

    public void sendSimpleMail() {
        // 构建一个邮件对象
        SimpleMailMessage message = new SimpleMailMessage();
        // 设置邮件主题
        message.setSubject("这是一封测试邮件-----来自ken！！！！");
        // 设置邮件发送者，这个跟application.yml中设置的要一致
        message.setFrom("462503861@qq.com");
        // 设置邮件接收者，可以有多个接收者，中间用逗号隔开，以下类似
        // message.setTo("10*****16@qq.com","12****32*qq.com");
        message.setTo("zhangjinlong198879@163.com");
        // 设置邮件抄送人，可以有多个抄送人
//        message.setCc("12****32*qq.com");
        // 设置隐秘抄送人，可以有多个
//        message.setBcc("7******9@qq.com");
        // 设置邮件发送日期
        message.setSentDate(new Date());
        // 设置邮件的正文
        message.setText("这是一封测试邮件-----来自ken！！！！---正文");
        // 发送邮件
        javaMailSender.send(message);
    }

}
