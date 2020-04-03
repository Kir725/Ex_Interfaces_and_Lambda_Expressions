package com.kolmikra.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorter {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        boolean inRaiseOrder = true;
        while (inRaiseOrder) {
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    inRaiseOrder = false;
                    break;
                }
            }
            Collections.shuffle(strings);
        }
    }
}
