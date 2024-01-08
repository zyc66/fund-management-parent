package com.wss.fund.controller;// OCRController.java
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.client.RestTemplate;

@RestController
public class OCRController {

    private final String OCR_SERVICE_URL = "http://localhost:5000/ocr"; // 修改为实际的OCR服务地址

    @PostMapping("/performOCR")
    public ResponseEntity<String> performOCR(@RequestPart("file") MultipartFile file) {
        // 发送HTTP POST请求到OCR服务
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.postForEntity(OCR_SERVICE_URL, file, String.class);

        // 获取OCR服务的响应
        String ocrResult = response.getBody();

        return ResponseEntity.ok("OCR Result: " + ocrResult);
    }
}
