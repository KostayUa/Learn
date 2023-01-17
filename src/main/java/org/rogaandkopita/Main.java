package org.rogaandkopita;

import org.rogaandkopita.finder.Finder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{8, 5, 3, 10, 7, 4};

        System.out.println("Please enter any number for searching:");

        int x = readLine();

        int result = Finder.find(arr, x);

        if (result != -1)
            System.out.println("Position is: " + result);
        else
            System.out.println("Number is not found.");
    }

    public static int readLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
}