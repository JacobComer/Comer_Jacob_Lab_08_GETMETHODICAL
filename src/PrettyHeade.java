import java.util.Scanner;

public class PrettyHeade
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String msg = SafeInput.getNonZeroLenString(in, "Enter the message to be centered in the header");
        SafeInput.prettyHeade(msg);
    }
}