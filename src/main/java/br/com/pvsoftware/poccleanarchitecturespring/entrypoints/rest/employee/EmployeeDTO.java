package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class EmployeeDTO {

    @NotEmpty
    private final String name;

    @NotEmpty
    private final String cpf;

    @Email
    private final String email;
}
