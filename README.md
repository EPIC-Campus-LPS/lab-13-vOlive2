# Lab 13

## Euclid's Algorithm for Finding the Greatest Common Divisor

Write a recursive method to find the greatest common factor between two integers `a` and `b` using Euclid's algorithm. 

Euclid's algorithm uses the property $gcd(a, b) = gcd(b, a \mod b)$  to compute the greatest common divisor between $a$ and $b$. 

Write the public method `gcd(int a, int b)` which returns the greatest common divisor as an integer. 

In your main method, use the following test cases:

```java
System.out.println(gcd(5,10)); // 5
System.out.println(gcd(35,7)); // 7
System.out.println(gcd(1071,462)); // 21
System.out.println(gcd(1386,3213)); // 63
```

## Sum Digits of a Number

Write a recursive method `sumDigits` to sum the digits on integer `n`.

In your main method, use the following test cases:

```java
System.out.println(sumDigits(123)); // 6
System.out.println(sumDigits(12345)); // 15
System.out.println(sumDigits(95473616384058673))); // 99
```

## Binary Search in a Sorted Array

Write a recursive method to find an integer `n` in an integer array `arr` using binary search. 

Binary search algorithms recursively split the array in half over and over again until they find the element. 

Write the public method `binarySearch(int[] arr, int target)` which returns the index of the element `target` or -1 if it does not appear in the list.

In your main method, use the following test cases:

```java
System.out.println(binarySearch({1, 3, 5, 7, 9, 11, 13}, 7)); // 3
System.out.println(binarySearch({2, 4, 6, 8, 10}, 6)); // 2
System.out.println(binarySearch({42}, 42)); // 0
System.out.println(binarySearch({10, 100, 1000, 10000, 100000}, 500)); // -1
```

## Binary Representation of a Number

Write a recursive method to create a string representing the binary representation of an integer `n`. This method should have one integer parameter `n` and return a String.

In your main method, use the following test cases:

```java
System.out.println(toBinary(0)); // 0
System.out.println(toBinary(1)); // 1
System.out.println(toBinary(5)); // 101
System.out.println(toBinary(10)); // 1010
System.out.println(toBinary(42); // 101010

```

