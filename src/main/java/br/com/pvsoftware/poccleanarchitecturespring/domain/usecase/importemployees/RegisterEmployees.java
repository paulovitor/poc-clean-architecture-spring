package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Employee;
import java.util.Set;

public interface RegisterEmployees {

    void saveAll(Set<Employee> employees);
}
