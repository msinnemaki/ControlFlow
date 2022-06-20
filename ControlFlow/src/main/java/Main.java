public class Main
{
    public static void main (String[] args)
    {


        //      If Else


        IfElse ifElse = new IfElse();

        String newString = "Hello World";
        System.out.println(ifElse.checkStringLength("Tiffany"));
        System.out.println(ifElse.printTStringsOnly(newString));


        //      For Loops

        //notice we did not have to make an instance of our ForLoops class
        //in order to invoke or call these methods - this is because they are static


        //here we are creating our string array right in the param of our method
        ForLoops.printAssociatesNames(new String[] {"Jo Jo","CJ","DeeAnne","David","Shane"});

        //the other way is to declare the array first
        //assign it to a variable
        //and use the variable in the method param

        String[] associates = {"Shaquanna ", "Mark ", "Tyler ", "Eric ","Janga ","Li "};
        System.out.println(ForLoops.printTotalAssociatesNameCounts(associates));

        //      While Loops

        WhileLoops.printFirst3Indexes(associates);

        //      Do-While Loop

        DoWhile doWhile = new DoWhile();
        doWhile.printValueIfTrue();

        //      Switch Statements

        SwitchStatements switchStatements = new SwitchStatements();
        switchStatements.gradeCalculator(95);



    }
}
