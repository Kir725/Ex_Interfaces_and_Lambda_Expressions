package com.kolmikra.sequence;

import com.kolmikra.sequence.IntSequence;

public class CubeSequence implements IntSequence {
    private int[] container;
    private int counter = 0;

    public CubeSequence(int... inputSequence) {
        this.container = inputSequence;
    }

    @Override
    public int next() {
        int nextElem = container[counter];
        counter++;
        return nextElem * nextElem * nextElem;
    }

    @Override
    public boolean hasNext() {
        return counter == container.length - 1;
    }
}
