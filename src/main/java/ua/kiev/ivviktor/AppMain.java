package ua.kiev.ivviktor;

import java.io.File;
import java.util.Set;

public class AppMain
{
	private static final String usage="USAGE:\r\nDirRandomOrder -s <directory> -t <directory>";
    public static void main( String[] args )
    {
		if(args.length!=4){System.out.println("SYNTAX ERROR.\r\n"+usage);System.exit(1);}	
    	File srcDir=null, targetDir=null;
    	for(int i=0;i<args.length;i++){
    		if(args[i]=="-s") srcDir=new File(args[++i]);
    		else if(args[i]=="-t"){ targetDir=new File(args[++i]);targetDir.mkdir();}
    		else{ System.out.println(usage);System.exit(1);}
    	}
		int filesNum=srcDir.listFiles().length;
		Set<Integer> numberSet=new Randomizer().getUniqRandomsSet(filesNum);
		DirCopy dc=new DirCopy(srcDir, targetDir);
		dc.copyDir(numberSet);
		System.out.println("Files successfully copied into "+targetDir.getName());
    }
	
	
}
