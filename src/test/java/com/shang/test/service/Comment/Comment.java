package com.shang.test.service.Comment;

import com.shang.service.Comment.CommentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class Comment {
    @Test
    public void tesst() throws Exception {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configcontext.xml");
        CommentService commentService = cpx.getBean(CommentService.class);
        commentService.insertComment(1,4,1,"sss",1);
    }
}
