package com.company;

import java.io.*;

public class Main {
    public static StringBuilder status = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // p. 1.1
        new DirCreator().createDir("Games/src");
        new DirCreator().createDir("Games/res");
        new DirCreator().createDir("Games/savegames");
        new DirCreator().createDir("Games/temp");

        // p. 1.2
        new DirCreator().createDir("Games/src/main");
        new DirCreator().createDir("Games/src/test");

        // p. 1.3
        new FileCreator().createFile("Games/src/main/Main.java");
        new FileCreator().createFile("Games/src/main/Utils.java");

        // p. 1.4
        new DirCreator().createDir("Games/res/drawables");
        new DirCreator().createDir("Games/res/vectors");
        new DirCreator().createDir("Games/res/icons");

        // p. 1.5
        new FileCreator().createFile("Games/temp/temp.txt");

        // write to file status
        try (FileWriter writer = new FileWriter("Games/temp/temp.txt")) {
            writer.write(String.valueOf(status));
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Check status of created filse here: Games/temp/temp.txt");

        // p. 2.1 + 2.2
        GameProgress gp1 = new GameProgress(10, 0, 0, 0);
        GameProgress gp2 = new GameProgress(10, 0, 0, 0);
        GameProgress gp3 = new GameProgress(10, 0, 0, 0);

        // p. 2.2
        gp1.saveGameProgr("Games/savegames/gp1.dat", gp1);
        gp2.saveGameProgr("Games/savegames/gp2.dat", gp2);
        gp3.saveGameProgr("Games/savegames/gp3.dat", gp3);

        // p. 2.3
        gp1.createZip("Games/savegames/game_progress.zip", new String[]{"Games/savegames/gp1.dat",
                "Games/savegames/gp2.dat",
                "Games/savegames/gp3.dat"});

        // p. 2.4
        new FileCreator().deleteFiles(new String[]{"Games/savegames/gp1.dat",
                "Games/savegames/gp2.dat",
                "Games/savegames/gp3.dat"});
    }
}
