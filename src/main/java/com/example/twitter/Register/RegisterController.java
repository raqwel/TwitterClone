package com.example.twitter.Register;

import com.example.twitter.dbflute.exbhv.UserBhv;
import com.example.twitter.dbflute.exentity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("")
public class RegisterController {

    @Autowired
    private UserBhv userBhv;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(RegisterForm form, Model model) {

        return "Register/index";
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@Validated @ModelAttribute RegisterForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Register/index";
        }

        User user = new User();
        user.setUserName(form.getUserName());
        user.setPassword(form.getPassword());
        userBhv.insert(user);

        return "Register/success";
    }
}
