// WAP in java for Aggregation.

class Operation{  
     int square(int n){  
      return n*n;  
     }  
    }  
      
    class AggregationCircle{  
    
     Operation op;//aggregation  
     double pi=3.14;  
        
     double area(int radius){  
       op=new Operation();  
       int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
       return pi*rsquare;  
     }  
                  
     public static void main(String args[]){
         AggregationCircle c=new AggregationCircle();
       double result=c.area(5);  
       System.out.println(result);  
     }  
    }  