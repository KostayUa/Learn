package org.rogaandkopita.finder;

public class Finder {

    public static int find(int[] arr, int x) {
        if(arr.length == 0) return -1;
        int i = 0;

        while(true) {
            if (i >= arr.length) return -1;

            if (arr[i] == x) return i;

            i = i + 1;
        }
    }
}
