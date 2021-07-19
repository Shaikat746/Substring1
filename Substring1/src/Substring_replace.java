
public class Substring_replace {
	

	public static void main(String[] args) {
		// Initialising String
	      String Str = "0110";
	      char[] c=Str.toCharArray();
	      for(int i=1;i<c.length;i++) {
	    	  if(c[i]=='1')
	    	  {
	    		  c[i] = '0';
	    	  }
	    	  else
	    	  {
	    		  c[i] = '1';
	    	  }
	    	  
	      }
	      String str = new String(c);
	      System.out.print(str);
	}

	
		
	}

