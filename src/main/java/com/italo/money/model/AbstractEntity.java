package com.italo.money.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Getter @Setter
    private boolean active;
    @Getter @Setter @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @Temporal(TemporalType.DATE) @Getter @Setter
    private LocalDate createTime;
    @Temporal(TemporalType.DATE) @Getter @Setter
    private LocalDate updateTime;
    @OneToOne @Getter @Setter
    private SystemUser creationResponsible;
    @OneToOne @Getter @Setter
    private SystemUser updateResponsible;
}
