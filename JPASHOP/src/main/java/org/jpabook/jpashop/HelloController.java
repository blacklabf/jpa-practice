package org.jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!!"); // controller에서 Model의 data에다가 값을 넣어 view에다가넘김
        return "hello"; // 화면 이름 hello.html (resources) / prefix,suffix 수정 가능
    }

}
