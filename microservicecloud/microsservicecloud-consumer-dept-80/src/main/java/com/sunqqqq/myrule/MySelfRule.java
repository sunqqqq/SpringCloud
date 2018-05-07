package com.sunqqqq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ehl
 * @date 2018/5/6
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RoundRobinRule();

    }
}
