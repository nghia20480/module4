package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ConvertRepository implements IConvertRepository {
    @Override
    public double Convert(double VND) {
        double USD;
        USD=VND/23000;
        return USD;
    }
}
