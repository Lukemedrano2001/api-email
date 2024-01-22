package br.com.lukemedrano.apiEnvioEmail.domain.email;

public record EmailRequestDTO(String destinatario, String assunto, String corpo) {
	
}