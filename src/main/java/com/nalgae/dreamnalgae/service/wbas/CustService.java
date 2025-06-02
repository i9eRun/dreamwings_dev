package com.nalgae.dreamnalgae.service.wbas;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nalgae.dreamnalgae.entity.wbas.Cust;
import com.nalgae.dreamnalgae.repository.wbas.CustRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustService {
    private final CustRepository custRepository;

    public List<Cust> findAll() {
        return custRepository.findAll();
    }

    public Optional<Cust> findById(String custCd) {
        return custRepository.findById(custCd);
    }

    public Cust save(Cust cust) {
        return custRepository.save(cust);
    }

    public void deleteById(String custCd) {
        custRepository.deleteById(custCd);
    }
    
    
}
