package com.example.repository;

import org.springframework.stereotype.Repository;
import sun.security.mscapi.CKeyPairGenerator;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ConvertRepository implements IConvertRepository {
    @Override
    public String Convert(String Word) {
        Map<String,String> map=new HashMap<>();
        map.put("hello","chao");
        map.put("bye","tam biet");
        String Ketqua=null;
        for (String key : map.keySet()) {
            if (key.equals(Word)){
                Ketqua=map.get(key);
                return Ketqua;
            } else {
                Ketqua = "Khong tim thay tu";
           return Ketqua;
            }

        }
        return Ketqua;

    }
}
