package ru.specialist;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		Path labs = Paths.get("..", "labs.txt");
		List<String> lines = Files.readAllLines(labs, Charset.forName("utf-8"));
		int lineCount = 0, wordCount = 0, charCount = 0;
		for(String line : lines) {
			System.out.println(line);
			lineCount++;
			charCount += line.length();
			wordCount += line.split("\\s").length;
		}
		System.out.println("-----------------------------------");
		System.out.printf("Lines: %d Words: %d Chars: %d\n", 
				lineCount, wordCount, charCount);
	}

}
