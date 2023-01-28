package HomeWork06;

public class PhoneTester {
    public static void main(String[] args) {
    /*
     1) Create a Class “Phone”. Create 3 Objects of it:
     iPhone, Pixel, Samsung with specific
     attributes and behaviors.
     */
        System.out.println("******Phone 1 *******");
        Phone phone1=new Phone();
        phone1.model="iPhone";
        phone1.color="Black";
        phone1.ringtone();
        phone1.apps();
        phone1.quality();
        System.out.println(phone1.color);
        phone1.capacity();
        System.out.println("****** Phone 2  *******");
        Phone phone2=new Phone();
        phone2.model="Pixel";
        phone2.color="White";
        phone2.ringtone();
        phone2.apps();
        phone2.quality();
        System.out.println(phone2.color);
        phone2.apps();
        System.out.println("***** Phone 3 ******");
        Phone phone3=new Phone();
        phone3.model="Samsung";
        phone3.weight=15;
        phone3.color="Red";
        phone3.apps();
        phone3.quality();
        System.out.println(phone3.color);
        phone3.ringtone();

    }
}
