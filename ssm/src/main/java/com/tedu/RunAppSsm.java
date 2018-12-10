package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tedu.mapper")	//扫描Mybatis接口文件
public class RunAppSsm {
  public static void main(String[] args) {
	SpringApplication.run(RunAppSsm.class, args);
}
}
