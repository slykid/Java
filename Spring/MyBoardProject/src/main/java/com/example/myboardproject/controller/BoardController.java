/**
 * packageName  : com.example.myboardproject.controller
 * fileName     : BoardFormController
 * author       : kilhyunkim
 * date         : 25. 2. 4.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 4.          kilhyunkim         최초작성
 */
package com.example.myboardproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    private final PostService postService;

    @Autowired
    public BoardController(PostService postService) {
        this.postService = postService;
    }


    // 게시판 조회
    @GetMapping("/board/list")
    public String listBoard(Model model) {
        List<Post> posts = postService.findPosts();
        model.addAttribute("posts", posts);

        return "board/list";
    }


    // 게시글 작성
    @GetMapping("/board/writePost")
    public String writePostForm() {
        return "board/writePostForm";
    }

    @PostMapping("/board/writePost")
    public String savePost() {


        return "redirect:/board/list";
    }


    // 로그인
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login() {

        return "redirect:/";
    }


    // 회원가입
    @GetMapping("/signup")
    public String signupForm() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());


        memberService.join(member);

        return "redirect:/";
    }

}
