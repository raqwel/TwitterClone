package com.example.twitter.Register;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Getter
@Setter
public class RegisterForm {

    @NotNull(message = "名前を入力してください")
    @Size(min = 4, max = 8, message = "名前は4文字以上8文字以内で入力してください")
    private String userName;

    @NotNull(message = "パスワードを入力してください")
    @Size(min = 8, max = 30, message = "パスワードは8文字以上30文字以内で入力してください")
    private String password;

}
