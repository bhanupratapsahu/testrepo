package test.atmecs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App implements Iterable<App>
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    }
    
    /**
     * @return 
     * 
     */
    public Set<Integer> test() {
		
    	ListIterator<String> itr = new ArrayList<String>().listIterator();
    	
    	Set<Integer> intSet = new HashSet<Integer>();
    	
    	Set<String> strSet = new TreeSet<String>();
    	
    	Set<Double> dblSet = new LinkedHashSet<Double>();
		return intSet;
    	
		
    	  
	}
    
    public Collection m1() {
    	
    	List<String> list = new ArrayList<String>();
    	list.add("");
    	list.add("");
    	list.add("");
    	list.add("");
    	return new ArrayList();
		
	}
    
    

	@Override
	public Iterator<App> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
