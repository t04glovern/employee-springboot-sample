package com.nathanglover.employeeapi.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SwaggerDefinition(tags = {
        @Tag(name = "employees", description = "Operations for accessing employee information")
})
@Slf4j
public class EmployeeController {


    @Autowired
    public EmployeeController() {
    }

    @ApiOperation(value = "Get an employee", response = String.class)
    @GetMapping(value = {"/employee"})
    @ResponseBody
    public String index() {
        return "Hello, World!";
    }
}
