public class WhileLoops
{
    public WhileLoops()
    {

    }

    public static void printFirst3Indexes(String[] associates)
    {
        //we are starting our counter at 2
        //2 is the third index in an array

        /*int count = 2;

        while (count>= 0)
        {
            System.out.println(associates[count]);
            count--;
        }*/

        //the other way to do this is to keep the order
        int count =0;
        while (count < 3)
        {
            System.out.println(associates[count]);
            //increment or decrement count to prevent an infinite loop
            count++;
        }


    }
}
