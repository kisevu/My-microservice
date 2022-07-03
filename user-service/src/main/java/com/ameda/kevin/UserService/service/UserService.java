package com.ameda.kevin.UserService.service;

import com.ameda.kevin.UserService.entity.UserEntity;
import com.ameda.kevin.UserService.repository.UserRepository;
import com.ameda.kevin.UserService.vo.Department;
import com.ameda.kevin.UserService.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }
    public ResponseTemplate getUserWithDepartment(Long userId) {
        ResponseTemplate responseTemplate=new ResponseTemplate();
        UserEntity userEntity=userRepository.findById(userId).get();
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"
        +userEntity.getDepartmentId(),Department.class);
        responseTemplate.setUserEntity(userEntity);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
