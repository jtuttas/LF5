import java.util.Scanner;

/**
 */
public class Summebildung
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		double summe;
		double menge;
		String bon;

		bon = "Ihr Einkauf bei GoodFood GmbH\r\n\r\n-----------------\r\n";
		summe = 0;
		String eingabe;
		do
		{
			System.out.print("Artikelpreis (oder x für ende):"); eingabe = (new Scanner(System.in)).nextLine();
			if (!eingabe.equals("x"))
			{
				double preis = Double.parseDouble(eingabe);
				System.out.print("Menge (kg / stk)"); 
				menge = (new Scanner(System.in)).nextDouble();
				bon = bon+preis+" Eur  * "+menge;
				preis = preis*menge;
				System.out.print("(e)rmäßigte MwSt?"); 
				String erm = (new Scanner(System.in)).nextLine();
				if (erm.equals("e"))
				{
					bon = bon+" zzgl. 7% MwSt";
					preis = Math.round(preis*107)*0.01;
				}
				else
				{
					bon = bon+" zzgl. 19% MwSt";
					preis = Math.round(preis*119)*0.01;
				}
				bon = bon+" = "+preis+" Eur\r\n";
				summe = summe+preis;
			}
		} while (! ((eingabe.equals("x"))));
		bon = bon+"-----------------\r\n Endbetrag:"+summe+" Eur";
		System.out.println(bon);
	}

}
