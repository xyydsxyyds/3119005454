package CJX;

public class Distance_getting {
     public double distance_getting(String str1,String str2) {
         char[] char1=str1.toCharArray();
         char[] char2=str2.toCharArray();
         int distance=0;
         if(char1.length==char2.length) {
                for(int i=0;i<char1.length;i++) {
	                 if(char1[i]!=char2[i])
		                   distance++;
                }
         }	
         return 0.01*(100-distance*100/128);
     }
}
