package com.andreykliev.input_output.write;

public class WritngToConsole implements Writer{
    @Override
    public void write(String item) {
        System.out.println(item + " ");
    }
}
