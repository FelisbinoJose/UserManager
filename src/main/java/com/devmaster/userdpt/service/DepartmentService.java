package com.devmaster.userdpt.service;

import com.devmaster.userdpt.Dto.DepartmentDto;
import com.devmaster.userdpt.entities.Department;
import com.devmaster.userdpt.repositories.DepartmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRespository departmentRespository;

    public Department criarDepartment(DepartmentDto departmentDto){
        Department department = new Department();
        department.setName(departmentDto.getName());
        // Aqui você pode adicionar lógica adicional, como definir a lista de usuários, se necessário
        return departmentRespository.save(department);
    }

    public List<Department> listarTodos(){
        return  departmentRespository.findAll();
    }
}
