package homeWork;

public class NumberDivisibleBy5 {
        Scanner s = new Scanner(System.in);
  
        System.out.print("Enter any number:");
        int n = s.nextInt();
        if(n % 5 == 0)
        {
            System.out.println(n+" is divisible by 5");
        }
        else
        {
            System.out.println(n+" is not divisible by 5");
        }

}
