## MergeSort Algorithm


    MergeSort(A, p, r):
    if p > r 
    
        return
        
    q = (p+r)/2
    
    mergeSort(A, p, q)
    
    mergeSort(A, q+1, r)
    
    merge(A, p, q, r)
    

## The merge function works as follows:

Create copies of the subarrays L ← A[p..q] and M ← A[q+1..r].

Create three pointers i, j and k

i maintains current index of L, starting at 1

j maintains current index of M, starting at 1

k maintains the current index of A[p..q], starting at p.

Until we reach the end of either L or M, pick the larger among the elements from L and M and place them in the correct position at A[p..q]

When we run out of elements in either L or M, pick up the remaining elements and put in A[p..q]

## Merge Sort Complexity
Time Complexity	 

Best	O(n*log n)

Worst	O(n*log n)

Average	O(n*log n)

Space Complexity	O(n)

Stability	Yes
