
public class TestaMultiplosDeTres {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
}

// ou
//public class TestaMultiplosDeTres {
//    public static void main (String[] args) {
//        for (int i = 3; i < 100; i += 3 ){
//            System.out.println(i);
//        }
//    }
//}

