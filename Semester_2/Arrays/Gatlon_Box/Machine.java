import java.util.Random;

// Class that defines the Machine
// number of pegs hit is 1 less than num of slots

class Machine {

  private int slots, y;
  private int[] balls;
  private char[][] board;

  // Machine Constructor
  public Machine(int s, int b) {

    this.slots = s;

    // value of balls[i] represent what slot the ball ended up in
    this.balls = new int[b];
    
    for (int i = 0; i < b; i++) {
      balls[i] = s/2;
    }

    this.y = slots;

    this.board = new char[slots+230][slots];
    // initalize all coordinates to " " except for bottom row 
    for (int r = 0; r < s-2; r++) {
      for (int c = 0; c < s; c++) {
        board[r][c] = ' ';
        
      }
    }
    for (int i = 0; i < s; i++) {
      board[s-2][i] = ' ';
    }
  }

  // for each ball simulates moving down by one level
  public void simulate() {
    for (int i = 0; i < balls.length; i++) {
      for (int y = 0; y < slots-1; y++) {

        // Simulate a collision
        if (contact() == 0) {

          // Go right
          balls[i]++;
          System.out.print("R");

        } else {

          // Go left
          balls[i]--;
          System.out.print("L");
        }   
      }
       System.out.println();
    }

    // decrement counter, will break when y = 0 (all balls have reached bottom)
      y--;
      if (y == 0) {

        // make sure all balls are in bounds
        for (int b = 0; b < balls.length; b++) {
          if (b < 0) b = 0;
          if (b > slots) b = slots - 1;
        }
      }
  } 

  // Print final output
  public void getResults() {

    for (int i = 0; i < balls.length; i++) {

      // TODO: Set row to lowest unfilled slot

      int row = 0;
      int c = balls[i];
      // System.out.println(c + "," + row);

      if (c < 0) {
        c = 0;
      } else if (c > slots) c = slots-1;

      while (board[row][c] == '0') {
        row++;
        if (row < 0) {
          row = 0;
          break;
        }
      }
      
      // if (row > slots) row = slots-1;    

      //  System.out.println("validated: " + c + "," + row);

      board[row][c] = '0';

    }
  }

  // Print the table
  public void printResults() {
    
    
    for (int r = 0; r < this.slots; r++) {
      for (int c = 0; c < this.slots; c++) {
        System.out.print(board[r][c]);
      }
      System.out.println();
    }
  }

  // Simulates a contact with a peg 
  // return 1(left) or 2 (right)
  private int contact() {
    Random rand = new Random();
    return (int)Math.floor(Math.random()*(1-0+1)+0);
  }
}