import java.util.Comparator;
//ignore case
public class CharacterCompare implements Comparator<Character>
	 {
		 public int compare(Character c1, Character c2 )
		 { 
			 Character LowerC1;
			 Character LowerC2;
			 LowerC1=c1.toLowerCase(c1);
			 LowerC2=c2.toLowerCase(c2);
			 return LowerC1.compareTo(LowerC2);
		 }

		
}
