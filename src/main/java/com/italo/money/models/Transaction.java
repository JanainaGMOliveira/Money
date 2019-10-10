package com.italo.money.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Transaction extends AbstractEntity {
    @Getter @Setter
    private String description;
    @Getter @Setter
    private Double ammount;
    @OneToOne @Getter @Setter
    private TransactionMethod method;
    @Getter @Setter
    private Integer portions;
}