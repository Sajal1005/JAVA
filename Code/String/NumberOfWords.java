package String;

public class NumberOfWords {
    public int countWords(String s) {
        s=s.trim();
        if(s.length()==0){return 0;}
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                count++;
            }
        }
        return count+1;
    }
}
