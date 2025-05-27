package com.nalgae.dreamnalgae.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nalgae.dreamnalgae.model.CodeDto;
import com.nalgae.dreamnalgae.service.CodeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/code")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class CodeController {
    private final CodeService service;

    // public CodeController(CodeService service) {
    //     this.service = service;
    // }
    
    @GetMapping("/{groupCd}")
    public List<CodeDto> getCodesByGroup(@PathVariable String groupCd) {
        return service.getCodesByGroup(groupCd);
    }

}
