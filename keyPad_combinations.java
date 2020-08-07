class Solution {
    
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();
        String[] keys = {"","", "abc", "def", "ghi", "jkl","mno", "pqrs","tuv", "wxyz" };
        ArrayList<String> ans = new ArrayList<>();
        letter_combinations(digits, keys, ans,"");
        return ans;
    }
    
    public static void letter_combinations(String digits,String keys[], ArrayList<String> ans,String asf){
        if(digits.length()==0){
            ans.add(asf);
            return;
        }
        int numb = digits.charAt(0) - '0';
        String str = digits.substring(1);
        
        String res = keys[numb];
        for(int idx=0;idx<res.length();idx++){
            letter_combinations(str,keys,ans,asf+res.charAt(idx));
        }
        
    }
}
