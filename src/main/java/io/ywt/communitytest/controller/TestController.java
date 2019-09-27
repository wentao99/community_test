package io.ywt.communitytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @GetMapping("/tm")
    public String tm11(@RequestParam(value = "name") String name1, Model model) {
        model.addAttribute("name", name1);
        return "hello";
    }


}
