package com.italo.money.services;

import com.italo.money.models.SystemUser;
import com.italo.money.repositories.SystemUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserService extends BaseService{

    @Autowired
    private SystemUserRepository systemUserRepository;

    public void saveSystemUser(SystemUser systemUser, String systemUserId){
        SystemUser responsible = systemUserRepository.findByUuid(systemUserId);
        SystemUser userToSave = (SystemUser) feedBaseFields(systemUser, responsible);
    }

    public void saveSystemUser1(SystemUser systemUser, SystemUser responsible){
        //SystemUser responsible = systemUserRepository.findByUuid(systemUserId);
        SystemUser userToSave = (SystemUser) feedBaseFields(systemUser, responsible);
        systemUserRepository.save(userToSave);
    }
}
