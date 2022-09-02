import java.util.Scanner;
//import java.lang.Integer;
class Main {
  public static void main(String[] args) {
    
    String time, x, y;
    int x1, y1;
    int position, totalLength;
    double tollAmount;
    
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("Please, enter the time of travel using 24 hours:");
    time = scnr.nextLine();
    //System.out.println(time);

    totalLength = time.length();
    //System.out.println(totalLength);
    
    position = time.indexOf(":");
    //System.out.println(position);

    x = time.substring(0, position);
    //System.out.println("The first part is:"+x);
    
      
    y = time.substring(position+1,totalLength);
    //System.out.println("The Second part is:" + y);
    
      
    x1 = Integer.parseInt(x);
    y1 = Integer.parseInt(y);
    System.out.println("The two integers are:" + x1 + " " + y1);
    
    if(x1 < 6 && y1 <= 59) {
      tollAmount = 1.55;
      System.out.println("This is a case of the First row");
      System.out.println("The tollAmount is:" + tollAmount);
    }
    else if((x1 >= 6 && x1<=9) && (y1 <= 59 && y1 >= 0)){
      tollAmount = 4.65;
      System.out.println("The tollAmount is:" + tollAmount);
    }
    else if((x1 >= 10 && x1<=17) && (y1 <= 59 && y1 >= 0)){
      tollAmount = 2.35;
      System.out.println("The tollAmount is:" + tollAmount);
    }
    else if(x1 >= 18 && y1 <= 59) {
      tollAmount = 1.55;
      System.out.println("This is a case of the last row");
      System.out.println("The tollAmount is:" + tollAmount);
    }
    else{
      System.out.println("Please, make sure to enter a valid time!");
    }
  }
}
