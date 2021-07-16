package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees;

public class InvalidEmployeeCpfException extends RuntimeException {

    public InvalidEmployeeCpfException(String cpf) {
        super(String.format("Invalid employee cpf '%s'", cpf));
    }
}
