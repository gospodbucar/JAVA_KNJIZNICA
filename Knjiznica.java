import java.io.*;
import java.util.*;

public class Knjiznica {

    private ArrayList<Knjiga> seznamKnjig;
    private ArrayList<ZvocnoGradivo> seznamZvocnegaGradiva;
    private ArrayList<KartografskoGradivo> seznamKartografskegaGradiva;
    private ArrayList<PeriodicnaPublikacija> seznamPeriodicnaPublikacija;
    private ArrayList<StrokovnaLiteratura> seznamStrokovnaLiteratura;


    public Knjiznica(){

        this.seznamKnjig = new ArrayList<Knjiga>();
        this.seznamZvocnegaGradiva = new ArrayList<ZvocnoGradivo>();
        this.seznamKartografskegaGradiva = new ArrayList<KartografskoGradivo>();
        this.seznamPeriodicnaPublikacija = new ArrayList<PeriodicnaPublikacija>();
        this.seznamStrokovnaLiteratura = new ArrayList<StrokovnaLiteratura>();


    }

    public ArrayList<Knjiga> knjiznica(){

        seznamKnjig = new ArrayList<Knjiga>();
        return this.seznamKnjig;

    }

    public ArrayList<ZvocnoGradivo> knjiznica1(){

        seznamZvocnegaGradiva = new ArrayList<ZvocnoGradivo>();
        return this.seznamZvocnegaGradiva;

    }

    public ArrayList<KartografskoGradivo> knjiznica2(){

        seznamKartografskegaGradiva = new ArrayList<KartografskoGradivo>();
        return this.seznamKartografskegaGradiva;

    }

    public ArrayList<PeriodicnaPublikacija> knjiznica3(){

        seznamPeriodicnaPublikacija = new ArrayList<PeriodicnaPublikacija>();
        return this.seznamPeriodicnaPublikacija;

    }

    public ArrayList<StrokovnaLiteratura> knjiznica4(){

        seznamStrokovnaLiteratura = new ArrayList<StrokovnaLiteratura>();
        return this.seznamStrokovnaLiteratura;

    }
     
        //METODE GET
    public ArrayList<Knjiga> getKnjige() {
        return this.seznamKnjig;
    }

    public ArrayList<ZvocnoGradivo> getZvocnoGradivo() {
        return this.seznamZvocnegaGradiva;
    }

    public ArrayList<KartografskoGradivo> getKartografskoGradivo() {
        return this.seznamKartografskegaGradiva;
    }

    public ArrayList<PeriodicnaPublikacija> getPeriodicnaPublikacija() {
        return this.seznamPeriodicnaPublikacija;
    }

    public ArrayList<StrokovnaLiteratura> getStrokovnaLiteratura() {
        return this.seznamStrokovnaLiteratura;
    }

        //METODE DODAJ()
    public void DodajKnjigo(Knjiga knjiga)		                        
	{
		this.seznamKnjig.add(knjiga);
	}

    public void DodajZvocnoGradivo(ZvocnoGradivo gradivo)		                        
	{
		this.seznamZvocnegaGradiva.add(gradivo);
	}

    public void DodajKartografskoGradivo(KartografskoGradivo gradivo)		                        
	{
		this.seznamKartografskegaGradiva.add(gradivo);
	}

    public void DodajPeriodicnoPublikacijo(PeriodicnaPublikacija gradivo)		                         
	{
		this.seznamPeriodicnaPublikacija.add(gradivo);
	}

    public void DodajStrokovnoLiteraturo(StrokovnaLiteratura gradivo)		                         
	{
		this.seznamStrokovnaLiteratura.add(gradivo);
	}

 
        //METODE ZA IZPIS
    public void izpisKnjig(){

        for(int i = 0; i < this.seznamKnjig.size();i++){
            getKnjige().get(i).izpis();
            System.out.println();


        }
    } 

    public void izpisZvocnegaGradiva(){

        for(int i = 0; i < this.seznamZvocnegaGradiva.size();i++){
            getZvocnoGradivo().get(i).izpis();
            System.out.println();


        }
    } 

    public void izpisKartografskegaGradiva(){

        for(int i = 0; i < this.seznamKartografskegaGradiva.size();i++){
            getKartografskoGradivo().get(i).izpis();
            System.out.println();


        }
    } 

