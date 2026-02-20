class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;   
        int days = n % 7;    
        
        int totalWeeks = weeks * 21 + 7 * weeks * (weeks + 1) / 2;
        
        
        int totalDays = 0;
        for (int i = 1; i <= days; i++) {
            totalDays += weeks + i;
        }
        
        return totalWeeks + totalDays;
    }
}