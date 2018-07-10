import java.util.*;

public class UI
{
    public void menu()
    {
        List<Shares> shares = new LinkedList<Shares>();
        List<Shares> myShares = new LinkedList<Shares>();
        int choice = 0;
        boolean fileLoaded = false;
        String notLoaded = "\nNo file loaded\n\n";
        Scanner sc = new Scanner(System.in);

        // Loops until user selects to exit
        do
        {
            // try-catch statement for menu
            try
            {
                System.out.println("Main Menu");
                System.out.println("1. File Operations");
                System.out.println("2. Check Market");
                System.out.println("3. Buy/Sell Shares");
                System.out.println("4. Forward in Time");
                System.out.println("5. Exit");
                choice = sc.nextInt();

                // Switch case statement for user selected option
                switch (choice)
                {
                    // File Operations
                    case 1: fileLoaded = fileMenu();
                            break;
                    // Check Market
                    case 2: if (fileLoaded)
                            {
                                marketMenu();
                            }
                            break;
                    // Buy/Sell Shares
                    case 3: if (fileLoaded)
                            {
                                sharesMenu();
                            }
                            break;
                    // Forward in Time
                    case 4: if (fileLoaded)
                            {
                                nextDay();
                            }
                            break;
                    // Exit
                    case 5: System.out.println("\nGoodbye!!\n\n");
                            fileLoaded = true; // Makes sure next if-statement is not entered
                            break;
                }
                if (!fileLoaded)
                {
                    System.out.println(notLoaded);
                }
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Wrong type of input...\nInput Number.");
                sc = new Scanner(System.in);
            }
        } while (choice != 5);

    }
}
