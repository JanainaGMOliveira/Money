package com.italo.money.config;


import com.italo.money.models.SystemUser;
import com.italo.money.repositories.SystemUserRepository;
import com.italo.money.services.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private SystemUserRepository systemUserRepository;

    @Autowired
    private SystemUserService systemUserService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        SystemUser user = systemUserRepository.findById((long)9).get();
        SystemUser userToSave = new SystemUser();
        userToSave.setUsername("Usuario Novo");
        userToSave.setPassword("senhadousuarionovo");
        systemUserService.saveSystemUser1(userToSave, user);
    }
}
