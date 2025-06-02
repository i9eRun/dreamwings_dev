package com.nalgae.dreamnalgae.service.wbas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nalgae.dreamnalgae.repository.wbas.Wbas2001Repository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Wbas2001Service {
    private final Wbas2001Repository wbas2001Repository;
    private final NamedParameterJdbcTemplate jdbc;
    private final JdbcTemplate jdbcTemplate;

    public List<Map<String,Object>> getInitData() {
        StringBuilder sql = new StringBuilder();
        sql.append("""
            select
                group_cd,
                code_cd,
                code_nm
            from tms_code_m
            where group_cd = '000'
        """);

        Map<String, Object> params = new HashMap<>();

        return jdbc.queryForList(sql.toString(), params);

    }

    @Transactional
    public void processExcelFile(MultipartFile file) throws IOException {
        //List<Book> books = new ArrayList<>();

    }

    public List<Map<String, Object>> getCustomerList(Map<String, String> params) {
        StringBuilder sql = new StringBuilder();
        List<Object> values = new ArrayList<>();

        sql.append("SELECT ")
        .append("T.CUST_CD, T.CUST_GB, T.CUST_DIV_GB, T.CUST_ABBR_NM, T.CUST_NM, ")
        .append("T.BIZ_REG_NO, T.DAEPYO_NM, T.UPTAE_NM, T.JONGMOK_NM, T.TEL_NO, ")
        .append("T.TEL_NO2, T.FAX_NO, T.EMAIL_ADDR, T.POST_NO, T.ADDR1, T.ADDR2, ")
        .append("TO_CHAR(T.TRADE_FR_DT, 'YYYYMMDD') AS TRADE_FR_DT, ")
        .append("TO_CHAR(T.TRADE_TO_DT, 'YYYYMMDD') AS TRADE_TO_DT, ")
        .append("T.SINYONG_AMT, T.MISU_AMT, T.MAGAM_DD, T.CONTR_STORE_YN, T.JIYUK_NM, ")
        .append("T.DELIV_PATH_CD, T.DELIV_POS_CD, T.EXPRESS_DELIV_PATH_CD, T.CHARGE_EMP_ID, ")
        .append("T.BIGO, T.DREAM_BIGO, T.SALE_TYPE_GB, T.GULJAE_GB, T.CHULGO_GB, T.SOSOK_NM, ")
        .append("T.BANPOM_YN, T.CUST_DIV_CD1, T.CUST_DIV_CD2, T.BILL_YN, T.DM_SEND_YN, T.BIZ_NM, ")
        .append("T.TEAM_CD, T.TEAM_NM, T.DAMDANG_NM, T.DELIV_DIV_CD, T.BUNJI_PRT_YN, ")
        .append("T.SEND_EMAIL_ADDR, T.WORK_USER_ID, TO_CHAR(T.WORK_DT, 'YYYYMMDD') AS WORK_DT, ")
        .append("T.USE_YN, T.BANP_DAMDANG_NM, T.BANP_TEAM_CD, T.BANP_TEAM_NM, T.ORD_METHOD_GB, ")
        .append("T.ORD_METHOD_GB_D, T.BOK_INI_BOKWAN_AMT, T.CHUNGU_AMT_PRT_YN, T.CHULPAN_SUB_CD, ")
        .append("T.BANP_EMAIL_ADDR, T.BONSA_SALE_NM, T.BOX_AUTO_YN, T.HOMEPAGE_ADDR, ")
        .append("T.HOMENAME_CUST_NM, T.HOMEPAGE_USER_ID, T.HOMEPAGE_YN, T.BAEBON_CD, ")
        .append("T.SQUARE_SIZE, T.GARO_SIZE, T.SERO_SIZE, T.DEPTH_SIZE, T.RECV_POST_NO, T.RECV_ADDR1, ")
        .append("T.RECV_DAMDANG_NM, T.RECV_NICK_NM, T.WEB_ORD_GB, T.CHULGO_SORT_GB, ")
        .append("T.CHUNGU_DAMDANG_NM, T.CHUNGU_NICK_NM, T.JAKUP_IND_CNT, T.BOX_BOK_QTY_YN, ")
        .append("T.BOK_WMS_CNV_YN, T.TAKBAE_CD, T.PARENT_CUST_CD, T.MGT_LEVEL, T.DAEPYO_EMAIL_ADDR, ")
        .append("T.DAEPYO_NM_YN, T.DAEPYO_CP_TEL_NO, T.ACC_CD, T.ACC_EMAIL_ADDR, T.BANP_AUTO_JAES_GB, ")
        .append("T.BANP_TRUST_YN, T.PISS_SCH_USE, T.BOK_PANSWAE_YN, T.BOK_PART, T.SUNLBL_USE_YN, T.PRT_GB, ")
        .append("T.PLT_USE_KPP, T.PLT_USE_AJ, T.PLT_USE_NG, T.PLT_USE_EX, T.JAEBUL_TRUST_YN, T.JULPAN_TRUST_YN, ")
        .append("TO_CHAR(T.JAEBUL_TRUST_DT, 'YYYYMMDD') AS JAEBUL_TRUST_DT, ")
        .append("T2.TEAM_HEAD_NM AS CHULPAN_TEAM_HEAD_NM, T2.HEAD_TEL_NO AS CHULPAN_HEAD_TEL_NO, ")
        .append("T2.DAMDANG_NM AS CHULPAN_DAMDANG_NM, T2.DAMDANG_TEL_NO AS CHULPAN_DAMDANG_TEL_NO, ")
        .append("T2.ORDER_DAMDANG_NM AS CHULPAN_ORDER_DAMDANG_NM, T2.ORDER_TEL_NO AS CHULPAN_ORDER_TEL_NO, ")
        .append("T3.USER_NM AS CHARGE_EMP_NM, T3.TEL_NO AS CHARGE_EMP_TEL_NO, T3.FAX_NO AS CHARGE_EMP_FAX_NO, ")
        .append("T4.DELIV_CAR_NO, T6.DELIV_CAR_NO AS EXPRESS_DELIV_CAR_NO, ")
        .append("T.SCAN_YN, T.TOT_SCAN_YN, TO_CHAR(T.PANSWAE_DT, 'YYYYMMDD') AS PANSWAE_DT, ")
        .append("T.SALES_DAMDANG_ID, T5.USER_NM AS SALES_DAMDANG_NM, ")
        .append("TO_CHAR(T.PISS_END_DT, 'YYYYMMDD') AS PISS_END_DT, NVL(MAIN_SALE, '01') AS MAIN_SALE ")
        .append("FROM TB_CUST T ")
        .append("LEFT JOIN TB_CHULPAN_DAMDANG T2 ON T.CUST_CD = T2.CHULPAN_CD ")
        .append("LEFT JOIN TB_COM_USER T3 ON T.CHARGE_EMP_ID = T3.USER_ID ")
        .append("LEFT JOIN TB_DELIV_PATH T4 ON T.DELIV_PATH_CD = T4.DELIV_PATH_CD ")
        .append("LEFT JOIN TB_COM_USER T5 ON T.SALES_DAMDANG_ID = T5.USER_ID ")
        .append("LEFT JOIN TB_DELIV_PATH_EXPRESS T6 ON T.EXPRESS_DELIV_PATH_CD = T6.DELIV_PATH_CD ")
        .append("WHERE 1=1 and T.SOSOK_NM = '날개물류'");

        // 동적 where 절 생성
        String panSch = params.get("panSch");
        if (isNotEmpty(panSch)) {
            sql.append(" AND T.SALE_TYPE_GB = ? ");
            values.add(panSch.trim());
        }

        String custCd = params.get("custCd");
        if (isNotEmpty(custCd)) {
            sql.append(" AND T.CUST_CD = ? ");
            values.add(custCd.trim());
        } else {
            String custNm = params.get("custNm");
            if (isNotEmpty(custNm)) {
                sql.append(" AND (T.CUST_NM LIKE '%'||?||'%' OR T.CUST_ABBR_NM LIKE '%'||?||'%') ");
                values.add(custNm.trim());
                values.add(custNm.trim());
            }

            String useYn = params.get("useYn");
            if (isNotEmpty(useYn)) {
                sql.append(" AND T.USE_YN = ? ");
                values.add(useYn.trim());
            }

            String contrStoreYn = params.get("contrStoreYn");
            if (isNotEmpty(contrStoreYn)) {
                sql.append(" AND T.CONTR_STORE_YN = ? ");
                values.add(contrStoreYn.trim());
            }

            String banpomYn = params.get("banpomYn");
            if (isNotEmpty(banpomYn)) {
                sql.append(" AND T.BANPOM_YN = ? ");
                values.add(banpomYn.trim());
            }

            String tradeToDt = params.get("tradeToDt");
            if (isNotEmpty(tradeToDt)) {
                if ("1".equals(tradeToDt.trim())) {
                    sql.append(" AND T.TRADE_TO_DT IS NOT NULL ");
                } else {
                    sql.append(" AND T.TRADE_TO_DT IS NULL ");
                }
            }

            String bunjiPrtYn = params.get("bunjiPrtYn");
            if (isNotEmpty(bunjiPrtYn)) {
                sql.append(" AND T.BUNJI_PRT_YN = ? ");
                values.add(bunjiPrtYn.trim());
            }

            String delivDivCd = params.get("delivDivCd");
            if (isNotEmpty(delivDivCd)) {
                if ("1".equals(delivDivCd.trim())) {
                    sql.append(" AND T.DELIV_DIV_CD IS NOT NULL ");
                } else {
                    sql.append(" AND T.DELIV_DIV_CD IS NULL ");
                }
            }

            String custDivGb = params.get("custDivGb");
            if (isNotEmpty(custDivGb)) {
                sql.append(" AND T.CUST_DIV_GB = ? ");
                values.add(custDivGb.trim());
            }

            String mgtLevel = params.get("mgtLevel");
            if (isNotEmpty(mgtLevel)) {
                sql.append(" AND T.MGT_LEVEL = ? ");
                values.add(mgtLevel.trim());
            }

            String teamCd = params.get("teamCd");
            if (isNotEmpty(teamCd)) {
                sql.append(" AND T.TEAM_CD = ? ");
                values.add(teamCd.trim());
            }

            String banpTeamCd = params.get("banpTeamCd");
            if (isNotEmpty(banpTeamCd)) {
                sql.append(" AND T.BANP_TEAM_CD = ? ");
                values.add(banpTeamCd.trim());
            }

            String strWhere = params.get("strWhere");
            if (isNotEmpty(strWhere)) {
                sql.append(" AND (").append(strWhere.trim()).append(") ");
            }
        }

        // ORDER BY 절
        String custNmForOrder = isNotEmpty(params.get("custNm")) ? params.get("custNm").trim() : "";
        sql.append("ORDER BY DECODE(INSTR(T.CUST_NM, ?), 0, 999999, INSTR(T.CUST_NM, ?)), T.CUST_NM, T.CUST_ABBR_NM ");
        values.add(custNmForOrder);
        values.add(custNmForOrder);

        System.out.println("파라미터 밸류값");
        System.out.println(values);
        System.out.println(sql);

        return jdbcTemplate.queryForList(sql.toString(),values.toArray());
    }



    private boolean isNotEmpty(String val) {
        return val != null && !val.trim().isEmpty();
    }







    
}
