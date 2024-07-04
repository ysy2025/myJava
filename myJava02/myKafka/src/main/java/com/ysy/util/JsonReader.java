package com.ysy.util;

import java.io.*;

public class JsonReader {

    /**
     * 读取json文件，返回json串
     * @param fileName
     * @return
     */
    public String readFile1Line(String fileName) {
        String jsonStr = "";
        try {
            File File = new File(fileName);
            FileReader fileReader = new FileReader(File);

            Reader reader = new InputStreamReader(new FileInputStream(File),"utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String readFilenLine(String path) {

        return "";
    }
}
