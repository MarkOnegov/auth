package ru.monegov.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import ru.monegov.authentication.AuthenticationService;
import ru.monegov.entity.UserEntity;

import javax.annotation.security.PermitAll;

@PermitAll
@Controller
public class RegisterController {

	@Inject
	private AuthenticationService authenticationService;

	@Post("/register")
	public String register(@Body UserEntity candidate) {
		String username = authenticationService.register(candidate);
		return username;
	}
}
