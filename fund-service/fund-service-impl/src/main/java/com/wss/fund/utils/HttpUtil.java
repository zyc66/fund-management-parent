package com.wss.fund.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class HttpUtil {

    private static final RestTemplate restTemplate = new RestTemplate();

    public static String sendGetRequest(String url) {
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }

    public static String sendPostRequest(String url, String requestBody) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
        return response.getBody();
    }

    public static void main(String[] args) {
        // 示例用法
        String getUrl = "https://jsonplaceholder.typicode.com/posts/1";
        String postUrl = "https://jsonplaceholder.typicode.com/posts";
        String requestBody = "{\"title\": \"foo\",\"body\": \"bar\",\"userId\": 1}";

        // 发送GET请求
        String getResponse = sendGetRequest(getUrl);
        System.out.println("GET Response: " + getResponse);

        // 发送POST请求
        String postResponse = sendPostRequest(postUrl, requestBody);
        System.out.println("POST Response: " + postResponse);
    }
}
