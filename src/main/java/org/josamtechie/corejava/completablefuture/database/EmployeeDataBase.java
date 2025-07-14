package org.josamtechie.corejava.completablefuture.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.josamtechie.corejava.completablefuture.dto.Employee;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDataBase
{

    public static List<Employee> fetchEmployees(){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("employee.json"), new TypeReference<List<Employee>>(){});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
