/**
 * Created by PierreM on 17/12/2014.
 */
public class Person {

    public String getInitials(String fullName) {
        String result = "";
        String nextInitial = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) {
                result = result + "";
            } else {
                nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();
            }
        }
        return result;
    }

}
