package com.arthur.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue
    private String id_;
    private String name_;
    private int hp_;
    private int atk_;
    private String career_;
}
