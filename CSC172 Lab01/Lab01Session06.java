import java.util.Comparator;

/* BE AWARE:findMax will ignore case of Character object
 * Generic findMax, with a function object
 * Precondition: a.size( ) > 0.
 * Reference: Data Structure and Algorithm Analysis in Java 3rd edition page 115
 */ 
 public class Lab01Session06 {
	 
 public static <AnyType> AnyType findMax( AnyType [ ] arr, Comparator<? super AnyType> cmp )
 {
	 int maxIndex = 0;
	 for( int i = 0; i < arr.length; i++ )
	 {
		 if( cmp.compare( arr[ i ], arr[ maxIndex ] ) > 0 ){
			 maxIndex = i; 
	 }
	 
	 }
	 return arr[ maxIndex ];
 }

 	public static void main(String[]args)
  {
	Character [ ] arr = { 'j','k','d','S','b' };
	System.out.println( findMax( arr, new CharacterCompare( ) ) );
  }
}