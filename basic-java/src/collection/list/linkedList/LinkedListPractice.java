package collection.list.linkedList;

import collection.list.Student;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {

        Student selim = new Student("Selim Hossain", "selim@gmail.com", 25, 757.50);
        Student jasim = new Student("Jasim Ahmed", "jasim@gmail.com", 28, 456.50);
        Student rakib = new Student("Rakib Hasan", "selim@gmail.com", 40, 754.50);
        Student shubbo = new Student("Shubho Islam", "rakib@gmail.com", 52, 452.50);
        Student akash = new Student("Akash Bhuyan", "selim@gmail.com", 54, 742.50);
        Student shanto = new Student("Shanto Islam", "shanto@gmail.com", 96, 712.50);
        Student aftab = new Student("Aftab Ahmed", "aftab@gmail.com", 78, 784.0);
        Student shishir = new Student("Shihir Zaman", "shishir@gmail.com", 24, 712.50);
        Student jaman = new Student("Zaman Ahmed", "jaman@gmail.com", 78, 456.60);
        Student sobuj = new Student("Sobuj Ahmed", "sobuj@gmail.com", 45, 142.50);
        Student rakhi = new Student("Tabassum Rakhi", "rakhi@gmail.com", 45, 712.50);

        Student shohana = new Student("Shohana Khondokar", "shohana@gmail.com", 54, 712.50);
        Student mahua = new Student("Mahua Sunny", "mahua@gmail.com", 453, 712.50);
        Student jabed = new Student("Jabed Omar", "jabed@gmail.com", 37, 152.0);
        Student shorif = new Student("Shorif Hasan", "shorif@gmail.com", 84, 144.1);
        Student shofiq = new Student("Shofiqul Islam", "shofiq@gmail.com", 38, 654.00);
        Student monir = new Student("Monir Zaman", "monir@gmail.com", 17, 1532.4);
        Student atiq = new Student("Atiqur Rahman", "atiq@gmail.com", 78, 712.50);
        Student dipro = new Student("Tariqul Islam Dipro", "dipro@gmail.com", 87, 212.50);
        Student suzon = new Student("Suzon Ahmed", "suzon@gmail.com", 24, 412.50);
        Student rahmot = new Student("Rahomot Islam", "rahmot@gmail.com", 51, 312.50);
        Student musfiq = new Student("Musfiq Zaman", "musfiq@gmail.com", 78, 222.50);
        Student shaiful = new Student("Shaiful Islam", "shaiful@gmail.com", 84, 342.50);
        Student shofiqul = new Student("Shofiqul Islam", "shofiqul@gmail.com", 62, 712.50);

        Student sunny = new Student("Mahua Sunny", "sunny@gmail.com", 52, 212.50);
        Student sony = new Student("Sony Chowdhury", "sony@gmail.com", 34, 422.50);
        Student rahim = new Student("Rahim Hasnat", "rahim@gmail.com", 12, 134.50);
        Student jayadul = new Student("Jayadul Karim", "jayadul@gmail.com", 7, 324.50);
        Student anamul = new Student("Anamul Haque", "anamul@gmail.com", 12, 134.0);
        Student tamanna = new Student("Tamanna Fariha", "tamanna@gmail.com", 12, 712.50);
        Student nur = new Student("Nur Zaman", "nur@gmail.com", 18, 712.50);
        Student naim = new Student("Naim Islam", "selim@gmail.com", 19, 712.50);
        Student shahriar = new Student("Shariar Hasan", "shahriar@gmail.com", 75, 712.50);
        Student tanvir = new Student("Tanvir Ahmed", "tanvir@gmail.com", 14, 124.00);
        Student afrin = new Student("Afrina Haque", "afrin@gmail.com", 85, 432.0);
        Student ashik = new Student("Ashik Ullash", "ashik@gmail.com", 23, 231.00);
        Student munnaf = new Student("Munnaf Mustafiz", "munnaf@gmail.com", 24, 324.0);
        Student ahnaf = new Student("Ahnaf Kabir", "ahnaf@gmail.com", 68, 324.00);
        Student rafi = new Student("Rafi Rashid", "rafi@gmail.com", 35, 234.00);

        Student rashid = new Student("Rashid Abid", "rashid@gmail.com", 12, 412.00);
        Student mahathir = new Student("Mahathir Mohiuddin", "mahathir@gmail.com", 423, 712.50);
        Student wahid = new Student("Wahid Zaman", "wahid@gmail.com", 13, 712.50);
        Student amdad = new Student("Amdadul Ahmed", "amdad@gmail.com", 13, 124.00);
        Student mahadi = new Student("Mahadi Hasan", "mahadi@gmail.com", 34, 712.50);
        Student marfie = new Student("Razeam Marfia", "marfie@gmail.com", 42, 412.00);
        Student rasheda = new Student("Kazi Rasheda", "rasheda@gmail.com", 48, 124.00);
        Student farhana = new Student("Farhana Akter Khan", "farhana@gmail.com", 12, 432.0);
        Student nashin = new Student("Nashin Bushrat", "nashin@gmail.com", 15, 324.00);
        Student una = new Student("Anika Anzum Una", "una@gmail.com", 8, 4231.00);
        Student lamia = new Student("Lamia Noor", "lamia@gmail.com", 25, 413.00);
        Student shaheen = new Student("Shaheen Shah", "shaheen@gmail.com", 25, 523.00);

        List<Student> listOfStudent = new LinkedList<>();
        listOfStudent.add(selim);
        listOfStudent.add(jasim);
        listOfStudent.add(rakib);
        listOfStudent.add(shubbo);
        listOfStudent.add(akash);
        listOfStudent.add(shanto);
        listOfStudent.add(aftab);
        listOfStudent.add(shishir);
        listOfStudent.add(jaman);
        listOfStudent.add(sobuj);
        listOfStudent.add(rakhi);
        listOfStudent.add(shohana);
        listOfStudent.add(mahua);
        listOfStudent.add(jabed);
        listOfStudent.add(shorif);
        listOfStudent.add(monir);
        listOfStudent.add(shofiq);
        listOfStudent.add(atiq);
        listOfStudent.add(dipro);
        listOfStudent.add(suzon);
        listOfStudent.add(rahmot);
        listOfStudent.add(musfiq);
        listOfStudent.add(shaiful);

        List<Student> collectionList = new LinkedList<>();

        collectionList.add(shofiqul);
        collectionList.add(sunny);
        collectionList.add(sony);
        collectionList.add(rahim);
        collectionList.add(jayadul);
        collectionList.add(anamul);
        collectionList.add(tamanna);
        collectionList.add(nur);
        collectionList.add(naim);
        collectionList.add(shahriar);
        collectionList.add(tanvir);
        collectionList.add(afrin);
        collectionList.add(ashik);
        collectionList.add(munnaf);
        collectionList.add(ahnaf);
        collectionList.add(rafi);

        LinkedList<Student> list = new LinkedList<>();
        list.add(rashid);
        list.add(mahathir);
        list.add(wahid);
        list.add(amdad);
        list.add(mahadi);
        list.add(marfie);
        list.add(rasheda);
        list.add(farhana);
        list.add(nashin);
        list.add(una);
        list.add(lamia);
        list.add(shaheen);
        System.out.println("list size: "+list.size());
        System.out.println("collectionList  size: "+collectionList.size());

        System.out.println("listOfStudent size: "+listOfStudent.size());
        listOfStudent.remove(nur);
        System.out.println("listOfStudent size: "+listOfStudent.size());
        listOfStudent.addAll(list);
        System.out.println("listOfStudent size: "+listOfStudent.size());




    }
}
