classs Person
{
  private String name;
  private int age;


public Person(String name,int age)
  {
  this.name=name;
  this.age=age;
  }


  public void introduce()
    {
    System.ouit.println("Hello "+this.name);
    System.out.println("Your age is "+this.age);
    }


  public static void main(String[] args)
    {
    Person s1=new Person("Chantae",18);
    s1.introduce();
    }
}
  
