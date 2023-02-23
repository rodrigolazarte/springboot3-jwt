package com.mlazarte.springjwt.auth;

import lombok.Builder;

@Builder
public record AuthenticationResponse(String token) {

}
