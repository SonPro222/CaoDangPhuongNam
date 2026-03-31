package org.example.caodangphuongnam.common_chung.util_tienich;
//dùng cho update file
public class FileUtil {

    public static String getExtension(String filename) {
        return filename.substring(filename.lastIndexOf(".") + 1);
    }
}