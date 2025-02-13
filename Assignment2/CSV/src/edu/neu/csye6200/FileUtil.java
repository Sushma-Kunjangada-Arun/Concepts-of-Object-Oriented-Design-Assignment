package edu.neu.csye6200;

import java.io.*;
import java.util.*;

public class FileUtil {
	
    public static List<String> readFile(String filename) throws IOException {
        List<String> lines = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        
        return lines;
    }
}