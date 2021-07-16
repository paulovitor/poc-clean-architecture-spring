package br.com.pvsoftware.poccleanarchitecturespring.domain.entity;

import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees.InvalidEmployeeCpfException;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees.InvalidEmployeeEmailException;
import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee.EmployeeDTO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class Employee {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    @NonNull
    private final String name;

    @NonNull
    private final String email;

    @NonNull
    private final Employee.Cpf cpf;

    private String phone;

    public Employee(final EmployeeDTO dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.cpf = new Cpf(dto.getCpf());
        failIfInvalidEmail();
    }

    private void failIfInvalidEmail() {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(this.email);
        if (!matcher.find()) {
            throw new InvalidEmployeeEmailException(this.email);
        }
    }

    public class Cpf {

        private final Pattern VALID_CPF_REGEX = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", Pattern.CASE_INSENSITIVE);

        private final String value;

        public Cpf(String value) {
            this.value = value;
            failIfInvalidCpf();
        }

        private void failIfInvalidCpf() {
            Matcher matcher = VALID_CPF_REGEX.matcher(this.value);
            if (!matcher.find()) {
                throw new InvalidEmployeeCpfException(this.value);
            }
        }
    }
}
