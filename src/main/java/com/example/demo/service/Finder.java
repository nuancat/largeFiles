package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Ilyas on 09.01.2019.
 */
@Service
public class Finder {

    private Path path;

    public void setLargeFilePath(String uri){
        Path path = Paths.get(uri);


    }

}
