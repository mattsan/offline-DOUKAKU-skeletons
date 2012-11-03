import static org.junit.Assert.*;
import java.io.*;

public class Test {
    @org.junit.Test
    public void simpleAdd() throws Exception {
        final FileInputStream in = new FileInputStream("patterns.tsv");
        final InputStreamReader reader = new InputStreamReader(in, "US-ASCII");
        final BufferedReader buffered = new BufferedReader(reader);
        String line;
        while ((line = buffered.readLine()) != null) {
            final String[] parts = line.split("\t");
            assertEquals(
                parts[0] + " failed",
                Answer.solve(parts[1]),
                parts[2]
            );
        }
    }
}

/*
% javac -cp .:junit-4.10.jar Answer.java Test.java; java -cp .:junit-4.10.jar org.junit.runner.JUnitCore Test
JUnit version 4.10
.E
Time: 0.007
There was 1 failure:
1) simpleAdd(Test)
org.junit.ComparisonFailure: #2 failed expected:<1[23]45> but was:<1[32]45>
        at org.junit.Assert.assertEquals(Assert.java:125)
        at Test.simpleAdd(Test.java:13)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
        at java.lang.reflect.Method.invoke(Method.java:597)
        at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:45)
        at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:15)
        at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:42)
        at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:20)
        at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:263)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:68)
        at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:47)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:300)
        at org.junit.runners.Suite.runChild(Suite.java:128)
        at org.junit.runners.Suite.runChild(Suite.java:24)
        at org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)
        at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)
        at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)
        at org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)
        at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)
        at org.junit.runners.ParentRunner.run(ParentRunner.java:300)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:157)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:136)
        at org.junit.runner.JUnitCore.run(JUnitCore.java:117)
        at org.junit.runner.JUnitCore.runMain(JUnitCore.java:98)
        at org.junit.runner.JUnitCore.runMainAndExit(JUnitCore.java:53)
        at org.junit.runner.JUnitCore.main(JUnitCore.java:45)

FAILURES!!!
Tests run: 1,  Failures: 1
*/
