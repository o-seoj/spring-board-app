package kr.co.sboard.service;

import kr.co.sboard.dto.CommentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentServiceTest {

    @Autowired
    CommentService commentService;

    @Test
    void getCommentAll() {
        List<CommentDTO> dtoList = commentService.getCommentAll(7);
        System.out.println(dtoList);
    }

    @Test
    void getComment() {

    }

    @Test
    void save() {

            CommentDTO commentDTO = CommentDTO.builder()
                    .ano(7)
                    .content("5번 댓글 1")
                    .writer("os3754")
                    .reg_ip("321.2.2.2")
                    .build();

            CommentDTO savedCommentDTO = commentService.save(commentDTO);
            System.out.println(savedCommentDTO);

    }

    @Test
    void update() {

    }

    @Test
    void delete() {

    }
}