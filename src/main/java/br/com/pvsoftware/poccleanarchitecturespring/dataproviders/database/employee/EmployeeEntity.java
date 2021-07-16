package br.com.pvsoftware.poccleanarchitecturespring.dataproviders.database.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String email;

    private String cpf;

    private String phone;
}
