//package com.bananalab.corecloud.configure;
//
//
//import com.bananalab.corecloud.filter.CrossDomainFilter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @ Author ：李文龙 @ Date ：Created in 13:29 2018/10/11
// *
// * @ Description：${description} @ Modified By：
// */
//@Configuration
//public class ServletConfig {
//
//	@Bean
//	public FilterRegistrationBean crossDomainFilter() {
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		registrationBean.setFilter(new CrossDomainFilter());
//		List<String> urlPatterns = new ArrayList();
//		urlPatterns.add("/bananalab/article");
//		urlPatterns.add("/bananalab/article/detail");
//		urlPatterns.add("/bananalab/consult");
//		registrationBean.setOrder(1);
//		registrationBean.setUrlPatterns(urlPatterns);
//		return registrationBean;
//	}
//}
