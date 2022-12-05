package JavaStreams_3;

import java.util.*;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthTreeUI;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Tutorial1 {

	@Test
	public void regular () {

		//FInd the number of names starting with "A" in the list
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhi");
		names.add("Ront");
		names.add("Abhishek");
		names.add("Abhijit");
		names.add("Abhil");

		int count = 0;

		for(int i = 0 ; i<names.size(); i++) {

			String actual = names.get(i);

			if(actual.startsWith("A")) {

				count++;
			}

		}

		System.out.println(count);

	}


	@Test
	public void streamFIlter() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhi");
		names.add("Ront");
		names.add("Abhishek");
		names.add("Abhijit");
		names.add("Abhil");

	long count = 	names.stream().filter(s->s.startsWith("A")).count();
	
	System.out.println(count);
		
	
	//Create stream directly 
	
	Stream.of("Abhi" , "Rony").filter(s->s.startsWith("A"));
	
	long count_s = Stream.of("Abhi" , "Rony").filter(s->s.startsWith("A")).count();
	System.out.println(count_s);
	

	}

	
	@Test
	public void streamFIlter2() {

		//Print all the names of Arraylist having length > 4
		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhi");
		names.add("Ront");
		names.add("Abhishek");
		names.add("Abhijit");
		names.add("Abhil");
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	
		System.out.println("Limiting till 1");
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
}
	

	@Test
	public void stream_Map() {

		//Print all the names of Arraylist having last letter as "a" in Uppercase
	

		Stream.of("Abhia" , "Ronya" , "Abhisheka" , "Bittu" , "Koyel").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));;
		
		
		//Print all the names of Arraylist having last letter as "a" in Uppercase and in Sorted  
		System.out.println("$$$$$$$$$$$$$$$$$");
		
		Stream.of("Abhia" , "Ronya" , "Abhisheka" , "Bittu" , "Koyel").filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));;

	}

	@Test
	public void stream_Merge2list() {

		//Merge 2 list and check if the contains any element with "Abhi" , if yes pass else fail
	
		ArrayList<String> names1 = new ArrayList<String>();

		names1.add("Abhi");
		names1.add("Ront");
		names1.add("Abhishek");
		names1.add("Abhijit");
		names1.add("Abhil");

		ArrayList<String> names2 = new ArrayList<String>();

		names2.add("Abhiaaaaaaaaa");
		names2.add("Rontaaaaaaaaaaa");
		names2.add("Abhishekaaaaaaaa");
		names2.add("Abhijitaaaaaaa");
		names2.add("Abhilaaaa");
		
		
		Stream<String> newStream = Stream.concat(names1.stream(),names2.stream());
		
		//Sort the stream with filter condition
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Abhi"));
		
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
		

	}
	
	
	
}
