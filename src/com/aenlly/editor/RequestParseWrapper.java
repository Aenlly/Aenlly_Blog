package com.aenlly.editor;

import org.apache.struts2.dispatcher.multipart.JakartaMultiPartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*  必须要有该方法  */
public class RequestParseWrapper extends JakartaMultiPartRequest {
    public void parse(HttpServletRequest servletRequest, String saveDir)throws IOException
    {

    }
}