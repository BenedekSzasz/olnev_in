package dev.tanto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    public static ArrayList<NameDict> readContent() {
        try {
            return tryreadContent();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

private static ArrayList<NameDict> tryreadContent() throws FileNotFoundException {
    ArrayList<NameDict> nameDictList = new ArrayList<>();
    String fileName = Prop.getFilename();
    File file = new File(fileName);
    try (Scanner sc = new Scanner(file, "utf8")) {
        sc.nextLine();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            NameDict nameDict = new NameDict();
            String[] lineArray = line.split(";");
            if (lineArray.length > 1) {
                nameDict.setHunName(lineArray[0]);
                nameDict.setItName(lineArray[1]);
                nameDictList.add(nameDict);
            }
        }
    }
    return nameDictList;
}
}
