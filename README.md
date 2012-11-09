# Offline DOUKAKU Test Skeltons

## Test Pattern File and Format

## Languages

### C

* test.c
* answer.h
* answer.c


        % gcc answer.c test.c -o c_test; ./c_test
        Failure in #2
        expected: 13245
          actual: 12345
        
        Cases: 3  Failures: 1

### C++

* test.cpp
* answer.hpp
* answer.cpp


        % g++ answer.cpp test.cpp -o cpp_test; ./cpp_test
        Failure in #2
        expected: "13245"
          actual: "12345"
        
        Cases: 3  Failures: 1

### Groovy

* Test.groovy
* Answer.groovy


        % groovy Test.groovy 
        .E
        Time: 0.138
        There was 1 error:
        1) testSimpleAdd(Test)Assertion failed: 
        
        assert parts[2].equals(Answer.solve(parts[1]))
            |    |   |             |     |    |
            |    |   false         12345 |    12345
            |    13245                   [#2, 12345, 13245]
            [#2, 12345, 13245]
        
            at org.codehaus.groovy.runtime.InvokerHelper.assertFailed(InvokerHelper.java:386)
            at org.codehaus.groovy.runtime.ScriptBytecodeAdapter.assertFailed(ScriptBytecodeAdapter.java:658)
            at Test$_testSimpleAdd_closure1.doCall(Test.groovy:8)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
            at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)
            at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:233)
            at org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:272)
            at groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:877)
            at groovy.lang.Closure.call(Closure.java:412)
            at groovy.lang.Closure.call(Closure.java:425)
            at org.codehaus.groovy.runtime.DefaultGroovyMethods.callClosureForLine(DefaultGroovyMethods.java:3588)
            at org.codehaus.groovy.runtime.DefaultGroovyMethods.eachLine(DefaultGroovyMethods.java:14291)
            at org.codehaus.groovy.runtime.DefaultGroovyMethods.eachLine(DefaultGroovyMethods.java:14098)
            at org.codehaus.groovy.runtime.DefaultGroovyMethods.eachLine(DefaultGroovyMethods.java:14064)
            at org.codehaus.groovy.runtime.dgm$181.invoke(Unknown Source)
            at org.codehaus.groovy.runtime.callsite.PojoMetaMethodSite$PojoMetaMethodSiteNoUnwrapNoCoerce.invoke(PojoMetaMethodSite.java:271)
            at org.codehaus.groovy.runtime.callsite.PojoMetaMethodSite.call(PojoMetaMethodSite.java:53)
            at org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:42)
            at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:108)
            at org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:116)
            at Test.testSimpleAdd(Test.groovy:6)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
            at org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:90)
            at groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:233)
            at groovy.lang.MetaClassImpl.invokeStaticMethod(MetaClassImpl.java:1280)
            at org.codehaus.groovy.runtime.InvokerHelper.invokeStaticMethod(InvokerHelper.java:819)
            at org.codehaus.groovy.runtime.InvokerHelper.invokeStaticMethod(InvokerHelper.java:65)
            at groovy.lang.GroovyShell.runJUnit3Test(GroovyShell.java:351)
            at groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:281)
            at groovy.lang.GroovyShell.run(GroovyShell.java:229)
            at groovy.lang.GroovyShell.run(GroovyShell.java:159)
            at groovy.ui.GroovyMain.processOnce(GroovyMain.java:550)
            at groovy.ui.GroovyMain.run(GroovyMain.java:337)
            at groovy.ui.GroovyMain.process(GroovyMain.java:323)
            at groovy.ui.GroovyMain.processArgs(GroovyMain.java:120)
            at groovy.ui.GroovyMain.main(GroovyMain.java:100)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
            at org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:108)
            at org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:130)
        
        FAILURES!!!
        Tests run: 1,  Failures: 0,  Errors: 1

### Haskell

* test.hs
* answer.hs


        % runhaskell test.hs
        ### Failure in: 1
        #2
        expected: "13245"
         but got: "12345"
        Cases: 3  Tried: 3  Errors: 0  Failures: 1

### Java

* Test.java
* Answer.java
* Junit-4.10.jar


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

### Lua

* test.lua
* answer.lua


        % lua test.lua
        Failuer in #2
        expected: 13245
          actual: 12345
        
        Cases: 3  Failures: 1

### Perl

* test.t
* Answer.pm


        % prove -v test.t
        test.t ..
        ok 1 - TEST ¥#1
        not ok 2 - TEST ¥#2
        ok 3 - TEST ¥#3
        1..3
        
        #   Failed test 'TEST ¥#2'
        #   at test.t line 10.
        #          got: '12345'
        #     expected: '13245'
        # Looks like you failed 1 test of 3.
        Dubious, test returned 1 (wstat 256, 0x100)
        Failed 1/3 subtests
        
        Test Summary Report
        -------------------
        test.t (Wstat: 256 Tests: 3 Failed: 1)
          Failed test:  2
          Non-zero exit status: 1
        Files=1, Tests=3,  0 wallclock secs ( 0.02 usr  0.01 sys +  0.01 cusr  0.00 csys =  0.04 CPU)
          Result: FAIL

### Prolog

* test.prolog
* answer.prolog


If using SWI-Prolog …

        % swipl -s test.prolog -g tests -t halt
        Failure in #2
        expected: 13245
          actual: 12345
        Cases: 3  Failures: 1

If using GNU-Prolog …

        % gprolog --consult-file test.prolog --entry-goal 'tests, halt'
        Failure in #2
        expected: 13245
          actual: 12345
        Cases: 3  Failures: 1

### Python

* test.py
* answer.py


        % python2.7 test.py
        F
        ======================================================================
        FAIL: test (__main__.TestSequenceFunctions)
        ----------------------------------------------------------------------
        Traceback (most recent call last):
          File "test.py", line 10, in test
            solve(inputted), expected, "%s failed" % num
        AssertionError: #2 failed
        ----------------------------------------------------------------------
        Ran 1 test in 0.000s
        FAILED (failures=1)

### Ruby

* test.rb
* answer.rb


        % ruby test.rb
        Loaded suite AnswerTest
        Started
        AnswerTest#test: F
        
        Finished in 0.00554 seconds.
        
          1) Failure:
        AnswerTest#test
            [test.rb:10:in `test'
             test.rb:8:in `foreach'
             test.rb:8:in `test'
             .../ruby/1.8/runit/testcase.rb:42:in `run'
             .../ruby/1.8/runit/testsuite.rb:23:in `run']:
        #2 failed.
        <"12345"> expected but was
        <"13245">.
        
        1 tests, 2 assertions, 1 failures, 0 errors

### Scala

* Test.scala
* Answer.scala
* scalatest_2.9.0-1.8.jar


        % scalac -cp .:scalatest_2.9.0-1.8.jar Test.scala Answer.scala; scala -cp .:scalatest_2.9.0-1.8.jar org.scalatest.run Test
        Run starting. Expected test count is: 3
        Test:
        - TEST #1
        - TEST #2 *** FAILED ***
          "1[23]45" did not equal "1[32]45" (Test.scala:11)
        - TEST #3
        Run completed in 118 milliseconds.
        Total number of tests run: 3
        Suites: completed 1, aborted 0
        Tests: succeeded 2, failed 1, ignored 0, pending 0
        *** 1 TEST FAILED ***

