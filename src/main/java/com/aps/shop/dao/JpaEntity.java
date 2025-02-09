package com.aps.shop.dao;

import java.util.Objects;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class JpaEntity {

    @Id
    protected Long id;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        JpaEntity jpaEntity = (JpaEntity) o;
        return Objects.equals(id, jpaEntity.id);
    }
}
