package com.dbxml.dbxml.dao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LadDao {

    @JsonProperty(value = "RT")
    private Integer RT;
    private int VN;
    private int AT;
    @JsonProperty(value = "AN")
    private String AN;
    private int NAH;
    private String RSTAT;
    private String RSTAN;
    private String RSDT;
    private long AOD;
    private int CC;
    private int FA;
    private int AL;
    private int PF;
    private int PA;
    private String CL;
    private int AS;
    private int BPA;
    private String BPD;
    private int OB;
    private int OA;
    private int NOP;
    private int LPA;
    private long LPD;
    private String ACD;
    private String LID;
    private String LOD;
    private String WOD;
    private String WOA;
    private String CRC;
    private String ASPS;
    private long FMPD;
    private long LMPD;
    private long PTD;
    private String AST;
    private String ASA;
    private int PM;
    private ConsumerDao CONSUMER;

}
