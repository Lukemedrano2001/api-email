package br.com.lukemedrano.apiEnvioEmail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lukemedrano.apiEnvioEmail.domain.email.EmailRequestDTO;
import br.com.lukemedrano.apiEnvioEmail.services.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	@Autowired
	private final EmailService emailService;

	public EmailController(EmailService emailService) {
		this.emailService = emailService;
	}
	
	@PostMapping
	public void enviarEmail(@RequestBody EmailRequestDTO email) {
		emailService.enviarEmail(email);
	}
}