    public void izpisPeriodicnaPublikacija(){

        for(int i = 0; i < this.seznamPeriodicnaPublikacija.size();i++){
            getPeriodicnaPublikacija().get(i).izpis();
            System.out.println();


        }
    } 

    public void izpisStrokovnaLiteratura(){

        for(int i = 0; i < this.seznamStrokovnaLiteratura.size();i++){
            getStrokovnaLiteratura().get(i).izpis();
            System.out.println();


        }
    } 
    
        //TO STRING
    public String toStringKnjiga()                                         

	{
	String izpis = "V knjižnici so naslednje Knjige: \n";
	for(int i=0; i < this.seznamKnjig.size(); i++)
		{
			izpis += this.seznamKnjig.get(i).toString() ;
		}
		return izpis;
	}

    public String toStringZvocnoGradivo()                                        

	{
	String izpis = "V knjižnici je naslednje zvočno gradivo: \n";
	for(int i=0; i < this.seznamZvocnegaGradiva.size(); i++)
		{
			izpis += this.seznamZvocnegaGradiva.get(i).toString() ;
		}
		return izpis;
	}

    public String toStringKartografskoGradivo()                                        

	{
	String izpis = "V knjižnici je naslednje kartografsko gradivo: \n";
	for(int i=0; i < this.seznamKartografskegaGradiva.size(); i++)
		{
			izpis += this.seznamKartografskegaGradiva.get(i).toString() ;
		}
		return izpis;
	}

    public String toStringPeriodicnaPublikacija()                                        

	{
	String izpis = "V knjižnici je naslednje Periodične publikacije: \n";
	for(int i=0; i < this.seznamPeriodicnaPublikacija.size(); i++)
		{
			izpis += this.seznamPeriodicnaPublikacija.get(i).toString() ;
		}
		return izpis;
	}

    public String toStringStrokovnaLiteratura() 


	{
	String izpis = "V knjižnici je naslednje strokovne literature: \n";
	for(int i=0; i < this.seznamStrokovnaLiteratura.size(); i++)
		{
			izpis += this.seznamStrokovnaLiteratura.get(i).toString() ;
		}
		return izpis;
	}

        //ODSTRANI
    public void Odstrani(int stevilo) {								
		
		for(int i = 0; i < this.seznamKnjig.size(); i++) {
			if(this.seznamKnjig.get(i).GetID() == stevilo)
			 {
				this.seznamKnjig.remove(i);
                System.out.println("Artikel je odstranjen iz knjižnice!");
			}
		}
  
		for(int i = 0; i < this.seznamZvocnegaGradiva.size(); i++) {
			if(this.seznamZvocnegaGradiva.get(i).GetID() == stevilo)
			 {
				this.seznamZvocnegaGradiva.remove(i);
                System.out.println("Artikel je odstranjen iz knjižnice!");
			}
		}
							
            for(int i = 0; i < this.seznamZvocnegaGradiva.size(); i++) {
                if(this.seznamZvocnegaGradiva.get(i).GetID() == stevilo)
                 {
                    this.seznamZvocnegaGradiva.remove(i);
                    System.out.println("Artikel je odstranjen iz knjižnice!");
                }
            }
								
        for(int i = 0; i < this.seznamPeriodicnaPublikacija.size(); i++) {
            if(this.seznamPeriodicnaPublikacija.get(i).GetID() == stevilo)
             {
                this.seznamPeriodicnaPublikacija.remove(i);
                System.out.println("Artikel je odstranjen iz knjižnice!");
            }
        }

        for(int i = 0; i < this.seznamStrokovnaLiteratura.size(); i++) {
            if(this.seznamStrokovnaLiteratura.get(i).GetID() == stevilo)
             {
                this.seznamStrokovnaLiteratura.remove(i);
                System.out.println("Artikel je odstranjen iz knjižnice!");
            }
        }

    }

