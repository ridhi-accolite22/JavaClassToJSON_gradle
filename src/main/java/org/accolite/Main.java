package org.accolite;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Employee emp = new Employee();
            emp.setId(9878);
            emp.setName("Ridhi Kar");
            emp.setDesignation("SWE");
            emp.setAge(22);
            Employee emp2 = new Employee();
            emp2.setId(9706);
            emp2.setName("Amisha");
            emp2.setDesignation("QA");
            emp2.setAge(23);
            String jsonEmp = objectMapper.writeValueAsString(emp);
            String jsonEmp2 = objectMapper.writeValueAsString(emp2);
            System.out.println(jsonEmp);
            System.out.println(jsonEmp2);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}