package Main;
import java.util.TreeSet;

import com.eclab.util.TextFile;


public class Main {
	public static void main(String[] args) {
		System.out.println("x");
		String file = TextFile.read("H://dev//JavaModule//Module1//src//com//eclab//util//TextFile.java");
		TextFile.write("test.txt", file);
		TextFile text = new TextFile("test.txt");
		System.out.println(text);
		System.out.println(text.size());
		text.write("test2.txt");
		TreeSet<String> words = new TreeSet<String>(new TextFile("test2.txt","\\W+"));
		System.out.println(words.headSet("a"));
	}
}
