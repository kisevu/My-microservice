package com.ameda.kevin.UserService.vo;

import com.ameda.kevin.UserService.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {
    private UserEntity userEntity;
    private Department department;
}
