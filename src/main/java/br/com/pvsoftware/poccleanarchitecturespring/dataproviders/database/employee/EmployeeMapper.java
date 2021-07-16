package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import br.com.pvsoftware.poccleanarchitecturespring.domain.entity.Employee;
import java.util.Set;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Set<EmployeeEntity> toEntitySet(Set<Employee> employees);
}
