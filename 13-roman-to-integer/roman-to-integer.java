class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int x = map.get(s.charAt(i));
            int y = map.get(s.charAt(i+1));

            if (x >= y) {
                sum += x;
            } else {
                sum -= x;
            }
        }
        return sum + map.get(s.charAt(s.length() - 1));
    }
}