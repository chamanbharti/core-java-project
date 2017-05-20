package covariant;

public class Covariant {
	public static void main(String[] args) {
		AfricaZoo afZoo=new AfricaZoo();
		System.out.println(afZoo.getWildAnimal().whoAreYou());
		IndiaZoo inZoo=new IndiaZoo();
		System.out.println(inZoo.getWildAnimal().whoAreYou());
	}
}
