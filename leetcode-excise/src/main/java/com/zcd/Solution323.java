package com.zcd;

/**
 * @author zhongzuoming
 * @version v1.0
 * @Description
 * @encoding UTF-8
 * @date 2024/12/19
 * @time 13:11
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
public class Solution323 {

    public static void main(String[] args) {
        System.out.println("hello");
    }


    private int find(int[] representative,int vertex){
        if(vertex == representative[vertex]){
            return vertex;
        }

        return representative[vertex] = find(representative,representative[vertex]);
    }


    private int combine(int[] representative,int[] size,int vertex1,int vertex2){
        vertex1 = find(representative,vertex1);
        vertex2 = find(representative,vertex2);

        if(vertex1 == vertex2){
            return 0;
        }else{
            if(size[vertex1] > size[vertex2]){
                size[vertex1] += size[vertex2];
                representative[vertex2] = vertex1;
            }else{
                size[vertex2] += size[vertex1];
                representative[vertex1] = vertex2;
            }

            return 1;
        }
    }



    public int countComponents(int n, int[][] edges){
        int[] representative = new int[n];
        int[] size = new int[n];

        for(int i = 0; i < n;i++){
            representative[i] = i;
            size[i] = 1;
        }

        int components = n;
        for(int i = 0 ; i < edges.length;i++){
            components -= combine(representative,size,edges[i][0],edges[i][1]);
        }
        return  components;
    }
}

