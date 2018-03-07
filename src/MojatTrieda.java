public class MojatTrieda implements ZajacieUsi {

    public int zajacieUsi(int pocetZajacov) {
        int pocet_usi = 0;


    for(int i=1;i<5;i++)
        {
            if (pocetZajacov == i) pocet_usi = pocet_usi + 2;
            else if (pocetZajacov == i + 1) pocet_usi = pocet_usi + 3;

        }

        return pocet_usi;

    }
}