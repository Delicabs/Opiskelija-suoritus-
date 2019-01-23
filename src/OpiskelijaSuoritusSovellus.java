import java.text.SimpleDateFormat;
import java.util.*;

public class OpiskelijaSuoritusSovellus {

    private List<Opiskelija> opiskelijatList = new ArrayList<Opiskelija>();
    private static Scanner input = new Scanner(System.in);


    public void lisääOpiskelija() {
        Opiskelija opiskelija = new Opiskelija();
        System.out.print("Anna opiskelijanumero: ");
        String aOpiskeiljaNumero = input.nextLine();
        opiskelija.setOpiskelijanumero(aOpiskeiljaNumero);
        System.out.print("Anna nimi: ");
        String aNimi = input.nextLine();
        opiskelija.setNimi(aNimi);

        opiskelijatList.add(opiskelija);


    }

    public void näytäOpiskelijat() {
        for (Opiskelija opi : opiskelijatList)
            System.out.println(opi);


    }


    public void näytäOpiskelija() {
        int näytOP = etsiOpiskelija();
        if (näytOP != -1)
            System.out.println(opiskelijatList.get(näytOP).toString());

    }


    private void lisääSuoritus() {
        Suoritus suoritus = new Suoritus();
        int INDEX = etsiOpiskelija();
        if (INDEX != -1) {

            System.out.print("Anna kurssi tunnus: ");
            suoritus.setKurssiTunnus(input.nextLine());
            System.out.print("Anna arvosana: ");
            suoritus.setArvosana(input.nextInt());
            input.nextLine();
            System.out.print("Anna suorituspäivä (pp.kk.vvvv): ");
            SimpleDateFormat paivamaara = new SimpleDateFormat("dd.MM.yyyy");
            try {
                Date pvm = paivamaara.parse(input.nextLine());
                suoritus.setSuoritusPvm(pvm);
            } catch (Exception e) {
                System.out.println("Virhe");
            }


            opiskelijatList.get(INDEX).lisaa(suoritus);
        }

    }

    private int etsiOpiskelija() {
        System.out.print("Anna opiskelijanumero: ");
        String numero = input.nextLine();
        for (int i = 0; i < opiskelijatList.size(); i++)
            if (opiskelijatList.get(i).getOpiskelijanumero().equals(numero))
                return i;

        System.out.println("Opiskelijaa ei ole numerolla " + numero);
        return -1;
    }


    public static void main(String[] args) {
        Scanner inpiut = new Scanner(System.in);
        OpiskelijaSuoritusSovellus sovellus = new OpiskelijaSuoritusSovellus();
        int valinta = -1;

        do {
            System.out.println("1. Lisää opiskelija ");
            System.out.println("2. Näytä kaikki opiskelijat ");
            System.out.println("3. Näytä opiskelija ");
            System.out.println("4. Lisää suoritus ");
            System.out.println("0. Lopetus");
            System.out.print("Anna valintasi (0-4): ");
            valinta = inpiut.nextInt();

            switch (valinta) {
                case 1:
                    sovellus.lisääOpiskelija();
                    break;

                case 2:
                    sovellus.näytäOpiskelijat();
                    break;

                case 3:
                    sovellus.näytäOpiskelija();
                    break;
                case 4:
                    sovellus.lisääSuoritus();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Valinta oli virheellinen");
            }


        }
        while (valinta != 0);


    }
}

