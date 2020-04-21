package com.bananalab.corecloud.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ Author ：李文龙 @ Date ：Created in 15:16 2018/10/25
 * @ Description：${description} @ Modified By：实现跨域请求
 */
public class CrossDomainFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		HttpServletRequest request = (HttpServletRequest) servletRequest;

//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "POST, GET, DELETE, OPTIONS, DELETE, PUT");
//		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,token");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
