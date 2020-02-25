public class MultipleStrings {
    public void MultiStrings(String [] str){

        for (int i = 0; i < str.length;i++){
            String index = str[i];

            if( index.length() == str.length){


                System.out.println(str[i]);

        }
    }
    }

    public static void main(String[] str) {
String[] String = {"once", "upon","a","time"};

        MultipleStrings st = new MultipleStrings();
        st.MultiStrings(String);
    }
}
