import java.util.*;

public class Market
{
    public static void main(string [] args)
    {
        List<Shares> shares = new LinkedList<Shares>();
        List<Shares> myShares = new LinkedList<Shares>();
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do
        {
            try
            {
                System.out.println("Main Menu");
                System.out.println("1. File Operations");
                System.out.println("2 .Check Market");
                System.out.println("3. Buy/Sell Shares");
                System.out.println("4. Exit");
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Wrong type of input...\nInput Number.");
                sc = new Scanner(System.in);
            }
        } while (choice != 4);

    }
}
