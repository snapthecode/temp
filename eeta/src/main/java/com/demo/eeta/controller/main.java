package com.demo.eeta.controller;

import com.demo.eeta.domain.UserVo;
import com.demo.eeta.repository.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
@MapperScan(basePackages = "com.demo.eeta.repository")
public class main {
    private final UserMapper usermapper;

    public main(UserMapper usermapper) {
        this.usermapper = usermapper;
    }

    @GetMapping("/")
    public String main() {
        return "th/main";
    }

    @RequestMapping("/user")
    public String mainUser(Model model) {
        UserVo vo = new UserVo();
        vo = usermapper.UserSelected("admin");
        model.addAttribute("user", vo);
        return "th/mainTest";
    }
}
