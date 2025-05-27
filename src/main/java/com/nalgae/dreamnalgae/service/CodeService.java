package com.nalgae.dreamnalgae.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nalgae.dreamnalgae.model.CodeDto;
import com.nalgae.dreamnalgae.repository.CodeRepository;

@Service
public class CodeService {

    private final CodeRepository repo;

    public CodeService(CodeRepository repo) {
        this.repo = repo;
    }

    public List<CodeDto> getCodesByGroup(String groupCd) {
        return repo.findByGroupCd(groupCd);
    }
    
}
