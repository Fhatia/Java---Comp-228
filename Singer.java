public class Singer{
    public int Id;
    public String Name;
    public String Address;
    public String BirthDate;
    public int Albums;

    public Singer(){
        this.Id = 0;
        this.Name = "unknown";
        this.Address = "unknown";
        this.BirthDate = "unknown";
        this.Albums = 0;
    }

    public Singer(int Id){
        this.Id = Id;
    }

    public Singer(int Id, String Name){
        this.Id = Id;
        this.Name = Name;
    }

    public Singer(int Id, String Name, String Address){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
    }

    public Singer(int Id, String Name, String Address, String BirthDate){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.BirthDate = BirthDate;
    }

    public Singer(int Id, String Name, String Address, String BirthDate, int Albums){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.BirthDate = BirthDate;
        this.Albums = Albums;
    }

    public void SetId(int Id){
        this.Id = Id;
    }

    public void SetName(String Name){
        this.Name = Name;
    }

    public void SetAddress(String Address){
        this.Address = Address;
    }

    public void SetBirthDate(String BirthDate){
        this.BirthDate = BirthDate;
    }

    public void SetAlbums(int Albums){
        this.Albums = Albums;
    }

    public void SetAll(int Id, String Name, String Address, String BirthDate, int Albums){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.BirthDate = BirthDate;
        this.Albums = Albums;

    }

    public int GetId(){
        return Id;
    }

    public String GetName(){
        return Name;
    }

    public String GetAddress(){
        return Address;
    }

    public String GetBirthDate(){
        return BirthDate;
    }

    public int GetAlbums(){
        return Albums;
    }

}