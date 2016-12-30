package com.codingbat.array2;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.RunnerException;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

/**
 * @author Oleksandr Subbotin
 * @version 1.0
 * @since 20.12.16
 */
@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
public class BenchMore14 {
    public static final int LOAD_MULT = 100;
    public static final int N = 1_000_000;

    private int[] nums;
    private More14 testObj;

    public static void main(String[] ignore) throws IOException, RunnerException {
        final String[] args = {
                ".*BenchMore14.*",
                "-wi",
                "3",
                "-i",
                "5",
                "-f",
                "3"
        };
        Main.main(args);
    }

    @Setup
    public void init() {
        testObj = new More14();
        addNums();
    }

    private void addNums() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        nums = IntStream.range(0, N * LOAD_MULT)
                .map(i -> random.nextInt(1, 11))
                .toArray();
    }

    @Benchmark
    public void benchJ7() {
        testObj.more14(nums);
    }

    @Benchmark
    public void benchJ9() {
        testObj.more14_8(nums);
    }
}
