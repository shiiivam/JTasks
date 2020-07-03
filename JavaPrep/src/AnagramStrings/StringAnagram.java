package AnagramStrings;

public class StringAnagram {

	public static void main(String[] args) {
		String str1 = "aab";
		String str2 = "aba";
		boolean isAnagram = true;
		boolean[] visited = new boolean[str1.length()];
		int len1,len2;
		len1 = str1.length();
		len2 = str2.length();
	
		if(len1==len2) {
			for(int i=0;i<len1;i++) {
				isAnagram = false;
				char a = str1.charAt(i);
				for(int j=0;j<len1;j++) {
					char ab = str2.charAt(j);
					if(a==ab && !visited[j]) {
						isAnagram = true;
						visited[j] = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
			if(isAnagram) {
				System.out.println("Strings are Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
	}

}
