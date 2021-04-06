package leetcode;

class Solution2 {
	
    public String reverseLeftWords(String s, int n) {
    	
    	int l = s.length();
    	
    	String s1 = "";
    	
    	for(int i = n; i < l; i++) {
    		
    		s1+=s.charAt(i);
    	}
    	
    	String s2 = "";
    	
    	for(int j = 0; j < n; j++) {
    		
    		s2+=s.charAt(j);
    	}
    	
    	String jieguo = s1+s2;
    	
    	return jieguo;
    }
    
    public static void main(String args[]) {
    	
    	Solution2 st=new Solution2();
    	
    	System.out.println(st.reverseLeftWords("abcde", 4));
    	
    }
}


