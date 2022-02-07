import java.io.*;
import java.util.*;
import java.math.*;

public class Superclass  {
    
    

        //POLJA 
        
            public String Avtor;
            public String Naslov;
            public String Jezik;
            public ArrayList <String> KljucneBesede = new ArrayList<String>();
            //private String TipKnjige;
           // private int SteviloStrani;
            public String Zvrst;
            public boolean Izposojena;
            public boolean Rezervirana;
            public boolean NaZalogi;



            public int Leto;
            public String Skupina;
        
            private int ID;
        
        
        //ZAČETNA NASTAVITEV STANJ
        //KONSTRUKOTRJI
        
        public Superclass(){
        
                    this.Avtor ="Neznan";
                    this.Naslov="Neznan";         
                    this.Jezik ="Neznan";
                    this.KljucneBesede= new ArrayList<String>();
                    this.Zvrst ="Neznan";
                    this.ID = 0;
                    this.Izposojena=false;
                    this.Rezervirana =false;
                    this.NaZalogi=false;
                    this.Leto=0;
                    this.Skupina= "Neznan";
        
            }
        
        public Superclass(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String Zvrst){
        
                    this.Avtor = Avtor;
                    this.Naslov= Naslov;         
                    this.Jezik = Jezik;
                    this.KljucneBesede= KljucneBesede;
                    this.Zvrst = Zvrst;
        
        }
               
        public Superclass(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String TipKnjige, boolean Izposojena, boolean Rezervirana){
        
            this.Avtor = Avtor;
            this.Naslov= Naslov;         
            this.Jezik = Jezik;
            this.KljucneBesede = KljucneBesede;
            this.Zvrst = TipKnjige;

            this.Izposojena= Izposojena;
            this.Rezervirana =Rezervirana;

    }
        
        public Superclass(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String TipKnjige, boolean Izposojena, boolean Rezervirana , int ID){
        
            this.Avtor = Avtor;
            this.Naslov= Naslov;         
            this.Jezik = Jezik;
            this.KljucneBesede = KljucneBesede;
            this.Zvrst = TipKnjige;
        
            this.Izposojena= Izposojena;
            this.Rezervirana =Rezervirana;
            this.ID = ID;
            this.NaZalogi = true;
        
            }


        public Superclass(String Avtor, String Naslov, String Jezik, ArrayList<String> KljucneBesede, String TipKnjige, boolean Izposojena, boolean Rezervirana , int leto, String skupina){
        
                this.Avtor = Avtor;
                this.Naslov= Naslov;         
                this.Jezik = Jezik;
                this.KljucneBesede = KljucneBesede;
                this.Zvrst = TipKnjige;
                this.Izposojena= Izposojena;
                this.Rezervirana =Rezervirana;

                this.Leto = leto;
                this.Skupina = skupina;
            
                }

        //GENERATOR ID
        public static int IDstevilo(){




            int novID = (int)Math.round(Math.random()*100D);



            return novID;
        }



        //METODE SET
        
            public void SetAvtor(String avtor){
                this.Avtor = avtor;
            }
        
            public void SetNaslov(String naslov){
                this.Naslov = naslov;
            }
        
            public void SetJezik(String jezik){
                this.Jezik = jezik;
            }    

            public void SetSkupina(String skupina){
                this.Skupina = skupina;
            }    
            
          
            public void SetID(int stevilo){
                this.ID = stevilo;
            }
        
            public void SetLeto(int leto){
                this.Leto = leto;
            }

            public void SetZvrst(String tip){
                this.Zvrst = tip;
            }
        
            public void SetIzposojena(boolean izposojena){
                this.Izposojena = izposojena;
            }
        
            public void SetRezervirana(boolean rezervirana){
                this.Rezervirana = rezervirana;
            }


            public void SetNaZalogi(boolean zaloga){
                this.NaZalogi = zaloga;
            }

            public void SetKljucneBesede(String kb){
                this.KljucneBesede = VnesiKljucneBesede(kb);
            }

            public void SetVrni(boolean vrni ){
                this.Izposojena = vrni;
                this.Rezervirana = vrni;
            }
        
        //METODE GET
        
            public String GetAvtor(){
                return this.Avtor;
            }
        
            public String GetNaslov(){
                return this.Naslov;
            }
        
            public String GetJezik(){
                return this.Jezik;
            }    
            
            public ArrayList<String> GetKljucneBesede(){
                return this.KljucneBesede;
            }
        
            public String GetZvrst(){
                return this.Zvrst;
            }

                   
            public String GetSkupino(){
                return this.Skupina;
            }
        
        
            public boolean GetIzposojena(){
                return this.Izposojena;
            }
        
