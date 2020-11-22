package com.kay.cn.util;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class FileUtils {

    public static String getContent(String path) {
        try (InputStream is = FileUtils.class.getResourceAsStream(path)){
            StringWriter writer = new StringWriter();

            IOUtils.copy(is, writer, "UTF-8");
            return writer.toString();
        } catch (IOException e) {
            return null;
        }
    }
}
