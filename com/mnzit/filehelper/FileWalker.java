package com.mnzit.filehelper;


import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mnzit
 */
public class FileWalker {

    File file;

    public void walk(String directory, String type) {
        file = new File(directory);
        if (file.isDirectory() && !type.isEmpty()) {
            for (File listFile : file.listFiles()) {
                if (listFile.isDirectory()) {
                    walk(listFile.getAbsolutePath(), type);
                } else {
                    if (listFile.getName().endsWith(type)) {
                        System.out.println(listFile.getAbsolutePath());
                    }
                }
            }
        }else{
            System.out.println("Directory or type not found");
        }
    }

    public static void main(String[] args) {
        FileWalker f = new FileWalker();
        f.walk("D:\\Each for all","pptx");
    }
}
