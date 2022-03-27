package com.company;

import java.io.File;

import static com.company.Main.status;

public class DirCreator {

    public void createDir(String path) {
        if (new File(path).mkdirs()) {
            status.append("Folder was created: " + path + '\n');
        } else {
            status.append("Wasn't created folder: " + path + '\n');
        }
    }
}
