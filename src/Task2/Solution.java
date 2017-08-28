package Task2;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<Integer> list = new ArrayList<Integer>();
        FileInputStream fileInputStream = new FileInputStream(s);


        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            list.add(data);
        }

        int x = 0;
        for(int c : list)
        {
            if(c == 44)
            {
                x++;
            }
        }

        System.out.println(x);
    }
}
