package arrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        MyList<Integer> myList1 = new MyList<Integer>(5);

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        myList.addE(1, 5);
        myList.addE(2, 10);

        myList.display();

        System.out.println();
        System.out.print(myList.remove(3));

        System.out.println();
        myList.display();

        System.out.println();
        System.out.println("size = " + myList.size());

        Object b[] = (Object[]) myList.clone();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        if (myList.contains(10)) System.out.println("Có phần tử");
        else System.out.println("Ko có phần tử");

        System.out.println(myList.indexOf(6));


    }
}
