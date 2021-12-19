package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsInJava {
	//normal way using java
//	@Test
	public void regular()
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("Abhishek");
		name.add("Akanksha");
		name.add("Rahul");
		name.add("Ayush");
		name.add("Kunal");
		int count=0;
		for(int i=0;i<name.size();i++)
		{
			String actualName=name.get(i);
			if(actualName.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	//using java stream lets see hoe to filter
//	@Test
	public void streamfilter()
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("Abhishek");
		name.add("Akanksha");
		name.add("Rahul");
		name.add("Ayush");
		name.add("Kunal");
		//stream
		long ans=name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(ans);
	}
//	@Test
	public void streamMap()
	{
		ArrayList<String> name=new ArrayList<String>();
		name.add("Abhishek");
		name.add("Akanksha");
		name.add("Rahul");
		name.add("Ayush");
		name.add("Kunal");
		Stream.of("Abhishek","rama","ahliya","Ram","Kunal").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

	@Test
	public void streamCollect()
	{
		List<String> ls=Stream.of("Abhishek","rama","ahliya","Ram","Kunal").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
	}
}
