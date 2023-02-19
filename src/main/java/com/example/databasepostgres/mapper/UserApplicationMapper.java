package com.example.databasepostgres.mapper;

import com.example.databasepostgres.dto.UserApplicationDTO;
import com.example.databasepostgres.entity.UserApplication;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserApplicationMapper {

    UserApplication toUserApplicationEntity(UserApplicationDTO userApplicationDTO);

    UserApplicationDTO toUserApplicationDTO(UserApplication userApplication);
}
