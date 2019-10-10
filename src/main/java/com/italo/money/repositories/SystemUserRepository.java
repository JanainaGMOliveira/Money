package com.italo.money.repositories;

import com.italo.money.models.SystemUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SystemUserRepository extends PagingAndSortingRepository<SystemUser, Long> {
    public SystemUser findByUuid(String uuid);
}