        //ODSTRANI PO AVTOR
    public void OdstraniAvtor(String Avtor) {								
		
            for(int i = 0; i < this.seznamKnjig.size(); i++) {
                if(this.seznamKnjig.get(i).GetAvtor().equals(Avtor))
                 {
                    this.seznamKnjig.remove(i);
                    System.out.println("Artikel je odstranjen iz knjižnice!");
                }
            }
      
            for(int i = 0; i < this.seznamZvocnegaGradiva.size(); i++) {
                if(this.seznamZvocnegaGradiva.get(i).GetAvtor().equals(Avtor))
                 {
                    this.seznamZvocnegaGradiva.remove(i);
                    System.out.println("Artikel je odstranjen iz knjižnice!");
                }
            }
                                
                for(int i = 0; i < this.seznamZvocnegaGradiva.size(); i++) {
                    if(this.seznamZvocnegaGradiva.get(i).GetAvtor().equals(Avtor))
                     {
                        this.seznamZvocnegaGradiva.remove(i);
                        System.out.println("Artikel je odstranjen iz knjižnice!");
                    }
                }
                                    
            for(int i = 0; i < this.seznamPeriodicnaPublikacija.size(); i++) {
                if(this.seznamPeriodicnaPublikacija.get(i).GetAvtor().equals(Avtor))
                 {
                    this.seznamPeriodicnaPublikacija.remove(i);
                    System.out.println("Artikel je odstranjen iz knjižnice!");
                }
            }
    
            for(int i = 0; i < this.seznamStrokovnaLiteratura.size(); i++) {
                if(this.seznamStrokovnaLiteratura.get(i).GetAvtor().equals(Avtor))
                 {
                    this.seznamStrokovnaLiteratura.remove(i);
                    System.out.println("Artikel je odstranjen iz knjižnice!");
                }
            }
    
        }    
    
