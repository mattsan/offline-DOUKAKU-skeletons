import org.scalatest.FunSuite
import scala.io.Source
import Answer.solve
 
class Test extends FunSuite {
  val source = Source.fromFile("patterns.tsv")
  val lines = source.getLines
  lines.foreach(line => {
      val parts = line split '\t'
      test("TEST " + parts(0)) {
        assert(solve(parts(1)) === parts(2))
      }
    }
  )
}

/*
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
*/
