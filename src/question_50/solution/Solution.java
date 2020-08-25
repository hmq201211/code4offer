package question_50.solution;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-25 17:10
 **/
public class Solution {
    /**
     * @Description: firstUniqChar 有序hash 根据 hash来确定是不是第一个
     * @Params: [s]
     * @Create: 2020/8/25 17:24
     * @Return: char
     */
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return ' ';
    }

    public char firstUniqCharByStr(String s) {
        Map<Character, Boolean> map = new HashMap<>(s.length());
        char[] chars = s.toCharArray();
        for (char c : chars) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : chars) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }
}
