package Java_Interview_Frequent_Questions;
 
import java.util.HashMap;
import java.util.Map;
 
public class DuplicateWords_in_a_Sentence {
 
	public static void main(String[] args) {
		String sentence="I Live in India I Love India";
              sentence= sentence.toLowerCase();
               String[] words=sentence.split("\\s+"); //splits words by ignoring one or more whitespace/tabspace
               Map<String,Integer> wordcount=new HashMap<>();
//               for loop to add all the words to HashMap object along with the count
               for(String word:words) 
               {
            	   wordcount.put(word, wordcount.getOrDefault(word, 0)+1);
               }
//               for loop to get the key along with its value with its occurence
               for(Map.Entry<String, Integer> entry:wordcount.entrySet())
               {
            	   if(entry.getValue()>1)
            	   {
            		   System.out.println(entry.getKey() + ":"+ entry.getValue());
            	   }
               }

	}
 
}