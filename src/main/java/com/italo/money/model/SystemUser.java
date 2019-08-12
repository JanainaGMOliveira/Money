package com.italo.money.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class SystemUser extends AbstractEntity{
    @Getter @Setter
    private String username;
    @Getter @Setter
    private String password;
}
