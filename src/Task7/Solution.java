package Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s1 = reader.readLine();
            firstFileName = s1;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String s2 = reader.readLine();
            secondFileName = s2;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread implements ReadFileInterface {
        String gullFileName;
        @Override
        public void setFileName(String fullFileName) {

        }

        @Override
        public String getFileContent() {
            return null;
        }

        @Override
        public void join() throws InterruptedException {

        }

        @Override
        public void start() {

        }
    }
}
