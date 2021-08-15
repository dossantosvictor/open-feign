package com.estudos.demo.controller;

import com.estudos.demo.DTO.PostDTO;
import com.estudos.demo.client.PostClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("posts")
public class PostController {

    private PostClient postClient;

    @GetMapping
    public List<PostDTO> gettAllPost(){
        return postClient.getAllPost();
    }



}
