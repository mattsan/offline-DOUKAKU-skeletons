import unittest
from answer import solve

class TestSequenceFunctions(unittest.TestCase):
    def test(self):
        with open('patterns.tsv') as f:
            for line in f:
                num, inputted, expected = line.rstrip().split("\t")
                self.assertEqual(
                    solve(inputted), expected, "%s failed" % num
                    )

if __name__ == '__main__':
    unittest.main()

# % python2.7 test.py
# F
# ======================================================================
# FAIL: test (__main__.TestSequenceFunctions)
# ----------------------------------------------------------------------
# Traceback (most recent call last):
#   File "test.py", line 10, in test
#     solve(inputted), expected, "%s failed" % num
# AssertionError: #2 failed
# 
# ----------------------------------------------------------------------
# Ran 1 test in 0.000s
# 
# FAILED (failures=1)
