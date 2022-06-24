package com.example.its.web.user;

import com.example.its.domain.auth.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UsersService usersService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("userList",usersService.findAll());
        return "users/list";
    }

    // GET /users/creationFOrm
    @GetMapping("/creationForm")
    public String showCreationForm() {
        return "users/creationForm";
    }

    //POST /users
    @PostMapping
    public String create(UserForm form) {
        return "redirect:/users";
    }
}

