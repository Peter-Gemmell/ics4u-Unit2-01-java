/*
* This is a program that calculates mean, median and mode
* after reading in a text file into an array.
*
* @author  Peter Gemmell
* @version 1.0
* @since   2022-09-27
*/
/** This program demonstrates a stack. */
final class Main {

    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * One value to enter into stack.
    */
    public static final int TWENTY_TWO = 22;

    /**
    * Another value to enter into stack.
    */
    public static final int THIRTEEN = 13;

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // use MrCoxallStack class
        MrCoxallStack aStack = new MrCoxallStack();
        int tempElement;

        System.out.println("The initial stack is empty.\n");
        aStack.showStack();

        System.out.println("Adding 22.");
        aStack.push(TWENTY_TWO);
        aStack.showStack();

        System.out.println("Adding 13.");
        aStack.push(THIRTEEN);
        aStack.showStack();

        System.out.println("Adding 22.");
        aStack.push(TWENTY_TWO);
        aStack.showStack();

        System.out.println("Pop top element.");
        tempElement = aStack.pop();
        aStack.showStack();

        System.out.println("\nDone.");
    }
}
