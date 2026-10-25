package zadaci;
import java.util.Scanner;

public class vjezbe {

	public static void main(String[] args) {
	
		
	//*1.Napisati program koji za unijete parametre A i B vraca srednju vrijednost.
		
		int a = 2;
	    int b = 3;
		
		//double srednja - moze isto
		int srednja = (a + b)/2;
		
		System.out.println("srednja vrijednost je " + srednja);
		

    //*2.Za Milicu i Anu se cuva koliko puta su obisle teren u 40 minuta,
		//Medjutim prilikom unosa podataka desila se zabuna.
		//U varijabli x je sacuvana vrijednost koja je trebala da bude u varijabli y.
		//Napisati program koji mijenja mjesta ovim vrijednostima.
		
		int milica = 3;
		int ana = 5;
		
		int x;
		
		x=milica;
		milica=ana;
		ana=x;
		
		 System.out.println("Milica je:" + milica + " i " + "Ana je:" + ana);
		
		
		//*3.Dato je rastojanje u cm...Napisati program koji obavjestava koliko ima metara u tom rastojanju.
		
		//ako zelimo cijeli broj: int zamijenjujemo sa integer(int);
		
		double cm = 354;
		double m=cm/100;
		
		System.out.println("udaljenost u metrima je:" + m);
		
		//4.Hotel svoje sobe oznacava cetverocifrenim brojevima.
		//Preposljednja cifra oznacava sprat na kojem se nalazi soba.
		//Napraviti program koji za uneseni broj sobe vraca na kojem je spratu.
		
		int soba = 1234;
		int sprat = (soba/10)%10;
		
		
		System.out.println("soba se nalazi na spratu broj" + sprat);
		
		
		//*5.Dat je cetverocifreni broj.
		//Napisati program koji racuna kvadrat zbira cifara tog broja.
		
		int broj = 1354;
		
		  int x = broj%10;
		  int y = (broj/10)%10;
		  int z = (broj/100)%10;
		  int q = broj/1000;
		
		  int zbir = x + y + z + q;
		  int kvadrat = zbir * zbir;
		
		  System.out.println("kvadrat zbir cifara broja je :" + kvadrat);
		
		
		//*6.Napisi program koji nam govori koji broj se dobija zamjenom prve i posljednje cifre tog broja.
		
		int broj = 321;
		
		int x = broj%10;
		int y = (broj/10)%10;
		int z = (broj/100)%10;
		
		int novi = x*100+y*10+z;
	       
	     System.out.println("okrenuti broj je:" + novi);
		
		
		//*7.Korisnik unosi coordinate dvije tacke (x1,y1) i (x2,y2).
	       //Te tacke predstavljaju pocetne pozicije dva studenata koji su se dogovorili da se nadju na lokaciji(x3,y3).
	       //Ta lokacija se nalazi tacno na sredini njihovog puta.
	       //Program treba da odredi tu lokaciju i izracuna rastojanje od pocetne pozicije do tacke susreta.
		
		 int x1= 1;
		 int y1 = 2;
		
		 int x2 = 5;
         int y2 = 3;
		
		  double x3 = (x1+x2)/2.0;
		  double y3 = (y1+y2)/2.0;
		
		  double udaljenostD = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		  double udaljenostB = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		
		
		  System.out.println("Udaljenosti izmedju studenata i sredine su:" + udaljenostD + "i:" + udaljenostB);
		
		
		//8.Dimenzije pravougaonika su 543 i 130.
		// Napisati program koji racuna koliko kvadrata stranice 65 je moguce izrezati iz tog pravougaonika.
		
		 double x =543;
		 double y = 130;
		 double z = 65;
		
		 double max = (x/z)*(y/z);
		 System.out.println("U pravougaonik stranica:" + x + "i:" + y +" moze da stane : "+ max + "kvadrat stranice");
		
		
		//*9.Napisati program koji racuna povrsinu ekrana monitora pravougoanog oblika 
		//  cija je dijagonala d=50 a odnos stranica 16:9.
		
	     double d = 50;
	     double k = Math.sqrt((d*d)/337);
	     
	     double a = 16*k;
	     double b = 9*k;
	     double p = a*b;
	     
	     
	     System.out.println("Povrsina pravougaonika cije su stranice:" + a + "i:"+ b);
	     
	   //objasnjenje  d2 = 16k2+9k2
	    		// k=sqrt(D2/337)
	               // a=16*k
	                 //ab=9*k
	                   //p=a*b
	     
	     
	     //*10.Dat je petocifreni prirodan broj koji predstavlja broj stambene jedinice u ygradi.
	     //na osnovu zadatog broja potrebno je odrediti sprat na kome se nalazi stambena jedinica.
	     //Poznato je da se to moze otkriti kada se na vrijednost pretposljednje cifre
	     //zadatog broja doda vrijednost posljednje.Stampati taj broj.
	     
		int broj = 12345;

		int posljednja = broj % 10;
		int pretposljednja = (broj / 10) % 10;

		int sprat = pretposljednja + posljednja;

		System.out.println(sprat);
	     

		
		
		
		//*11.Napisati program koji obradjuje dvocifren broj na sljedeci nacin:
		//Ako je prva cifra veca od druge stampati RAZLIKU prve i druge.
		//Ako je prva cifra manja od druge stampati zbir te dvije cifre
		//Ako su cifre iste stampati njihov proizvod.
		
		int broj = 57;
		
		
		int a = broj/10;
		int b = broj%10;
		
		if (a>b) {
			int raz = a - b;
			System.out.println("razlika cifara je:" + raz);
		}
		else if (b>a){
			int zbir = a + b;
			System.out.println("razlika cifara je:" + zbir);
		}
		else {
			int pro = a*b;
			  System.out.println("razlika cifara je:" + pro);
	}
			
		
		//*12.Za dva stola okrugla poznat je njihov poluprecnik.
	     //Napisati program kojim se stampa obim stola sa vecom povrsinom.R1 5, r2 7.
			
		  //Math.poew 
		
		int r1 = 5;
		int r2 = 7;
		
	    double p1 = r1*r1*Math.PI;
		double p2 = r2*r2*Math.PI;
		
		if (p1>p2) {
		  double obim= 2*r1 * Math.PI;
		
		System.out.println("Obim stola sa vecom povrsinom:" + obim);
		}
		else {
			double obim = 2 * r2 * Math.PI;
			System.out.println("Obim stola sa vecom povrsinom:" + obim);
		}
		
		//rezultat je 43.98..
		
		//*13.Korisnik unosi tri broja.Naci najveci i najmanji od njih i prikazati ih korisniku (MAX i MIN).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj");	
		int x = sc.nextInt();
		System.out.println("Unesite drugi broj");	
		int y = sc.nextInt();
		System.out.println("Unesite treci broj");	
		int z = sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Maksimum je:" + x);
		}
		else if (y>x && y>z) {
			System.out.println("Maksimum je:" + y);
		}
		else if (z>x && z>x) {
			System.out.println("Maksimum je:" + z);
		}
		else if (x==y  || y==z) {
			System.out.println("postoje jednaki brojevi,necu da racunam !!");
		}
		
		
		//isto vazi za MINIMUM samo mijenjamo MAX sa MIN !
		
		System.out.println("unijeli ste broj:" + prvi );
		
		
		//**14.Napisati program koji racuna X**n koristeci petlju.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite X: ");
		int x = sc.nextInt();
		System.out.println("Unesite N:");
		int n = sc.nextInt();
		int stepen = 1;
		
		for(int i = 0; i<=n-1; i++) {
			stepen = stepen * x;
		}
		
		System.out.println("Stepen nivoa :" + n + "broja x je:" + stepen);
		
		
	}

}
