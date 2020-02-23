package first;

/**
 * 替换空格
 * todo 数组越界异常
 */
public class ReplaceSpaces {
    public static String replaceBlank(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int length = str.length();
        int numberOfBlank = 0;
        for (int i = 0; i < length; i ++) {
            if (str.charAt(i) == ' ') {
                numberOfBlank ++;
            }
        }
        if (numberOfBlank <= 0) return str;

        int newLength = length + numberOfBlank * 2;
        int index = length - 1;
        int newIndex = newLength - 1;
        char[] chars = str.toCharArray();
        while (index >= 0 && index <= newIndex) {
            if (chars[index] == ' ') {
                chars[newIndex --] = '0';
                chars[newIndex --] = '2';
                chars[newIndex --] = '%';
            } else {
                chars[newIndex --] = chars[index];
            }
            index --;
        }
        return chars.toString();
    }

    public static void main(String[] args) {
        String str = "how are you";
        String s = replaceBlank(str);
        System.out.println(s);
    }
}
