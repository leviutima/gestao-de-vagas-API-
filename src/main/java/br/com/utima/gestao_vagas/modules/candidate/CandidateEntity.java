package br.com.utima.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    private String username;

    @Email(message= "O campo email deve conter um email válido")
    private String email;

    @Length(min = 6)
    private String password;
    private String description;
    private String curriculum;

}
