package com.aps.shop.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode(callSuper = true)
public class JpaUser extends AuditedJpaEntity {

    @Column(nullable = false)
    private String username;

    // TODO add password history later
    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @Column(nullable = false)
    private String password;
}
