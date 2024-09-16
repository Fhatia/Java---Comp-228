public class Runnable {
    public static void main(String[] args) {
        Singer singer1 = new Singer();
        Singer singer2 = new Singer();

        singer2.SetId(136);
        singer2.SetName("DJ Beats");
        singer2.SetAddress("123 Right Street");
        singer2.SetBirthDate("August 19, 1992");
        singer2.SetAlbums(24);

        System.out.println("The singer's Id is: " + singer1.GetId());
        System.out.println("The singer's Name is: " + singer1.GetName());
        System.out.println("The singer's Address is: " + singer1.GetAddress());
        System.out.println("The singer's birth date is: " + singer1.GetBirthDate());
        System.out.println("The singer has " + singer1.GetAlbums() + " albums");
        System.out.println();
        System.out.println("The singer's Id is: " + singer2.GetId());
        System.out.println("The singer's Name is: " + singer2.GetName());
        System.out.println("The singer's Address is: " + singer2.GetAddress());
        System.out.println("The singer's birth date is: " + singer2.GetBirthDate());
        System.out.println("The singer has " + singer2.GetAlbums() + " albums");
    }
}