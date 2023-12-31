package com.example.service;

import com.example.repository.IConvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertService  implements IConvertService{
    @Autowired
    private IConvertRepository convertRepository;
    @Override
    public double Convert(double VND) {
        return convertRepository.Convert(VND);
    }
}
