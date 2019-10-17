import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

class Main {

    void g () {

	LexicalException le = new LexicalException ( "" );
	String s = le.msg;
	Task2Exception te = new Task2Exception ( "" );
	s = te.msg;

	Token t = null;
	t = new T_Semicolon ();
	t = new T_LeftBracket ();
	t = new T_RightBracket ();
	t = new T_EqualDefines ();
	t = new T_Equal ();
	t = new T_LessThan ();
	t = new T_GreaterThan ();
	t = new T_LessEq ();
	t = new T_GreaterEq ();
	t = new T_Comma ();
	t = new T_LeftCurlyBracket ();
	t = new T_RightCurlyBracket ();
	t = new T_Assign ();
	t = new T_Plus ();
	t = new T_Times ();
	t = new T_Minus ();
	t = new T_Div ();
	t = new T_Identifier ( "" );
	s = ( (T_Identifier) t ).s;
	t = new T_Integer ( 7 );
	int n = ( (T_Integer) t ).n; 
	t = new T_Def ();
	t = new T_Skip ();
	t = new T_If ();
	t = new T_Then ();
	t = new T_Else ();
	t = new T_While ();
	t = new T_Do ();
	t = new T_Repeat ();
	t = new T_Until ();
	t = new T_Error ( "" );
	s = ( (T_Error) t ).msg;

    }

    void f () {	
	try {
	    Lexer l = Task2.create ();
	    l.lex ( "" ); }
	catch ( Exception e ) {} }

    public static void main ( String [] args ) {
	System.out.println ( "\n" );
	System.out.println ( "   Hello I'm the compilation tester for Task 2." );
	System.out.println ( "   WARNING: I only test if the submission can be compiled." ); 
	System.out.println ( "   WARNING: I do NOT test if the right functionality is implemented." );
	System.out.println ( "\n" ); } 


}



