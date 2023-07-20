package leetcodeLinkedListWithReadme.md;

public class LLTestClass {
    public static void main(String[] args) {
        DeleteDupLinkedList linkedList=new DeleteDupLinkedList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(4);
        linkedList.insertLast(30);
        linkedList.insertFirst(4);
//        linkedList.display();
//        linkedList.deleteDuplicates();
        System.out.println();
        linkedList.display();
    }
}
