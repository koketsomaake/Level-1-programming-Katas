
public class LongestStringArray {
    public void getLongest(String[] array) {
        String str = "";
        int arrayLength = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (arrayLength < array[i].length()) {
                arrayLength = array[i].length();
                str = array[i];
            }
            System.out.println("");
        }
        System.out.println( str + " is the longest string");
    }
    public static void main(String[] args) {
        String[] Arry = {"the", "quick", "brown", "fox", "ate", "my", "chickens"};
        LongestStringArray longString = new LongestStringArray();

        longString.getLongest(Arry);
    }
}