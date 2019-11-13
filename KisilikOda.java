package HOTEL;

import java.util.Scanner;
import java.util.*;
import java.util.TimerTask;


public class KisilikOda extends MüsteriGirisi {
	// unutma 1 gün 2 dakikadýr 120000 ms.
	public int odatipi;

	// public int c;

	public void kisilikoda() {

		System.out.println("Kaç Kiþilik Oda Ýstiyorsunuz:");
		Scanner scan = new Scanner(System.in);
		odatipi = scan.nextInt();
		switch (odatipi) {
		case 1:

			System.out.print("Mevcut Oda Sayýsý:20" + "\n");

			StringBuilder textbx = new StringBuilder();

			textbx.append("Boþ Odalar \n");

			for (int k = 0; k < 20; k++) {

				if (super.tekkisilik[k].status == true) {

					textbx.append(" No:  " + super.tekkisilik[k].odanumarasý + " \n ");
					MüsteriGirisi.tekbosoda++;

				}

			}

			System.out.println("Boþ Oda Sayýsý:" + MüsteriGirisi.tekbosoda + "\n");

			// bos odalarýn listesini tutan bölüm
			if (MüsteriGirisi.tekbosoda > 0) {

				System.out.println(textbx);

				tarih();

				fiyat(odatipi);
				int birsayi;
				Scanner sayi = new Scanner(System.in);

				System.out.println("Odanýzý seçmek istermisinz 1 evet 0 hayýr");

				while (true) {

					birsayi = sayi.nextInt();

					if (birsayi == 1 || birsayi == 0)
						break;
				}
				switch (birsayi) {

				case 1:
					System.out.println("Kalmak istediðinz odayý giriniz ");
					Scanner gir = new Scanner(System.in);

					int k = gir.nextInt();
					if (super.tekkisilik[k - 1].status == true) {

						System.out.println("Odanýz " + tekkisilik[k - 1].odanumarasý + " nolu odadýr.");
						super.tekkisilik[k - 1].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(tekkisilik, tekkisilik[k - 1].odanumarasý);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);
					}
					break;
				case 0:

					for (int c = 0; c < 20; c++) {

						if (super.tekkisilik[c].status == true)

						{
							odano = c;
							System.out.println("Odanýz " + tekkisilik[odano].odanumarasý + " nolu odadýr.");
							super.tekkisilik[c].status = false;

							TimerTask tasknew = new TimerSchedulePeriod(tekkisilik, tekkisilik[odano].odanumarasý);

							Timer timer = new Timer();

							timer.schedule(tasknew, trh * 120000);

							break;

						}

					}

					break;

				}

				break;
			} else {
				System.out.print("tek kiþilik odamýz yoktur.");
				break;
			}

		case 2:

			System.out.print("Mevcut Oda Sayýsý:30" + "\n");

			StringBuilder textb = new StringBuilder();

			textb.append("Boþ Odalar \n");

			for (int k = 0; k < 30; k++) {

				if (super.ciftkisilik[k].status == true) {

					textb.append(" No:  " + super.ciftkisilik[k].odanumarasý + " \n ");

					MüsteriGirisi.ciftbosoda++;
				}

			}

			System.out.println("Boþ Oda Sayýsý:" + MüsteriGirisi.ciftbosoda + "\n");

			if (MüsteriGirisi.ciftbosoda > 0)

			{

				System.out.println(textb);

				tarih();
				fiyat(odatipi);

				int birsayi;

				Scanner sayi = new Scanner(System.in);
				System.out.println("Odanýzý seçmek istermisinz 1 evet 0 hayýr");

				while (true) {

					birsayi = sayi.nextInt();

					if (birsayi == 1 || birsayi == 0)
						break;
					System.out.println("Geçerli bir Sayi giriniz");
				}
				switch (birsayi) {
				case 1:
					System.out.println("Kalmak istediðinz odayý giriniz ");
					Scanner gir = new Scanner(System.in);

					int k = gir.nextInt();
					if (super.ciftkisilik[k - 21].status == true) {

						System.out.println("Odanýz " + ciftkisilik[k - 21].odanumarasý + " nolu odadýr.");
						super.ciftkisilik[k - 21].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(ciftkisilik, ciftkisilik[k - 21].odanumarasý);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);
					}

					break;
				case 0:

					for (int c = 0; c < 30; c++) {
						if (super.ciftkisilik[c].status == true) {
							odano = c;

							System.out.println("Odanýz " + ciftkisilik[odano].odanumarasý + " nolu odadýr.");

							super.ciftkisilik[c].status = false;

							TimerTask tasknew = new TimerSchedulePeriod(ciftkisilik, ciftkisilik[odano].odanumarasý);

							Timer timer = new Timer();

							timer.schedule(tasknew, trh * 120000);

							break;
						}

					}

				}

				break;

			} else {
				System.out.print("cift kiþilik odamýz yoktur.");
				break;
			}
		case 3:

