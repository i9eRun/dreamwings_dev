package com.nalgae.dreamnalgae.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nalgae.dreamnalgae.model.CodeDto;
import com.nalgae.dreamnalgae.repository.CodeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CodeService {

    private final CodeRepository repo;
    private final JdbcTemplate jdbcTemplate;

    // public CodeService(CodeRepository repo) {
    //     this.repo = repo;
    // }

    public List<CodeDto> getCodesByGroup(String groupCd) {
        return repo.findByGroupCd(groupCd);
    }

    public List<Map<String, Object>> getTableCodes(String table, String codeField, String nameField, String whereClause) {
        System.out.println(whereClause);
        StringBuilder sql = new StringBuilder();
        sql.append("select ")
            .append(codeField).append(" ").append("as codeCd, ")
            .append(nameField).append(" ").append("as codeNm ")
            .append("from ").append(table).append(" ").append("where 1=1 and use_yn=1 ");

        if (whereClause != null && !whereClause.trim().isEmpty()) {
            sql.append(whereClause).append(" ");
        }

        sql.append("order by ").append(codeField).append(", ").append(nameField);

        System.out.println(sql);

        return jdbcTemplate.queryForList(sql.toString());
    }

    
    
}
