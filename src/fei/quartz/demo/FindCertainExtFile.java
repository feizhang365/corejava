package fei.quartz.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class FindCertainExtFile implements Job {
	private static final String FILE_DIR = "/Users/fzh/dev";
	private static final String FILE_TEXT_EXT = ".java";
	private static ArrayList<File> files = new ArrayList<>(); 
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		listFile(FILE_DIR, FILE_TEXT_EXT);
		System.out.println(files.size());
		for(File f : files){
			System.out.println(f.getAbsolutePath()+f.getName());
		}
	}
	// list files if is directory iterator
	public void listFile(String folder, String ext) {

//		GenericExtFilter filter = new GenericExtFilter(ext);
		File dir = new File(folder);
		
		if(dir.isDirectory()==false){
			System.out.println("Directory does not exists : " + FILE_DIR);
			return;
		}
		
		// list out all the file name and filter by the extension
//		String[] list = dir.list(filter);
//
//		if (list.length == 0) {
//			System.out.println("no files end with : " + ext);
//			return;
//		}
//
//		for (String file : list) {
//			String temp = new StringBuffer(FILE_DIR).append(File.separator)
//					.append(file).toString();
//			System.out.println("file : " + temp);
//		}
		File[] fList = dir.listFiles();
		for(File file : fList){
			if(file.isFile()){
				if(file.getName().endsWith(".java"))
				files.add(file);
			}else if(file.isDirectory()){
				listFile(file.getAbsolutePath(),ext);
			}
		}
		
	}

	// inner class, generic extension filter
	public class GenericExtFilter implements FilenameFilter {
		private String ext;
		public GenericExtFilter(String ext) {
			this.ext = ext;
		}
		
		public boolean accept(File dir, String name) {
			return (name.endsWith(ext));
		}
	}
}
