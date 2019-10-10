package com.italo.money.services;

import com.italo.money.models.AbstractEntity;
import com.italo.money.models.SystemUser;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseService {
    protected AbstractEntity feedBaseFields(AbstractEntity entity, SystemUser responsible){
        if(entity.getId() == null){
            entity.setActive(true);
            entity.setUuid(UUID.randomUUID().toString());
            entity.setCreationResponsible(responsible);
            entity.setCreateTime(LocalDateTime.now());
        }
        entity.setUpdateResponsible(responsible);
        entity.setUpdateTime(LocalDateTime.now());
        return entity;
    }
}
