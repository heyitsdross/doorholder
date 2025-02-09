package com.aps.shop.api.rest.admin;

import java.util.List;

import com.aps.shop.dao.repository.JpaUserRepository;
import com.aps.shop.dto.UserDTO;
import com.aps.shop.mapper.JpaDTOMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/admin")

public class AdminRestController {

    private JpaUserRepository userRepository;
    private JpaDTOMapper jpaDTOMapper;

    @GetMapping("/users")
    public List<UserDTO> users() {
        return userRepository.findAllAdminUsersBy()
                             .stream()
                             .map(jpaDTOMapper::toDTO)
                             .toList();
    }
}
