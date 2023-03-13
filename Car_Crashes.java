import java.io.*;
class BinaryTree {
   private  Node root;

   private class Node {
       private String data;
       private Node left, right;

       public Node(String data) {
           this.data = data;
           this.left = null;
           this.right = null;
           
       }
   }

   public Node getRoot() {
	   return root;
   }
   public void insert(String data) {
       Node newNode = new Node(data);
       if (root == null) {
           root = newNode;
           return;
       }

       Node current = root;
       Node parent = null;
       while (true) {
           parent = current;
           if (data.compareTo(current.data) < 0) {
               current = current.left;
               if (current == null) {
                   parent.left = newNode;
                   return;
               }
               
           } 
         
           else {
               current = current.right;
               if (current == null) {
                   parent.right = newNode;
                   return;
               }
           }
           
       }
       
   }
   public int size(Node root ) {
       if (root== null) {
           return 0;
       }
       
       else {
    	   return size(root.left)+ 1 + size(root.right);
       }
   }

   public void Display(Node node) {
       if (node == null) {
           return;
       }
       Display(node.left);
       System.out.println(node.data);
       Display(node.right);
   }
}
public class Car_Crashes {
	
	
	public int size=0;
	
	private class Node {
        String  data;
        Node next;
        
        public Node(String data2) {
            this.data = data2;
        }
    }
    
    private Node front;
    private Node rear;
    
    public Car_Crashes() {
        front = null;
        rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void Enqueue(String fields) {
        Node newNode = new Node(fields);
        if (isEmpty()) {
          
            front = newNode;
            rear = newNode;
            size++;
        } 
        else {
           
            rear.next = newNode;
            rear = newNode;
            size++;
        }
        
        rear.next = front;
    }
    
    
    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
      
        if (front == rear) {
            
            front = null;
            rear = null;
        } else {
           
            front = front.next;
            rear.next = front;
            size--;
        }
       
    }
    public int size() {
    	
    	return size;
    }
    
    
    
    
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } 
        	
        	
        	Node temp=front;
            while(temp!=rear ) {
            
                  System.out.println(temp.data);
                   temp=temp.next;
                   Dequeue();
            
            	
            }
           
        
    }
   

