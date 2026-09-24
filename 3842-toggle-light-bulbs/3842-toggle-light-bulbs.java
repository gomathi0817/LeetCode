import java.util.*;
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < bulbs.size(); i++) {
            int bulb = bulbs.get(i);
            if (result.contains(bulb)) {
                result.remove(Integer.valueOf(bulb));
            } else {
                result.add(bulb);
            }
        }
        Collections.sort(result);
        return result;
    }
}