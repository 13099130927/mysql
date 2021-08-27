package com.example.demo.Mapper;

import com.example.demo.Hr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HrMapper {
    @Select("select name,phone from hr")
    List<Hr> findHr();
}
