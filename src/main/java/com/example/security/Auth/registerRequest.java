package com.example.security.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class registerRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
