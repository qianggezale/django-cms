package com.qiang.springbootmybatis.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class VInOutEntity implements Serializable {
    private long id;
    private String name;
    private String adress;
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date stime;
    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date etime;

}
