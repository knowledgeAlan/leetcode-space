package com.zcd;

import java.util.HashMap;
import java.util.Map;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 14/10/24 3:52 pm
 */
public class Solution276 {


    private static Map<Integer,Integer> memo = new HashMap();
    public static void main(String[] args) {


    }


    public int totalWay(int n,int k){

        if(n==1){
            return  k;
        }

        if(n == 2){
            return k*k;
        }

        if(memo.containsKey(n)){
            return  memo.get(n);
        }

        memo.put(n,k-1 *(totalWay(n-1,k)+totalWay(n-2,k)));
        return memo.get(n);
    }
    public int numWays(int n,int k){
        return 1;
    }
}
