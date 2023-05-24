class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    int count = 1;
	    if (head1==null){
	        return 0;
	    }
	    else{
	        Node temp = head1;
	        while(temp.next!=null){
	            count+=1;
	            temp = temp.next;
	        }
	        //return count;
	        
	    }
	    if(count%2==0) return 0;
	    return 1;
	}
}
