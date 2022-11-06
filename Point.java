
public class Point {

  private float x;
  private float y;

//Constructeur par defaut et constructeur avec paramatres

  public Point(Float x, Float y)
   {
     this.x=x;
     this.y=y ;
   }

   public Point()
   {
     this.x = 0;
     this.y=0;
   }

 // Getters

    public Float  GetX()
    {
      return this.x ;
    }

    public Float GetY()
      {
        return this.y;
      }

// Setters

  public void SetX(Float x)
    {
      if ((x==0) && (this.y==0))
        System.out.println("vous devez entre un abscisse different de 0");
      else
        if (this.x==x)
        System.out.println("vous devez entrer un abscisse different de l'ordonné ");
      else
      this.x=x;
    }

    public void SetY(Float x)
      {
        if ((y==0) && (this.x==0))
          System.out.println("vous devez entre un abscisse different de 0");
        else
          if (this.y==y)
          System.out.println("vous devez entrer un abscisse different de l'ordonné ");
        else
        this.x=x;
      }

  public String toString()
  {
    return "Cordonne  :"+ this.x+" ordonné :  "+this.y;
  }

}
