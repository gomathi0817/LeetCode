class Solution {
    public String convertDateToBinary(String date) {
        int day = Integer.parseInt(date.substring(8, 10));
        int month = Integer.parseInt(date.substring(5, 7));
        int year = Integer.parseInt(date.substring(0, 4));
        String binaryDay=Integer.toBinaryString(day);
        String binaryMonth=Integer.toBinaryString(month);
        String binaryYear=Integer.toBinaryString(year);
        return binaryYear+"-"+binaryMonth+"-"+binaryDay;
    }
}