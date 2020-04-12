package eg.edu.alexu.csd.datastructure.queue;

public class arrqueue implements IQueue,IArrayBased{

	//take care that when he enters a size it decreases by one during processing
		//so ask him enter a size greater than given or handle it in the constructor
		private int N;
		private Object[] q;
		private int f;
		private int r;
		arrqueue(){
			N=1000;
			q=new Object[1000];
			f=0;
			r=0;
		}
		arrqueue(int cap) throws Exception {
			if(cap==0) {
				throw new Exception("empty queue");
			}
		else if(cap<3) {
				throw new Exception("small size");
			}
			N=cap+1;
			q=new Object[cap+1];
			r=0;
			f=0;
		}
    	@Override
		public int size() {
			return (N-f+r)%N;
		}
		@Override
		public boolean isEmpty() {	
			return (f==r);
		}
		@Override
		public void enqueue(Object element)  {
		 try {
			  if((r+1)%N==f) {
			    throw new Exception("full Queue!");
				   }
			    else {
					q[r]=element;
					r=(r+1)%N;
			    }
		    }
		 catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		@Override
		public Object dequeue()  {
			try {
			if(isEmpty()) {
	            throw new Exception("empty Queue!");
			}
			else {
				Object temp=q[f];
				f=(f+1)%N;
				return temp;
			}
			}
			catch(Exception e) {
				System.out.print(e.getMessage());
				return "";
			}
		}

	
}
