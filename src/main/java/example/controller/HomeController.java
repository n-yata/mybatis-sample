package example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import example.mapper.SampleMybatis;
import example.model.User;

@Controller
public class HomeController {
    @Autowired
    SampleMybatis mapper;

    @GetMapping(value = "/")
    public String get() {
        return "index";
    }

    @PostMapping(value = "/")
    public String post(Model model) {
        List<User> userList = mapper.selectAll();
        List<String> lines = new ArrayList<>();

        for(User user : userList) {
            lines.add(user.getLastName() + " " + user.getFirstName() + ", " + user.getRoleName());
        }

        model.addAttribute("file_contents", lines);
        return "index";
    }
}
