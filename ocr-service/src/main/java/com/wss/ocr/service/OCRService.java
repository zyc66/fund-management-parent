package com.wss.ocr.service;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class OCRService {

    private final ITesseract tesseract;

    public OCRService() {
        tesseract = new Tesseract();
        // 设置Tesseract的OCR语言库为中文，根据需要选择简体中文或繁体中文
        tesseract.setLanguage("chi_sim");  // 简体中文
        // tesseract.setLanguage("chi_tra");  // 繁体中文
    }

    public String performOCR(File imageFile) {
        try {
            return tesseract.doOCR(imageFile).trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "OCR失败：" + e.getMessage();
        }
    }
}
