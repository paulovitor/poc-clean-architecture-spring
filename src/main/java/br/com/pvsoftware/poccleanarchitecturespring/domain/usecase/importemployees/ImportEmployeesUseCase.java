package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees;

import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee.EmployeeDTO;
import java.util.Set;

public interface ImportEmployeesUseCase {

    void importEmployees(Set<EmployeeDTO> dtos);
}
