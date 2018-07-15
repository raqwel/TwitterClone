package com.example.twitter.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String login(LoginForm form, Model model) {

        return "Login/login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(@Validated @ModelAttribute LoginForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Login/login";
        }

        return "Timeline/timeline";
    }
}
