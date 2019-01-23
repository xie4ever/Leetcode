package com.xie.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/12/26 17:27
 */
public class NAryTreeLevelOrderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    private HashMap<Integer, List<Integer>> map = new HashMap<>();

    public List<List<Integer>> levelOrder(Node root) {
        go(0, root);
        List<List<Integer>> list = new ArrayList<>();
        for (Integer level : map.keySet()) {
            list.add(map.get(level));
        }
        return list;
    }

    private void go(int level, Node root) {
        if (root == null) {
            return;
        }
        List<Integer> list = map.get(level);
        if (list == null) {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            map.put(level, l);
        } else {
            list.add(root.val);
        }

        for (int i = 0; i < root.children.size(); i++) {
            go(level + 1, root.children.get(i));
        }
    }
}
