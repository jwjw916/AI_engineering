package com.woorifis.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "us3y")
public class Us3y {
    @Id
    private String date;

    @Column
    private double open;     
    @Column
    private double high;       
    @Column
    private double low;       
    @Column
    private double close;   

}