package com.company.thirdPart;

import java.util.Arrays;

public class ThirdPart {
    public StringBuilder smallestWord(String value) {
        boolean w = true;
        int c = 0;
        StringBuilder smallestWorld = new StringBuilder();
        return null;
    }


    public String[] change3symbol$$$(String[] value, int dis) {
        String[] res = new String[value.length];
        for (int i = 0; i < value.length; i++) {
            if (value[i].length() == dis) {
                StringBuilder str = new StringBuilder(value[i]);
                str.replace(str.length() - 3, str.length(), "$$$");
                res[i] = String.valueOf(str);
            } else {
                res[i] = value[i];
            }
        }
        return res;

    }

    public StringBuilder insertNULL(String value) {
        int count = 0;
        StringBuilder res = new StringBuilder();
        char[] caharValue = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            res.append(caharValue[i]);
            if (caharValue[i] > 32 && caharValue[i] <= 46) {
                ++count;
                if (i != value.length() - 1 && caharValue[i + 1] != 32) {
                    res.insert(i + count, " ");

                }


            }


        }

        return res;
    }

    public char[] stringUniqueChar(String value) {
        char[] res = new char[value.length()];
        char[] myString = value.toCharArray();
        for (int j = 0; j < myString.length; j++) {
            int c = 0;
            for (int i = c; i < res.length; i++) {

                if (myString[j] != res[i]) {
                    res[i] = myString[j];
                    break;

                }


            }
            ++c;
        }


        return res;
    }

    public int countWordsInString(String value) {
        int count = 1;
        char[] myString = value.toCharArray();
        for (int i = 0; i < myString.length; i++) {
            if (myString[i] >= 32 && myString[i] <= 46 && myString[i] != 45) {
                ++count;
                if (i != myString.length - 1 && myString[i + 1] == 32) {
                    count--;
                }
            }
        }

        return count;
    }

    public StringBuilder deletePartString(String value, int start, int len) {
        StringBuilder res = new StringBuilder(value);
        res.delete(start, start + len);
        return res;
    }

    public StringBuilder reversString(String value) {
        StringBuilder res = new StringBuilder();
        char[] myString = value.toCharArray();

        for (int i = myString.length - 1; i >= 0; i--) {
            res.append(myString[i]);

        }
        return res;
    }

    public StringBuilder deleteLastWord(String value) {
        StringBuilder res = new StringBuilder(value);
        StringBuilder deleteWord = new StringBuilder();
        char[] myString = value.toCharArray();
        deleteWord = deleteWord.reverse();
        for (int i = myString.length - 1; i >= 0; i--) {
            deleteWord.append(myString[i]);
            if (myString[i] >= 32 && myString[i] <= 46) {
                if(i==myString.length-1){
                    continue;
                }
                if (myString[i] != 45) {
                    deleteWord.deleteCharAt(deleteWord.length() - 1);
                    break;
                }
                else continue;
            }
        }
        System.out.println(deleteWord);
        res = res.delete((res.length()-deleteWord.length()-1),res.length());
        return res;
    }

}

