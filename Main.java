import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a number to count down or up from: ");

    int num;
    num =s.nextInt();

    if (num >= 0)
    do
    {
      System.out.println(num);
      num--;
    } while (num >=0);
    else if (num < 0) 
    do
    {
      System.out.println(num);
      num++;
    } while (num < 0);
    System.out.println("Blast off!");
  }
}