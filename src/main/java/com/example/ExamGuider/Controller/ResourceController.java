package com.example.ExamGuider.Controller;

import com.example.ExamGuider.Entity.Resource;
import com.example.ExamGuider.Service.ServiceImpl.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resources")

public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @PostMapping("/{examId}")
    public Resource add(@PathVariable Long examId,
                        @RequestBody Resource resource) {
        return resourceService.addResource(examId, resource);
    }

    @GetMapping("/{examId}")
    public List<Resource> get(@PathVariable Long examId) {
        return resourceService.getResources(examId);
    }
}
