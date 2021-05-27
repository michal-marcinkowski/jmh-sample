package dev.cloudility.sample.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.AverageTime)
public class JmhTestTest { //must be public

    @Benchmark
    public void test() { //method must be public
        JmhTest.main(new String[]{});
    }

    public static void main(String[] args) throws Exception {
        new Runner(createOptions()).run();
    }

    private static Options createOptions() {
        return new OptionsBuilder()
                .include(JmhTestTest.class.getSimpleName())
                .build();
    }
}
