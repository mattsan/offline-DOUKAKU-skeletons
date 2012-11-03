module Main where
import Test.HUnit
import Answer

main :: IO ()
main = do
  eachLines <- lines `fmap` readFile "patterns.tsv"
  patterns <- return $ split3 `fmap` eachLines
  tests <- return $ (TestCase . doAssert) `fmap` patterns
  runTestTT $ TestList tests
  return ()
    where split3 str = let (x, xs)   = split str
                           (x', x'') = split xs
                       in (x, x', x'')
          split = (id >< tail) . break (== '\t')
          doAssert (name, input, expected) =
              assertEqual name expected (solve input)
          (><) :: (a -> b) -> (c -> d) -> (a, c) -> (b, d)
          (f >< g) (x, y) = (f x, g y)

-- % runhaskell test.hs
-- ### Failure in: 1
-- #2
-- expected: "13245"
--  but got: "12345"
-- Cases: 3  Tried: 3  Errors: 0  Failures: 1
