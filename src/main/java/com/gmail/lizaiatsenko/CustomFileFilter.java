package com.gmail.lizaiatsenko;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by liza on 03/03/2017.
 */
public class CustomFileFilter implements FilenameFilter {
    private String ext;
    public CustomFileFilter(String ext) {
        this.ext= ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toUpperCase().endsWith("." + ext.toUpperCase());
    }
}
