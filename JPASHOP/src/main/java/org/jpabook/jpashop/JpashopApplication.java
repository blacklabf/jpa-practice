package org.jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {

        // lombok 확인 : getter, setter (기본생성자 자동확인)
        /**
         * Hello hello = new Hello();
        hello.setData("hello");
        String data = hello.getData();
        System.out.println("data = " + data);
        */
        SpringApplication.run(JpashopApplication.class, args);
    }




}
