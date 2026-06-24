class Solution {
    public int romanToInt(String s) {
    int num=0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            if(i==s.length()-1){
                num=num+current;
            }
            else if(current>=getValue(s.charAt(i+1))){
                num=num+current;
            }

            else{
                num=num+getValue(s.charAt(i+1))-current;
                i++;
            }
        }
        return num;

    }

    public static int getValue(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}