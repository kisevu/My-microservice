package com.ameda.kevin.departmentService.controller;

import com.ameda.kevin.departmentService.entity.Department;
import com.ameda.kevin.departmentService.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department  saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentWithId(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentWithId(departmentId);
    }
}
