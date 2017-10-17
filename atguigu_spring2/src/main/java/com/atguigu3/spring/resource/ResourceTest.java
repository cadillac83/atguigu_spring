package com.atguigu3.spring.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by maxudong on 2017/4/21.
 * Resources：
 1.UrlResource：URL对应的资源，根据一个URL地址即可构建
 2.ClassPathResource：获取类路径下的资源文件
 3.FileSystemResource：获取文件系统里面的资源
 4.ServletContextResource：ServletContext封装的资源，用于访问ServletContext环境下地资源
 5.InputStreamResource：针对于输入流封装的资源
 6.ByteArrayResource：针对于字节数组封装的资源

 所有的Application contexts都实现了ResourceLoader类
 classpath*:  classpath下所有文件
 */
@Component
public class ResourceTest implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    //去单元测试类中查看效果
    public void resource_classpath() throws IOException {
        Resource resource = applicationContext.getResource("classpath:resource_test/config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }

    //去单元测试类中查看效果
    public void resource_file() throws IOException {
        Resource resource = applicationContext.getResource("file:E:\\protect\\atguigu_spring\\atguigu_spring2\\src\\main\\resources\\resource_test\\config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
