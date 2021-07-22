package com.audrey.h2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_match")
@Setter
@Getter
@ToString

public class Match {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Long id_lover;  // FK

    private String percentage;

    private String result;

    private boolean bestMatch;
}
