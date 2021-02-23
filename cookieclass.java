package CookieOOP;
class cookie
{
 String[] topping = {};



    cookie(String[] Selectedtopping)
    {
        this.topping = Selectedtopping;
    }

    void addIceCream()
    {
        System.out.println("Your cookie will be served with a scoop of ice cream!");
    }

    void showToppings(String [] Selectedtopping, int amount)
    {
        System.out.println("You chose " +amount+ " toppings, they were: ");
        for (int i = 0; i<=(amount); i++)
        {
            System.out.println(Selectedtopping[i]);
        }


    }

}
public class cookieclass 
{
    
}
