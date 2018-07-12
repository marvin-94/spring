package com.marvin.spring.data;

import com.marvin.spring.model.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
