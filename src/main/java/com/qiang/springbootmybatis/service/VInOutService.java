package com.qiang.springbootmybatis.service;

import com.qiang.springbootmybatis.dao.entity.VInOutEntity;

import java.util.List;

public interface VInOutService {

    List<VInOutEntity> getAll();

    boolean insert(VInOutEntity entity);
}
