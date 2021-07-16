package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
