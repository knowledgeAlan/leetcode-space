package com.zcd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 19/11/24 12:09 pm
 */
public class Solution320 {

    public static void main(String[] args) {

        String word = "word";
        List<String> ans = new ArrayList();

        backtrack(ans,new StringBuilder(),word,0,0);

        ans.forEach(System.out::println);
    }

    private static void backtrack(List<String> ans,StringBuilder builder,String word,int i,int k){
        int len = builder.length();
        if(i == word.length()){

            if( k != 0){
                builder.append(k);
            }

            ans.add(builder.toString());

        }else{


            backtrack(ans,builder,word,i+1,k+1);

            if( k != 0){
                builder.append(k);
            }

            builder.append(word.charAt(i));

            backtrack(ans,builder,word,i+1,0);
        }

        builder.setLength(len);
    }
}
