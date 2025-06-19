package com.devmaster.userdpt.controllers;


import com.devmaster.userdpt.Dto.DepartmentDto;
import com.devmaster.userdpt.entities.Department;
import com.devmaster.userdpt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> criarDepartment(@RequestBody DepartmentDto departmentDto){
        Department departmentCriado = departmentService.criarDepartment(departmentDto);
        return ResponseEntity.ok(departmentCriado);
    }

}
