package com.aenlly.editor;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.StrutsRequestWrapper;

public class UeditorFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String URL = httpServletRequest.getRequestURI();//获得URL
        //过滤掉ueditor中的controller.jsp页面。如果存在同名页面，则使用controller.jsp的全路径
        if(URL.endsWith("controller.jsp")) {
            chain.doFilter(new StrutsRequestWrapper(httpServletRequest), response);
        }else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }
}