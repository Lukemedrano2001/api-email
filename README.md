# API de Envio de E-mails
Este projeto consiste em uma API de envio de e-mails desenvolvida em Spring Boot. A estrutura do projeto inclui os seguintes componentes:


## Funcionalidades
EmailController
O EmailController é responsável por expor um endpoint que aceita requisições POST para o envio de e-mails. Ao receber uma requisição, ele encaminha os dados do e-mail para o EmailService.


## EmailRequestDTO
O EmailRequestDTO é um objeto que representa os dados necessários para o envio de e-mails, incluindo destinatário, assunto e corpo do e-mail.


## EmailService
O EmailService contém a lógica de negócios para o envio de e-mails. Ele utiliza o JavaMailSender do Spring para criar e enviar mensagens de e-mail com base nos dados fornecidos pelo EmailRequestDTO.


## Como Utilizar
Para enviar um e-mail, realize uma requisição HTTP POST para o seguinte endpoint:

- `Rota e Método HTTP`: POST http://localhost:8080/api/email
O corpo da requisição deve ser um JSON contendo os seguintes campos:

{
    "destinatario": "seuemail@email.com",
    "assunto": "Seu assunto aqui",
    "corpo": "Corpo do e-mail aqui"
}


## Configurações para envio de e-mail

As seguintes configurações são necessárias para o envio de e-mails através da aplicação. Certifique-se de ajustar os valores de `spring.mail.username` e `spring.mail.password` com as credenciais do seu servidor de e-mail.

- spring.mail.host=sandbox.smtp.mailtrap.io
- spring.mail.port=587
- spring.mail.username=username
- spring.mail.password=password
- spring.mail.properties.mail.smtp.auth=true
- spring.mail.properties.mail.smtp.starttls.enable=true


## Tecnologias Utilizadas
| Tecnologia                       | Descrição                                      |
|----------------------------------|------------------------------------------------|
| Spring Boot                      | Framework para criação de aplicativos Java     |
| Spring Boot Starter Web           | Suporte para desenvolvimento de aplicativos web|
| Spring Boot DevTools              | Ferramentas de desenvolvimento automático      |
| Spring Boot Starter Test          | Suporte a testes automatizados                 |
| Spring Boot Starter Mail          | Suporte para envio de e-mails usando o JavaMailSender do Spring |


## License
Este projeto está licenciado sob a Licença MIT.
