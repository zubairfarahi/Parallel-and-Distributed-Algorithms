# Laboratory 4
Different types of sorting are parallelized:
- _shear sort_
- _may sort_
- _bubble sort_

All running and testing can be done through the file
`Makefile`.

## Goes lucky
Initially each thread will operate on its own range.

When the difference between the start and end indices is equal to the length
of the interclassification, the threads will overlap 2 each 2. In this
in case one dies and the other one extends to incorporate the interval.

The inversion of the vectors (the one of the interclass and the one of the data) is done by
thread 0.

## Bubble sort
** OETS ** is implemented.

An additional barrier is used to run the algorithm until the string is
sorted, not by a fixed number of `N` times.

## Shear luck
In order to be able to use (somewhat) `qsort` and columns, the matrix is ​​transposed
before sorting by columns and then the matrix is ​​transposed again after
`Qsort`,