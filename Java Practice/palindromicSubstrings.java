class plaindromicSubstrings {
    public int countSubstrings(String s) {
        int count=0;
        String str="";

        //outer Loop
        for(int i=0; i<s.length();i++){
            str="";

            //inner Loop
            for(int j=i; j<s.length();j++){
                Character ch=s.charAt(j);
                str+=ch;
                boolean bool=isPalindrome(str);
                if(bool) count++;
            }
        }
        return count;
    }
    public boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<=j){
            char a=str.charAt(i);
            char b=str.charAt(j);
            if(a!=b) return false;
            i++;
            j--;
        }
        return true;
    }
}