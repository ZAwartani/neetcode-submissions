class Solution {

    public String encode(List<String> strs) {
String result = "";
        for(int i = 0 ; i < strs.size(); i++)
        {
            for(int j = 0 ; j < strs.get(i).length() ;j++)
            {
                String Word = strs.get(i);
                int Ascii = (int) Word.charAt(j);
                result+=Ascii;
                result+='.';
            }
            result+=',';
        }
        return result;
    }

    public List<String> decode(String str) {
 List<String> result = new ArrayList<>();
        String txt = "";
        String number = "";
        for(int i = 0 ; i < str.length();i++)
        {
            if(str.charAt(i) == '.')
            {
                int value = Integer.parseInt(number);
                char ch = (char) value;
                txt += ch;
                number = "";
            }
            else if (str.charAt(i) == ','){
                result.add(txt);
                txt = "";
            }
            else{
                number += str.charAt(i);
            }
        }
        return result;
    }
}
