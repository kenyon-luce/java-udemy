package Debugger;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        this.sBuilder.append(c);
        charsAdded++;
    }
}

/* NOTES 
TESTING CODE: click on the number representing the line of code you want to debug (breakpoint), then run the debugger
    it should display the results from each line of code being viewed
    FUNCTIONS: there will be a bar on top giving you different functionalities for debugging
        STEP OVER: debugs the next line of code
        STEP INTO: navigates to any parent classes/variables if called on within the line (opens new tab)
        STEP OUT: takes you out of 'step into' (back button)
        THREADS: created automatically every time the debugger is run,
            they seem similar to branches where you can safely debug multiple things at once
    VARIABLES: any variables being debugged will be displayed as objects in a seperate tab on the left, showing 
        the execution process of the code
*/ 
