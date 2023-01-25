interface UpperCasePrintable{}

class InterfacePrinter
{
    public static void print(Object obj)
    {
        String org=obj.toString();
        if(obj instanceof UpperCasePrintable)
        {
            org=org.toUpperCase();
        }

        System.out.println(org);
    }
}

class PointOne implements UpperCasePrintable
{
    private int xPos, yPos;

    PointOne(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public String toString()
    {
        String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
        return posInfo;
    }
}

class PointTwo
{
    private int xPos, yPos;

    PointTwo(int x, int y)
    {
        xPos=x;
        yPos=y;
    }

    public String toString()
    {
        String posInfo="[x pos:"+xPos + ", y pos:"+yPos+"]";
        return posInfo;
    }
}

class InterfaceMark
{
    public static void main(String[] args)
    {
        PointOne pos1=new PointOne(1, 1);
        PointTwo pos2=new PointTwo(2, 2);
        PointOne pos3=new PointOne(3, 3);
        PointTwo pos4=new PointTwo(4, 4);

        InterfacePrinter.print(pos1);
        InterfacePrinter.print(pos2);
        InterfacePrinter.print(pos3);
        InterfacePrinter.print(pos4);
    }
}