// andre arante

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // ask for num of strands and take in strands
    
    System.out.print("How many strands? ");
    int n = in.nextInt();
    String skip = in.nextLine();

    // store in array
    Strand[] arr = new Strand[n];
    for(int i = 0; i < n; i++) {
      System.out.print("Id #" + i + ": ");
      
      String new_id = in.nextLine();
      System.out.print("strand #" + i + ": ");
      String new_strand = in.nextLine();

      // add to array
      arr[i] = new Strand(new_id, new_strand);
    }

    // compare and print the strand with highest GC content
    Strand highest = compare_arr(arr);
    System.out.println("Highest GC-content: " + highest.getId() + "(" + highest.get_GC_content() + " %)");
  }

  // compare GC content value
  // return Id of higher GC content
  public static Strand compare_arr(Strand[] arr) {
    Strand highest = arr[0];

    // comapre each strand in arr against lowest
    for(int i = 0; i < arr.length; i++) {
      if (highest.get_GC_content() < arr[i].get_GC_content()) {
        highest = arr[i];
      }
    }

    return highest;
  }
}


// Strand data type
class Strand {
  public String id;
  public String strnd;
  
  public Strand(String id, String strnd) {
    this.id = id;
    this.strnd = strnd;
  }

  public String getId() {
    return this.id;
  }

  public String getStrnd() {
    return this.strnd;
  }

  public double get_GC_content() {
    double y = 0;
    for(int i = 0; i < strnd.length()-1; i++) {
      String current = strnd.substring(i, i+1);
      if (current.equals("C") || current.equals("G")) {
        y++;
      }
    }
    return (y/strnd.length()) * 100;
  }
}
