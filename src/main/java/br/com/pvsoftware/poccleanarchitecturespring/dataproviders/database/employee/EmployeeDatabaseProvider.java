package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Employee;
import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees.RegisterEmployees;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeDatabaseProvider implements RegisterEmployees {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Override
    public void saveAll(final Set<Employee> employees) {
        employeeRepository.saveAll(employeeMapper.toEntitySet(employees));
    }
}
