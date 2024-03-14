class Swap
{
    public static void main(String args[])
    {
        int x=56;
        int y=65;
        System.out.println("Values of x and y are (before swapping) : "+x+" "+y+" .");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Values of x and y are (after swapping) : "+x+" "+y+" .");
    }
}
