package com.example.ExamGuider.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class HuggingFaceService {

    @Value("${hf.api.token}")
    private String token;

    @Value("${hf.api.url}")
    private String apiUrl;
    public String askAI(String question) {

        RestTemplate restTemplate = new RestTemplate();

        String prompt = "Act as a government exam mentor. Give clear guidance: " + question;

        Map<String, Object> body = Map.of(
                "inputs", prompt,
                "options", Map.of("wait_for_model", true)
        );

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request =
                new HttpEntity<>(body, headers);

        ResponseEntity<String> response =
                restTemplate.postForEntity(apiUrl, request, String.class);

        return response.getBody();
    }
}