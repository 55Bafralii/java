package HOTEL;

import java.util.Scanner;
import java.util.*;
import java.util.TimerTask;


public class KisilikOda extends M�steriGirisi {
	// unutma 1 g�n 2 dakikad�r 120000 ms.
	public int odatipi;

	// public int c;

	public void kisilikoda() {

		System.out.println("Ka� Ki�ilik Oda �stiyorsunuz:");
		Scanner scan = new Scanner(System.in);
		odatipi = scan.nextInt();
		switch (odatipi) {
		case 1:

			System.out.print("Mevcut Oda Say�s�:20" + "\n");

			StringBuilder textbx = new StringBuilder();

			textbx.append("Bo� Odalar \n");

			for (int k = 0; k < 20; k++) {

				if (super.tekkisilik[k].status == true) {

					textbx.append(" No:  " + super.tekkisilik[k].odanumaras� + " \n ");
					M�steriGirisi.tekbosoda++;

				}

			}

			System.out.println("Bo� Oda Say�s�:" + M�steriGirisi.tekbosoda + "\n");

			// bos odalar�n listesini tutan b�l�m
			if (M�steriGirisi.tekbosoda > 0) {

				System.out.println(textbx);

				tarih();

				fiyat(odatipi);
				int birsayi;
				Scanner sayi = new Scanner(System.in);

				System.out.println("Odan�z� se�mek istermisinz 1 evet 0 hay�r");

				while (true) {

					birsayi = sayi.nextInt();

					if (birsayi == 1 || birsayi == 0)
						break;
				}
				switch (birsayi) {

				case 1:
					System.out.println("Kalmak istedi�inz oday� giriniz ");
					Scanner gir = new Scanner(System.in);

					int k = gir.nextInt();
					if (super.tekkisilik[k - 1].status == true) {

						System.out.println("Odan�z " + tekkisilik[k - 1].odanumaras� + " nolu odad�r.");
						super.tekkisilik[k - 1].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(tekkisilik, tekkisilik[k - 1].odanumaras�);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);
					}
					break;
				case 0:

					for (int c = 0; c < 20; c++) {

						if (super.tekkisilik[c].status == true)

						{
							odano = c;
							System.out.println("Odan�z " + tekkisilik[odano].odanumaras� + " nolu odad�r.");
							super.tekkisilik[c].status = false;

							TimerTask tasknew = new TimerSchedulePeriod(tekkisilik, tekkisilik[odano].odanumaras�);

							Timer timer = new Timer();

							timer.schedule(tasknew, trh * 120000);

							break;

						}

					}

					break;

				}

				break;
			} else {
				System.out.print("tek ki�ilik odam�z yoktur.");
				break;
			}

		case 2:

			System.out.print("Mevcut Oda Say�s�:30" + "\n");

			StringBuilder textb = new StringBuilder();

			textb.append("Bo� Odalar \n");

			for (int k = 0; k < 30; k++) {

				if (super.ciftkisilik[k].status == true) {

					textb.append(" No:  " + super.ciftkisilik[k].odanumaras� + " \n ");

					M�steriGirisi.ciftbosoda++;
				}

			}

			System.out.println("Bo� Oda Say�s�:" + M�steriGirisi.ciftbosoda + "\n");

			if (M�steriGirisi.ciftbosoda > 0)

			{

				System.out.println(textb);

				tarih();
				fiyat(odatipi);

				int birsayi;

				Scanner sayi = new Scanner(System.in);
				System.out.println("Odan�z� se�mek istermisinz 1 evet 0 hay�r");

				while (true) {

					birsayi = sayi.nextInt();

					if (birsayi == 1 || birsayi == 0)
						break;
					System.out.println("Ge�erli bir Sayi giriniz");
				}
				switch (birsayi) {
				case 1:
					System.out.println("Kalmak istedi�inz oday� giriniz ");
					Scanner gir = new Scanner(System.in);

					int k = gir.nextInt();
					if (super.ciftkisilik[k - 21].status == true) {

						System.out.println("Odan�z " + ciftkisilik[k - 21].odanumaras� + " nolu odad�r.");
						super.ciftkisilik[k - 21].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(ciftkisilik, ciftkisilik[k - 21].odanumaras�);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);
					}

					break;
				case 0:

					for (int c = 0; c < 30; c++) {
						if (super.ciftkisilik[c].status == true) {
							odano = c;

							System.out.println("Odan�z " + ciftkisilik[odano].odanumaras� + " nolu odad�r.");

							super.ciftkisilik[c].status = false;

							TimerTask tasknew = new TimerSchedulePeriod(ciftkisilik, ciftkisilik[odano].odanumaras�);

							Timer timer = new Timer();

							timer.schedule(tasknew, trh * 120000);

							break;
						}

					}

				}

				break;

			} else {
				System.out.print("cift ki�ilik odam�z yoktur.");
				break;
			}
		case 3:

