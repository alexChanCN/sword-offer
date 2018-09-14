package ch2;

import utils.ListNode;
import utils.ListNodeUtils;

import java.util.ArrayList;

public class Q6 {
    ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            printListFromTailToHead(listNode.next);
            res.add(listNode.val);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = ListNodeUtils.intList(new int[]{1,2,3,4,5});
        Q6 q6 = new Q6();
        ArrayList<Integer> arrayList = q6.printListFromTailToHead(head);
        System.out.println(arrayList);
    }
}
