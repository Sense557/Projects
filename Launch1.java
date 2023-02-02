import java.util.Scanner;

class Guesser
{
    int guessNum;
        int guessingNumber()
    {
        System.out.println("Guesser! Kindly guess a number ");
        Scanner sc = new Scanner(System.in);
        int guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
        int guessingNumber()
    {
        System.out.println("Player! Kindly guess a number ");
        Scanner sc = new Scanner(System.in);
        int guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
        void collectNumFromGuesser()
        {
            Guesser g = new Guesser();
            numFromGuesser = g.guessingNumber();
        }

        void collectNumFromPlayers()
        {
            Player p1 = new Player();
            Player p2 = new Player();
            Player p3 = new Player();
            numFromPlayer1 = p1.guessingNumber();
            numFromPlayer2 = p2.guessingNumber();
            numFromPlayer3 = p3.guessingNumber();
        }

        void compare()
        {
            if(numFromGuesser==numFromPlayer1)
            {
                if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
                { 
                    System.out.println("Hum sum winner hain bhai");
                }
                else if(numFromGuesser==numFromPlayer2)
                {
                    System.out.println("Player 1 & 2 won the game");
                }
                else if(numFromGuesser==numFromPlayer3)
                {
                    System.out.println("Player 1 & 3 won the game");
                }
                else
                {
                    System.out.println("Player 1 Won the Game");
                }
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                if (numFromGuesser==numFromPlayer3)
                { 
                    System.out.println("Player 2 & 3 Won the Game");
                }
                else
                {
                    System.out.println("Player 2 Won the Game");
                }
            }
            else if(numFromGuesser==numFromPlayer3)
                {
                    System.out.println("Player 3 Won the Game");
                }
            else
                {
                    System.out.println("Sab haar gaye bhai");
                }
                
        }
}


public class Launch1 {
    public static void main(String[] args) 
    {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}