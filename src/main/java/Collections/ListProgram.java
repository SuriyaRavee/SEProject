package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListProgram {

	public static void main(String[] args) {
		List<String> complist = new LinkedList<String>();
		//List<String> complist = new ArrayList<String>();
		complist.add("Infosys");
		complist.add("Syntel");
		complist.add("TCS");
		complist.add("HCL");
		System.out.println(complist);
		System.out.println(complist.size());
		System.out.println(complist.get(2));
		System.out.println(complist.contains("CTS"));
		//List will allow duplicates
		complist.add("TCS");
		System.out.println(complist);
		System.out.println(complist.remove("TCS"));
		//here 1st one will get removed
		System.out.println(complist);
		complist.clear();
		System.out.println(complist.isEmpty());
		
		for(String eachcomp :complist)
			System.out.println(eachcomp);
		
	}

}
