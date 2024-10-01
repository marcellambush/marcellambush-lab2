import java.util.*;
public class TypeC extends Thing{
   public TypeC(int row, int col){
       super(row, col, 'C');
   }
   public void maybeTurn(Random rand) {
       int i = rand.nextInt(3);


         timeSinceLast++;
  
         if (timeSinceLast == 5) {
           timeSinceLast = 0;
  
           if (i == 1) {
             rightTurn();
           }
  
           if (i == 2) {
             leftTurn();
           }
         }


       }
}

