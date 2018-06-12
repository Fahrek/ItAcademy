import java.awt.*;

public class Dog
{
    int paw;
    int age;
    String name;
    String breed;
    Color color;
    boolean isVaccinated;

    public Dog ( int paw,
                 int age,
                 String name,
                 String breed,
                 Color color,
                 boolean isVaccinated )
    {
        this.paw = paw;
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.isVaccinated = isVaccinated;
    }

    void bark()
    {
        System.out.println("Guau!");
    }

    public void changeColor(Color newColor)
    {
        this.color = newColor;
    }

    public int getDogYears()
    {
        return this.age * 7;
    }
}

