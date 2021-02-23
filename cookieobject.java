package CookieOOP;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class cookieobject 
{
    public static void main(String[] args) 
    {
        String[] toppings = new String[4];
        int topping_amount = 0;
        Scanner scan = new Scanner(System.in);
        int count = 0 ;
        int i = 0;
        boolean truthStatement = true;
        String iceCreamQues = "";
        String iceCreamAns = "Yes";

        while (truthStatement)
        {
        System.out.println("Hello, how many toppings would you like on your cookie? (No more than 3)");
        topping_amount = scan.nextInt();

        if (topping_amount>3)
            System.out.println("Please select no more than 3 toppings!");

        else if (topping_amount==0)
        {
            System.out.println("A plain cookie? Are you Crazy?!");
            break;
        }

        else 
            truthStatement = false;

        }
        
        System.out.println("Please tell us what you would like in your cookie! Anything is fine! (If you chose no toppings IGNORE THIS!");

        
        while (count<=topping_amount)
        {
            toppings[i] = scan.nextLine();
            count++;
            i++;
           
        } 
      
        cookie newCookie = new cookie(toppings);

        System.out.println("Would you like a scoop of Ice Cream with your Cookie? (Respond with yes or no [Not case sensitive]");
        iceCreamQues = scan.nextLine();

        if (iceCreamQues.equalsIgnoreCase(iceCreamAns))
            newCookie.addIceCream();
        else
            System.out.println("Okay, your cookie will be served on its own!");
        newCookie.showToppings(toppings, topping_amount);
        scan.close();

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String formatted = currentTime.format(format);
        System.out.println("Your cookie was ordered at " + formatted);
    }    
}
