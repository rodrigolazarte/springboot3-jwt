package com.mlazarte.springjwt.auth;

public record RegisterRequest(
        String firstName,
        String lastName,
        String email,
        String password) {
}
