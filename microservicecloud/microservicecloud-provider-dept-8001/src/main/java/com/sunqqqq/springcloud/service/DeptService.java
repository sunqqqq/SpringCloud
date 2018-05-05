package com.sunqqqq.springcloud.service;

import com.sunqqqq.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Ehl
 * @date 2018/5/4
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept get(long id);

    List<Dept> list();
}