            public boolean GetRezervirana(){
                return this.Rezervirana;
            }
        
            public boolean GetNaZalogi(){
                return this.NaZalogi;
            }
        
            public void SetStanjeArtikla(boolean stanje){
        
                this.NaZalogi= stanje;
        
            }
        
            public int GetLeto(){ //ID KNJIGE /RANDOM GLEDE NA STEVILO STRANI
                return this.Leto;
            }

            public int GetID(){ //ID KNJIGE /RANDOM GLEDE NA STEVILO STRANI
                return this.ID;
            }
        
            //KLJUČNE BESEDE

            public static ArrayList<String> VnesiKljucneBesede(String niz){

                ArrayList<String> KljucneB = new ArrayList<String>();

                String beseda = "";

                niz.toLowerCase();

                for(int i = 0; i < niz.length();i++){

                    switch (niz.charAt(i)){

                        case ' ':
                            KljucneB.add(beseda);
                            beseda = "";
                            continue;

                        case ',':
                            continue;
                        

                        default:
                            beseda += niz.charAt(i);
                            if(i == niz.length()-1){
                                KljucneB.add(beseda);
                            }


                    }


                }

                return KljucneB;

            }

   
               
            //IZPOSOJENA
        
            public String StanjeArtikla(boolean izposojena, boolean rezervirana){
        
                String niz ="";
                if (izposojena || rezervirana == true ){
        
                        niz = "Artikel trenutno ni na voljo.\n";

                        if(izposojena == true){
        
                            niz += "Artikel je trenutno izposojen.\n";
                            this.SetIzposojena(true);
                        }
        
                        else{
        
                            niz += "Artikel je že rezerviran";
                            this.SetRezervirana(true);
                        }
        
                }
        
                else{
        
                    niz = "Artikel je na voljo";
                    this.SetNaZalogi(true);                }
        
                return niz;
            }
        
            //IZPIS
        
            public void izpis(){
        
                System.out.println("***   PODATKI O ARTIKLU   ***");
                System.out.println("Avtor: " + this.GetAvtor() + ".");
                System.out.println("Nalsov: " + this.GetNaslov() + ".");
                System.out.println("Jezik: " + this.GetJezik() + ".");
                System.out.println("Ključne besede: " + this.GetKljucneBesede() + ".");
                System.out.println("Tip Zvrsti: " + this.GetZvrst() + ".");
        
                System.out.println("ID Knjige je: " + GetID());
        
                System.out.println();
        
                System.out.println("Stanje artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");
        
                System.out.println();
                
            }

   

            
        
            @Override //tako povozimo metodo nadrazreda z istim imenom
            public String toString() {
                String niz = "";
                niz += "***   PODATKI O ARTIKLU   ***\n";
                niz += ("Avtor: " + this.GetAvtor() + ".\n");
                niz += ("Naslov: " + this.GetNaslov() + "\n");
                niz += ("Jezik: " + this.GetJezik() + "\n");
                niz += ("Ključne besede: " + this.GetKljucneBesede() + "\n");
                niz += ("Tip Zvrsti: " + this.GetZvrst() + "\n");
        
                niz += ("ID Artikla je: " + GetID() + "\n\n");
        
                niz += ("Stanje Artikla: " + StanjeArtikla(GetIzposojena(), GetRezervirana()) + "\n\n");
        
                niz += "________________________________________" + "\n";
                
                return niz;
            }
            
        
            //METODA ZA VNOS
        
            public static Superclass VnesiArtikel() throws Exception {


                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                System.out.println("***   VNOS NOVE KNJIGE   ***");
                System.out.println("Vnesi Avtorja: ");
                String avtor = br.readLine();
        
                System.out.println("Vnesi Naslov: ");
                String naslov = br.readLine();
        
                System.out.println("Vnesi Jezik: ");
                String jezik = br.readLine();
        
                System.out.println("Vnesi Kljucne besede: ");
                String kljucnebesede = br.readLine();

                ArrayList<String> KljucneB = new ArrayList<String>();

                KljucneB = VnesiKljucneBesede(kljucnebesede);
                
                

                System.out.println("Vnesi Zvrst: ");
                String tip = br.readLine();
                
        
                System.out.println("Želite rezerverati Artikel? (DA/NE): ");
                String rez = br.readLine().toUpperCase();
                boolean rezervirana ;
                 if(rez.equals("DA")){
                     rezervirana = true;
                    }
                
                else{ rezervirana = false;}
        
                
                Superclass novArtikel = new Superclass(avtor, naslov, jezik, KljucneB, tip , false, rezervirana);
        
                System.out.println("Uspesno ste vnesli Artikel!.");
        
        
                return novArtikel;
            }
        


            
        }
        






