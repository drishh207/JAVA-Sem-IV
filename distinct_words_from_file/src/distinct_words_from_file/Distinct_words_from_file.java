package distinct_words_from_file;
import java.util.*;
import java.io.*;

public class Distinct_words_from_file {

    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        FileInputStream fis =  new FileInputStream("E:/sample.txt");
	DataInputStream dis = new DataInputStream(fis);
	BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        String line = null;
        ArrayList<String> wordlist=new ArrayList<>();
	while((line=br.readLine())!=null)
        {
            StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
            while(st.hasMoreTokens())
            {
		String s1= st.nextToken().toLowerCase();
		if(!wordlist.contains(s1))
                {
                    wordlist.add(s1);
		}
            }
        }
        System.out.println("The distinct words are ");
        for(String str:wordlist)
            System.out.println(str);
    }
}