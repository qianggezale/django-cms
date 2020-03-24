package com.qiang.springbootmybatis.service.impl;

import com.qiang.springbootmybatis.dao.mapper.VInOutMapper;
import com.qiang.springbootmybatis.dao.entity.VInOutEntity;
import com.qiang.springbootmybatis.service.VInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

@Service
public class VInOutServiceImpl implements VInOutService {

    @Autowired
    private VInOutMapper vInOutMapper;

    @Override
    public List<VInOutEntity> getAll() {

        return vInOutMapper.getAll();
    }

    @Override
    public boolean insert(VInOutEntity entity) {
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(date));
//        return vInOutMapper.insert(entity
//                //new VInOutEntity(1, "22", "adress2",new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()))
//        ) > 0;

        return vInOutMapper.insert(entity) > 0;
    }
}
