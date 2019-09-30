package com.italo.money.service;

import com.italo.money.model.AbstractEntity;
import com.italo.money.model.SystemUser;

import java.time.LocalDateTime;

public class BaseService {
    protected AbstractEntity feedBaseFields(AbstractEntity entity, SystemUser responsible){
        if(entity.getId() == null){
            entity.setCreationResponsible(responsible);
            entity.setCreateTime(LocalDateTime.now());
        }
        entity.setUpdateResponsible(responsible);
        entity.setUpdateTime(LocalDateTime.now());
        return entity;
    }
}
