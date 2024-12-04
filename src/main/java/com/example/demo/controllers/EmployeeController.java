package com.example.demo.controllers;

//Operations
// GET / employees
// POST /employees
// DELETE /employees/{id}


import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //    public String getEmployees() {
//        return "Hello Employees";
//    }
//    @GetMapping(path = "/employees/{id}")
//    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId) {
//        return new EmployeeDTO(employeeId,"Dharmesh",LocalDate.of(2024,11,26),true);
//    }


    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createNewEmployee(employeeDTO);

    }

//    @GetMapping(path="/employees")
//    public String getData(@PathParam("sortBy") String sortBy,
//                          @PathParam("limit") Integer limit) {
//        return "Hello World "+ sortBy+" "+limit;
    //}


}
