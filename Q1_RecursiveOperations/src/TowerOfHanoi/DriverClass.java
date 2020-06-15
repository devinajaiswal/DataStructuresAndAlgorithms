 package TowerOfHanoi;

public class DriverClass {

	public static TowerOfHanoiUsingStack movementOfDisks(int n, TowerOfHanoiUsingStack start, TowerOfHanoiUsingStack end, TowerOfHanoiUsingStack temporary){
		if(n == 1){
	            end.push(start.pop());
		}
		else{
		    movementOfDisks(n-1, start, temporary, end);
	            end.push(start.pop());
	            movementOfDisks(n-1, temporary, end, start);
		    }
		    return end;
		}
	    
	   public static void main(String [] args){

		   TowerOfHanoiUsingStack a = new TowerOfHanoiUsingStack();
		   TowerOfHanoiUsingStack b = new TowerOfHanoiUsingStack();
		   TowerOfHanoiUsingStack c = new TowerOfHanoiUsingStack();

		int numdisks = 5;
		for(int i=numdisks; i>0; i--){
	            a.push(i);
		}
	            System.out.println("Start: ");
	            a.display();
	            TowerOfHanoiUsingStack result = movementOfDisks(numdisks, a, c, b);
	            System.out.println("End: ");
	            result.display();
		}   
}
