package CJX;
import java.util.List;
import com.hankcs.hanlp.HanLP;
public class Simhash_bulit{
	public String simhash_bulit(String str) {
		int Hash[]=new int[128];//Êı×ÖÊı×éHash
		for(int i=0;i<Hash.length;i++) 
			Hash[i]=0;
		List<String> terms=HanLP.extractKeyword(str,str.length());
		for(String term:terms) {
			if(term.length()<128)
			{for(int j=0;j<128-term.length();j++)
				term="0"+term;
			}
		    char array[]=term.toCharArray();
		    for(int l=0;l<128;l++) {
			    if(array[l]=='1')
				    Hash[l]++;
			    else
				    Hash[l]--;
		    }
		}
		
		String result="";
		    for(int m=0;m<Hash.length;m++) {
		        if(Hash[m]<=0)
			        result +="0";
		        else
			        result +="1";
		    }
		return result;
	}	
}
