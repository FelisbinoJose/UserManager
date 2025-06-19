package com.devmaster.userdpt.controllers;


import com.devmaster.userdpt.Dto.DepartmentDto;
import com.devmaster.userdpt.entities.Department;
import com.devmaster.userdpt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Department>> listarTodos(){
        List<Department> listaDeDepartment = departmentService.listarTodos();
        return ResponseEntity.ok(listaDeDepartment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        return departmentService.buscarPorId(id).map(department -> ResponseEntity.ok(department))
                .orElse(ResponseEntity.notFound().build());
    }


}
