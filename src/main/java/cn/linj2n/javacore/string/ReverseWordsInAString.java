package cn.linj2n.javacore.string;

/* 557. Reverse Words in a String III FROM: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        StringBuilder inverseString = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            inverseString.append(new StringBuilder(word).reverse().toString());
            inverseString.append(" ");
        }
        return inverseString.toString().trim();
    }
}


