public class Test {
    public static void main(String[] args) {
        MyDate md = new MyDate(31, 1, 2023);
        System.out.println("Day = "+ md.getDay());
        md.setDay(35);
        System.out.println("Day = "+ md.getDay());
        md.setDay(30);
        System.out.println("Day = "+ md.getDay());

        System.out.println("Month = "+ md.getMonth());
        md.setMonth(13);
        System.out.println("Month = "+ md.getMonth());
        md.setMonth(5);
        System.out.println("Month = "+ md.getMonth());
    }
}