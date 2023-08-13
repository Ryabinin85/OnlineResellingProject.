package com.example.onlineresellingproject.service;

import org.springframework.web.multipart.MultipartFile;

public interface FilesService {
    String saveUserImage(MultipartFile file, String newFileName);

    String saveAdsImage(MultipartFile file, String newFileName);

    String getNewFileName(MultipartFile file);
}
