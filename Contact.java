public class Contact {

  private String nom ;
  private String prenom;
  private long NumeroTelephone;
  private String AdresseMailContact;
public Contact (String nom, String prenom,long NumeroTelephone, String AdresseMailContact)
  {
    this.nom=nom;
    this.prenom=prenom;
    this.AdresseMailContact=AdresseMailContact;
    this.NumeroTelephone=NumeroTelephone;
  }
// GETTERS :
 public String GetNomContact()
 {
   return this.nom;
 }

public String  GetPrenomContact()
{
  return this.prenom;
}

public String GetAdresseeMailContact()
{
  return this.AdresseMailContact;
}

public long GetNumeroTelephoneContact()
{
  return this.NumeroTelephone;
}


  public String toString()
  {
    return "Contact : [ Nom : "+this.nom+" Prenom : "+this.prenom+" AdresseMailContact : "+ this.AdresseMailContact+ "Numero de telephone : "
    + this.NumeroTelephone;
  }
}
