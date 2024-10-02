import java.util.*;
import java.util.Random;
public abstract class Thing {
   public Random rand = new Random(System.currentTimeMillis());
   protected int row;
   protected int col;
   protected int dir;
   protected char lab = 'r';
   int timeSinceLast;


   public Thing(int row, int col, char lab) {
       this.row = row;
       this.col = col;
       this.lab = lab;
       this.dir = 0;
       this.timeSinceLast = 0;
   }
   public void rightTurn() {
       this.dir = (this.dir + 1) % 4;
   }
   public void leftTurn() {
       this.dir = (this.dir + 3) % 4;
   }
   public abstract void maybeTurn(Random rand);


   public void step() {
       final int[] dc = {
         0, 1, 0, -1
       }, dr = {
         1, 0, -1, 0
       };
       row += dr[dir];
       col += dc[dir];
   }
}