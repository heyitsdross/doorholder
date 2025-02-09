package com.aps.shop.dao;

import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
public abstract class AuditedJpaEntity extends JpaEntity {

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdDate;
}
