    public static String playPass(String string, int m) {
        string = string.toUpperCase(); //turn the string into a capital letter
        char[] charArray = string.toCharArray(); //Create a charArray with the string values
        for(int i = 0; i<charArray.length; i++){
            if(Character.isLetter(charArray[i])){
                int letter = charArray[i] + n; //shifting
                if(letter>90){
                    letter -=26;
                }
                charArray[i] = (char)letter;
                if(i%2==0){
                    charArray[i] = Character.toUpperCase(charArray[i]); //converting to upper case the even letters
                }else{
                    charArray[i] = Character.toLowerCase(charArray[i]); //converting to lower case the odd letters
                }
            }else if(Character.isDigit(charArray[i])){
                int number = 57 - Character.getNumericValue(charArray[i]); //change the number by its complement to 9
                charArray[i] = (char)number;
            }
        }
        String result;
        return result = new StringBuilder(new String (charArray)).reverse().toString(); // reversing the string
    }
