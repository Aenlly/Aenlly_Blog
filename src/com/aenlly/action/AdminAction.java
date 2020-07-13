package com.aenlly.action;

import com.aenlly.entity.Admin_Entity;
import com.aenlly.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("adminAction")
@Scope("prototype")
public class AdminAction extends ActionSupport {
    @Autowired
    private AdminService adminService;

    private Admin_Entity admin_Entity=new Admin_Entity();//必须得实例化，否则一直为空

    public Admin_Entity getAdmin_Entity() {
        return admin_Entity;
    }

    public void setAdmin_Entity(Admin_Entity admin_Entity) {
        this.admin_Entity = admin_Entity;
    }

    public String list() {
        System.out.println("你好");
        // 查询显示
        try {
            List<Admin_Entity> list = adminService.getAll(admin_Entity.getAdminNickname());
            ActionContext.getContext().put("adminlists", list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "list";
    }
}
