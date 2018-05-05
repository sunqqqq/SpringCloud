package com.sunqqqq.springcloud.dao;

import com.sunqqqq.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Ehl
 * @date 2018/5/4
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(long id);

    List<Dept> findAll();
}
