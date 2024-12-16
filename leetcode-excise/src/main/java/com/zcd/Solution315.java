package com.zcd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 13/11/24 2:23 pm
 */
public class Solution315 {


    public static void main(String[] args) {
        int [] nums = {5,2,6,1};
        countSmaller(nums);
    }
    public static List<Integer> countSmaller(int[] nums) {

        LinkedList<Integer> result = new LinkedList();
        List<Integer> list = new ArrayList();
        for(int i = nums.length-1;i>=0;i--){

            int idx = binarySearch(list,nums[i]);
            result.addFirst(idx);
            list.add(idx,nums[i]);
        }

        return result;

    }


    public static int binarySearch(List<Integer> list,int num){
        int left = 0;
        int right = list.size() -1;

        int mid =0;

        while(left < right){

            mid = left +(right-left)/2;

            if(list.get(mid) < num){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        if(!list.isEmpty()&& list.get(left)< num){
            return left + 1;
        }

        return left;
    }
}
