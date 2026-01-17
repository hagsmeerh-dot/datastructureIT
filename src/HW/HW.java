package HW;

public class HW {
    //Clone an Array
    public class CloneArray {
        public static int[] cloneArray(int[] array) {
            return array.clone();
        }
    }
    //. Remove a Random Element from an Array
    import java.util.Random;

    public class RemoveRandomElement {
        public static int[] removeRandom(int[] array) {
            Random rand = new Random();
            int index;
            index = rand.nextInt(array.length);
            int[] newArray = new int[array.length - 1];

            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        }
    }
    //Remove a Specific Element from an Array
    public class RemoveSpecificElement {
        public static int[] removeElement(int[] array, int element) {
            int count = 0;
            for (int num : array) {
                if (num != element) count++;
            }

            int[] newArray = new int[count];
            int index = 0;
            for (int num : array) {
                if (num != element) {
                    newArray[index++] = num;
                }
            }
            return newArray;
        }
    }
   // . Reverse an Array
   public class ReverseArray {
       public static void reverse(int[] array) {
           int left = 0, right = array.length - 1;
           while (left < right) {
               int temp = array[left];
               array[left] = array[right];
               array[right] = temp;
               left++;
               right--;
           }
       }
   }
   //5. Concatenate Two Linked Lists
   class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;
           this.next = null;
       }
   }

    public class ConcatenateLinkedLists {
        public static Node concatenate(Node first, Node second) {
            if (first == null) return second;
            if (second == null) return first;

            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = second;
            return first;
        }
    }
    //. Rotate a Linked List to the Right by k Places
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class RotateLinkedList {
        public static Node rotate(Node head, int k) {
            if (head == null || head.next == null || k <= 0) return head;

            Node current = head;
            int length = 1;
            while (current.next != null) {
                current = current.next;
                length++;
            }

            current.next = head; // form a circle
            k = k % length; // in case k is greater than length

            int skipLength = length - k;
            current = head;
            for (int i = 0; i < skipLength - 1; i++) {
                current = current.next;
            }
            head = current.next;
            current.next = null; // break the circle

            return head;
        }
    }
    //Search for Element in Singly Linked List
    public class SearchSinglyLinkedList {
        public static int search(Node head, int key) {
            Node current = head;
            int index = 0;
            while (current != null) {
                if (current.data == key) return index;
                current = current.next;
                index++;
            }
            return -1; // not found
        }
    }
    //. Remove at Specific Position from Singly Linked List
    public class RemoveAtPosition {
        public static Node remove(Node head, int position) {
            if (head == null) return null;

            if (position == 0) return head.next; // remove head

            Node current = head;
            for (int i = 0; current != null && i < position - 1; i++) {
                current = current.next;
            }

            if (current == null || current.next == null) return head; // position is more than the size

            current.next = current.next.next; // unlink the node
            return head;
        }
    }
    // Remove Duplicates Elements from Doubly Linked List
    class DNode {
        int data;
        DNode next;
        DNode prev;

        DNode(int data) {
            this.data = data;
        }
    }

    public class RemoveDuplicatesDoublyLinkedList {
        public static void removeDuplicates(DNode head) {
            DNode current = head;
            while (current != null) {
                DNode runner = current.next;
                while (runner != null) {
                    if (runner.data == current.data) {
                        runner.prev.next = runner.next;
                        if (runner.next != null) runner.next.prev = runner.prev;
                    }
                    runner = runner.next;
                }
                current = current.next;
            }
        }
    }
    //Traverse Doubly Linked List in Reverse
    public class TraverseDoublyLinkedListReverse {
        public static void traverseReverse(DNode head) {
            if (head == null) return;

            DNode current = head;
            while (current.next != null) {
                current = current.next;
            }

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
        }
    }
    //Search for an Element in a Doubly Linked List
    public class SearchDoublyLinkedList {
        public static int search(DNode head, int key) {
            DNode current = head;
            int index = 0;

            while (current != null) {
                if (current.data == key) return index;
                current = current.next;
                index++;
            }
            return -1; // not found
        }
    }
    //Insert a Node at a Specific Position in a Circular Linked List
    class CNode {
        int data;
        CNode next;

        CNode(int data) {
            this.data = data;
        }
    }

    public class InsertInCircularLinkedList {
        public static CNode insertAtPosition(CNode head, int data, int position) {
            CNode newNode = new CNode(data);

            if (head == null) {
                newNode.next = newNode;
                return newNode;
            }

            if (position == 0) {
                CNode tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                tail.next = newNode;
                newNode.next = head;
                return newNode;
            }

            CNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
                if (current == head) break; // out of bounds
            }

            newNode.next = current.next;
            current.next = newNode;
            return head;
        }
    }
    // Delete a Node from a Specific Position in a Circular Linked List
    public class DeleteFromCircularLinkedList {
        public static CNode deleteAtPosition(CNode head, int position) {
            if (head == null) return null;

            if (position == 0) {
                CNode tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                if (tail == head) {
                    return null; // only one node
                }
                tail.next = head.next;
                return head.next;
            }

            CNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
                if (current.next == head) return head; // out of bounds
            }

            current.next = current.next.next;
            return head;
        }
    }
    //Search for an Element in a Circular Linked List
    public class SearchCircularLinkedList {
        public static int search(CNode head, int key) {
            if (head == null) return -1;

            CNode current = head;
            int index = 0;

            do {
                if (current.data == key) return index;
                current = current.next;
                index++;
            } while (current != head);

            return -1; // not found
        }
    }
    //. SBlit a Circular Linked List into Two Halves
    public class SplitCircularLinkedList {
        public static void split(CNode head) {
            if (head == null) return;

            CNode fast = head, slow = head;
            while (fast.next != head && fast.next.next != head) {
                fast = fast.next.next;
                slow = slow.next;
            }

            CNode head1 = head;
            CNode head2 = slow.next;
            slow.next = head1;

            if (fast.next != head) {
                fast = fast.next;
            }
            fast.next = head2;
        }
    }
}
