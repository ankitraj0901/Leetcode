class Solution {
    public static boolean isValid(String str) {
        if (str.length() == 1) {
            return false;
        }
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }else {
                if (!s.empty()) {
                    char last = s.pop();
                    switch (ch) {
                        case ')':
                            if (last != '(') {
                                return false;
                            }
                            break;
                        case ']':
                            if (last != '[') {
                                return false;
                            }
                            break;
                        case '}':
                            if (last != '{') {
                                return false;
                            }
                            break;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}