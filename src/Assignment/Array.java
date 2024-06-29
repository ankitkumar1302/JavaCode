package Assignment;

public class Array {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findMaxMin(arr));
    }


    // 1) Find the Maximum and Minimum Element in an Array
    public static String findMaxMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) { // for(int i:arr){}
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return "Max: " + max + " Min: " + min;
    }

    // 2)Reverse an Array
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) { // for(int i:arr){}
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }


//what to do now??
//TODO: create an array


// insert values

    /*
   1) Find the Maximum and Minimum Element in an Array
    Write a function that takes an array of integers as input and
    returns the maximum and minimum elements in the array.





    2)Reverse an Array Write a function that takes an array of
     integers as input and returns the array in reversed order.

    3)Find the Duplicate Number Given an array of
    integers where each element appears twice except for one.
    Write a function to find the single number that doesn't have
    a duplicate in the array.

    4)Rotate an Array Given an array, rotate the array
    to the right by k steps, where k is a non-negative number.

    5)Two Sum Given an array of integers, return indices of the
    two numbers such that they add up to a specific target.
     You may assume that each input would have
    exactly one solution, and you may not use the same element twice.

    6)Find the Majority Element Given an array of size n, find the majority element.
    The majority element is the element that appears more than ⌊ n/2 ⌋
    times.

    7)Find All Numbers Disappeared in an Array Given an array of integers
    where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
    Find all the elements of [1, n] inclusive that do not appear in this array.

    8)Product of Array Except Self Given an array nums
    of n integers where n > 1, return an array output such that output[i]
     is equal to the product of all the elements of nums except nums[i].



     */


}
