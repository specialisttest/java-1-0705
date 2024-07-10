package ru.specialist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		try (var fis = new FileInputStream(".."+File.separator+"labs.txt");
				var isr = new InputStreamReader(fis,Charset.forName("utf-8"));
				var reader = new BufferedReader(isr))
		{
			String s;
			while ( (s = reader.readLine()) !=null ) 
				System.out.println( s );
					
		} // reader.close() isr.close() fis.close()		
		
		Path labs = Paths.get("..", "labs.txt");
		System.out.println(labs);
		System.out.println(labs.getFileName());
		if (Files.exists(labs))
//			System.out.println(Files.readString(labs, Charset.forName("utf-8")));
		{
			List<String> lines = Files.readAllLines(labs, Charset.forName("utf-8"));
			for(String line : lines)
				System.out.println(line);
		}
		
		Path fileToWrite = Paths.get("..", "test.txt");
		String[] stringToWrite = {"Test string", "Тестовая строка"};
		Files.write(fileToWrite, 
				List.of(stringToWrite), 
				Charset.forName("utf-8"));
		
		Path dir = Paths.get("..");
		
		Files.newDirectoryStream(dir).forEach(System.out::println);
			
		
		WatchService watchDog = 
				FileSystems.getDefault().newWatchService();
		
		dir.register(watchDog, StandardWatchEventKinds.ENTRY_CREATE);
		WatchKey key = watchDog.take();
		for(var event : key.pollEvents()) {
			System.out.println(event.context());
		}
		

	}

}
