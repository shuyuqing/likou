//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

//package leetcode;
//
//class Solution2 {
//	
//    public String reverseLeftWords(String s, int n) {
//    	
//    	int l = s.length();
//    	
//    	String s1 = "";
//    	
//    	for(int i = n; i < l; i++) {
//    		
//    		s1+=s.charAt(i);
//    	}
//    	
//    	String s2 = "";
//    	
//    	for(int j = 0; j < n; j++) {
//    		
//    		s2+=s.charAt(j);
//    	}
//    	
//    	String jieguo = s1+s2;
//    	
//    	return jieguo;
//    }
//    
//    public static void main(String args[]) {
//    	
//    	Solution2 st=new Solution2();
//    	
//    	System.out.println(st.reverseLeftWords("abcde", 4));
//    	
//    }
//}

class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder builder = new StringBuilder();
		builder.append(s.substring(n));
		builder.append(s.substring(0, n));
		return builder.toString();
    }
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        int length = s.length();
        if (n > length) return null;
        return s.substring(n) + s.substring(0,n);
    }
}

