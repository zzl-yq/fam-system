package com.zlz;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@MapperScan("com.zlz.dao")
@SpringBootApplication
public class FamSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamSystemApplication.class, args);
	}
	//配置mybatis的分页插件pageHelper
	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties props = new Properties();
		props.setProperty("dialect", "mysql");
		// 表示支持从接口中读取pageNum和pageSize
		props.setProperty("supportMethodsArguments", "true");
		pageHelper.setProperties(props);
		return pageHelper;
	}
}
