package Task6;

import java.util.List;

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        ATableInterface aTableInterface;
        String text;
        public TableInterfaceWrapper(ATableInterface aTableInterface) {
            this.aTableInterface = aTableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            aTableInterface.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            String s = this.text;
            s.toUpperCase();
            return s;
        }

        @Override
        public void setHeaderText(String newHeaderText) {
        aTableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
