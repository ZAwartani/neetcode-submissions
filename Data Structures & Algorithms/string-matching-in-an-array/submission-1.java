class Solution {
    HashSet<String> Sub_word = new HashSet<>();
    public List<String> stringMatching(String[] words) {
        int Slow = 0;
        int Fast = Slow + 1;
        while(Slow < words.length - 1){
            String First = words[Slow];
            String Seconde = words[Fast];
            if(First.contains(Seconde)){
                Sub_word.add(Seconde);
            }
            if(Seconde.contains(First)){
                Sub_word.add(First);
            }
            if(Fast == words.length - 1){
                Slow++;
                Fast = Slow + 1;
            }else{
                Fast++;
            }
        }
        return new ArrayList<>(Sub_word);
    }
}