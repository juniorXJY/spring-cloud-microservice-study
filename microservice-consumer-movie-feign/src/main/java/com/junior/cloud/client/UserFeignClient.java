package com.junior.cloud.client;

import com.junior.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    User findByIdFeign(@RequestParam("id") Long id);
}