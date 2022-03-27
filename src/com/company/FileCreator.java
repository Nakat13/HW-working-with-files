package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


import static com.company.Main.status;

public class FileCreator {

    public void createFile(String path) {
        try {
            if (new File(path).createNewFile())
                status.append("File was created: " + path + '\n');
            else {
                status.append("Wasn't created file: " + path + '\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFiles(String[] filesToDelete) {
        try {
            for (String s : filesToDelete) {
                Files.delete(Path.of(s));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
