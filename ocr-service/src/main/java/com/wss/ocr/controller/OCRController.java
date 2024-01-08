package com.wss.ocr.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

@Controller
public class OCRController {

    @PostMapping("/uploadAndOCR")
    public ResponseEntity<String> handleFileUploadAndOCR(@RequestPart("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<>("Please select a file to upload.", HttpStatus.BAD_REQUEST);
        }

        try {
            // 将 MultipartFile 转换为 File
            File convertedFile = convertMultiPartToFile(file);

            // 使用 Tesseract 进行 OCR
            String ocrResult = performOCR(convertedFile);

            return new ResponseEntity<>("OCR Result: " + ocrResult, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to upload and process file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        // 获取应用程序的工作目录
        String appDirectory = System.getProperty("user.dir");

        // 在工作目录下创建文件
        File convertedFile = new File(appDirectory, file.getOriginalFilename());
        file.transferTo(convertedFile);

        System.out.println("File path: " + convertedFile.getAbsolutePath());

        return convertedFile;
    }


    private String performOCR(File file) throws TesseractException {
        if (!file.exists()) {
            System.out.println("File does not exist: " + file.getAbsolutePath());
            return "File does not exist";
        }

        Tesseract tesseract = new Tesseract();
        // 设置 Tesseract 数据目录（根据实际安装情况调整路径）
        tesseract.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata");
        // 指定使用中文语言模型（chi_sim），可以根据需要选择其他语言模型
        tesseract.setLanguage("chi_sim");


        // 识别图像文本
        return tesseract.doOCR(file);
    }
}
