package com.qiang.springbootmybatis.contorller;

import com.qiang.springbootmybatis.dao.entity.VInOutEntity;
import com.qiang.springbootmybatis.service.VInOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class VInOutController {

    @Autowired
    VInOutService vInOutService;

    @GetMapping("/v/getinouts")
    public List<VInOutEntity> getAll(HttpServletRequest request, HttpServletResponse response) {
        //request.
        return vInOutService.getAll();

    }

    @RequestMapping(path = "/v/add", method = {RequestMethod.POST})
    public boolean insertVInOut(@RequestBody VInOutEntity entity) {
        System.out.println(entity.getAdress());
        return vInOutService.insert(entity);
    }

}
