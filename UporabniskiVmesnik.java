import java.io.*;

public class UporabniskiVmesnik {

    public static void main (String []args){

        System.out.println();

        System.out.println(" *** DOBRODOŠLI V KNJIŽNICI *** \n");

        Knjiznica knjiznica = new Knjiznica();

        while(true){

            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            
                System.out.format("**** VNOS ARTIKLOV ****\n");

                System.out.println("Pritisnite (k) za vnos knjige");
                System.out.println("Pritisnite (i) za izpis knjig\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("Pritisnite (z) za vnos zvočnega gradiva");
                System.out.println("Pritisnite (u) za izpis zvočnega gradiva\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("Pritisnite (h) za vnos kartografskega gradiva");
                System.out.println("Pritisnite (b) za izpis kartografskega gradiva\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("Pritisnite (c) za vnos periodične publikacije");
                System.out.println("Pritisnite (v) za izpis periodične publikacije\n");
//////////////////////////////////////////////////////////////////////////////////////////////////////
                System.out.println("Pritisnite (w) za vnos strokovne literature");
                System.out.println("Pritisnite (e) za izpis strokovne literature\n");


                System.out.format("**** ISKANJE ****\n");
                System.out.println("Pritisnite (1) za izpis po ključnih besedah");
                System.out.println("Pritisnite (2) za izpis po ID artikla");
                System.out.println("Pritisnite (3) za izpis po zvrsti");
                System.out.println("Pritisnite (4) za izpis po jeziku ");
                System.out.println("Pritisnite (5) za izpis po SKUPINAH\n");

                System.out.println("Pritisnite (a) za izpis celotne knjižnice \n");



                System.out.format("**** REZERVACIJA/IZPOSOJA/VRNITEV ****\n");
                System.out.println("Pritisnite (6) za rezervacijo artikla po ID");
                System.out.println("Pritisnite (7) za izposojo artikla po ID");
                System.out.println("Pritisnite (8) za vrnitev artikla na zalogo\n");

                System.out.format("**** IZBRIS PO ID ARTIKLA ****\n");
                System.out.println("Pritisnite (d) za izbris artikla po ID");
                System.out.println("Pritisnite (m) za izbris artikla po Avtorju\n");


                System.out.format("**** DATOTEKE ****\n");
                System.out.println("Pritisnite (f) za izpis v datoteko");
                System.out.println("Pritisnite (r) za izpis iz datoteke\n");




                System.out.println("Pritisnite (x) za izhod iz programa\n");




                String niz;
            
                try {
                    niz = br.readLine();
                    char znak = niz.charAt(0);
                    
                    switch (znak) {

                        case 'k':                                               //VNOS KNJIG

                            Knjiga novaKnjiga = Knjiga.VnesiKnjigo();
                            knjiznica.DodajKnjigo(novaKnjiga);
                        
                        break;

                        case 'i':                                               //IZPIS KNJIG

                            System.out.println(knjiznica.toStringKnjiga());

                        break;

                        case 'd':   
                                                                    //ODSTRANI ARTIKEL ID
                            System.out.println("Vnesi ID artikla: \n ");  
                            int mesto = Integer.parseInt(br.readLine()); 
                            
                            knjiznica.Odstrani(mesto);
                            System.out.println("Artikel z id: " + mesto + " je odstranjena \n"); 
                        
                        break;

                        case 'm':   
                                                                    //ODSTRANI ARTIKEL
                            System.out.println("Vnesi Avtorja: \n ");  
                            String Avtor = br.readLine(); 

                                knjiznica.OdstraniAvtor(Avtor);
                            System.out.println("Artikel z Avtorjem: " + Avtor + " je odstranjen\n"); 

                        break;






                        case 'z':                                                        //VNOS ZVOCNEGA GRADIVA

                            ZvocnoGradivo novoZvocnoGradivo = ZvocnoGradivo.VnesiZvocnoGradivo();
                            knjiznica.DodajZvocnoGradivo(novoZvocnoGradivo);
                        
                        break;

                        case 'u':                                                     //IZPIS ZVOCNEGA GRADIVA

                            System.out.println(knjiznica.toStringZvocnoGradivo());

                        break;



                        case 'h':                                                        //VNOS ZVOCNEGA GRADIVA

                            KartografskoGradivo novoKartografskoGradivo = KartografskoGradivo.VnesiKartografskoGradivo();
                            knjiznica.DodajKartografskoGradivo(novoKartografskoGradivo);
                        
                        break;

                        case 'b':                                                     //IZPIS ZVOCNEGA GRADIVA

                            System.out.println(knjiznica.toStringKartografskoGradivo());

                        break;




                        case 'c':                                                        //VNOS PERIODICNE PUBLIKACIJE

                            PeriodicnaPublikacija novaPeriodicnaPublikacija = PeriodicnaPublikacija.VnesiPeriodicnoPublikacijo();
                            knjiznica.DodajPeriodicnoPublikacijo(novaPeriodicnaPublikacija);
                        
                        break;

                        case 'v':                                                     //IZPIS PERIODICNA PUBLIKACIJA

                            System.out.println(knjiznica.toStringPeriodicnaPublikacija());

                        break;




                        case 'w':                                                        //VNOS STROKOVNE LITERATURE

                            StrokovnaLiteratura novaStrokovnaLiteratura = StrokovnaLiteratura.VnesiStrokovnoLiteraturo();
                            knjiznica.DodajStrokovnoLiteraturo(novaStrokovnaLiteratura);
                    
                        break;

                        case 'e':                                                     //IZPIS STROKOVNE LITERATURE

                            System.out.println(knjiznica.toStringStrokovnaLiteratura());

                        break;

                        case 'a':   
                                                                    //IZPIS KNJIG
                        System.out.println("KNJIGE: \n" + knjiznica.toStringKnjiga());

                        System.out.println("KARTOGRAFSKO GRADIVO: \n" +knjiznica.toStringKartografskoGradivo());

                        System.out.println("STROKOVNA LITERATURA: \n" +knjiznica.toStringStrokovnaLiteratura());

                        System.out.println("PERIODIČNA PUBLIKACIJA: \n" +knjiznica.toStringPeriodicnaPublikacija());

                        System.out.println("ZVOČNO GRADIVO: \n" +knjiznica.toStringZvocnoGradivo());



                        break;







                        case '1':

                            knjiznica.izpisPoKljucnihBesedah();

                        break;

                        case '2':

                            knjiznica.izpisPoID();

                        break;

                        case '3':

                            knjiznica.izpisPoZvrsti();

                        break;

                        case '4':

                            knjiznica.izpisPoJeziku();

                        break;

                        case '5':

                            knjiznica.izpisPoSkupinah();

                        break;

                        case '6':

                            System.out.println("Vnesi ID Artikla za rezervacijo: \n ");  
                            int mesto6 = Integer.parseInt(br.readLine()); 
                        
                            knjiznica.RezervirajPoID(mesto6);
            

                        break;

                        case '7':

                            System.out.println("Vnesi ID Artikla za izposojo: \n ");  
                            int mesto7 = Integer.parseInt(br.readLine()); 
                        
                            knjiznica.IzposodiPoID(mesto7);
            

                        break;

                        case '8':

                            System.out.println("Vnesi ID Artikla za vrnitev na zalogo: \n ");  
                            int mesto8 = Integer.parseInt(br.readLine()); 
                        
                            knjiznica.VrniNaZalogo(mesto8);
            

                        break;


                        case 'f':

                            System.out.println("Vnesi ime datoteke za shranjevanje!");

                            String datoteka = br.readLine();
                            knjiznica.shraniVdatkoteko(datoteka);
                            System.out.println("Knjižnica je uspešno shranjeno!");
                    	break;

                        case 'r':
                            System.out.println("Vnesite ime datoteke za branje!");
                            String datoteka1 = br.readLine();
                            knjiznica.preberiIzDatoteke(datoteka1);
                            System.out.println("Artikli so uspesno dodani!");
                        break;




                        case 'x':
                            System.out.println("Program je zakljucen!\n");
                        return;

                        default:
                            System.out.println("Izbira ni pravilna - poskusite ponovno!\n");
                        break;


                        }


                    }


                    catch(Exception e){

                        System.out.println("Napaka pri vnosu = poskusite ponovno\n");
    
    
                    }



        }





    }
    
}
