public class Test {
  public static void main (String args[]) {
    LinkList<Integer> l1 = new LinkList<Integer>();
    l1.insertFirst(10);
    System.out.println(l1);
    l1.insertFirst(2);
    System.out.println(l1);
    l1.insertFirst(4);
    System.out.println(l1);
    l1.insertFirst(9);
    l1.insertFirst(3);
    System.out.println(l1);
    l1.insertFirst(5);
    System.out.println(l1);
    System.out.println(l1);

    System.out.println("10?: " + l1.search(10));
    System.out.println("5?: " + l1.search(5));
    System.out.println("122?: " + l1.search(122));



    l1.insertLast(123);
    System.out.println(l1);

    l1.remove(123);
    System.out.println(l1);
    System.out.println();
    System.out.println();
    
    LinkListOrder<Integer> l2 = new LinkListOrder<>();
    l2.insert(0);
    l2.insert(3);
    l2.insert(6);
    l2.insert(4);
    l2.insert(1);
    l2.insert(11);
    l2.insert(8);
    l2.insert(2);
    l2.insert(1);
    System.out.println(l2);
    
    System.out.println("1? " + l2.search(1));
    System.out.println("4? " + l2.search(4));
    System.out.println("7? " + l2.search(7));
    System.out.println("15? " + l2.search(15));
    
    LinkListOrder<String> l3 = new LinkListOrder<>();
    l3.insert("a");
    l3.insert("aa");
    l3.insert("a");
    l3.insert("aa");
    l3.insert("a");
    l3.insert("aaaa");
    l3.insert("a");
    l3.insert("aaaaaaa");
    l3.insert("a");
    
    System.out.println("aa? " + l3.search("aa"));
    System.out.println(l3);
    
    LinkListOrder<Persona> l4 = new LinkListOrder<>();
    l4.insert(new Persona("A", 10));
    l4.insert(new Persona("B", 30));
    l4.insert(new Persona("C", 40));
    l4.insert(new Persona("D", 20));
    System.out.println(l4);
    System.out.println("20? " + l4.search(new Persona("D", 20)));
    
    
  }
}

