package com.kolmikra.sequence;

public interface IntSequence {
    public int next();

    public default boolean hasNext() {
        return true;
    }

    public static IntSequence of(int... args) {
        return new CubeSequence(args);
    }

    public static IntSequence ofWithAnonClass(int... args) {
        return new IntSequence() {
            private int counter;

            @Override
            public int next() {
                int nextElem = args[counter];
                counter++;
                return nextElem * nextElem * nextElem;
            }

            @Override
            public boolean hasNext() {
                return counter == args.length - 1;
            }
        };
    }

    public static IntSequence constant(int n) {
        return new IntSequence() {
            public int next() {
                return n;
            }

            public boolean hasNext() {
                return true;
            }
        };
    }

    public static IntSequence constantLambda(int n) {
        return () -> n;
    }
}
