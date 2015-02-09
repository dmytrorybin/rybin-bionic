package rybin;

/**
 * Created by eredin on 09.02.2015.
 */
public class task1 {
    public static String cipher(String s, int a)
    {
        String res = "";
        int t;
        for (int i = 0; i <s.length(); i++)
        {
            t = (int) s.charAt(i);
            //       System.out.println(t);
            t += a;
            if (t > 122)
                t  = 96 + (t - 122);
            //       System.out.println(t);
            res += (char) t;
        }
        return res;
    }

    public static String decipher(String s, int a)
    {
        String res = "";
        int t;
        for (int i = 0; i <s.length(); i++)
        {
            t = (int) s.charAt(i);
            t -= a;
            if (t < 97)
                t  = 123 - (97 - t);
            res += (char) t;
        }
        return res;
    }


    public static void main(String[] args) {
        String string = "ghdhdfdfhdf";
        //    String tmp = "";
        System.out.println(string);
        string = cipher(string, 5);
        System.out.println(string);
        string = decipher(string, 5);
        System.out.println(string);
    }
}
