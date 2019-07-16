package com.rongcloud.integrate.model;

import java.io.File;

public class ModelUtils {

    /**
     * 判断 model 是否存在
     * @param path
     * @return
     */
    public static boolean isExsitModel(String path) {
        if (path == null) {
            return false;
        }
        File file = new File(path);
        if (file != null && file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null) {
                return false;
            }
            return true;
        }

        return false;
    }


}
