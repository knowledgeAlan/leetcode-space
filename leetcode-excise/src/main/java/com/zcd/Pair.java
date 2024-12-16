package com.zcd;

/**
 * @author uniweb
 * @version 1.0
 * @description:
 * @date 8/11/24 5:00 pm
 */
public class Pair<T, T1> {

    private TreeNode key;

    private Integer value;

    public Pair(TreeNode key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public TreeNode getKey() {
        return key;
    }

    public void setKey(TreeNode key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
