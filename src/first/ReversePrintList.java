package first;

import bean.ListNode;

import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class ReversePrintList {
    public static void reversePrint(ListNode listNode) {
        if (listNode == null) {
            return;
        }

        Stack stack = new Stack();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            System.out.println(((ListNode)stack.pop()).getValue() + " ");
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.setValue(1);
        ListNode listNode1 = new ListNode();
        listNode1.setValue(2);
        ListNode listNode2 = new ListNode();
        listNode2.setValue(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        reversePrint(listNode);


    }
}
