//�ַ���������ת�����ǰ��ַ���ǰ������ɸ��ַ�ת�Ƶ��ַ�����β�����붨��һ������ʵ���ַ�������ת�����Ĺ��ܡ����磬�����ַ���"abcdefg"������2���ú�������������ת��λ�õ��Ľ��"cdefgab"��

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

