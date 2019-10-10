package com.italo.money.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class AbstractEntity implements Serializable {
    @Getter @Setter
    private boolean active;
    @Getter @Setter @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    @Getter @Setter
    private String uuid;
    @Getter @Setter
    private LocalDateTime createTime = LocalDateTime.now();
    @Getter @Setter
    private LocalDateTime updateTime = LocalDateTime.now();
    @OneToOne @Getter @Setter
    private SystemUser creationResponsible;
    @OneToOne @Getter @Setter
    private SystemUser updateResponsible;
}
