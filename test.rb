require "runit/testcase"
require "runit/cui/testrunner"

require "answer.rb"

class AnswerTest < RUNIT::TestCase
  def test
    IO.foreach("patterns.tsv") do |line|
      num, input, expected = line.chomp.split("\t")
      assert_equal (solve input), expected, "#{num} failed."
    end
  end
end

RUNIT::CUI::TestRunner.run(AnswerTest.suite)

__END__
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
