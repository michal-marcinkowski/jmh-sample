package dev.cloudility.sample.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Fork(value = 1, warmups = 4)
@Warmup(iterations = 3, time = 1)
@Measurement(iterations = 5, time = 2)
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
