public class Test {
    public static void main(String[] args) {
        MyDate md1 = new MyDate(20, 2, 2023);
        MyDate md2 = new MyDate(21, 3, 2022);
        MyDate md3 = new MyDate(22, 4, 2024);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

//		int a = 2;
//		int b = 3;
//		if(a==b) {
//			System.out.println("a = b");
//		}else {
//			System.out.println("a != b");
//		}

//		if(md1==md3) {
//			System.out.println("md1 == md3");
//		}else {
//			System.out.println("md1 != md3");
//		}

        System.out.println("md1 so sanh bang md2: "
                + md1.equals(md2));

        System.out.println("md1 so sanh bang md3: "
                + md1.equals(md3));

        System.out.println("Hashcode md1 " + md1.hashCode());
        System.out.println("Hashcode md2 " + md2.hashCode());
        System.out.println("Hashcode md3 " + md3.hashCode());
    }
}