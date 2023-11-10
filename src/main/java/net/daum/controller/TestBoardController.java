package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;
import net.daum.service.TestBoardService;

@Controller
@RequiredArgsConstructor
public class TestBoardController {
    private final TestBoardService testBoardService;

    @GetMapping("/aop_cont")
    public String aop_cont(@RequestParam int bno,
                           Model model){
        model.addAttribute("board", testBoardService.getBoardById(bno));

        return "aop_cont";
    }
}