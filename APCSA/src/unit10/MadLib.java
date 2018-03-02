package unit10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		loadVerbs();
		loadAdjectives();
		try{
			Scanner file = new Scanner(new File(fileName));
			

		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadNouns()
	{
		try{
			Scanner file1 = new Scanner (new File("nouns.dat"));
			int i = 0;
			while (file1.hasNext()){
				nouns.add(i, file1.next());
				i++;
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file2 = new Scanner (new File("verbs.dat"));
			int i = 0;
			while (file2.hasNext()){
				verbs.add(i, file2.next());
				i++;
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file3 = new Scanner (new File("adjectives.dat"));
			int i = 0;
			while (file3.hasNext()){
				adjectives.add(i, file3.next());
				i++;
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
	}

	public String getRandomVerb()
	{
		String rverb = "";
		int r = (int) (Math.random() * verbs.size());
		rverb += verbs.get(r);
		return rverb;
	}
	
	public String getRandomNoun()
	{
		String rnoun = "";
		int r = (int) (Math.random() * nouns.size());
		rnoun += nouns.get(r);
		return rnoun;
	}
	
	public String getRandomAdjective()
	{
		String radjective = "";
		int r = (int) (Math.random() * adjectives.size());
		radjective += adjectives.get(r);
		return radjective;
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}