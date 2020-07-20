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

    private int pageNow=1;//初始化第一页
    private int pageSize=10;//内容的显示条度
    private int istrue=-1;//判断单击了某个管理
    private String isin=null;
    private int count=-1;

    //显示内容管理页
    public String release(){
        setIstrue(0);
        return "release";
    }

    public String list() {
        // 查询显示
        try {
            List<Admin_Entity> list = adminService.getAll(admin_Entity.getAdminNickname());
            ActionContext.getContext().put("adminlists", list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "list";
    }

    public String article(){
        istrue=getIstrue();//获得判断显示值
        pageNow=getPageNow();//获得页码
        pageSize=getPageSize();//获得页显示数
        int counts=postService.getCount(1);//获得总记录数
        if(pageNow<1||pageNow>(pageSize+count-1)/pageSize)//判断点击的页码是否小于1
            pageNow=1;
        Paging paging=new Paging(pageNow,pageSize,counts);//获得页的总页数等
        List<Post_Entity> list=postService.getTitle(pageNow,pageSize,1);//获得文章的内容

        setIsin("Administration");//设置管理导航栏的判断值
        setIstrue(1);//设置导航栏选择判断值
        ActionContext.getContext().put("isin",isin);
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("paging",paging);//存储页码数据到pagin中

        return "article";
    }

    public String article_title(){
        istrue=getIstrue();//获得判断显示值
        count=postService.getLikeCount(post_Entity.getPostTitle(),1);//获得总记录数
        List<Post_Entity> list=postService.getLikeTitle(post_Entity.getPostTitle(),1);//获得文章的内容
        setIsin("Administration");//设置管理导航栏的判断值
        setIstrue(1);//设置导航栏选择判断值
        ActionContext.getContext().put("isin",isin);
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("count",count);//存储查询的总记录数到count中
        return "article_title";
    }

    public String works(){
        istrue=getIstrue();//获得判断显示值
        pageNow=getPageNow();//获得页码
        pageSize=getPageSize();//获得页显示数
        int counts=postService.getCount(2);//获得总记录数
        if(pageNow<1||pageNow>(pageSize+count-1)/pageSize)//判断点击的页码是否小于1
            pageNow=1;
        Paging paging=new Paging(pageNow,pageSize,counts);//获得页的总页数等
        List<Post_Entity> list=postService.getTitle(pageNow,pageSize,2);//获得文章的内容

        setIsin("Administration");//设置管理导航栏的判断值
        setIstrue(2);//设置导航栏选择判断值
        ActionContext.getContext().put("isin",isin);
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("paging",paging);//存储页码数据到pagin中

        return "works";
    }

    public String works_title(){
        istrue=getIstrue();//获得判断显示值
        count=postService.getLikeCount(post_Entity.getPostTitle(),2);//获得总记录数
        List<Post_Entity> list=postService.getLikeTitle(post_Entity.getPostTitle(),2);//获得作品的内容
        setIsin("Administration");//设置管理导航栏的判断值
        setIstrue(2);//设置导航栏选择判断值
        ActionContext.getContext().put("isin",isin);
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("count",count);//存储查询的总记录数到count中
        return "works_title";
    }

    public int getIstrue() {
        return istrue;
    }

    public void setIstrue(int istrue) {
        this.istrue = istrue;
    }

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

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
