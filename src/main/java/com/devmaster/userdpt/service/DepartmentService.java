package com.devmaster.userdpt.service;

import com.devmaster.userdpt.Dto.DepartmentDto;
import com.devmaster.userdpt.entities.Department;
import com.devmaster.userdpt.repositories.DepartmentRespository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRespository departmentRespository;

    public Department criarDepartment(DepartmentDto departmentDto){
        Department department = new Department();
        department.setName(departmentDto.getName());
        return departmentRespository.save(department);
    }

    public List<Department> listarTodos(){
        return  departmentRespository.findAll();
    }

    public Optional<Department> buscarPorId(Long id){
        Optional<Department> department = departmentRespository.findById(id);
        if (department.isEmpty()) {
            throw new EntityNotFoundException("Department com o id:" + id + " não encontrado.");
        }
        return department;
    }


}
