import java.util.Random;


public class ThingList {
 public Random rand1 = new Random(System.currentTimeMillis());
 private Node head;


 private class Node {
     Thing data;
     Node next;
     int count;


   Node(Thing data) {
       this.data = data;
       this.next = null;
       this.count = 0;
   }
 }


 public ThingList() {
     this.head = null;
 }


 public void addThing(Thing thing) {
     Node newNode = new Node(thing);
     newNode.next = head;
     head = newNode;
 }
 public void moveAll(Random rand) {
   for( Node T = head; T != null; T = T.next ) {
     T.data.maybeTurn(rand); //changed this
     T.data.step(); //changed this
   }
 }
 public void printAll() {
   for( Node T = head; T != null; T = T.next )
     System.out.println(T.data.row + " " + T.data.col + " " + T.data.lab);
 }
}
