package com.gmail.lizaiatsenko;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

@Component
public class FileManager {
    public Set<String> getExtentionList(String folder){
        File dir= new File(folder);
        Set<String> extList= new TreeSet<>();
        for (String fileName : dir.list()) {
            File file= new File((dir.getAbsolutePath() + "\\" + fileName));
            int i= fileName.lastIndexOf(".");
            if(file.isFile() && i!=-1){
                extList.add(fileName.substring(i+1, fileName.length()).toLowerCase());
            }
        }
        return extList;
    }

    public Map<String, Integer> getExtentionCount(String folder){
        File dir= new File(folder);
        Map<String, Integer> map= new HashMap<>();
        for (String ext: getExtentionList(folder)) {
            FilenameFilter filter= new CustomFileFilter(ext);
            map.put(ext, dir.listFiles().length);
        }
        return map;
    }

    public void sayHello(){
        System.out.println("hello");
    }
}
