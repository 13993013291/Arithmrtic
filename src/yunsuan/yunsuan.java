package yunsuan;

import java.util.Scanner;

 public class yunsuan {
      String chushu()
     {
          int i=(int)(1+Math.random()*100);
          int j=(int)(1+Math.random()*100);
          while(i<j || i%j!=0)
          {
        	 i=(int)(1+Math.random()*100);
             j=(int)(1+Math.random()*100);
          }
          return(i + "÷" +j);
     }
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要练习的数目：");
    	int m=scanner.nextInt();
        String a,b;
        int k;
        yunsuan test=new yunsuan();
        for(int n=0;n<m;n++)
        {
             a=test.chushu();
             b=test.chushu();
             int i=(int)(Math.random()*100);
             int j=(int)(Math.random()*100);
             switch((int)(Math.random()*4))
             {
             case 0:
                 if(i>j)
                	System.out.println(i+"-"+j+"+"+a+"+"+i+"=");
                 if(i<j&&i<=10)                    
                	System.out.println(a+"+"+i+"+"+j+"*"+i+"=");
                 else
                    System.out.println(b+"+"+a+"=");                
                 break;
             case 1:
            	 if(i>j&&i<10)
                 	System.out.println(i+"-"+j+"+"+a+"*"+i+"=");
                  if(i<j&&i<=10)                    
                 	System.out.println(i+"+"+i+"*"+j+"-"+i+"=");
                  else
                     System.out.println(b+"-"+a+"=");                
                  break;
             case 2:
            	 if(i>j)
                 	System.out.println(i+"-"+j+"+"+i+"+"+i+"=");
                  if(i<j&&i<=10)                    
                 	System.out.println(a+"+"+i+"+"+j+"*"+i+"=");
                  else
                     System.out.println(b+"*"+"("+a+")"+"=");                
                  break;
             case 3:
            	 if(i>j)
                 	System.out.println(i+"-"+j+"+"+a+"+"+i+"=");
                  if(i<j&&i<=10)                    
                 	System.out.println(a+"+"+i+"+"+j+"*"+i+"=");
                  else
                     System.out.println(b+"+"+a+"=");                
                  break;
              }
         }
     }
 }

