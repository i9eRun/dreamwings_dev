package com.nalgae.dreamnalgae.entity.wbas;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_CUST")
public class Cust {
    @JsonProperty("CUST_CD")
    @Id
    @Column(name = "CUST_CD", length = 114, nullable = false)
    private String custCd;

    @JsonProperty("CUST_GB")
    @Column(length = 12)
    private String custGb;

    @JsonProperty("CUST_DIV_GB")
    @Column(length = 12, nullable = true)
    private String custDivGb;

    @JsonProperty("CUST_ABBR_NM")
    @Column(length = 140)
    private String custAbbrNm;

    @JsonProperty("CUST_NM")
    @Column(length = 500, nullable = true)
    private String custNm;

    @JsonProperty("BIZ_REG_NO")
    @Column(length = 110)
    private String bizRegNo;

    @JsonProperty("DAEPYO_NM")
    @Column(length = 114)
    private String daepyoNm;

    @JsonProperty("UPDATE_NM")
    @Column(length = 120)
    private String uptaeNm;

    @JsonProperty("JONGMOK_NM")
    @Column(length = 130)
    private String jongmokNm;

    @JsonProperty("TEL_NO")
    @Column(length = 140)
    private String telNo;

    @JsonProperty("FAX_NO")
    @Column(length = 140)
    private String faxNo;

    @JsonProperty("EMAIL_ADDR")
    @Column(length = 150)
    private String emailAddr;

    @JsonProperty("POST_NO")
    @Column(length = 16)
    private String postNo;

    @JsonProperty("ADDR1")
    @Column(length = 160)
    private String addr1;

    @JsonProperty("ADDR2")
    @Column(length = 140)
    private String addr2;

    @JsonProperty("TRADE_FR_DT")
    @Temporal(TemporalType.DATE)
    private Date tradeFrDt;

    @JsonProperty("TRADE_TO_DT")
    @Temporal(TemporalType.DATE)
    private Date tradeToDt;

    @JsonProperty("SINYONG_AMT")
    @Column(precision = 12)
    private BigDecimal sinyongAmt;

    @JsonProperty("MISU_AMT")
    @Column(precision = 12)
    private BigDecimal misuAmt;

    @JsonProperty("MAGAM_DD")
    @Column(precision = 2)
    private Integer magamDd;

    @JsonProperty("CONTR_STORE_YN")
    @Column(name = "CONTR_STORE_YN", columnDefinition = "CHAR(1)")
    private String contrStoreYn;

    @JsonProperty("JIYUK_NM")
    @Column(length = 120)
    private String jiyukNm;

    @JsonProperty("DELIV_PATH_CD")
    @Column(length = 15)
    private String delivPathCd;

    @JsonProperty("DELIV_POS_CD")
    @Column(length = 14)
    private String delivPosCd;

    @JsonProperty("CHARGE_EMP_ID")
    @Column(length = 120)
    private String chargeEmpId;

    @JsonProperty("BIGO")
    @Column(length = 2024)
    private String bigo;

    @JsonProperty("SALE_TYPE_GB")
    @Column(length = 12)
    private String saleTypeGb;

    @JsonProperty("GULJAE_GB")
    @Column(length = 18)
    private String guljaeGb;

    @JsonProperty("CHULGO_GB")
    @Column(length = 12)
    private String chulgoGb;

    @JsonProperty("SOSOK_NM")
    @Column(length = 120)
    private String sosokNm;

    @JsonProperty("CUST_DIV_CD1")
    @Column(length = 120)
    private String custDivCd1;

    @JsonProperty("CUST_DIV_CD2")
    @Column(length = 120)
    private String custDivCd2;

    @JsonProperty("BIZ_NM")
    @Column(length = 150)
    private String bizNm;

    @JsonProperty("TEAM_CD")
    @Column(length = 16)
    private String teamCd;

    @JsonProperty("TEAM_NM")
    @Column(length = 120)
    private String teamNm;

    @JsonProperty("DAMDANG_NM")
    @Column(length = 120)
    private String damdangNm;

    @JsonProperty("DELIV_DIV_CD")
    @Column(length = 15)
    private String delivDivCd;

    @JsonProperty("SEND_EMAIL_ADDR")
    @Column(length = 1300)
    private String sendEmailAddr;

    @JsonProperty("WORK_USER_ID")
    @Column(length = 120)
    private String workUserId;

