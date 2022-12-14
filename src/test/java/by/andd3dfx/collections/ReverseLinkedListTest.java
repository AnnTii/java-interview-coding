package by.andd3dfx.collections;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseLinkedListTest {

    @Test
    public void reverse() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(
                new ReverseLinkedList.ListNode(
                        new ReverseLinkedList.ListNode(
                                new ReverseLinkedList.ListNode(null, 3), 4
                        ), 5
                ), 6
        );

        ReverseLinkedList.ListNode current = ReverseLinkedList.reverse(head);

        var expected = new int[]{3, 4, 5, 6};
        for (int item : expected) {
            assertThat(current.val).isEqualTo(item);
            current = current.next;
        }
        assertThat(current).isNull();
    }

    @Test
    public void reverseForListWithSizeOne() {
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(null, 6);

        ReverseLinkedList.ListNode current = ReverseLinkedList.reverse(head);

        assertThat(current.val).isEqualTo(6);
        assertThat(current.next).isNull();
    }

    @Test
    public void reverseForNull() {
        assertThat(ReverseLinkedList.reverse(null)).isNull();
    }
}
