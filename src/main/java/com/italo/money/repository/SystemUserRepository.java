package com.italo.money.repository;

import com.italo.money.model.SystemUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SystemUserRepository extends PagingAndSortingRepository<SystemUser, Long> {
}
