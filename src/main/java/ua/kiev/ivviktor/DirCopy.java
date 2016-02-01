/**
 * 
 */
package ua.kiev.ivviktor;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

/**
 * @author User
 *
 */
public class DirCopy {
	private File srcDir;
	private File targetDir;
	/**
	 * @param srcDir
	 * @param targetDir
	 */
	public DirCopy(File srcDir, File targetDir) {
		this.srcDir = srcDir;
		this.targetDir = targetDir;
	}
	public void copyDir(Set<Integer> order){
		File[] srcFiles=srcDir.listFiles();
		int ind=0;
		for(Integer i : order){
			ind++;
			String fileExt=FilenameUtils.getExtension(srcFiles[i].getName());
			if(fileExt.length()>0) fileExt="."+fileExt;
			File newFile=new File(targetDir, ind+fileExt);
			try {
				FileUtils.copyFile(srcFiles[i], newFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Cannot copy file "+srcFiles[i].getName()+" to "+newFile.getAbsolutePath());
			}
		}
		
	}
	

}
