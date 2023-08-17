package com.andreykliev.input_output.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile implements Writer {

    private File file;

    public WritingToFile(File file) {
        this.file = file;
    }

    @Override
    public void write(String item) {
        if (file == null){
            System.out.println("Фаил не найден");
        }
        if (item == null){
            System.out.println("Элемент для записи не найден");
        }
        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(item + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
