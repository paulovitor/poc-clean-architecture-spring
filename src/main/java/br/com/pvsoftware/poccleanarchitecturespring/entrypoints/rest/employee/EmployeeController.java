package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee;

import br.com.pvsoftware.poccleanarchitecturespring.domain.usecase.importemployees.ImportEmployeesUseCase;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
class EmployeeController {

    private final ImportEmployeesUseCase importEmployeesUseCase;
    private final EmployeesFileReader employeesFileReader;

    @PostMapping("/employees/file")
    ResponseEntity<Void> importEmployees(final MultipartFile file) {
        Set<EmployeeDTO> employees = employeesFileReader.read(file);
        importEmployeesUseCase.importEmployees(employees);
        return ResponseEntity.noContent().build();
    }
}
