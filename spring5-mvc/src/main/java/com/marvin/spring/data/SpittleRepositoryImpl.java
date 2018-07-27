package com.marvin.spring.data;

import com.marvin.spring.model.Spittle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return createSpittleList(count);
    }

    @Override
    public Spittle findSpittle(long max) {
        return null;
    }

    private List<Spittle> createSpittleList(int count) {
        List<Spittle> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(new Spittle("Spittle" + i, new Date()));
        }
        return result;
    }
}
