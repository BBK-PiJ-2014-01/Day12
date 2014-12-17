/**
 * Created by PierreM on 17/12/2014.
 */
public class Person {

    public String getInitials(String fullName) {
        String result = "";
        String nextInitial = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (words[i].equals("")) {
                result = result + "";
            } else {
                nextInitial = "" + words[i].charAt(0);
                System.out.println(nextInitial);
                result = result + nextInitial.toUpperCase();
            }
        }
        return result;
    }

}
