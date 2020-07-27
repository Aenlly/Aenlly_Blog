package com.aenlly.action;

import com.aenlly.bean.Paging;
import com.aenlly.entity.*;
import com.aenlly.service.*;
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
    @Autowired
    private PostTypeService postTypeService;
    @Autowired
    private IndexService indexService;
    @Autowired
    private PostThemeService postThemeService;

    private Index_Entity indexEntity=new Index_Entity();
    private PostType_Entity postTypeEntity=new PostType_Entity();
    private PostTheme_Entity postThemeEntity=new PostTheme_Entity();
    private Post_Entity postEntity=new Post_Entity();
    private Admin_Entity adminEntity=new Admin_Entity();//必须得实例化，否则一直为空

    public Index_Entity getIndexEntity() {
        return indexEntity;
    }

    public void setIndexEntity(Index_Entity indexEntity) {
        this.indexEntity = indexEntity;
    }

    public PostType_Entity getPostTypeEntity() {
        return postTypeEntity;
    }

    public void setPostTypeEntity(PostType_Entity postTypeEntity) {
        this.postTypeEntity = postTypeEntity;
    }

    public PostTheme_Entity getPostThemeEntity() {
        return postThemeEntity;
    }

    public void setPostThemeEntity(PostTheme_Entity postThemeEntity) {
        this.postThemeEntity = postThemeEntity;
    }

    public Post_Entity getPostEntity() {
        return postEntity;
    }

    public void setPostEntity(Post_Entity postEntity) {
        this.postEntity = postEntity;
    }

    public Admin_Entity getAdminEntity() {
        return adminEntity;
    }

    public void setAdmin_Entity(Admin_Entity adminEntity) {
        this.adminEntity = adminEntity;
    }

    private int pageNow=1;//初始化第一页
    private int pageSize=10;//内容的显示条度
    private int istrue=-1;//判断单击了某个管理
    private int count=-1;

    //显示内容管理页显示
    public String release(){

        List<PostTheme_Entity> themelist=postThemeService.getAll();//查询主题
        List<PostType_Entity> typelist=postTypeService.getAll();//查询类别

        ActionContext.getContext().put("themelist",themelist);//存进主题
        ActionContext.getContext().put("typelist",typelist);//存进类别

        setIstrue(0);
        return "release";
    }

    public String releaseadd(){
        System.out.println(postEntity.getPostAuthor());
        System.out.println(postEntity.getPostTitle());
        System.out.println(postEntity.getCateName());
        System.out.println(postEntity.getPostContent());
        boolean isbool=postService.save(postEntity);
        System.out.println(isbool);
        ActionContext.getContext().put("iscontadd", isbool);
        return release();
    }


    public String list() {
        // 查询显示
        try {
            List<Admin_Entity> list = adminService.getAll(adminEntity.getAdminNickname());
            ActionContext.getContext().put("adminlists", list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "list";
    }

    //文章管理显示
    public String article(){
        istrue=getIstrue();//获得判断显示值
        pageNow=getPageNow();//获得页码
        pageSize=getPageSize();//获得页显示数
        int counts=postService.getCount("文章");//获得总记录数
        if(pageNow<1||pageNow>(pageSize+count-1)/pageSize)//判断点击的页码是否小于1
            pageNow=1;
        Paging paging=new Paging(pageNow,pageSize,counts);//获得页的总页数等
        List<Post_Entity> list=postService.getTitle(pageNow,pageSize,"文章");//获得文章的内容


        setIstrue(1);//设置导航栏选择判断值

        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("paging",paging);//存储页码数据到pagin中

        return "article";
    }

    //文章搜索管理
    public String article_title(){
        istrue=getIstrue();//获得判断显示值
        count=postService.getLikeCount(postEntity.getPostTitle(),"文章");//获得总记录数
        List<Post_Entity> list=postService.getLikeTitle(postEntity.getPostTitle(),"文章");//获得文章的内容

        setIstrue(1);//设置导航栏选择判断值
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("count",count);//存储查询的总记录数到count中
        return "article_title";
    }

    //删除文章
    public String article_del(){
        boolean isbooldel=postService.delete(postService.getId(postEntity.getPostId()));

        setIstrue(1);//设置导航栏选择判断值
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("isbooldel",isbooldel);//存储用于判断显示界面的值到istrue中
        return article();
    }

    //作品管理显示
    public String works(){
        istrue=getIstrue();//获得判断显示值
        pageNow=getPageNow();//获得页码
        pageSize=getPageSize();//获得页显示数
        int counts=postService.getCount("作品");//获得总记录数
        if(pageNow<1||pageNow>(pageSize+count-1)/pageSize)//判断点击的页码是否小于1
            pageNow=1;
        Paging paging=new Paging(pageNow,pageSize,counts);//获得页的总页数等
        List<Post_Entity> list=postService.getTitle(pageNow,pageSize,"作品");//获得文章的内容

        setIstrue(2);//设置导航栏选择判断值
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("paging",paging);//存储页码数据到pagin中

        return "works";
    }

    //作品搜索管理
    public String works_title(){
        istrue=getIstrue();//获得判断显示值
        count=postService.getLikeCount(postEntity.getPostTitle(),"作品");//获得总记录数
        List<Post_Entity> list=postService.getLikeTitle(postEntity.getPostTitle(),"作品");//获得作品的内容

        setIstrue(2);//设置导航栏选择判断值
        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("articlelist",list);//存储显示的内容到pagelist中
        ActionContext.getContext().put("count",count);//存储查询的总记录数到count中
        return "works_title";
    }

    //主题管理显示
    public String type(){
        List<PostType_Entity> list=postTypeService.getAll();//获得全部类型
        setIstrue(3);//设置导航栏选择判断值

        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("typelist",list);//存储查询的类型到typelist中
        return "type";
    }

    public String typeadd(){
        int bool=postTypeService.save(postTypeEntity);
        if(bool==0){
            ActionContext.getContext().put("onaddtrue", -1);//用于判断是否成功
        }else {
            ActionContext.getContext().put("onaddtrue", bool);//用于判断是否成功
        }
        return type();
    }

    public String typeedit(){
        boolean bool=postTypeService.update(postTypeEntity);
        ActionContext.getContext().put("onedit",bool);
        return type();
    }

    public String typedel(){
        boolean bool=postTypeService.delete(postTypeService.getId(postTypeEntity.getCateId()));
        ActionContext.getContext().put("ondel", bool);//用于判断是否成功
        return type();
    }

    //主页管理
    public String index(){
        List<Index_Entity> list=indexService.getAll();//获得主页信息
        setIstrue(5);//设置导航栏选择判断值

        ActionContext.getContext().put("istrue",istrue);//存储用于判断显示界面的值到istrue中
        ActionContext.getContext().put("indexlist",list);//存储查询的主页信息到indexlist中
        return "index";
    }

    //主页管理更新
    public String indexupdate() {
        boolean bool = indexService.update(indexEntity);//更新获取返回值
        ActionContext.getContext().put("ontrue", bool);//用于判断是否弹出保存成功提示框
        return index();
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