    @JsonProperty("WORK_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date workDt;

    @JsonProperty("BANP_DAMDANG_NM")
    @Column(length = 120)
    private String banpDamdangNm;

    @JsonProperty("BANP_TEAM_CD")
    @Column(length = 16)
    private String banpTeamCd;

    @JsonProperty("BANP_TEAM_NM")
    @Column(length = 120)
    private String banpTeamNm;

    @JsonProperty("ORD_METHOD_GB")
    @Column(length = 12)
    private String ordMethodGb;

    @JsonProperty("BOK_INI_BOKWAN_AMT")
    @Column(precision = 12, scale = 1)
    private BigDecimal bokIniBokwanAmt;

    @JsonProperty("CHULPAN_SUB_CD")
    @Column(length = 120)
    private String chulpanSubCd;

    @JsonProperty("BANP_EMAIL_ADDR")
    @Column(length = 150)
    private String banpEmailAddr;

    @JsonProperty("BONSA_SALE_NM")
    @Column(length = 110)
    private String bonsaSaleNm;

    @JsonProperty("HOMEPAGE_ADDR")
    @Column(length = 1150)
    private String homepageAddr;

    @JsonProperty("HOMENAME_CUST_NM")
    @Column(length = 1140)
    private String homenameCustNm;

    @JsonProperty("HOMEPAGE_USER_ID")
    @Column(length = 1120)
    private String homepageUserId;

    @JsonProperty("BAEBON_CD")
    @Column(length = 1110)
    private String baebonCd;

    @JsonProperty("SQUARE_SIZE")
    @Column(precision = 10, scale = 6)
    private BigDecimal squareSize;

    @JsonProperty("GARO_SIZE")
    @Column(precision = 4)
    private Integer garoSize;

    @JsonProperty("SERO_SIZE")
    @Column(precision = 4)
    private Integer seroSize;

    @JsonProperty("DEPTH_SIZE")
    @Column(precision = 4)
    private Integer depthSize;

    @JsonProperty("RECV_POST_NO")
    @Column(length = 16)
    private String recvPostNo;

    @JsonProperty("RECV_ADDR1")
    @Column(length = 1100)
    private String recvAddr1;

    @JsonProperty("RECV_DAMDANG_NM")
    @Column(length = 120)
    private String recvDamdangNm;

    @JsonProperty("RECV_NICK_NM")
    @Column(length = 120)
    private String recvNickNm;

    @JsonProperty("WEB_ORD_GB")
    @Column(length = 14)
    private String webOrdGb;

    @JsonProperty("CHULGO_SORT_GB")
    @Column(precision = 5)
    private Integer chulgoSortGb;

    @JsonProperty("CHUNGU_DAMDANG_NM")
    @Column(length = 120)
    private String chunguDamdangNm;

    @JsonProperty("CHUNGU_NICK_NM")
    @Column(length = 120)
    private String chunguNickNm;

    @JsonProperty("JAKUP_IND_CNT")
    @Column(precision = 9)
    private Integer jakupIndCnt;

    @JsonProperty("BOX_BOK_QTY_YN")
    @Column(name = "BOX_BOK_QTY_YN", columnDefinition = "CHAR(1)")
    private String boxBokQtyYn;

    @JsonProperty("BOK_WMS_CNV_YN")
    @Column(name = "BOK_WMS_CNV_YN", columnDefinition = "CHAR(1)")
    private String bokWmsCnvYn;

    @JsonProperty("TAKBAE_CD")
    @Column(length = 12)
    private String takbaeCd;

    @JsonProperty("PARENT_CUST_CD")
    @Column(length = 114)
    private String parentCustCd;

    @JsonProperty("MGT_LEVEL")
    @Column(length = 2)
    private String mgtLevel = "02";

    @JsonProperty("DAEPYO_EMAIL_ADDR")
    @Column(length = 150)
    private String daepyoEmailAddr;

    @JsonProperty("DAEPYO_CP_TEL_NO")
    @Column(length = 140)
    private String daepyoCpTelNo;

    @JsonProperty("ACC_CD")
    @Column(length = 5)
    private String accCd;

    @JsonProperty("ACC_EMAIL_ADDR")
    @Column(length = 1300)
    private String accEmailAddr;

    @JsonProperty("BANP_AUTO_JAES_GB")
    @Column(length = 2)
    private String banpAutoJaesGb = "02";

    @JsonProperty("INSERT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertDt;

    @JsonProperty("INSERT_ID")
    @Column(length = 120)
    private String insertId;

    @JsonProperty("UPDATE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDt;

    @JsonProperty("UPDATE_ID")
    @Column(length = 120)
    private String updateId;

    @JsonProperty("PISS_SCH_USE")
    @Column(length = 1)
    private String pissSchUse;


    @JsonProperty("PANSWAE_DT")
    @Temporal(TemporalType.DATE)
    private Date panswaeDt;

    @JsonProperty("SALES_DAMDANG_ID")
    @Column(length = 18)
    private String salesDamdangId;

    @JsonProperty("BOK_PART")
    @Column(length = 2)
    private String bokPart = "01";

    @JsonProperty("DREAM_BIGO")
    @Column(length = 1500)
    private String dreamBigo;

    @JsonProperty("PISS_END_DT")
    @Temporal(TemporalType.DATE)
    private Date pissEndDt;

    @JsonProperty("MAIN_SALE")
    @Column(length = 2)
    private String mainSale;


    @JsonProperty("TEL_NO2")
    @Column(length = 140)
    private String telNo2;

    @JsonProperty("EXPRESS_DELIV_PATH_CD")
    @Column(length = 15)
    private String expressDelivPathCd;

    @JsonProperty("EXPRESS_DELIV_POS_CD")
    @Column(length = 110)
    private String expressDelivPosCd;

    @JsonProperty("JAEBUL_TRUST_DT")
    @Temporal(TemporalType.DATE)
    private Date jaebulTrustDt;

    @JsonProperty("CNV_STD_CD")
    @Column(length = 118)
    private String cnvStdCd;

    @JsonProperty("BANPOM_YN")
    @Column(name = "BANPOM_YN", columnDefinition = "CHAR(1)")
    private String banpomYn;

    @JsonProperty("BILL_YN")
    @Column(name = "BILL_YN", columnDefinition = "CHAR(1)")
    private String billYn;

    @JsonProperty("DM_SEND_YN")
    @Column(name = "DM_SEND_YN", columnDefinition = "CHAR(1)")
    private String dmSendYn;

    @JsonProperty("BUNJI_PRT_YN")
    @Column(name = "BUNJI_PRT_YN", columnDefinition = "CHAR(1)")
    private String bunjiPrtYn;

    @JsonProperty("USE_YN")
    @Column(name = "USE_YN", columnDefinition = "CHAR(1)")
    private String useYn;

    @JsonProperty("CHUNGU_AMT_PRT_YN")
    @Column(name = "CHUNGU_AMT_PRT_YN", columnDefinition = "CHAR(1)")
    private String chunguAmtPrtYn;

    @JsonProperty("BOX_AUTO_YN")
    @Column(name = "BOX_AUTO_YN", columnDefinition = "CHAR(1)")
    private String boxAutoYn;

    @JsonProperty("HOMEPAGE_YN")
    @Column(name = "HOMEPAGE_YN", columnDefinition = "CHAR(1)")
    private String homepageYn;

    @JsonProperty("DAEPYO_NM_YN")
    @Column(name = "DAEPYO_NM_YN", columnDefinition = "CHAR(1)")
    private String daepyoNmYn;

    @JsonProperty("BANP_TRUST_YN")
    @Column(name = "BANP_TRUST_YN", columnDefinition = "CHAR(1)")
    private String banpTrustYn;

    @JsonProperty("BOK_PANSWAE_YN")
    @Column(name = "BOK_PANSWAE_YN", columnDefinition = "CHAR(1)")
    private String bokPanswaeYn;

    @JsonProperty("SCAN_YN")
    @Column(name = "SCAN_YN", columnDefinition = "CHAR(1)")
    private String scanYn;

    @JsonProperty("TOT_SCAN_YN")
    @Column(name = "TOT_SCAN_YN", columnDefinition = "CHAR(1)")
    private String totScanYn;

    @JsonProperty("SUNLBL_USE_YN")
    @Column(name = "SUNLBL_USE_YN", columnDefinition = "CHAR(1)")
    private String sunlblUseYn;

    @JsonProperty("PRT_GB")
    @Column(name = "PRT_GB", columnDefinition = "CHAR(1)")
    private String prtGb;

    @JsonProperty("JAEBUL_TRUST_YN")
    @Column(name = "JAEBUL_TRUST_YN", columnDefinition = "CHAR(1)")
    private String jaebulTrustYn;

    @JsonProperty("JULPAN_TRUST_YN")
    @Column(name = "JULPAN_TRUST_YN", columnDefinition = "CHAR(1)")
    private String julpanTrustYn;

    @JsonProperty("PLT_USE_KPP")
    @Column(name = "PLT_USE_KPP", columnDefinition = "CHAR(2)")
    private String pltUseKpp;

    @JsonProperty("PLT_USE_AJ")
    @Column(name = "PLT_USE_AJ", columnDefinition = "CHAR(2)")
    private String pltUseAj;

    @JsonProperty("PLT_USE_NG")
    @Column(name = "PLT_USE_NG", columnDefinition = "CHAR(2)")
    private String pltUseNg;

    @JsonProperty("PLT_USE_EX")
    @Column(name = "PLT_USE_EX", columnDefinition = "CHAR(2)")
    private String pltUseEx;
}
