package com.woorifis.demo.model.entity;

import java.util.ArrayList;

import java.util.List;

import com.woorifis.demo.model.dto.SymbolDetailDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "symdetail")
public class SymbolDetail {
    @Id
    private Long Id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String detail;
    @Column(nullable=false)
    private Float marketcap;

    @OneToOne(mappedBy = "symid")
    private SymbolKeyword symbolKeyword;
    

    
    

    public static SymbolDetail toSymbolDetail(SymbolDetailDTO symbolDetailDTO){
        SymbolDetail symbolDetail = new SymbolDetail();
        symbolDetail.setId(symbolDetailDTO.getId());
        symbolDetail.setName(symbolDetailDTO.getName());
        symbolDetail.setDetail(symbolDetailDTO.getDetail());
        symbolDetail.setMarketcap(symbolDetailDTO.getMarketcap());
        return symbolDetail;
    }
}
