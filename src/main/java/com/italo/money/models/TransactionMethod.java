package com.italo.money.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class TransactionMethod extends AbstractEntity{
    @Getter @Setter
    private String description;
}
