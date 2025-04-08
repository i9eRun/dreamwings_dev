package com.nalgae.goldwings.service.oman;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nalgae.goldwings.entity.oman.User;
import com.nalgae.goldwings.repository.oman.Oman1001Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Oman1001Service {

    private final Oman1001Repository oman1001Repository;

    public List<User> getAllUsers() {
        return oman1001Repository.findAll(); // 전체 사용자 목록 조회
    }
}
