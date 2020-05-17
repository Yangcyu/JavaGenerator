package com.ycy.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author 
 * 
 */
@Table(name="psn_info_d")
@Data
public class PsnInfo implements Serializable {
    @Id
    @GeneratedValue
    private String psnNo;

    /**
     * 人员_管理码

     */
    private String psnMgtcode;

    private String name;

    private String alis;

    private String gend;

    private LocalDate brdy;

    private String certType;

    private String certNo;

    private String hsecfcCodg;

    private String tel;

    private String mob;

    private String naty;

    private String natRegnCode;

    private String email;

    private String polstas;

    private LocalDate patcJobDate;

    private String resdNat;

    private String resdLocAdmdvs;

    private String resdAddr;

    private String resdAddrPoscode;

    private String liveAdmdvs;

    private String liveAddr;

    private String liveAddrPoscode;

    private String resdbookNo;

    private String mrgStas;

    private String hlcon;

    private String memo;

    private String survStas;

    private String mulProvMntFlag;

    private String admdut;

    private String empStas;

    private String retrType;

    private String gradSchl;

    private String educ;

    private String proTechDutyLv;

    private String natProfQuaLv;

    private String rid;

    private String crter;

    private String crterName;

    private LocalDateTime crteTime;

    private String crteOptins;

    private String opter;

    private String opterName;

    private LocalDateTime optTime;

    private String optins;

    private String ver;

    private String compareFlag;

    private static final long serialVersionUID = 1L;
}