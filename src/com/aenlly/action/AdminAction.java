package com.aenlly.action;

import com.aenlly.bean.Paging;
import com.aenlly.entity.Admin_Entity;
import com.aenlly.entity.Post_Entity;
import com.aenlly.service.AdminService;
import com.aenlly.service.PostService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller("adminAction")
@Scope("prototype")
public class AdminAction extends ActionSupport {
    @Autowired
    private AdminService adminService;
    @Autowired
    private PostService postService;

    private Post_Entity post_Entity=new Post_Entity();
    private Admin_Entity admin_Entity=new Admin_Entity();//必须得实例化，否则一直为空

    public Post_Entity getPost_Entity() {
        return post_Entity;
    }

    public void setPost_Entity(Post_Entity post_Entity) {
        this.post_Entity = post_Entity;
    }

    public Admin_Entity getAdmin_Entity() {
        return admin_Entity;
    }

    public void setAdmin_Entity(Admin_Entity admin_Entity) {
        this.admin_Entity = admin_Entity;
    }

    private int pageNow=1;
    private int pageSize=10;

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
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

    public String Page(){
        pageNow=getPageNow();
        pageSize=getPageSize();
        int count=postService.getCount(1);
        System.out.println("pageNow"+pageNow);
        if(pageNow<1||pageNow>(pageSize+count-1)/pageSize)
            pageNow=1;
        Paging paging=new Paging(pageNow,pageSize,count);
        List<Post_Entity> list=postService.getTitle(pageNow,pageSize,1);
        ActionContext.getContext().put("pagelist",list);
        ActionContext.getContext().put("paging",paging);
        return "page";
    }
}
