package com.homework.hanghae99homework02.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class RegisterDto {
    private String username;
    private String password;
    private String nickname;
    private String email;
}