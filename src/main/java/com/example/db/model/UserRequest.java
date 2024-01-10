package com.example.db.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String surname;
    private String login;
    private String password;
}
