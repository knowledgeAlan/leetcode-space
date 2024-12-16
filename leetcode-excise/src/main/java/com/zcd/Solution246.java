package com.zcd;

import java.util.HashMap;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 9/9/24 5:19 pm
 */
public class Solution246 {
    public static void main(String[] args) {

    }

    public static boolean validateSolution246(String nums){

        HashMap<Character,Character> map = new HashMap();


        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');

        int length = nums.length();

        for (int i = 0 ; i < length;i++){
            if(map.get(nums.charAt(i)) == null){
                return false;
            }

            if(nums.charAt(length - i-1) != map.get(nums.charAt(i)) ){
                return false;
            }
        }
        return true;

    }
}
