package com.qiang.springbootmybatis.dao.mapper;

import com.qiang.springbootmybatis.dao.entity.VInOutEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VInOutMapper {

    int insert(VInOutEntity v);

    List<VInOutEntity> getAll();
}
