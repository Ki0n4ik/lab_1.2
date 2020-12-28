import java.util.Date;

public final class Building
{
    private final Integer floor;
    private final String name;
    private final Date dateOfBuild;

    private Building(Integer f, String n, Date date)
    {
        this.floor = f;
        this.name = n;
        this.dateOfBuild = new Date(date.getTime());
    }

    public static Building createNewBuilding(Integer f, String n, Date date)
    {
        return new Building(f, n, date);
    }

    public Integer getFloor() {
        return floor;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBuild() {
        return new Date(dateOfBuild.getTime());
    }

    @Override
    public String toString() {
        return floor +" - "+ name +" - "+ dateOfBuild;
    }
}