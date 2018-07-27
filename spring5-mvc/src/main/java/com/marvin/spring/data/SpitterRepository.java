package com.marvin.spring.data;

import com.marvin.spring.model.Spitter;

public interface SpitterRepository {

    void save(Spitter spitter);

    Spitter findByUsername(String username);
}
