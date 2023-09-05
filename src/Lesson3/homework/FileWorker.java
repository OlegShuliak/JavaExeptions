package Lesson3.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWorker {

    private String fileName;

    public FileWorker() {
    }

    public void writeInFile(PersonInfo personInfo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(String.format("src\\Lesson3\\homework\\%s", personInfo.getFio().getFirstName()), true))) {
            bw.append(String.format("%s\n", personInfo));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