			System.out.print("Mevcut Oda Sayýsý:1" + "\n");

			StringBuilder text = new StringBuilder();

			text.append("Boþ Odalar \n");

			// bu kýsým boþ oda sayýsýný ve boþ odalarýn numaralarýný verir.

			for (int k = 0; k < 1; k++) {

				if (super.KralDairesi[k].status == true) {

					text.append(" No:  " + super.KralDairesi[k].odanumarasý + " \n ");

					MüsteriGirisi.kralbosoda++;
				}

			}

			System.out.println("Boþ Oda Sayýsý:" + MüsteriGirisi.kralbosoda + "\n");

			if (MüsteriGirisi.kralbosoda > 0) {

				System.out.println(text);

				tarih();

				fiyat(odatipi);
				// boþ odayý bulup onu sýrayla tutan kýsým

				for (int c = 0; c < 1; c++) {
					if (super.KralDairesi[c].status == true)

					{
						odano = c;
						System.out.println("Odanýz " + KralDairesi[odano].odanumarasý + " nolu odadýr.");
						super.KralDairesi[c].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(KralDairesi, KralDairesi[odano].odanumarasý);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);

						break;
					}

				}

				break;

			} else {
				System.out.print("Kral dairesi odasý kalmadý.");
				break;
			}

		}

	}

	public int trh;

	private void tarih() {

		int glyil;
		int gtyil;
		int glay;
		int gtay;
		int glgün;
		int gtgün;

		Scanner gir = new Scanner(System.in);

		Calendar date = new GregorianCalendar(2019, 9, 19);
		int year = date.get(Calendar.YEAR); // 2019
		System.out.println("Geldiðiniz Yýlý//Ayý//Günü giriniz ");

		while (true) {
			glyil = gir.nextInt();

			if (glyil >= year) {
				break;
			}

			System.out.println("Geçerli bir yýl giriniz");

		}

		while (true)

		{
			glay = gir.nextInt();

			if (glay <= 12) {
				break;
			}
			System.out.println("Geçerli bir ay giriniz");

		}

		while (true) {
			glgün = gir.nextInt();
			if (glay <= 30) {
				break;
			}
			System.out.println("Geçerli bir gün giriniz");

		}

		System.out.println("Gideceðiniz Yýlý//Ayý//Günü giriniz");

		gtyil = gir.nextInt();
		gtay = gir.nextInt();
		gtgün = gir.nextInt();

		trh = (gtyil - glyil) * 360 + (gtay - glay) * 30 + (gtgün - glgün) * 1;

	}

	private int tekkisilikFiyat = 200;
	private int ciftkisilikFiyat = 300;
	private int kraldairesiFiyat = 500;

	private void fiyat(int a) {
		if (a == 1) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("FÝyatýnýz " + trh * tekkisilikFiyat + "TL dir");

			} else if (trh == 3 || trh == 4) {
				int s = trh * (tekkisilikFiyat - tekkisilikFiyat / 20);
				System.out.println("Fiyatýnýz " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (tekkisilikFiyat - tekkisilikFiyat / 10);
				System.out.println("Fiyatýnýz " + s + "TL dir");

			}

		} else if (a == 2) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("FÝyatýnýz " + trh * ciftkisilikFiyat + "TL dir");
			} else if (trh == 3 || trh == 4) {
				int s = trh * (ciftkisilikFiyat - ciftkisilikFiyat / 20);
				System.out.println("Fiyatýnýz " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (ciftkisilikFiyat - ciftkisilikFiyat / 10);
				System.out.println("Fiyatýnýz " + s + "TL dir");

			}
		} else if (a == 3) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("FÝyatýnýz " + trh * kraldairesiFiyat + "TL dir");
			} else if (trh == 3 || trh == 4) {
				int s = trh * (kraldairesiFiyat - kraldairesiFiyat / 20);
				System.out.println("Fiyatýnýz " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (kraldairesiFiyat - kraldairesiFiyat / 10);
				System.out.println("Fiyatýnýz " + s + "TL dir");

			}
		}

	}

}
