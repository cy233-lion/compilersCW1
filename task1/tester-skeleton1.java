class Main {

    public void g1 ( Matrix2D matrix2D ) {
	
	Task1Exception te = new Task1Exception ( "" );
	String s = te.msg;

	int n = matrix2D.initialState ();
	n = matrix2D.terminalState ();
	n = matrix2D.nextState ( 0, 1 );

	try {
	    Language language = Task1.create ( matrix2D );
	    int [] input = new int [] { 0, 0, 1, 555 };
	    Boolean b = language.decide ( input ); }
	catch ( Exception e ) {} }
    
    public static void main ( String [] args ) {
	System.out.println ( "\n" );
	System.out.println ( "   Hello I'm the compilation tester for Task 1." );
	System.out.println ( "   WARNING: I only test if the submission can be compiled." ); 
	System.out.println ( "   WARNING: I do NOT test if the right functionality is implemented." );
	System.out.println ( "\n" ); } 
    
}

