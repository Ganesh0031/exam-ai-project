package com.example.ExamGuider.Controller;

import com.example.ExamGuider.Service.ServiceImpl.HuggingFaceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/hf-ai")

public class HuggingFaceController {

    private final HuggingFaceService service;

    public HuggingFaceController(HuggingFaceService service) {
        this.service = service;
    }

    @PostMapping("/ask")
    public String ask(@RequestBody Map<String, String> req) {
        return service.askAI(req.get("question"));
    }
}