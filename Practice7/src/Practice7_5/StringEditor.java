package Practice7_5;

public class StringEditor implements Stringable {

    private String string;

    StringEditor(String s) {
        string = s;
    }

    @Override
    public int getLength() {
        return string.length();
    }

    @Override
    public String getOnlyOddChars() {
        String newOne = "";
        for (int i = 1; i < string.length(); i += 2)
            newOne += string.charAt(i);
        return newOne;
    }

    @Override
    public String invert() {
        String newOne = "";
        for (int i = string.length() - 1; i >= 0; i--)
            newOne += string.charAt(i);
        return newOne;
    }

}
