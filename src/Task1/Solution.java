package Task1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        ArrayList<Integer> list = new ArrayList<Integer>();
        FileInputStream inputStream = new FileInputStream(s);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }

        inputStream.close();

        System.out.println(list);
    int MAX = list.size();

        for(int o : list)
        {
            int max = 0;

            for(int i = 0; i < list.size(); i++)
            {
                if(o == list.get(i)){
                    max++;
                }
            }
        }
    }


}

