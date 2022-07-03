package com.ameda.kevin.departmentService.service;

import com.ameda.kevin.departmentService.entity.Department;
import com.ameda.kevin.departmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentWithId(Long departmentId) {
      Department department=departmentRepository.findById(departmentId).get();
      return department;
    }
}
