package UserImplementation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Comparable<User>{
	    
	    private String name;
	    private int id;
	    private Date dOB;
	    
	    public User (String name, int id, Date birth){
	        this.name = name;
	        this.id = id;
	        this.dOB = birth;
	    }
	    
	    @Override
	    public boolean equals(Object other){
	        if(this == other)
	            return true;
	        if(other == null || (this.getClass() != other.getClass())){
	            return false;
	        }
	        User guest = (User)other;
	        return(this.id == guest.id)&&(this.name != null && name.equals(guest.name)) && (this.dOB != null && dOB.equals(guest.dOB));
	    }
	    
	    @Override 
		public int hashCode() { 
			int result = 0; 
			result = 31*result + id; 
			result = 31*result + (name !=null ? name.hashCode() : 0); 
			result = 31*result + (dOB !=null ? dOB.hashCode() : 0); 
			return result; 
		} 
		@Override 
		public int compareTo(User t) { 
			return this.id - t.id; 
		} 
	        
	        
	        public static void main(String [] args) throws ParseException{
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	            Date date1 = sdf.parse("1994-02-20");
	            Date date2 = sdf.parse("1994-02-19");
	            
	            User user1 = new User("Devina", 1, date1);
	            User user2 = new User("Devina Jaiswal", 1, date1);
	            User user3 = new User("Devina", 2, date2);
	            
	            System.out.println("Equals() overriding results ");
	            System.out.println("Comparing 2 objects with same data");
	            System.out.println(user1.equals(user2));
	            System.out.println("Comparing 2 objects with different data");
	            System.out.println(user1.equals(user3));
	            
	            System.out.println("hashcode() overriding results ");
	            System.out.println("Hashcode for user1 : "+user1.hashCode());
	            System.out.println("Hashcode for user2 : "+user2.hashCode());
	            System.out.println("Hashcode for user3 : "+user3.hashCode());
	            
	            System.out.println("compareTo() overriding results ");
	            System.out.println("Comparing 2 objects with same data");
	            System.out.println(user1.compareTo(user2));
	            System.out.println("Comparing 2 objects with different data");
	            System.out.println(user1.compareTo(user3));
	        }
	    
	    
	    
	}