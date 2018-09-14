package utils;

/**
 * @Author： Chen Shuai
 * @Date: 2018/7/17 下午3:49
 */
public class ListNodeUtils {
    public static ListNode intList(int[] nums) {
        ListNode headNode = new ListNode(0);
        ListNode nextNode = headNode;
        for (int i : nums) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }
        return headNode.next;
    }

    public static void showNode(ListNode node){
        String s = "";
        while (node !=null){
            s = s + node.val;
            node = node.next;
        }
        System.out.println(s);
    }
}
