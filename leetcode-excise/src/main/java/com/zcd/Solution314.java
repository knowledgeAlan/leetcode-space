package com.zcd;



import java.util.*;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 3/9/24 4:32 pm
 */
public class Solution314 {


    public List<List<Integer>> verticalOrder(TreeNode root){
        List<List<Integer>> result =  new LinkedList();


        if(root == null ) {
            return  result;
        }


         Map<Integer,ArrayList> columnTable = new HashMap<>();

        Queue<Pair<TreeNode,Integer>> queue = new ArrayDeque();


        int column = 0;

        queue.offer(new Pair<>(root,column));

        while(!queue.isEmpty()){

            Pair<TreeNode,Integer> p = queue.poll();


            root = p.getKey();
            column = p.getValue();

            if(root != null){
                if(!columnTable.containsKey(column)){
                    columnTable.put(column,new ArrayList());
                }


                columnTable.get(column).add(root.val);

                queue.offer(new Pair<>(root.left,column-1));
                queue.offer(new Pair<>(root.right,column+1));
            }
        }


        List<Integer> sortedKey = new ArrayList<>(columnTable.keySet());

        Collections.sort(sortedKey);

        for(int k:sortedKey){
            result.add(columnTable.get(k));
        }
        return result;
    }
}
