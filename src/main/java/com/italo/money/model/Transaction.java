package com.italo.money.model;

import javax.persistence.Entity;

@Entity
public class Transaction extends AbstractEntity{
    private String description;
    private Double ammount;
}