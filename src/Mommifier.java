public class Mommifier {

    public String mommify(String input) {
        String[] inputArr = input.split("");
        StringBuilder newString = new StringBuilder();
        for (String character : inputArr) {
            if (isVowel(character)) {
                // inputArr[input.indexOf(character)] = "mommy";
                newString.append("mommy");
            }
            else
                newString.append(character);
        }
        return newString.toString();

    }

    public boolean isVowel(String s){
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (s.equals(vowel)) {
                return true;
            }
        }
        return false;
    }
}
