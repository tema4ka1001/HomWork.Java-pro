package homeworks.hm7;

public class StringMethod {
    public static void main(String[] args) {

        findSymbolOccurance("Hello Word", 'l');
        isPolindrom("Hello");
    }
        public static int findSymbolOccurance (String s,char c){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                }
            }
            return count;
        }
        public static int findWordPosition(String source, String target){
        if (source.indexOf(target) != -1){
            return source.indexOf(target);
        }
        return -1;
        }
    public static String stringreverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reverse = sb.toString();
        return sb.toString();
    }
    public static boolean isPolindrom(String s){
        boolean ispolidrom = true;
        for (int i=0; i<s.length(); i++) {
            if (s.substring(i,i+1).equals(s.substring(s.length() -i, i-1))){
                ispolidrom = false;
                break;
            }
        }
        return ispolidrom;
    }
}

