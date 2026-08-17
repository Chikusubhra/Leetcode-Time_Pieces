class Solution {
    public String reformatDate(String date) {
        String year = date.substring(date.length() - 4);
        String result = year + "-";
        Map<String, String> map = new HashMap<String, String>();
        String arr1[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        String arr2[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], arr2[i]);
        }
        String month = date.substring(date.length() - 8, date.length() - 5);
        List<String> list = new ArrayList<String>(map.keySet());
        for (String str : list) {
            if (str.equals(month)) {
                result += map.get(str) + "-";
            }
        }
        String words[] = date.split(" ");
        String day_th = words[0];
        String day = "";
        for (int i = 0; i < day_th.length(); i++) {
            if (Character.isDigit(day_th.charAt(i))) {
                day += Character.toString(day_th.charAt(i));
            }
        }
        if (day.length() == 1) {
            result += "0" + day;
        } else if (day.length() == 2) {
            result += day;
        }
        return result;
    }
}