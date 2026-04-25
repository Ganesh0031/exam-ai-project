package com.example.ExamGuider.Controller;


import com.example.ExamGuider.Service.ServiceImpl.GeminiService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ai")

public class AIController {

    private final GeminiService geminiService;

    public AIController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> body) {
        return geminiService.askAI(body.get("question"));
    }
}