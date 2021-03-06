package Undefined;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

/**无重复字符的最长子串
 *
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 *
 * @author Jacob
 * @creator 2022/3/2-17:16
 */
public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;

        for(int end = 0; end < length; end++){
            int orDefault = map.getOrDefault(chars[end], 0);
            map.put(chars[end], orDefault+1);
            if(end-start+1==map.size()){
                ans = Math.max(ans, map.size());
            }
            while(end-start+1>map.size()){
                char c = chars[start++];
                map.put(c, map.get(c)-1);
                if(map.get(c)==0)
                    map.remove(c);
            }
        }

        return ans;
    }

    @Test
    public void test(){
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    @Test
    public void test1(){
        String s = "hello";
        System.out.println(reverseWord(s));
    }

    public String reverseWord(String s){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length-1; i >= 0; i--)
            sb.append(chars[i]);
        return sb.toString();
    }

}
