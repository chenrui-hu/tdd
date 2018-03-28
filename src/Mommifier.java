public class Mommifier {

    public String mommify(String input) {
        String[] inputArr = input.split("");
        String newString = new String();
        for (String character : inputArr) {
            if (isVowel(character)) {
                // inputArr[input.indexOf(character)] = "mommy";
                newString += "mommy";
            }
            else
                newString += character;
        }
        return newString;

    }

    public boolean isVowel(String character){
        String[] vowels = new String[] {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
