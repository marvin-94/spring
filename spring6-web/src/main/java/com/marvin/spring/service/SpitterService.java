package com.marvin.spring.service;

import com.marvin.spring.model.Spitter;
import org.springframework.stereotype.Service;

@Service
public class SpitterService {
    private static Spitter spitter;

    public void register(Spitter spitter) {
        SpitterService.spitter = spitter;
    }


}
