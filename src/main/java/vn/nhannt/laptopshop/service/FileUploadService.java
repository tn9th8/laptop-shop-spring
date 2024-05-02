package vn.nhannt.laptopshop.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;

@Service
public class FileUploadService {

    private final ServletContext servletContext;

    // DI
    public FileUploadService(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String store(MultipartFile file, String targetDir) {
        String finalFileName = "";
        try {
            // code: rootPath = getRealPath + stringPath + File.separator + targetDir
            // mean: absolutePath = "...\webapp\" + relativePath + "\" + targetDir
            String rootPath = this.servletContext.getRealPath("/resources/images");
            File dir = new File(rootPath + File.separator + targetDir); // File.separator = "\"
            // if directory is not existed => make new directory
            if (!dir.exists())
                dir.mkdirs();
            // Doi ten file se luu
            // Should: use uuid algorithm so that final file name is unique in 100 years
            finalFileName = +System.currentTimeMillis() + "-" + file.getOriginalFilename();
            // Create the filer rong on server (serverFile)

            File serverFile = new File(dir.getAbsolutePath() + File.separator + finalFileName);
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(serverFile));
            // Lay file of request duoi dang binary (requestFile)
            byte[] requestFile = file.getBytes();
            // Write requestFile into new serverFile
            stream.write(requestFile);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalFileName;
    }

}
