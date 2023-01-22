package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloModelController {

    @GetMapping("model")
    public String helloModel(Model model) {
        // Model 에 데이터 저장
        model.addAttribute("eng", "타임리프!!");

        // 반환값으로 뷰 이름을 돌려줌
        return "helloThymeleaf";
    }
}
