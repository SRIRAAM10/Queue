import java.util.Scanner;
class Queue
{
    Scanner scan=new Scanner(System.in);
    int queue[];
    int front;
    int rear;
    int n;
    
    Queue(int size)
    {
        n=size;
        front=-1;
        rear=-1;
        queue=new int[size];
    }
    void enqueue()
    {
        int x;
        System.out.println("Enter The Element To be inserted: ");
        x=scan.nextInt();
       
        if(rear==n-1)
        {
            System.out.println("OVERFLOW");
        }
        else if(front==-1&&rear==-1)
        {
           
            front=rear=0;
            queue[rear]=x;
        }
        else
        {
             
            rear++;
            queue[rear]=x;
        }
        
    }
    void dequeue()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("UNDERFLOW");
        }
        else if(front==rear)
        {
           
          
            System.out.println("Deleted Element: "+queue[front]);
              front=rear=-1;
        }
        else
        {
        
            
            System.out.println("Deleted Element: "+queue[front]);
            front++;
            
        }
    }
    void peek()
    {
        if(front==-1&&rear==-1)
        {
            System.out.println("NULL");
        }
        else{
       
        System.out.println("The Top="+queue[front]);
        }
    }
    void display()
    {
         if(front==-1&&rear==-1)
        {
            System.out.println("NULL");
        }
        else
        {
            for(int i=front;i<rear+1;i++)
            {
                System.out.println("\n"+queue[i]);
            }
        }
        
        
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int m;
        

        System.out.println("Enter No of elements in the Queue: ");
        m=scan.nextInt();
       
        Queue q=new Queue(m);
        for(int i=0;i<m;i++)
        {
            q.enqueue();
        }
       boolean option=true;
        while(option)
        {
            int choice;
            System.out.println("Enter The Operations to be performed: 1.ADD ELEMENTS 2.DELETE ELEMENT 3.SHOW TOP 4.DISPLAY ALL 5.EXIT");
            choice=scan.nextInt();
            switch(choice)
            {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    option=false;
    
            }

        }
        

    
        
    }
}