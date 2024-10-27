package ru.mtuci.rbpo_2024_praktika.auth;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
class AuthRequestDTO {
    private String username;
    private String password;
}