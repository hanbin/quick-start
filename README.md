# quick-start

一个Spring boot的简单Quick Start

## 一句话描述

这个工程没有提供太多的东西。
一个基于Spring Boot 2.4.2的纯净Spring Boot项目，依赖了`spring-boot-starter-web`和`Lombok`以及`Swagger`。

## 功能介绍

- 封装了基础的CommonResponse类；
- 配置了Swagger配置；
- 添加了一个极简的token验证`AuthInterceptor`，并且在Swagger页面中可以直接填写测试；
- 提供了`CustomApplicationReadyEvent`和`PrintSomethingBean` ，分别实现了`ApplicationListener<ApplicationReadyEvent>`和`CommandLineRunner`，参考这两个类可以在项目启动过程中做一些初始化动作和日志打印。
- 提供了全局异常拦截，封装了自定义异常`ApplicationException`, 建议在主动抛异常时使用这个。
- 提供了全局异常处理。

## 访问截图

-  Swagger访问地址： http://localhost:8888/doc.html

- Swagger接口访问截图：
  
![错误token](https://oss.hanbinit.com.cn/img/image-20210209002135806.png)

![token正确，接口正常返回](https://oss.hanbinit.com.cn/img/image-20210209002225107.png)