package cn.jrac.util;

public class StringHelper {

    public static String toArray(String str) {
        StringBuilder sb = new StringBuilder();
        if (str != null && !"".equals(str)) {
            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%s", array[i]);
                sb.append(array[i]);
            }
//adasdas111
        }
        return sb.toString();
    }


}
