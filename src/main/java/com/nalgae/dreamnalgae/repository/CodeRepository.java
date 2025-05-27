package com.nalgae.dreamnalgae.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.nalgae.dreamnalgae.model.CodeDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class CodeRepository {

    @PersistenceContext
    private EntityManager em;

    public List<CodeDto> findByGroupCd(String groupCd) {
        String sql = """
                SELECT code_cd, code_nm
                FROM tb_code_m
                WHERE group_cd = :groupCd
                    AND use_yn = '1'
                """;

        Query query = em.createNativeQuery(sql);
        query.setParameter("groupCd", groupCd);
        List<Object[]> rows = query.getResultList();

        return rows.stream()
        .map(r -> new CodeDto((String)r[0],(String)r[1]))
        .collect(Collectors.toList());

    }

}
