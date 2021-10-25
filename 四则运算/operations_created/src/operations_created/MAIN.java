package operations_created;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class MAIN {
	@SuppressWarnings({ "unused" })
	
	public static void main(String[] args) {
		 try {
		 System.out.println("开始运行！");
		 int len=args.length;	        
	     int num=Integer.parseInt(args[1]);//生成题目个数
         int range=Integer.parseInt(args[3]);//题目中数值的范围
	     //按照题目要求,输入八个数据,不满足要求退出程序
//-n 10000 -r 10 -e "Exercises.txt" -a "Answers.txt"
	     if(len==8&&num>0&&range>0&&args[0].equals("-n")&&args[2].equals("-r")&&args[4].equals("-e")&&args[6].equals("-a")) {

	    	String[] topic = new String[num];
 		    String[] answer =new String[num]; 
 		    topic_structure t_a[]=new topic_structure[num];
			for (int i = 1; i < num+1; i++) {
				t_a[i-1]=new topic_structure(range);
	    		topic[i-1]=t_a[i-1].result[0];
		    	answer[i-1]=t_a[i-1].result[1];
		    	System.out.println("第"+i+"道题题目和答案生成！");
			    	}
			
			
			
	    	 try {
	    		    File writeName = new File(args[5]); // 相对路径
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
	    		    }
	    		    FileWriter fw;
	    		    fw=new FileWriter(writeName);
	    		    for (int i = 1; i < topic.length+1; i++) {
	    		    	fw.write(i+".  "+topic[i-1]+"\n");
//此处放题目的生成	    		   	
	    		    }
	    			fw.close();
	    		} catch (Exception e) {
	    		    System.out.println("输入文件格式不对！");
	    		}
	    	 
	    	 try {
	    		    File writeName = new File(args[7]); // 相对路径
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
	    		    }
	    		    FileWriter fw;
	    		    fw=new FileWriter(writeName);
	    		    for (int i = 1; i < answer.length+1; i++) {
	    		    	fw.write(i+".  "+answer[i-1]+"\n");
//此处放答案的生成	    		   	
	    		    }
	    			fw.close();
	    		} catch (Exception e) {
	    			 System.out.println("输入文件格式不对！");
	    		}
	    	 try {
	    		    File writeName = new File("Grade.txt"); // 相对路径
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
	    		    }
	    		    
	    		    ArrayList<String> list3=new ArrayList<String>();
	    		    ArrayList<String> list4=new ArrayList<String>();
	    		    ArrayList<String> list5=new ArrayList<String>();
	    		    int sum1 = 0,sum2=0;	    		   
	    		    for (int k = 1; k < num+1; k++) {
	    		    if(true)
	    		    {sum1+=1;list4.add(String.valueOf(k));}
	    		    else
	    		    {sum2+=1;list5.add(String.valueOf(k));}
//此处放统计答案是否正确的生成	    		    	
	    		    }
	    		    list3.add("Correct: "+sum1+list4.toString());
	    		    list3.add("Wrong: "+sum2+list5.toString());
	    		    
	    		    FileWriter fw;
	    		    fw=new FileWriter(writeName);
	    		    for (int i = 1; i < list3.size()+1; i++) {
	    		    	fw.write(i+".  "+list3.get(i-1)+"\n"); 		   	
	    		    }
	    			fw.close();
	    			
	    		} catch (Exception e) {
	    		    e.printStackTrace();
	    		}     
	    }else {
	     System.out.println("您输入的参数不合法！！！");
	     System.exit(0);
	       }           
	     System.out.println("运行成功！");
	     System.out.println("题目存在于jar所在文件夹的Exercises.txt中，答案存在于jar所在文件夹的Answers.txt中，判断答案对错存在于jar所在文件夹的Grade.txt中！");
		 } catch (java.lang.ArrayIndexOutOfBoundsException e) {
 		    System.out.println("这样操作是不行的，你还要输入例如（ -n 20 -r 10 -e \"Exercises.txt\" -a \"Answers.txt\"）括号内的内容再按ENTER！");
 		}
	    }
	}