    //METODA ZA IZPIS PO KLJUČNIH BESEDAH
    public void izpisPoKljucnihBesedah(){

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            try{

                System.out.println("Vnesi ključne besede");

                String beseda = br.readLine();

                for(int i = 0; i < getKnjige().size();i++ ){

                    if(getKnjige().get(i).GetKljucneBesede().contains(beseda)){

                        getKnjige().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                    if(getKartografskoGradivo().get(i).GetKljucneBesede().contains(beseda)){

                        getKartografskoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                    if(getPeriodicnaPublikacija().get(i).GetKljucneBesede().contains(beseda)){

                        getPeriodicnaPublikacija().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                    if(getStrokovnaLiteratura().get(i).GetKljucneBesede().contains(beseda)){

                        getStrokovnaLiteratura().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                    if(getZvocnoGradivo().get(i).GetKljucneBesede().contains(beseda)){

                        getZvocnoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

            }

            catch (Exception e){
                System.out.println("NAPAČEN VNOS");

            }


    }

        //METODA ZA IZPIS PO SKUPINAH
    public void izpisPoSkupinah(){

            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
                try{
    
                    System.out.println("Vnesi Skupino (Šport/Zdravje/Dramatika/Politika/Naravoslovje/Zgodovina");
    
                    String beseda = br.readLine();
    
                    for(int i = 0; i < getKnjige().size();i++ ){
    
                        if(getKnjige().get(i).GetSkupino().contains(beseda)){
    
                            getKnjige().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getKartografskoGradivo().size();i++ ){
    
                        if(getKartografskoGradivo().get(i).GetSkupino().contains(beseda)){
    
                            getKartografskoGradivo().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){
    
                        if(getPeriodicnaPublikacija().get(i).GetSkupino().contains(beseda)){
    
                            getPeriodicnaPublikacija().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){
    
                        if(getStrokovnaLiteratura().get(i).GetSkupino().contains(beseda)){
    
                            getStrokovnaLiteratura().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getZvocnoGradivo().size();i++ ){
    
                        if(getZvocnoGradivo().get(i).GetSkupino().contains(beseda)){
    
                            getZvocnoGradivo().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                }
    
                catch (Exception e){
                    System.out.println("NAPAČEN VNOS");
    
                }
    
    
        }
    

        //METODA ZA IZPIS PO ID
    public void izpisPoID(){

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            try{

                System.out.println("Vnesi ID artikla");
                int stevilo = Integer.parseInt(br.readLine());

                for(int i = 0; i < getKnjige().size();i++ ){

                    if(getKnjige().get(i).GetID() == stevilo){

                        getKnjige().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                    if(getKartografskoGradivo().get(i).GetID() == stevilo){

                        getKartografskoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                    if(getPeriodicnaPublikacija().get(i).GetID() == stevilo){

                        getPeriodicnaPublikacija().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                    if(getStrokovnaLiteratura().get(i).GetID() == stevilo){

                        getStrokovnaLiteratura().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                    if(getZvocnoGradivo().get(i).GetID() == stevilo){

                        getZvocnoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

            }

            catch (Exception e){
                System.out.println("NAPAČEN VNOS");

            }


    }

    
        //METODA ZA IZPIS PO ZVRSTI
        public void izpisPoZvrsti(){

            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    
                try{
    
                    System.out.println("Vnesi zvrst");
    
                    String beseda = br.readLine();
    
                    for(int i = 0; i < getKnjige().size();i++ ){
    
                        if(getKnjige().get(i).GetZvrst().contains(beseda)){
    
                            getKnjige().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getKartografskoGradivo().size();i++ ){
    
                        if(getKartografskoGradivo().get(i).GetZvrst().contains(beseda)){
    
                            getKartografskoGradivo().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){
    
                        if(getPeriodicnaPublikacija().get(i).GetZvrst().contains(beseda)){
    
                            getPeriodicnaPublikacija().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){
    
                        if(getStrokovnaLiteratura().get(i).GetZvrst().contains(beseda)){
    
                            getStrokovnaLiteratura().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                    for(int i = 0; i < getZvocnoGradivo().size();i++ ){
    
                        if(getZvocnoGradivo().get(i).GetZvrst().contains(beseda)){
    
                            getZvocnoGradivo().get(i).izpis();
                            System.out.println();
                        }
    
                    }
    
                }
    
                catch (Exception e){
                    System.out.println("NAPAČEN VNOS");
    
                }
    
    
        }


        //METODA ZA IZPIS PO KLJUČNIH BESEDAH
        public void izpisPoJeziku(){

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            try{

                System.out.println("Vnesi Jezik");

                String beseda = br.readLine();

                for(int i = 0; i < getKnjige().size();i++ ){

                    if(getKnjige().get(i).GetJezik().contains(beseda)){

                        getKnjige().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                    if(getKartografskoGradivo().get(i).GetJezik().contains(beseda)){

                        getKartografskoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                    if(getPeriodicnaPublikacija().get(i).GetJezik().contains(beseda)){

                        getPeriodicnaPublikacija().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                    if(getStrokovnaLiteratura().get(i).GetJezik().contains(beseda)){

                        getStrokovnaLiteratura().get(i).izpis();
                        System.out.println();
                    }

                }

                for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                    if(getZvocnoGradivo().get(i).GetJezik().contains(beseda)){

                        getZvocnoGradivo().get(i).izpis();
                        System.out.println();
                    }

                }

            }

            catch (Exception e){
                System.out.println("NAPAČEN VNOS");

            }


    }

        //METODA ZA REZERVACIJO ARTIKLA PO ID
        public void RezervirajPoID(int stevilo){


                for(int i = 0; i < getKnjige().size();i++ ){

                    if(getKnjige().get(i).GetID() == stevilo){


                        getKnjige().get(i).SetRezervirana(true);
                        getKnjige().get(i).izpis();
                        System.out.println("Arikel je rezerviran!");
                    }

                }

                for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                    if(getKartografskoGradivo().get(i).GetID() == stevilo){

                        getKartografskoGradivo().get(i).SetRezervirana(true);
                        getKartografskoGradivo().get(i).izpis();
                        System.out.println("Arikel je rezerviran!");
                    }

                }

                for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                    if(getPeriodicnaPublikacija().get(i).GetID() == stevilo){

                        getPeriodicnaPublikacija().get(i).SetRezervirana(true);
                        getPeriodicnaPublikacija().get(i).izpis();
                        System.out.println("Arikel je rezerviran!");
                    }

                }

                for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                    if(getStrokovnaLiteratura().get(i).GetID() == stevilo){

                        getStrokovnaLiteratura().get(i).SetRezervirana(true);
                        getStrokovnaLiteratura().get(i).izpis();
                        System.out.println("Arikel je rezerviran!");
                    }

                }

                for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                    if(getZvocnoGradivo().get(i).GetID() == stevilo){

                        getZvocnoGradivo().get(i).SetRezervirana(true);
                        getZvocnoGradivo().get(i).izpis();
                        System.out.println("Arikel je rezerviran!");
                    }

                }

            }

        //METODA ZA IZPOSOJO ARTIKLA PO ID

        public void IzposodiPoID(int stevilo){


            for(int i = 0; i < getKnjige().size();i++ ){

                if(getKnjige().get(i).GetID() == stevilo){


                    getKnjige().get(i).SetIzposojena(true);
                    getKnjige().get(i).izpis();
                    System.out.println("Arikel je izposojen!");
                }

            }

            for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                if(getKartografskoGradivo().get(i).GetID() == stevilo){

                    getKartografskoGradivo().get(i).SetIzposojena(true);
                    getKartografskoGradivo().get(i).izpis();
                    System.out.println("Arikel je izposojen!");
                }

            }

            for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                if(getPeriodicnaPublikacija().get(i).GetID() == stevilo){

                    getPeriodicnaPublikacija().get(i).SetIzposojena(true);
                    getPeriodicnaPublikacija().get(i).izpis();
                    System.out.println("Arikel je izposojen!");
                }

            }

            for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                if(getStrokovnaLiteratura().get(i).GetID() == stevilo){

                    getStrokovnaLiteratura().get(i).SetIzposojena(true);
                    getStrokovnaLiteratura().get(i).izpis();
                    System.out.println("Arikel je izposojen!");
                }

            }

            for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                if(getZvocnoGradivo().get(i).GetID() == stevilo){

                    getZvocnoGradivo().get(i).SetIzposojena(true);
                    getZvocnoGradivo().get(i).izpis();
                    System.out.println("Arikel je izposojen!");
                }

            }

        }

        //METODA ZA VRNITEV ARTIKLA NA ZALOGO

        public void VrniNaZalogo(int stevilo){


            for(int i = 0; i < getKnjige().size();i++ ){

                if(getKnjige().get(i).GetID() == stevilo){


                    getKnjige().get(i).SetVrni(false);
                    getKnjige().get(i).izpis();
                    System.out.println("Arikel je spet na voljo!");
                }

            }

            for(int i = 0; i < getKartografskoGradivo().size();i++ ){

                if(getKartografskoGradivo().get(i).GetID() == stevilo){

                    getKartografskoGradivo().get(i).SetVrni(false);
                    getKartografskoGradivo().get(i).izpis();
                    System.out.println("Arikel je spet na voljo!");
                }

            }

            for(int i = 0; i < getPeriodicnaPublikacija().size();i++ ){

                if(getPeriodicnaPublikacija().get(i).GetID() == stevilo){

                    getPeriodicnaPublikacija().get(i).SetVrni(false);
                    getPeriodicnaPublikacija().get(i).izpis();
                    System.out.println("Arikel je spet na voljo!");
                }

            }

            for(int i = 0; i < getStrokovnaLiteratura().size();i++ ){

                if(getStrokovnaLiteratura().get(i).GetID() == stevilo){

                    getStrokovnaLiteratura().get(i).SetVrni(false);
                    getStrokovnaLiteratura().get(i).izpis();
                    System.out.println("Arikel je spet na voljo!");
                }

            }

            for(int i = 0; i < getZvocnoGradivo().size();i++ ){

                if(getZvocnoGradivo().get(i).GetID() == stevilo){

                    getZvocnoGradivo().get(i).SetVrni(false);
                    getZvocnoGradivo().get(i).izpis();
                    System.out.println("Arikel je spet na voljo!");
                }

            }

        }

        //SHRANI PODATKE V DATOTEKO
	    public void shraniVdatkoteko(String imeDatoteke) throws IOException {

		FileWriter fw = new FileWriter(imeDatoteke, true); // Drugi parameter določa, da zapisujemo v obstoječo datoteko od konca datoteke naprej.
		PrintWriter dat = new PrintWriter(fw);
		
            for(Knjiga novaKnjiga : this.seznamKnjig) {
                dat.print(novaKnjiga.shraniKotNiz());
            }
            for(ZvocnoGradivo novoZvocnoGradivo : this.seznamZvocnegaGradiva) {
                dat.print(novoZvocnoGradivo.shraniKotNiz());
            }
            for(PeriodicnaPublikacija novaPeriodicnaPublikacija : this.seznamPeriodicnaPublikacija) {
                dat.print(novaPeriodicnaPublikacija.shraniKotNiz());
            }
            for(KartografskoGradivo novoKartografskoGradivo : this.seznamKartografskegaGradiva) {
                dat.print(novoKartografskoGradivo.shraniKotNiz());
            }
            for(StrokovnaLiteratura novaStrokovnaLiteratura : this.seznamStrokovnaLiteratura) {
                dat.print(novaStrokovnaLiteratura.shraniKotNiz());
            }
	
		dat.close();
	    }


        public int preberiIzDatoteke(String imeDatoteke) throws Exception {
            FileReader fr = new FileReader(imeDatoteke);
            BufferedReader dat = new BufferedReader(fr);
            
            ArrayList<String> seznamKnj;
            ArrayList<String> seznamPer;
            ArrayList<String> seznamZvo;
            ArrayList<String> seznamKar;
            ArrayList<String> seznamStr;




            int stevecDodanihKnjig = 0;
            
            while(dat.ready()) {
                String vrstica = dat.readLine().trim().toUpperCase(); 
                
                if(vrstica.equals("*KNI")) {
                    seznamKnj = new ArrayList<String>();
                    
                    while(dat.ready() && !vrstica.equals("##")) {
                        vrstica = dat.readLine().trim();
                        seznamKnj.add(vrstica);
    
                    }
                    
                    Knjiga novaKnjiga = Knjiga.preberiIzNiza(seznamKnj);
                    stevecDodanihKnjig = stevecDodanihKnjig +1;
                    this.seznamKnjig.add(novaKnjiga);
    
                }

                if(vrstica.equals("*PER")) {
                    seznamPer = new ArrayList<String>();
                    
                    while(dat.ready() && !vrstica.equals("##")) {
                        vrstica = dat.readLine().trim();
                        seznamPer.add(vrstica);
    
                    }
                    
                    PeriodicnaPublikacija novaPeriodicnaPublikacija = PeriodicnaPublikacija.preberiIzNiza(seznamPer);
                    stevecDodanihKnjig = stevecDodanihKnjig +1;
                    this.seznamPeriodicnaPublikacija.add(novaPeriodicnaPublikacija);
    
                }

                if(vrstica.equals("*ZVO")) {
                    seznamZvo = new ArrayList<String>();
                    
                    while(dat.ready() && !vrstica.equals("##")) {
                        vrstica = dat.readLine().trim();
                        seznamZvo.add(vrstica);
    
                    }
                    
                    ZvocnoGradivo novoZvocnoGradivo = ZvocnoGradivo.preberiIzNiza(seznamZvo);
                    stevecDodanihKnjig = stevecDodanihKnjig +1;
                    this.seznamZvocnegaGradiva.add(novoZvocnoGradivo);
    
                }

                if(vrstica.equals("*KAR")) {
                    seznamKar = new ArrayList<String>();
                    
                    while(dat.ready() && !vrstica.equals("##")) {
                        vrstica = dat.readLine().trim();
                        seznamKar.add(vrstica);
    
                    }
                    
                    KartografskoGradivo novoKartografskoGradivo = KartografskoGradivo.preberiIzNiza(seznamKar);
                    stevecDodanihKnjig = stevecDodanihKnjig +1;
                    this.seznamKartografskegaGradiva.add(novoKartografskoGradivo);
                    
    
                }
 
                if(vrstica.equals("*STR")) {
                    seznamStr = new ArrayList<String>();
                    
                    while(dat.ready() && !vrstica.equals("##")) {
                        vrstica = dat.readLine().trim();
                        seznamStr.add(vrstica);
    
                    }
                    
                    StrokovnaLiteratura novoStrokovnaLiteratura = StrokovnaLiteratura.preberiIzNiza(seznamStr);
                    stevecDodanihKnjig = stevecDodanihKnjig +1;
                    this.seznamStrokovnaLiteratura.add(novoStrokovnaLiteratura);
                    
    
                }
 
 

            
                }
    
                return stevecDodanihKnjig;
                
                
        }



        




    }











    





