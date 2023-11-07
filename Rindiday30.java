public class Main {
	public static void main(String[] args) {
	
		boolean kondisi1 = true;
        boolean kondisi2 = false;
        boolean andResult = kondisi1 && kondisi2;
        boolean orResult = kondisi1 || kondisi2;
        boolean notResult = !kondisi1;

        System.out.println("kondisi1 && kondisi2: " + andResult);
        System.out.println("kondisi1 || kondisi2: " + orResult);
        System.out.println("!kondisi1: " + notResult);

		}
}
