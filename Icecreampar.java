
import java.util.Scanner;
//main class
class Icecreampar 
{
   public static void main(String args [])
   {
    Icecream ob=new Icecream();                            //create an object
    do{                                                    //do while start
    ob.listitem();                                         
    System.out.println("......................................THANKYOU!.........................");
    }while(true); 
   }
}


 class Icecream
{
   // INPUT OBJECT.
    
   Scanner sc=new Scanner(System.in);
  
    
//  STRING ARRAY DECLERTION
   String array[]={"Apple ","Vanilla","chocolate","Strawberry","pistachio"};

//  price array decleartation

  public int Apple[]={10,25,50,70,150};
   public int Qtyofa[]={100,50,10,5,1}; 

   public int Vanilla[]={20,50,80,100};
public int Qtyofv[]={140,50,10,5,}; 

    public int chocolate[]={20,40,80,100};
public int Qtyofch[]={130,50,10,5}; 

 public int Strawberry[]={20,50,70,100};
public int Qtyofs[]={120,50,10,5}; 

 public int pistachio[]={10,20,40,50,100};
public int Qtyofp[]={100,50,10,5,1}; 

 

//CONSTRUCTOR
 
   Icecream()
   {
        
       System.out.println(".....................welcome to Icecream parlour.....................");
   } 
  
// ITEM LIST METHOD
   public  void listitem()
    {
        for(int i=0;i<array.length;i++)                          //for loop
        {
         System.out.println("press "+ i + "for " + array[i]  + "flavour ");  //print the choice of flavour
        }
         System.out.println("press 5 for exit ");                         //for exit 
         
       input();                  //input method call
    }
// INPUT METHOD
   public void input()
   {
      int ch;                          //declarationof variable
      System.out.println("enter the choice");         //for input
      ch=sc.nextInt();                        
      
      sale(ch);                 //sale method call
   }
// SALE METHOD
    public  void sale(int x)                            //sale method define
     {
        int startrange,endrange;                         //variable declaration
         switch(x)                                    //switch case start
        {
          case 0:  System.out.println("enter the range");                   //ask range
                      startrange=sc.nextInt();                       //starting range
                      System.out.println("to");
                      endrange=sc.nextInt();                          //ending range
                      cheak(array[0]);                                 //check method
                      range(startrange,endrange,Apple,Qtyofa,x);       //range method call
                      break;
            case 1:  System.out.println("enter the range");
	                      startrange=sc.nextInt();
                      System.out.println("to");
                      endrange=sc.nextInt();
                      cheak(array[1]);
                      range(startrange,endrange,Vanilla,Qtyofv,x);
                      break;  
	    case 2:  System.out.println("enter the range");
	                      startrange=sc.nextInt();
                      System.out.println("to");
                      endrange=sc.nextInt();
                      cheak(array[2]);
                      range(startrange,endrange,chocolate,Qtyofch,x);
                      break; 
	    case 3:  System.out.println("enter the range");
	                      startrange=sc.nextInt();
                      System.out.println("to");
                      endrange=sc.nextInt();
                      cheak(array[3]);
                      range(startrange,endrange,Strawberry,Qtyofs,x);
                      break;   
            case 4:  System.out.println("enter the range");
	                      startrange=sc.nextInt();
                      System.out.println("to");
                      endrange=sc.nextInt();
                      cheak(array[4]);
                      range(startrange,endrange,pistachio,Qtyofp,x);
                      break;  
            case 5: System.exit(0);
            default:System.out.println("You have entered Wrong  choice\n");
                    System.out.println("Please enter the Correct choice ");
                    break; 
                      
         }
     }

// STOKE cheaking METHOD

  public void cheak(String s)
   {
     for(int i=0;i<array.length;i++)
     {
          if(array[i]==s)
          {
             System.out.println("product is in stoke");
             break;
          }
      else
       {
         if(i==array.length)
             {
               System.out.println("product is out of stock");
             }
          }
     }
       
   }
// RANGE COMPARE
  public void range(int x,int y, int []a,int []b,int j)
   {
     System.out.println(" various price of your product given range");
    System.out.println("");
    System.out.println("price \t\t\t  Qty ");
     for(int i=0;i<a.length;i++)
     {
       
       if(x<=a[i])
       {
          
         System.out.println(" " + a[i] + "rs" + "\t\t\t" + b[i]);
       }
       if(a[i]>y)
         {
             break;
         }

     }
        System.out.println("enter the price");
       int ch1=sc.nextInt();                        //enter price of icecream
        System.out.println("enter the qty");        //how many quantity you want
       int qty=sc.nextInt();
       System.out.println("..............collect your product................... ");
       System.out.println(" total bill=" + (qty*ch1));
     
        
   }
 
  }
