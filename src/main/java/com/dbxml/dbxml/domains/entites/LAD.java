package com.dbxml.dbxml.domains.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "lad")
@Data
@XmlRootElement(name = "LAD")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LAD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String RT;
    private int VN;
    private int AT;
    private String AN;
    private int NAH;
    private String RSTAT;
    private String RSTAN;
    private String RSDT;
    private int AOD;
    private String CC;
    private int FA;
    private String AL;
    private int PF;
    private int PA;
    private String CL;
    private int AS_;
    private int BPA;
    private String BPD;
    private int OB;
    private int OA;
    private int NOP;
    private int LPA;
    private int LPD;
    private String ACD;
    private String LID;
    private String LOD;
    private String WOD;
    private String WOA;
    private String CRC;
    private String ASPS;
    private int FMPD;
    private int LMPD;
    private int PTD;
    private String AST;
    private String ASA;
    private int PM;


}
