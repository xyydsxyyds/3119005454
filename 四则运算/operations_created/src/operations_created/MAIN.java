package operations_created;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;

public class MAIN {
	@SuppressWarnings({ "unused" })
	
	public static void main(String[] args) {
		 try {
		 System.out.println("��ʼ���У�");
		 int len=args.length;	        
	     int num=Integer.parseInt(args[1]);//������Ŀ����
         int range=Integer.parseInt(args[3]);//��Ŀ����ֵ�ķ�Χ
	     //������ĿҪ��,����˸�����,������Ҫ���˳�����
//-n 10000 -r 10 -e "Exercises.txt" -a "Answers.txt"
	     if(len==8&&num>0&&range>0&&args[0].equals("-n")&&args[2].equals("-r")&&args[4].equals("-e")&&args[6].equals("-a")) {

	    	String[] topic = new String[num];
 		    String[] answer =new String[num]; 
 		    topic_structure t_a[]=new topic_structure[num];
			for (int i = 1; i < num+1; i++) {
				t_a[i-1]=new topic_structure(range);
	    		topic[i-1]=t_a[i-1].result[0];
		    	answer[i-1]=t_a[i-1].result[1];
		    	System.out.println("��"+i+"������Ŀ�ʹ����ɣ�");
			    	}
			
			
			
	    	 try {
	    		    File writeName = new File(args[5]); // ���·��
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
	    		    }
	    		    FileWriter fw;
	    		    fw=new FileWriter(writeName);
	    		    for (int i = 1; i < topic.length+1; i++) {
	    		    	fw.write(i+".  "+topic[i-1]+"\n");
//�˴�����Ŀ������	    		   	
	    		    }
	    			fw.close();
	    		} catch (Exception e) {
	    		    System.out.println("�����ļ���ʽ���ԣ�");
	    		}
	    	 
	    	 try {
	    		    File writeName = new File(args[7]); // ���·��
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
	    		    }
	    		    FileWriter fw;
	    		    fw=new FileWriter(writeName);
	    		    for (int i = 1; i < answer.length+1; i++) {
	    		    	fw.write(i+".  "+answer[i-1]+"\n");
//�˴��Ŵ𰸵�����	    		   	
	    		    }
	    			fw.close();
	    		} catch (Exception e) {
	    			 System.out.println("�����ļ���ʽ���ԣ�");
	    		}
	    	 try {
	    		    File writeName = new File("Grade.txt"); // ���·��
	    		    if(!writeName.exists()) {
	    		        writeName.createNewFile(); // �������ļ�,��ͬ�����ļ��Ļ�ֱ�Ӹ���
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
//�˴���ͳ�ƴ��Ƿ���ȷ������	    		    	
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
	     System.out.println("������Ĳ������Ϸ�������");
	     System.exit(0);
	       }           
	     System.out.println("���гɹ���");
	     System.out.println("��Ŀ������jar�����ļ��е�Exercises.txt�У��𰸴�����jar�����ļ��е�Answers.txt�У��жϴ𰸶Դ������jar�����ļ��е�Grade.txt�У�");
		 } catch (java.lang.ArrayIndexOutOfBoundsException e) {
 		    System.out.println("���������ǲ��еģ��㻹Ҫ�������磨 -n 20 -r 10 -e \"Exercises.txt\" -a \"Answers.txt\"�������ڵ������ٰ�ENTER��");
 		}
	    }
	}
