package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee;

import java.util.Set;
import org.springframework.web.multipart.MultipartFile;

interface EmployeesFileReader {

    Set<EmployeeDTO> read(MultipartFile file);
}
