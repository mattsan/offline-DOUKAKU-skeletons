use strict;
use warnings;
use Test::More;
use Answer qw(solve);

open my $in, '<', 'patterns.tsv' or die;
while (<$in>) {
    tr/\r\n//d;
    my ($num, $input, $expected) = split /\t/, $_, 3;
    is +(solve $input), $expected, "TEST $num";
}

done_testing;

__END__
% prove -v test.t
test.t ..
ok 1 - TEST \#1
not ok 2 - TEST \#2
ok 3 - TEST \#3
1..3

#   Failed test 'TEST \#2'
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
