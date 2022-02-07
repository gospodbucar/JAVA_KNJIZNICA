import java.io.*;
import java.util.*;


public class StrokovnaLiteratura extends Superclass{

//POLJA 


    private int SteviloStrani;
    private int ID;

    
//ZAČETNA NASTAVITEV STANJ
//KONSTRUKOTRJI

    public StrokovnaLiteratura(){

            this.SteviloStrani=0;


    }

    public StrokovnaLiteratura(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int SteviloStrani, int ID){

            super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst);
            this.SteviloStrani= SteviloStrani;
            this.ID = (15 + this.SteviloStrani*2)%14;

    }

    public StrokovnaLiteratura(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int SteviloStrani, boolean Izposojena, boolean Rezervirana, int ID/*boolean NaZalogi*/){

            super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst, Izposojena, Rezervirana);
            this.SteviloStrani= SteviloStrani;
            this.ID = IDstevilo(); //GENERIRANJE ID

  
            //this.NaZalogi= NaZalogi;

    }


    public StrokovnaLiteratura(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst, int SteviloStrani, boolean Izposojena, boolean Rezervirana, int ID, int leto, String Skupina){

        super(Avtor, Naslov, Jezik, KljucneBesede, Zvrst, Izposojena, Rezervirana, leto, Skupina);
        this.SteviloStrani= SteviloStrani;
        this.ID = IDstevilo(); //GENERIRANJE ID 


}

    public void SetID(int stevilo){
        this.ID = stevilo;
    }

    public int GetSteviloStrani(){
        return this.SteviloStrani;
    }


    public void SetSteviloStrani(int strani){
        this.SteviloStrani = strani;
    }

  

    public int GetID(){ //ID KNJIGE /RANDOM GLEDE NA STEVILO STRANI
        return this.ID;
    }

    public boolean GetNaZalogi(){
        return this.NaZalogi;
    }

    public void SetStanjeArtikla(boolean stanje){

        this.NaZalogi= stanje;

    }

    public void izpis(){

        System.out.println("***   PODATKI O STROKOVNI LITERATURI   ***");
        System.out.println("Avtor: " + this.GetAvtor() + ".");
        System.out.println("Naslov: " + this.GetNaslov() + ".");
        System.out.println("Jezik: " + this.GetJezik() + ".");
        System.out.println("Leto izdaje: " + this.GetLeto());
        System.out.println("Ključne besede: " + this.GetKljucneBesede() + ".");
        System.out.println("Zvrst: " + this.GetZvrst() + ".");
        System.out.println("Skupina: " + this.GetSkupino());
        System.out.println("Število strani: " + GetSteviloStrani() + ".\n");
        System.out.println("ID Knjige je: " + GetID());
        System.out.println();

        System.out.println("Stanje artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");

        System.out.println();
        
    }

    @Override //tako povozimo metodo nadrazreda z istim imenom
	public String toString() {
		String niz = "";
		niz += "***   PODATKI O STROKOVNI LITERATURI   ***\n";
		niz += ("Avtor: " + this.GetAvtor() + ".\n");
		niz += ("Naslov: " + this.GetNaslov() + "\n");
		niz += ("Jezik: " + this.GetJezik() + "\n");
        niz += ("Leto izdaje: " + this.GetLeto() + "\n");
		niz += ("Ključne besede: " + this.GetKljucneBesede() + "\n");
        niz += ("Zvrst: " + this.GetZvrst() + "\n");
        niz += ("Skupina: " + this.GetSkupino() + "\n");
		niz += ("Število strani: " + this.GetSteviloStrani() + "\n\n");

        niz += ("ID Artikla je: " + GetID() + "\n\n");

        niz += ("Stanje Artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");

        niz += ("--------------------------------------------------" + "\n");
		
		return niz;
	}
	

 //METODA ZA VNOS NOVE KNJIGE

    public static StrokovnaLiteratura VnesiStrokovnoLiteraturo() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n***   VNOS NOVE STROKOVNE LITERATURE   ***\n");
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
        System.out.println("Pritisnite (1) za Matematika:");
        System.out.println("Pritisnite (2) za Angleščina:");
        System.out.println("Pritisnite (3) za Slovenščina:");
        System.out.println("Pritisnite (4) za Programiranja:");
        System.out.println("Pritisnite (5) za Informatika:");
        System.out.println("Pritisnite (6) za Umetnost:");

            
            int stevilo1 = Integer.parseInt(br.readLine());
            String tip = "";
            switch (stevilo1){
    
                case 1:
                     tip = "Matematika";
                break;
    
                case 2:
                    tip = "Angleščina";
                break;
                case 3:
                    tip = "Slovenščina";
                break;
    
                case 4:
                tip = "Programiranja";
                break;

                case 5:
                tip = "Informatika";
                break;

                case 6:
                tip = "Umetnost";
                break;

                default:
                System.out.println("NAPAKA PRI VNOSU");
                break;
    
            }
		System.out.println("Vnesi število strani: \n");
		int stevilo = Integer.parseInt(br.readLine());
        
        int IDknjiga = IDstevilo();

        System.out.println("Želite rezerverati artikel? (DA/NE): \n");
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
            kljucnebesede +=  "Strokovna" + " " ;
            kljucnebesede +=  "Literatura" + " ";


        ArrayList<String> KljucneB = new ArrayList<String>();

        KljucneB = VnesiKljucneBesede(kljucnebesede.toLowerCase());


		
		StrokovnaLiteratura novaStrokovnaLiteratura = new StrokovnaLiteratura(avtor, naslov, jezik, KljucneB, tip, stevilo ,  false, rezervirana, IDknjiga , leto , skupina);

		System.out.println("Uspesno ste vnesli Strokovno literaturo!.");


		return novaStrokovnaLiteratura;
	}

    public String shraniKotNiz()
	{
		String zapis = "*STR\r\n";				
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

    public static StrokovnaLiteratura preberiIzNiza(ArrayList<String> zapis) {

		StrokovnaLiteratura novoStrokovnaLiteratura = new StrokovnaLiteratura();

	
        try {
                novoStrokovnaLiteratura.SetAvtor(zapis.get(0));
                novoStrokovnaLiteratura.SetNaslov(zapis.get(1));
                novoStrokovnaLiteratura.SetJezik(zapis.get(2));
                novoStrokovnaLiteratura.SetLeto(Integer.parseInt(zapis.get(3)));
                novoStrokovnaLiteratura.SetSkupina(zapis.get(4));
                novoStrokovnaLiteratura.SetKljucneBesede(zapis.get(5));
                novoStrokovnaLiteratura.SetZvrst(zapis.get(6));
                novoStrokovnaLiteratura.SetSteviloStrani(Integer.parseInt(zapis.get(7)));
                novoStrokovnaLiteratura.StanjeArtikla(zapis.get(9).toLowerCase().equals("true") ?  true : false, zapis.get(8).toLowerCase().equals("true") ? true : false );
                novoStrokovnaLiteratura.SetID(Integer.parseInt(zapis.get(10)));

                
                return novoStrokovnaLiteratura;
            }
		

		catch(Exception e){

			System.out.println("Prišlo je do napake v zapisu STR!");
			throw e;


		}


    }

    
}


