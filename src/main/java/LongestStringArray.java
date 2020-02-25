public class LongestStringArray {
    public void longString(String[] str){

        for (int i = 0; i < str.length; i++) {
          String index = str[i];


            if( index.length() > str.length ){
                System.out.println(str[i]);
            }

        }
    }

    public static void main(String[] str) {
        String[] string = {"the", "quick","brown","fox","ate","my", "chickens"};

        LongestStringArray st = new LongestStringArray();
        st.longString(string);
    }


}


