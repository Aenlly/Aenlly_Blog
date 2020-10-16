package com.aenlly.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("contentAction")
@Scope("prototype")
public class ContentAction extends ActionSupport {

    public String centview(){
        return "view";
    }
}
