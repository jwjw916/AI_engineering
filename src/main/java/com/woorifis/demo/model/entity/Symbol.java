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
@Table(name = "nasdaq")
public class Symbol {
    @Id
    private String date;

    @Column
    private double open;       // 미국 (US)
    @Column
    private double high;       // 미국 (US)
    @Column
    private double low;        // 미국 (US)
    @Column
    private double close;      // 미국 (US)
    @Column
    private double adjclose;   // 미국 (US)
    @Column
    private long volume;       // 미국 (US)

}