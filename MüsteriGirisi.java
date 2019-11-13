package HOTEL;

public class MüsteriGirisi

{
	public static int tekbosoda;
	public static int ciftbosoda;
	public static int kralbosoda;
	public int odano = 0;

	public Odalar[] tekkisilik = { new Odalar("1", true), new Odalar("2", true), new Odalar("3", true),
			new Odalar("4", true), new Odalar("5", true), new Odalar("6", true), new Odalar("7", true),
			new Odalar("8", true), new Odalar("9", true), new Odalar("10", true), new Odalar("11", true),
			new Odalar("12", true), new Odalar("13", true), new Odalar("14", true), new Odalar("15", true),
			new Odalar("16", true), new Odalar("17", true), new Odalar("18", true), new Odalar("19", true),
			new Odalar("20", true), };

	public Odalar[] ciftkisilik = { new Odalar("21", true), new Odalar("22", true), new Odalar("23", true),
			new Odalar("24", true), new Odalar("25", true), new Odalar("26", true), new Odalar("27", true),
			new Odalar("28", true), new Odalar("29", true), new Odalar("30", true), new Odalar("31", true),
			new Odalar("32", true), new Odalar("33", true), new Odalar("34", true), new Odalar("35", true),
			new Odalar("36", true), new Odalar("37", true), new Odalar("38", true), new Odalar("39", true),
			new Odalar("40", true), new Odalar("41", true), new Odalar("42", true), new Odalar("43", true),
			new Odalar("44", true), new Odalar("45", true), new Odalar("46", true), new Odalar("47", true),
			new Odalar("48", true), new Odalar("49", true), new Odalar("50", true), };

	public Odalar[] KralDairesi = { new Odalar("51", true)

	};

	public void müsteriGirisi()

	{
		KisilikOda kisilikoda = new KisilikOda();

		while (true) {
			tekbosoda = 0;
			ciftbosoda = 0;
			kralbosoda = 0;

			System.out.println("\n");

			System.out.println("Termal  Otele Hosgeldiniz \n ".toUpperCase());

			kisilikoda.kisilikoda();

		}

	}

}