			System.out.print("Mevcut Oda Say�s�:1" + "\n");

			StringBuilder text = new StringBuilder();

			text.append("Bo� Odalar \n");

			// bu k�s�m bo� oda say�s�n� ve bo� odalar�n numaralar�n� verir.

			for (int k = 0; k < 1; k++) {

				if (super.KralDairesi[k].status == true) {

					text.append(" No:  " + super.KralDairesi[k].odanumaras� + " \n ");

					M�steriGirisi.kralbosoda++;
				}

			}

			System.out.println("Bo� Oda Say�s�:" + M�steriGirisi.kralbosoda + "\n");

			if (M�steriGirisi.kralbosoda > 0) {

				System.out.println(text);

				tarih();

				fiyat(odatipi);
				// bo� oday� bulup onu s�rayla tutan k�s�m

				for (int c = 0; c < 1; c++) {
					if (super.KralDairesi[c].status == true)

					{
						odano = c;
						System.out.println("Odan�z " + KralDairesi[odano].odanumaras� + " nolu odad�r.");
						super.KralDairesi[c].status = false;

						TimerTask tasknew = new TimerSchedulePeriod(KralDairesi, KralDairesi[odano].odanumaras�);

						Timer timer = new Timer();

						timer.schedule(tasknew, trh * 120000);

						break;
					}

				}

				break;

			} else {
				System.out.print("Kral dairesi odas� kalmad�.");
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
		int glg�n;
		int gtg�n;

		Scanner gir = new Scanner(System.in);

		Calendar date = new GregorianCalendar(2019, 9, 19);
		int year = date.get(Calendar.YEAR); // 2019
		System.out.println("Geldi�iniz Y�l�//Ay�//G�n� giriniz ");

		while (true) {
			glyil = gir.nextInt();

			if (glyil >= year) {
				break;
			}

			System.out.println("Ge�erli bir y�l giriniz");

		}

		while (true)

		{
			glay = gir.nextInt();

			if (glay <= 12) {
				break;
			}
			System.out.println("Ge�erli bir ay giriniz");

		}

		while (true) {
			glg�n = gir.nextInt();
			if (glay <= 30) {
				break;
			}
			System.out.println("Ge�erli bir g�n giriniz");

		}

		System.out.println("Gidece�iniz Y�l�//Ay�//G�n� giriniz");

		gtyil = gir.nextInt();
		gtay = gir.nextInt();
		gtg�n = gir.nextInt();

		trh = (gtyil - glyil) * 360 + (gtay - glay) * 30 + (gtg�n - glg�n) * 1;

	}

	private int tekkisilikFiyat = 200;
	private int ciftkisilikFiyat = 300;
	private int kraldairesiFiyat = 500;

	private void fiyat(int a) {
		if (a == 1) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("F�yat�n�z " + trh * tekkisilikFiyat + "TL dir");

			} else if (trh == 3 || trh == 4) {
				int s = trh * (tekkisilikFiyat - tekkisilikFiyat / 20);
				System.out.println("Fiyat�n�z " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (tekkisilikFiyat - tekkisilikFiyat / 10);
				System.out.println("Fiyat�n�z " + s + "TL dir");

			}

		} else if (a == 2) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("F�yat�n�z " + trh * ciftkisilikFiyat + "TL dir");
			} else if (trh == 3 || trh == 4) {
				int s = trh * (ciftkisilikFiyat - ciftkisilikFiyat / 20);
				System.out.println("Fiyat�n�z " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (ciftkisilikFiyat - ciftkisilikFiyat / 10);
				System.out.println("Fiyat�n�z " + s + "TL dir");

			}
		} else if (a == 3) {

			if (trh == 1 || trh == 2)

			{
				System.out.println("F�yat�n�z " + trh * kraldairesiFiyat + "TL dir");
			} else if (trh == 3 || trh == 4) {
				int s = trh * (kraldairesiFiyat - kraldairesiFiyat / 20);
				System.out.println("Fiyat�n�z " + s + "TL dir");
			} else if (trh >= 5) {
				int s = trh * (kraldairesiFiyat - kraldairesiFiyat / 10);
				System.out.println("Fiyat�n�z " + s + "TL dir");

			}
		}

	}

}
