package com.fei.lang;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        File file = new File("com.fei.lang");
        File[] children = file.listFiles();
        DateFormat format = DateFormat.getDateInstance();
        for(File child : children)
        {
            System.out.println(child.getAbsolutePath() + " ;\t " +
                        child.isDirectory() + " ;\t " +
                        format.format(new Date(child.lastModified()))
            );
        }
    }
}
