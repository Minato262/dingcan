package com.kay.cn.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

@Slf4j
public class FileUtils {

    public static String getContent(String path) {
        try (InputStream is = FileUtils.class.getResourceAsStream(path)) {
            StringWriter writer = new StringWriter();

            IOUtils.copy(is, writer, StandardCharsets.UTF_8);
            return writer.toString();
        } catch (IOException e) {
            log.error("IOException error", e);
            return null;
        }
    }
}
