package com.example.demo;

import com.example.demo.Mapper.HrMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Hrimpl implements Ihr{
    @Resource
    private HrMapper hrMapper;

    @Override
    public List<Hr> findHr() {
        List<Hr> list1=hrMapper.findHr();
        return list1;
    }
}
