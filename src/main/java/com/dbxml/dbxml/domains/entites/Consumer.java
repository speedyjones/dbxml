package com.dbxml.dbxml.domains.entites;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "consumers")
@Data
@RequiredArgsConstructor
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int RT;
    private int VN;
    private int AT;
    private String AN;
    private int AHN;
    private int RTA;
    private int IDT;
    private int IDN;
    private int IDED;
    private int SC;
    private int NS;
    private int NF;
    private String NM;
    private int DOB;
    private String NT;
    private int MS;
    private int OI;
    private long HTN;
    private String WTN;
    private long MTN;
    private int ADT;
    private String ADSD;
    private String ADED;
    private int ADF;
    private int AD;
    private String PC;
    private String PB;
    private String EMP;
    private String EA;
    private int ESD;
    private String EED;

}
