import java.io.*;
import java.util.*;


public class KartografskoGradivo extends Superclass{

//POLJA 


    private int SteviloStrani;
    private int ID;
//ZAČETNA NASTAVITEV STANJ
//KONSTRUKOTRJI

    public KartografskoGradivo(){

            this.SteviloStrani=0;


    }

    public KartografskoGradivo(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int DolzinaVminutah, int ID){

            super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst);
            this.SteviloStrani= DolzinaVminutah;
            this.ID = (15 + this.SteviloStrani*2)%14;

}

    public KartografskoGradivo(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int DolzinaVminutah, boolean Izposojena, boolean Rezervirana, int ID/*boolean NaZalogi*/){

            super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst, Izposojena, Rezervirana);
            this.SteviloStrani= DolzinaVminutah;
            this.ID = IDstevilo(); //GENERIRANJE ID 



    }

    public KartografskoGradivo(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int DolzinaVminutah, boolean Izposojena, boolean Rezervirana, int ID, int leto, String Skupina){

        super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst, Izposojena, Rezervirana, leto , Skupina);
        this.SteviloStrani= DolzinaVminutah;
        this.ID = IDstevilo();



}
    

    public void SetID(int stevilo){
        this.ID = stevilo;
    }

    public int GetDolzinoStrani(){
        return this.SteviloStrani;
    }


    public void SetSteviloStrani(int strani){
        this.SteviloStrani = strani;
    }

  

    public int GetID(){ //ID  /RANDOM GLEDE NA STEVILO STRANI
        return this.ID;
    }

    public boolean GetNaZalogi(){
        return this.NaZalogi;
    }

    public void SetStanjeArtikla(boolean stanje){

        this.NaZalogi= stanje;

    }



    public void izpis(){

        System.out.println("***   PODATKI O KARTOGRAFSKEM GRADIVU   ***");
        System.out.println("Avtor: " + this.GetAvtor() + ".");
        System.out.println("Naslov: " + this.GetNaslov() + ".");
        System.out.println("Jezik: " + this.GetJezik() + ".");
        System.out.println("Leto izdaje: " + this.GetLeto());
        System.out.println("Ključne besede: " + this.GetKljucneBesede() + ".");
        System.out.println("Zvrst: " + this.GetZvrst() + ".");
        System.out.println("Skupina: " + this.GetSkupino());
        System.out.println("Dolžina v minutah: " + GetDolzinoStrani() + ".\n");
        System.out.println("ID zvočnega gradiva je: " + GetID());
        System.out.println();

        System.out.println("Stanje artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");

        System.out.println();
        
    }

    @Override //tako povozimo metodo nadrazreda z istim imenom
	public String toString() {
		String niz = "";
		niz += "***   PODATKI O KARTOGRAFSKEM GRADIVU   ***\n";
		niz += ("Avtor: " + this.GetAvtor() + ".\n");
		niz += ("Naslov: " + this.GetNaslov() + "\n");
		niz += ("Jezik: " + this.GetJezik() + "\n");
        niz += ("Leto izdaje: " + this.GetLeto() + "\n");
		niz += ("Ključne besede: " + this.GetKljucneBesede() + "\n");
        niz += ("Zvrst: " + this.GetZvrst() + "\n");
        niz += ("Skupina: " + this.GetSkupino() + "\n");
		niz += ("Število strami: " + this.GetDolzinoStrani() + "\n\n");

        niz += ("ID kartografskega gradiva je: " + GetID() + "\n\n");

        niz += ("Stanje artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");

        niz += ("--------------------------------------------------" + "\n");
		
		return niz;
	}
	

 //METODA ZA VNOS 

    public static KartografskoGradivo VnesiKartografskoGradivo() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n***   VNOS NOVEGA KARTOGRAFSKEGA GRADIVA   ***\n\n");
		System.out.println("Vnesi Avtorja: \n");
		String avtor = br.readLine();

		System.out.println("Vnesi Naslov: \n");
		String naslov = br.readLine();

        System.out.println("Vnesi Jezik: \n");
		String jezik = br.readLine();

        System.out.println("Vnesi Leto izdaje: \n");
        int leto = Integer.parseInt(br.readLine());

        System.out.println("Vnesi Skupino Artikla: \n");
        System.out.println("Pritisnite (1) za Šport:");
        System.out.println("Pritisnite (2) za Zdravje:");
        System.out.println("Pritisnite (3) za Dramatika:");
        System.out.println("Pritisnite (4) za Politika:");
        System.out.println("Pritisnite (5) za Naravoslovje:");
        System.out.println("Pritisnite (6) za Zgodovina:");
        System.out.println("Pritisnite (7) za Glasba:");
        System.out.println("Pritisnite (8) za Strokovne informacije:");
        System.out.println("Pritisnite (9) za Zabavno:");


        
        int stevilo12 = Integer.parseInt(br.readLine());
        String skupina = "";
        switch (stevilo12){

            case 1:
                skupina = "Šport";
            break;

            case 2:
                skupina = "Zdravje";
            break;
            case 3:
                skupina = "Dramatika";
            break;

            case 4:
            skupina = "Politika";
            break;

            case 5:
            skupina = "Naravoslovje";
            break;

            case 6:
            skupina = "Zgodovina";
            break;

            case 7:
            skupina = "Glasba";
            break;

            case 8:
            skupina = "Strokovne informacije";
            break;

            case 9:
            skupina = "Zabavna";
            break;

            default:
            System.out.println("NAPAKA PRI VNOSU");
            break;

        }




        System.out.println("Vnesi Zvrst:\n");
        System.out.println("Pritisnite (1) za Zemljevid:");
        System.out.println("Pritisnite (2) za Atlas:");

        
        int stevilo1 = Integer.parseInt(br.readLine());
        String tip = "";
        switch (stevilo1){

            case 1:
                 tip = "Zemljevid";
            break;

            case 2:
                tip = "Atlas";
            break;

            default:
            System.out.println("NAPAKA PRI VNOSU");
            break;

        }
		
		System.out.println("Vnesi število strani: \n");
		int stevilo = Integer.parseInt(br.readLine());
        
        int IDKartografskoStevilo = IDstevilo();

        System.out.println("Želite rezerverati Artikel? (DA/NE): \n");
		String rez = br.readLine().toUpperCase();
        
        boolean rezervirana ;
         if(rez.equals("DA")){
             rezervirana = true;
            }
		
        else{ rezervirana = false;}

        System.out.println("Vnesi Kljucne besede: \n");
		String kljucnebesede ="";
            kljucnebesede += avtor + " ";
            kljucnebesede +=naslov + " ";
            kljucnebesede += jezik + " " ;
            kljucnebesede += tip + " " ;
            kljucnebesede +=Integer.toString(stevilo) + " ";
            kljucnebesede += Integer.toString(leto) + " ";
            kljucnebesede += skupina + " ";
            kljucnebesede +=  "Kartografsko" + " ";
            kljucnebesede +=  "Gradivo" + " ";


        ArrayList<String> KljucneB = new ArrayList<String>();

        KljucneB = VnesiKljucneBesede(kljucnebesede.toLowerCase());

		
		KartografskoGradivo novoKartografskoGradivo = new KartografskoGradivo(avtor, naslov, jezik, KljucneB, tip, stevilo ,  false, rezervirana, IDKartografskoStevilo , leto, skupina);

		System.out.println("UspeŠno ste vnesli Kartografsko Gradivo! ");


		return novoKartografskoGradivo;
	}

    public String shraniKotNiz()
	{
		String zapis = "*KAR\r\n";				
		zapis += this.Avtor + "\r\n";	
        zapis += this.Naslov + "\r\n";
        zapis += this.Jezik + "\r\n";
        zapis += Integer.toString(this.Leto) + "\r\n";
        zapis += this.Skupina + "\r\n";
        zapis += this.KljucneBesede.toString().replace("[", "").replace("]", "") + "\r\n";
        zapis += this.Zvrst + "\r\n";
        zapis += Integer.toString(this.SteviloStrani) + "\r\n";
        zapis += this.Rezervirana + "\r\n";
        zapis += this.Izposojena + "\r\n";
        zapis += Integer.toString(this.ID) + "\r\n";


   

		
		zapis += "##\r\n";

		return zapis;
	}


    public static KartografskoGradivo preberiIzNiza(ArrayList<String> zapis) {

		KartografskoGradivo novoKartografskoGradivo = new KartografskoGradivo();

	
        try {
                novoKartografskoGradivo.SetAvtor(zapis.get(0));
                novoKartografskoGradivo.SetNaslov(zapis.get(1));
                novoKartografskoGradivo.SetJezik(zapis.get(2));
                novoKartografskoGradivo.SetLeto(Integer.parseInt(zapis.get(3)));
                novoKartografskoGradivo.SetSkupina(zapis.get(4));
                novoKartografskoGradivo.SetKljucneBesede(zapis.get(5));
                novoKartografskoGradivo.SetZvrst(zapis.get(6));
                novoKartografskoGradivo.SetSteviloStrani(Integer.parseInt(zapis.get(7)));
                novoKartografskoGradivo.StanjeArtikla(zapis.get(9).toLowerCase().equals("true") ?  true : false, zapis.get(8).toLowerCase().equals("true") ? true : false );
                novoKartografskoGradivo.SetID(Integer.parseInt(zapis.get(10)));

                
                return novoKartografskoGradivo;
            }
		

		catch(Exception e){

			System.out.println("Prišlo je do napake v zapisu KAR!");
			throw e;


		}


    }
    
}

