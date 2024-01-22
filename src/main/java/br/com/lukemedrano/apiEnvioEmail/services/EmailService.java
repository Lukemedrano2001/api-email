package br.com.lukemedrano.apiEnvioEmail.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.lukemedrano.apiEnvioEmail.domain.email.EmailRequestDTO;

@Service
public class EmailService {
	private final JavaMailSender mailSender;

	public EmailService(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void enviarEmail(EmailRequestDTO email) { 
		var mensagem = new SimpleMailMessage();
		
		mensagem.setFrom("noreply@email.com");
		mensagem.setTo(email.destinatario());
		mensagem.setSubject(email.assunto());
		mensagem.setText(email.corpo());
		
		mailSender.send(mensagem);
	}
}