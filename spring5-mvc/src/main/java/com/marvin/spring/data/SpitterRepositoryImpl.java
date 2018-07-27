package com.marvin.spring.data;

import com.marvin.spring.model.Spitter;
import org.springframework.stereotype.Component;

@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    private static Spitter ss;
    @Override
    public void save(Spitter spitter) {
        ss = spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return ss;
    }


}
