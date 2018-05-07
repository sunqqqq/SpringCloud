package com.sunqqqq.springcloud.controller;

import com.sunqqqq.springcloud.entities.Dept;
import com.sunqqqq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Ehl
 * @date 2018/5/4
 */
@RestController
public class DeptController_Consumer {
    //    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
//    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping(value = "/consumer/dept/add")
//    public boolean add(Dept dept) {
//        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, boolean.class);
//    }
//
//    @RequestMapping(value = "/consumer/dept/get/{id}")
//    public Dept get(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
//    }
//
//    @RequestMapping(value = "/consumer/dept/list")
//    public List<Dept> list() {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
//    }
//
//    @RequestMapping(value = "/consumer/dept/discovery")
//    public Object discovery() {
//        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
//    }

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return service.list();
    }
}
