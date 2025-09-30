package kr.co.sboard.service;

import kr.co.sboard.dto.ArticleDTO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleServiceTest {
    private ArticleService articleService;

    @Test
    void getArticle() {
    }

    @Test
    void getArticleAll() {
    }

    @Test
    void save() {

        ArticleDTO articleDTO = ArticleDTO.builder()
                .title("제목1")
                .content("내용1")
                .writer("os3754")
                .reg_ip("123.123.2")
                .build();
        articleService.save(articleDTO);
    }

    @Test
    void modify() {
    }

    @Test
    void remove() {
    }
}