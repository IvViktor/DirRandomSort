package ua.kiev.ivviktor;

/**
 * Hello world!
 *
 */
import java.util.Set;
import java.util.Iterator;

public class AppMain
{
    public static void main( String[] args )
    {
		if(args.length!=1){System.out.println("SYNTAX ERROR. YOU SHOULD PUT A NUMBER.");
																		System.exit(1);}	

		int bounds=Integer.parseInt(args[0]);	
		Set<Integer> numberSet=new Randomizer().getUniqRandomsSet(bounds);
		for(Iterator<Integer> iterator=numberSet.iterator();iterator.hasNext();){
				System.out.print(iterator.next()+" ");
		}
		System.out.println();
    }
	
	
}
