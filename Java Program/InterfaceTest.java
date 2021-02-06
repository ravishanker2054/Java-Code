interface Animal
{
void draw();
}
class dog implements Animal
{
public void draw()
{
System.out.println("bow......bow");
}
}
class lion implements Animal
{
public void draw()
{
System.out.println("Roar.....Roar");
}
}
class InterfaceTest
{
public static void main(String args[])
{
dog a=new dog();
a.draw();
lion b=new lion();
b.draw();
}
} 