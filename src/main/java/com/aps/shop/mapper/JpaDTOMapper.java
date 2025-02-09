package com.aps.shop.mapper;

import com.aps.shop.dto.AdminUserProjection;
import com.aps.shop.dto.UserDTO;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface JpaDTOMapper {

    UserDTO toDTO(AdminUserProjection user);
}
