//CONDITIONS:
//X= add new score to the array list
//+= sum of prev 2 scores
//D = double the prev score
//C remove the prev score
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String ope = operations[i];
            if (ope.equals("C")) {
                ans.remove(ans.size() - 1);
            } 
            else if (ope.equals("+")) {
                int last = ans.get(ans.size() - 1);
                int secondLast = ans.get(ans.size() - 2);
                ans.add(last + secondLast);
            } 
            else if (ope.equals("D")) {
                ans.add(2 * ans.get(ans.size() - 1));
            } 
            else {
                ans.add(Integer.parseInt(ope));//parseInt is used instead of valueOf
            }
        }
        int sum = 0;
        for (int num : ans) {
            sum += num;
        }
        return sum;
    }
}