public static void main(String[] args) {
       Car_Crashes C=new Car_Crashes();
 BinaryTree HitAndRun_Jan=new BinaryTree();
	BinaryTree NotHitAndRun_Jan=new BinaryTree();
      BinaryTree HitAndRun_Feb=new BinaryTree();
      BinaryTree NotHitAndRun_Feb=new BinaryTree();
      BinaryTree HitAndRun_Mar=new BinaryTree();
      BinaryTree NotHitAndRun_Mar=new BinaryTree();
      BinaryTree HitAndRun_Apr=new BinaryTree();
      BinaryTree NotHitAndRun_Apr=new BinaryTree();
      BinaryTree HitAndRun_May=new BinaryTree();
      BinaryTree NotHitAndRun_May=new BinaryTree();
      BinaryTree HitAndRun_Jun=new BinaryTree();
      BinaryTree NotHitAndRun_Jun=new BinaryTree();
      BinaryTree HitAndRun_Jul=new BinaryTree();
      BinaryTree NotHitAndRun_Jul=new BinaryTree();
      BinaryTree HitAndRun_Aug=new BinaryTree();
      BinaryTree NotHitAndRun_Aug=new BinaryTree();
      BinaryTree HitAndRun_Sep=new BinaryTree();
      BinaryTree NotHitAndRun_Sep=new BinaryTree();
      BinaryTree HitAndRun_Oct=new BinaryTree();
      BinaryTree NotHitAndRun_Oct=new BinaryTree();
      BinaryTree HitAndRun_Nov=new BinaryTree();
      BinaryTree NotHitAndRun_Nov=new BinaryTree();
      BinaryTree HitAndRun_Dec=new BinaryTree();
      BinaryTree NotHitAndRun_Dec=new BinaryTree();
	Car_Crashes SnowWeather=new Car_Crashes();
	Car_Crashes ClearWeather=new Car_Crashes();
	Car_Crashes RainWeather=new Car_Crashes();
	Car_Crashes Monday=new Car_Crashes();
	Car_Crashes Tuesday=new Car_Crashes();
	Car_Crashes Wednesday=new Car_Crashes();
	Car_Crashes Thursday=new Car_Crashes();
	Car_Crashes Friday=new Car_Crashes();
	Car_Crashes Saturday=new Car_Crashes();
	Car_Crashes Sunday=new Car_Crashes();
	
    
	String csvFile1 = "src\\ped_crashes.csv";
	String csvFile2 = "src\\ped_crashes.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    
    try {
    	br=new BufferedReader(new FileReader(csvFile2));
    	while ((line = br.readLine()) != null) {
            String[] data = line.split(cvsSplitBy);
            if(line.contains("Hit-and-run")) {
            	if(line.contains("January")) {
            	HitAndRun_Jan.insert(line);
            	}
            	
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("January")) {
            		NotHitAndRun_Jan.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("February")) {
            		HitAndRun_Feb.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("February")) {
            		NotHitAndRun_Feb.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("March")) {
            		HitAndRun_Mar.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("March")) {
            		NotHitAndRun_Mar.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("April")) {
            		HitAndRun_Apr.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("April")) {
            		NotHitAndRun_Apr.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("May")) {
            		HitAndRun_May.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("May")) {
            		NotHitAndRun_May.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("June")) {
            		HitAndRun_Jun.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("June")) {
            		NotHitAndRun_Jun.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("July")) {
            		HitAndRun_Jul.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("July")) {
            		NotHitAndRun_Jul.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("August")) {
            		HitAndRun_Aug.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("August")) {
            		NotHitAndRun_Aug.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("September")) {
            		HitAndRun_Sep.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("September")) {
            		NotHitAndRun_Sep.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("October")) {
            		HitAndRun_Oct.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("October")) {
            		NotHitAndRun_Oct.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("November")) {
            		HitAndRun_Nov.insert(line);
            	}
            }
            if(line.contains("Not Hit-and-run")) {
            	if(line.contains("November")) {
            		NotHitAndRun_Nov.insert(line);
            	}
            }
            if(line.contains("Hit-and-run")) {
            	if(line.contains("December")) {
            		HitAndRun_Dec.insert(line);
            	}
            }
            if(line.contains("Not hit-and-run")) {
            	if(line.contains("December")) {
            		NotHitAndRun_Dec.insert(line);
            	}
            }
    }
    System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
    System.out.println("                                                   Question#03");
    	System.out.println("Hit And Run In Month Of January :"+HitAndRun_Jan.size(HitAndRun_Jan.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of January :"+NotHitAndRun_Jan.size(NotHitAndRun_Jan.getRoot()));
    	System.out.println("Hit And Run In Month Of  February :"+HitAndRun_Feb.size(HitAndRun_Feb.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of February :"+NotHitAndRun_Feb.size(NotHitAndRun_Feb.getRoot()));
    	System.out.println("Hit And Run In Month Of  March :"+HitAndRun_Mar.size(HitAndRun_Mar.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of  March :"+NotHitAndRun_Mar.size(NotHitAndRun_Mar.getRoot()));
    	System.out.println("Hit And Run In Month Of April :"+HitAndRun_Apr.size(HitAndRun_Apr.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of April :"+NotHitAndRun_Apr.size(NotHitAndRun_Apr.getRoot()));
    	System.out.println("Hit And Run In Month Of  May :"+HitAndRun_May.size(HitAndRun_May.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of  May:"+NotHitAndRun_May.size(NotHitAndRun_May.getRoot()));
    	System.out.println("Hit And Run In Month Of June :"+HitAndRun_Jun.size(HitAndRun_Jun.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of June :"+NotHitAndRun_Jun.size(NotHitAndRun_Jun.getRoot()));
    	System.out.println("Hit And Run In Month Of July :"+HitAndRun_Jul.size(HitAndRun_Jul.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of July :"+NotHitAndRun_Jul.size(NotHitAndRun_Jul.getRoot()));
    	System.out.println("Hit And Run In Month Of August :"+HitAndRun_Aug.size(HitAndRun_Aug.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of August :"+NotHitAndRun_Aug.size(NotHitAndRun_Aug.getRoot()));
    	System.out.println("Hit And Run In Month Of  September :"+HitAndRun_Sep.size(HitAndRun_Sep.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of September :"+NotHitAndRun_Sep.size(NotHitAndRun_Sep.getRoot()));
    	System.out.println("Hit And Run In Month Of  October :"+HitAndRun_Oct.size(HitAndRun_Oct.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of  October :"+NotHitAndRun_Oct.size(NotHitAndRun_Oct.getRoot()));
    	System.out.println("Hit And Run In Month Of November :"+HitAndRun_Nov.size(HitAndRun_Nov.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of November :"+NotHitAndRun_Nov.size(NotHitAndRun_Nov.getRoot()));
    	System.out.println("Hit And Run In Month Of  December :"+HitAndRun_Dec.size(HitAndRun_Dec.getRoot()));
    	System.out.println(" Not Hit And Run In Month Of December :"+NotHitAndRun_Dec.size(NotHitAndRun_Dec.getRoot()));
    	System.out.println();
    	System.out.println("                                     Solution Of Question # 03");
    	System.out.println();
          System.out.println("November Has The Highest Hit And Run  Crash Cases!");
          System.out.println("April Has The Lowest Hit And Run CRash Cases!");
          System.out.println("October Has The Highest  Not Hit And Run  Crash Cases!");
          System.out.println("November Has The Lowest Not Hit And Run  Crash Cases!");
          System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    }
    catch(Exception Ex) {
    	Ex.printStackTrace();
    }
    	    try {
    	    	br = new BufferedReader(new FileReader(csvFile1));
     		
     		
     		
    	    	while ((line = br.readLine()) != null) {
                    String[] data = line.split(cvsSplitBy);
                    
                    
                 if( line.contains("Rain")  ) {
                    	 if(line.contains("Intersection")) {
             	    	RainWeather.Enqueue(line);
                    	 }
             	    	
             	   // RainWeather.display();
             	    }
                     
    	    	
    	    	
                  if(line.contains("Clear") ) {
                	  if(line.contains("Intersection")) {
         	    	ClearWeather.Enqueue(line);
                	  }
                     // ClearWeather.display();
         	    }
         	    if(line.contains("Snow") ) {
         	    	SnowWeather.Enqueue(line);
         	    //	SnowWeather.display();
         	    }
         	    
         	    else if (line.contains("Monday") ) {
         	    	if(line.contains("Intersection")) {
         	    	Monday.Enqueue(line);
         	    	
         	    	}
         	    }
         	    else if(line.contains("Tuesday") ) {
         	    	if(line.contains("Intersection")) {
         	    	Tuesday.Enqueue(line);
         	    	}
         	    	//Tuesday.display();
         	    }
         	    else if(line.contains("Wednesday")) {
         	    	if(line.contains("Intersection")) {
         	    	Wednesday.Enqueue(line);
         	    	//Wednesday.display();
         	    	}
         	    }
         	    else if(line.contains("Thursday")) {
         	    	if(line.contains("Intersection")) {
         	    	Thursday.Enqueue(line);
         	    	//Thursday.display();
         	    	}
         	    }
         	    else if (line.contains("Friday")) {
         	    	if(line.contains("Intersection")) {
         	    	Friday.Enqueue(line);
         	    	//Friday.display();
         	    	}
         	    	
         	    }
         	    else if(line.contains("Saturday")) {
         	    	if(line.contains("Intersection")) {
         	    	Saturday.Enqueue(line);
         	    	}
         	    	//Saturday.display();
         	    }
         	    else if(line.contains("Sunday")) {
         	    	if(line.contains("Intersection")) {
         	    		Sunday.Enqueue(line);
         	    	}
         	    	
         	    	//Sunday.display();
         	    }
         	  
       }
    	    	System.out.println("                                  Question#01");
    	   	System.out.println("Number Of Crashes In Monday:"+Monday.size());
    	    System.out.println("Number Of Crashes In Tuesday:"+Tuesday.size());
    	    System.out.println("Number Of Crashes In Wednesday:"+Wednesday.size());
    	    System.out.println("Number Of Crashes In Thursday:"+Thursday.size());
    	    System.out.println("Number Of Crashes In Friday:"+Friday.size());
    	  
    	    System.out.println("Number Of Crashes In Saturday:"+Saturday.size());
    	    	System.out.println("Number Of Crashes In Sunday:"+Sunday.size());
    	    	System.out.println();
    	    	System.out.println("Solution Of Question#01");
    	    	System.out.println();
    	    	System.out.println("Wenesday was the deadliest day among all the Wednesday!");
    	    System.out.println("------------------------------------------------------------------------------------------------------------------");
    	    System.out.println("                                          Question#02");
    	    System.out.println();
    	    	System.out.println("Number Of Rainy Day Crashes:"+RainWeather.size());
    	    	System.out.println("---------------------------------------------------------------------------------------------------------------");
    	    
    	    
    	    	
    	 
    	    	 br.close();
     				 
     			 }      
    	    catch(Exception EX) {
         		 EX.printStackTrace();
         	 }
           }   	
}




     	  
     			 
     		

	    	 
	  
   