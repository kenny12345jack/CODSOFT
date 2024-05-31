import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int chances = 8;
    int finalscore = 0;
    boolean playAgain = true;
    System.out.println("Welcome Buddy!");
    System.out.println("Hey Buddy! you have about  " + chances + " chances to win the game");
    while (playAgain) {
      int rand = getRandInt(1, 100);
      boolean guess = false;
      for (int i = 0; i < chances; i++) {
        System.out.println("chance" + (i + 1) + ":Enter your Guess:");
        int user = sc.nextInt();
        if (user == rand) {
          guess = true;
          finalscore += 1;
          System.out.println("you won it");
          break;

        } else if (user > rand) {
          System.out.println("Too high");
        } else {
          System.out.println("Too low");
        }
      }

      if (guess == false) {
        System.out.println("sorry Buddy! you lost the chance.The Number is" + rand);
      }
      System.out.println("Do you want to play Again(Y/N)");
      String PA = sc.next();
      playAgain = PA.equalsIgnoreCase("y");
    }
    System.out.println("That's it Buddy,hope you like it..");
    System.out.println("Here is your score:" + finalscore);
  }

  public static int getRandInt(int i, int j) {
    return (int) (Math.random() * (j - i + 1) + i);

  }
}
