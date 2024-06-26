import java.util.HashMap;

class Solution {
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.romanToInt("IIIV"));
  }

  public int romanToInt(String s) {
    int number = 0;
    HashMap<Character, Integer> Roman = new HashMap<Character, Integer>();
    Roman.put('I', 1);
    Roman.put('V', 5);
    Roman.put('X', 10);
    Roman.put('L', 50);
    Roman.put('C', 100);
    Roman.put('D', 500);
    Roman.put('M', 1000);
    for (int i = 0; i < s.length(); i++) {
      if (i + 1 < s.length() && Roman.get(s.charAt(i)) < Roman.get(s.charAt(i + 1))) {
        number -= Roman.get(s.charAt(i));
      } else {
        number += Roman.get(s.charAt(i));
      }
    }
    return number;
  }
}
