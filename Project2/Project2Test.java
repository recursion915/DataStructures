import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Project2Test {
public static void main(String[]args) throws IOException{
		
		String filename=args[0];
		String outputfilename=args[1];
		OutputStream os=new FileOutputStream(outputfilename);
		PrintStream ps=new PrintStream(os);
//		String filename="infix_expr_short.txt";
		InfixCalculator test=new InfixCalculator();
		test.convertToList(filename);
//		System.out.println(test.mInfixString);
//		System.out.println(test.lineCounts);
		//println 0-lineCounts-1
		for(int i=0;i<(test.lineCounts-1);i++){
			System.out.printf("%.2f",(double)test.PostfixEvaluation(test.Yard(test.SeparateLine(test.mInfixString.get(i)))));
			System.out.println("");
			ps.printf("%.2f",(double)test.PostfixEvaluation(test.Yard(test.SeparateLine(test.mInfixString.get(i)))));
			ps.println("");
	 }
		//print last line without empty line
		System.out.printf("%.2f",(double)test.PostfixEvaluation(test.Yard(test.SeparateLine(test.mInfixString.get(test.lineCounts-1)))));
		ps.printf("%.2f",(double)test.PostfixEvaluation(test.Yard(test.SeparateLine(test.mInfixString.get(test.lineCounts-1)))));
	

		
		
//		
////		UNCOMMENT THIS; THIS WILL TEST my inFix and postFix works for complicated calculating
//		
//		String a="1 -2    ^3.0          ^3-(4 +5) * 6 * 7";
//		
//		System.out.println();
//		System.out.printf("%.2f",test.PostfixEvaluation(test.Yard(test.SeparateLine(a))));

		
	}
}
