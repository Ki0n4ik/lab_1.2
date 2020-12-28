import java.util.Date;

class Main
{
    public static void main(String[] args)
    {
        Building im = Building.createNewBuilding(20,"test", new Date());
        System.out.println(im);
        tryModification(im.getFloor(),im.getName(),im.getDateOfBuild());
        System.out.println(im);
    }

    private static void tryModification(Integer f, String n, Date date)
    {
        f = 10000;
        n = "test changed";
        date.setDate(10);
    }
}