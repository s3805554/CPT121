package task_6_2_3;

public class SubTest
{
    public static void main(String args[])
    {
        FixedRateSAccount account = new FixedRateSAccount("f1234", "Joe",
                                                          10000.0, 1.0);
        account.addInterest(); // interest for Jan
        System.out.println(account.getBalance());
        account.addInterest(); // interest for Feb
        System.out.println(account.getBalance());
        account.addInterest(); // interest for Mar
        System.out.println(account.getBalance());

        account.getBalance();
    }
}
