
# Laboratory 5
Introduction to multithreading using _Java_

It presents basic concepts such as:
- `Thread`
- `Runnable`
- `synchronized`
- `volatile`

## Bugs
There are some code snippets that contain either bugs or apparent behaviors
strangers that need to be repaired or explained

### Bug 1
In `main ()` we call the `run ()` method in `MyThread`, which means that all
"threads" run sequentially. To run in parallel, you need to
call `start ()`, and increment of` value` to be ** synchronized **.

### Bug 2
When a thread holds the lock of an object, any new attempt of the same
thread to get that lock is possible and no deadlock appears.

The phenomenon is called [reentrant synchronization] (https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html).

On top of that, every class automatically has a lock on itself.

### Bug 3
Because a and b are initially references to the same string and _Java_ is cretin,
it makes the same reference. If one of the strings changes, they appear
_race conditions_ because the threads will be synchronized by objects
different.

### Bug 4
Because of the automatic optimizations that _Java_ makes, the mofification of the variable
`keepRunning` is known only by the main thread, not the secondary thread.
By changing its type to a volatile one, the variable is not hidden, and again
changes are always written to _RAM_, from where they are visible to
all threads.

### Bug 5
Classic deadlock scenario: each thread gets a lock and waits for it
the other to release the one he still needs.

The solution is that the 2 `synchronized` blocks are no longer nested, for
that the first block in each threa release their lock before attempting to
get a new one.

## doubleVectorElements
`` Matlab
v. * = 2;
``
parallelized

## helloWorld
As in [Lab 1] (https://github.com/teodutu/APD/blob/master/Laboratoare/Lab1/helloWorld.c), but in _Java_.

## shortestPathsFloyd_Warshall
_Roy-Floyd_ parallelized. Nothing special here either.