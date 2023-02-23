package com.mlazarte.springjwt.auth;

import lombok.Builder;

@Builder
public record AuthenticationRequest(String email, String password) {
}
