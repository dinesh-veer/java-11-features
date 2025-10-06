package com.dinesh.varChanges;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

/**
 * Infer type for var variable
 *
 * <p></p>
 * Reference: <a href="https://docs.oracle.com/en/java/javase/17/language/local-variable-type-inference.html">Oracle var reference</a>
 * <a href="https://openjdk.org/projects/amber/guides/lvti-style-guide">Open JDK documentation</a>
 */
public class VarTypeInferenceExamples {

    public static void main(String[] args) throws IOException {

        //Previously we have to give specific names for each variable
        URL url = new URL("https://google.com");
        URLConnection uc = url.openConnection();
        Reader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));

        //Above code can be written in simple way using var type
        //var is reserved type name not a keyword
        var url1 = new URL("https://www.google.com/");
        var urlConnection = url1.openConnection();
        var reader1 = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        //Local variable declaration
        var list = new ArrayList<Integer>(); //infers ArrayList
        var stream = list.stream();         //infers Stream
        var path = Paths.get("src/sample.txt"); //Infers Path
        var bytes = Files.readAllBytes(path); //Infers bytes[]

        //Enhanced for loop
        var myList = Arrays.asList('A', 'B', 'C', 'D');
        for (var i = 0; i < myList.size(); i++) { //infers Character
            System.out.println(myList.get(i));
        }

        //try with resources variable
        try(var input = new FileInputStream("src/sample.txt");
        var fileReader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        }

        //var in Lambda example
        BiFunction<Integer, Integer, Integer> biFunction = (var a, var b) -> a + b;
        System.out.println(biFunction.apply(5, 3));

        //Lambda expression with var also with var with int.
        /*
        (var x, y) -> x + y;       // Cannot mix var and inferred formal parameters
        // in implicitly typed lambda expressions
        (var x, int y) -> x + y;  // Cannot mix var and manifest types
        // in explicitly typed lambda expressions
        */


    }
}