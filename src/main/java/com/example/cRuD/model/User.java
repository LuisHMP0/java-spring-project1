package com.example.cRuD.model;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import javax.xml.crypto.Data;

@Entity
public class User { // FALTA ADICIONAR AS DEPENDENCIAS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    //@NotNull(message = "Data de nascimento é obrigatória")
    private Data birthDate;

    //@Email(message = "E-mail inválido")
    //@NotNull(message ="E-mail é obrigatório")
    private String emaill;

    //@NotBlank(message = "Senha é obrigatória")
    private String password;

    @Transient // Campo não persistido no banco de dados
    private String confirmPassword;

    //@NotBlank(message = "Número do cartão é obrigatório")
    private String cardNumber;

    //@NotBlank(message = "Validade do cartão é obrigatória")
    private String cardExpiry;

    //@NotBlank(message = "Código de segurança é obrigatório")
    private String cardSecurityCode;

    //@NotBlank(message = "Nome do titular do cartão é obrigatório")
    private String cardHolderName;

    //@NotBlank(message = "CPF/CNPJ é obrigatório")
    private String cpfOrCnpj;

    // Getters e Setters
}

