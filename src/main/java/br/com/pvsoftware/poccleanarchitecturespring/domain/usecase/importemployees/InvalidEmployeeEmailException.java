package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees;

public class InvalidEmployeeEmailException extends RuntimeException {

    public InvalidEmployeeEmailException(String email) {
        super(String.format("Invalid employee email '%s'", email));
    }
}
