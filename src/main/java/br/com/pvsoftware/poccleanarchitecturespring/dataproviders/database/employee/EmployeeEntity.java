package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE")
class EmployeeEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    private String cpf;

    private String phone;
}
