package io.ywt.communitytest.controller;

import io.ywt.communitytest.entity.User;
import io.ywt.communitytest.mapper.FindUsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;



//@Controller
@RestController
public class TestController {

   @Autowired
   private FindUsersMapper findUsersMapper = null;

    @GetMapping("/tm")
    public String tm11(@RequestParam(value = "name", required = false) String name1, Model model) {
        model.addAttribute("name", name1);
        return "hello";
    }

    @RequestMapping("/tm12/{id}")
    public User tm12(@PathVariable(value = "id",required = false) String id){
        User user = findUsersMapper.findUsersById(Integer.parseInt(id));
        return user;
    }
}
