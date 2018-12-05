package interview.java.ass.FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileHandling {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\admin\\Desktop\\hello.txt");
	FileInputStream filesteam =new FileInputStream(file);
	InputStreamReader inputstr=new InputStreamReader(filesteam);
	BufferedReader br=new BufferedReader(inputstr);
	
	String line=null;
	int countWord = 0;
    int sentenceCount = 0;
    int characterCount = 0;
    int paragraphCount = 0;
    int whitespaceCount = 0;
    
    while ((line=br.readLine())!=null) {
    	if (line.equals("")) {
    		paragraphCount++;
		}
    	if(!(line.equals("")))
    	{
    		characterCount+=line.length();
    		String[]wordList=line.split("\\s+");
    	    countWord+=wordList.length;
    	    whitespaceCount+=countWord-1;
    	    String[]sentenceList=line.split("[!?.:]+");
    	    sentenceCount+=sentenceList.length;
    	}
	}
    System.out.println("Total word count = " + countWord);
    System.out.println("Total number of sentences = " + sentenceCount);
    System.out.println("Total number of characters = " + characterCount);
    System.out.println("Number of paragraphs = " + paragraphCount);
    System.out.println("Total number of whitespaces = " + whitespaceCount);
    }
}