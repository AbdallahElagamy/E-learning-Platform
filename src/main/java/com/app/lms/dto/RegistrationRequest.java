package com.app.lms.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RegisterUser {
    private String email;
    private String username;
    private String password;
    private String contactInformation;
    private String profilePictureUrl;
}
