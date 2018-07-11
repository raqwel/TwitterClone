package com.example.demo.Register;

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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(RegisterForm form, Model model) {
        // view名を返す
        return "Register/index";
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@Validated @ModelAttribute RegisterForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Register/index";
        }
        model.addAttribute("id", form.getId());
        model.addAttribute("password", form.getPassword());
        // view名を返す
        return "Register/success";
    }
}
