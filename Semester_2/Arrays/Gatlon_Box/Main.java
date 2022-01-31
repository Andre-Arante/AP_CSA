/*
  Note* histogram prints upside down but I don't have the energy to fix that <<
*/

import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // Get balls and slots from user
    System.out.print("Balls: ");
    int balls = in.nextInt();

    System.out.print("Slots: ");
    int slots = in.nextInt();

    Machine m = new Machine(slots, balls);

    // Simulate falling for number of Slots
    // for(int i = 0; i < slots; i++) {
    m.simulate();
    
    System.out.println();
    m.getResults();
    m.printResults();
    
  }
}
