package br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Employee;
import br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee.EmployeeDTO;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImportEmployeesService implements ImportEmployeesUseCase {

    private final RegisterEmployees registerEmployees;

    @Override
    public void importEmployees(Set<EmployeeDTO> dtos) {
        val employees = dtos.stream().map(it -> new Employee(it)).collect(Collectors.toSet());
        registerEmployees.saveAll(employees);
    }
}
