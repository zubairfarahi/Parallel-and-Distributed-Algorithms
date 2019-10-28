# Laboratory 2

Use ** mutex **, ** barrier ** and solve a * race condition *.

All requirements can be run and exemplified by the 'run_cerenza' rules in * Makefile *.

## allCores

It runs `sqrt (ULONG_MAX)` 10,000 times 3 times to keep all processor cores at 100%.

## addVectors

Add 2 vectors using parallelism.

Each * thread * performs a portion of the vectors.

## raceCondition

Solve a * race condition * created by 2 threads that execute both `a + = 2` on the same variable
global using a ** mutex **.

You can use the `testCorrectnessIntensive.sh` script for verification.

## oneTwo

Displays 1 and 2 1000 times each. Each display is made in a separate thread.
It is desired to be displayed first 1 1000 times and then 2.

For synchronization, a ** barrier ** is used.