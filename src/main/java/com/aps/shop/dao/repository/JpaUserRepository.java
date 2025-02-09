package com.aps.shop.dao.repository;

import java.util.List;

import com.aps.shop.dao.JpaUser;
import com.aps.shop.dto.AdminUserProjection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<JpaUser, Long> {

    List<AdminUserProjection> findAllAdminUsersBy();
}
