package com.andreykliev;

import com.andreykliev.input_output.read.Reader;
import com.andreykliev.input_output.write.Writer;
import com.andreykliev.service.Sorter;
import com.andreykliev.service.comparator.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean isDescSorting = false;
    static boolean isStringSorting = false;
    static Writer writer;
    static List<Reader> readers = new ArrayList<>();

    public static void main(String[] args) {
        new CommandLineParser().parse(args);
        Sorter sorter = new Sorter.Builder()
                .writer(writer)
                .comparator(new Comparator(isDescSorting, isStringSorting))
                .addFlows(readers)
                .build();
        sorter.sort();

        String header = "Done!";
        System.out.println(header);
    }
}