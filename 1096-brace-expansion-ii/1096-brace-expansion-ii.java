class Solution {
      private Set<String> parseBraces(String s, int l, int r) {
        Set<String> result = new HashSet<>();
        int start = l;
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (i == r || (s.charAt(i) == ',' && count == 0)) {
                Set<String> part = helper(s, start, i);
                result.addAll(part);
                start = i + 1;
            }
            if (i < r) {
                if (s.charAt(i) == '{') {
                    count++;
                } 
                else if (s.charAt(i) == '}') {
                    count--;
                }
            }
        }
        return result;
      }
    private Set<String> helper(String s, int l, int r) {
        Set<String> result = new HashSet<>();
        Set<String> current = new HashSet<>();
        current.add("");
        int i = l;
        while (i < r) {
            char ch = s.charAt(i);
            Set<String> part;
            if (ch == '{') {
                int j = i;
                int count = 0;
                while (j < r) {
                    if (s.charAt(j) == '{') {
                        count++;
                    } else if (s.charAt(j) == '}') {
                        count--;
                    }
                    if (count == 0) {
                        break;
                    }
                    j++;
                }
                part = parseBraces(s, i + 1, j);
                i = j + 1;
            } else {
                part = new HashSet<>();
                part.add(String.valueOf(ch));

                i++;
            }
            Set<String> next = new HashSet<>();
            for (String a : current) {
                for (String b : part) {
                    next.add(a + b);
                }
            }
            current = next;
        }
        result.addAll(current);
        return result;
    }
    public List<String> braceExpansionII(String expression) {
        Set<String> result = helper(expression, 0, expression.length());
        List<String> ans = new ArrayList<>(result);
        Collections.sort(ans);
        return ans;
    }
}