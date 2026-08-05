class Solution {

     public String encode(List<String> strs) {
        StringBuffer result= new StringBuffer();
        for (String str: strs) {
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String originalStr = str;
        int i = 0;
        while(i < str.length()) {
            int delimiterPos = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i,delimiterPos));
            i = delimiterPos+1;
            String decodedStr = str.substring(i, i+length);
            result.add(decodedStr);
            i+=length;
            
        }
        return result;
    }
}
