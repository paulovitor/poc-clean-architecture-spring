package br.com.pvsoftware.poccleanarchitecturespring.entrypoints.rest.employee;

import java.util.Set;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class EmployeesCsvFileReader implements EmployeesFileReader {

    @Override
    public Set<EmployeeDTO> read(final MultipartFile file) {
        // Read .csv file
        return null;
    }
}
