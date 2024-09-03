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


        LinkedList<TreeNode> queue = new LinkedList();

        queue.offer(root);

        Queue<Integer> posQueue = new LinkedList();
        posQueue.offer(0);

        HashMap<Integer,List<Integer>> map = new HashMap();

        int minPos = Integer.MAX_VALUE;


        while(!queue.isEmpty()){

            TreeNode node = queue.poll();
            int pos = posQueue.poll();

            List<Integer> list = map.getOrDefault(pos,new LinkedList());


            list.add(node.val);
            map.put(pos,list);

            if(node.left != null){
                queue.offer(node.left);
                posQueue.offer(pos -1);
            }


            if(node.right != null){
                queue.offer(node.right);
                posQueue.offer(pos+1);

            }

            minPos = Math.min(minPos,pos);

        }

        for(int i = minPos ; i < minPos + map.size() ; i++){
            result.add(map.get(i));
        }

        return result;
    }
}
