package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import org.springframework.data.repository.CrudRepository;

interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
}
