package com.qingguatang.Java5minute.course4;

import com.qingguatang.Java5minute.course4.model.Comment;
import com.qingguatang.Java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CommentControl {

    @Autowired
    private CommentPostControl commentPostControl;

    @RequestMapping(value = "/comments")
    public String comments(ModelMap modelMap){

        List<Comment> comments =commentPostControl.getComments("35847388");
        modelMap.addAttribute("comments",comments);

        return "comments";
    }

    /*private List<Comment> getComment(){

        List<Comment> commens = new ArrayList<>();

        Comment comment = new Comment();
        comment.setIcon("http://p1.music.126.net/vGKrH1IzLT27xF8TPEGE7Q==/109951163411337685.jpg?param=50y50");
        comment.setNickName("Harden");
        comment.setComment("hello！一转眼四年了！终于等到王者的归来~阿呆的全球屠榜又要开始啦！在此献上我的鸡腿！嘻嘻~");
        comment.setCommentTime("2015年11月20日");
        comment.setLikeNum(6578);

        commens.add(comment);

        comment = new Comment();
        comment.setIcon("http://p1.music.126.net/lBtYhCnEPpDVKad-XIwz5A==/109951162896749127.jpg?param=50y50");
        comment.setNickName("Kobe");
        comment.setComment("我真的是从头等到尾，你终于出来了，你的播放列表我真的快听烂了！这张专辑又要听三四年了！");
        comment.setCommentTime("2015年10月23日");
        comment.setLikeNum(890);

        commens.add(comment);

        return commens;
    }*/
}
