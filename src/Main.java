
//1. Susikurti neigiamų ir teigiamų skaičių masyvą ir atspausdinti jo elementus bei jų kiekį ciklo pagalba
//2. Suskaičiuoti neigiamų elementų kiekį*.
//3. Suskaičiuoti teigiamų elementų sumą ir sandaugą*.
//4. Sukurti funkciją, grąžinančią teigiamus masyvo elementus ir juos atspausdinti*:
//  int[] gautiTeigiamusMasyvoElementus(int[] masyvas)
public class Main {
    public static void main(String[] args) {
        System.out.println("Masyve esantys elementai:");

        int[] skaiciai = {3, 4, 8, -9, 27};
        int[] skaiciai2 = {3, -7, 4, 8, -9, 27};
        spausdintiMasyvoElementus( skaiciai);
        spausdintiMasyvoElementuKieki(skaiciai);
        System.out.println("\nNeigiamų elementų kiekis masyve: "+gautiNeigiamuMasyvoElementuKieki(skaiciai));
        System.out.println("Teigiamų elementų suma masyve: "+ gautiTeigiamuMasyvoElementuSuma(skaiciai));
        System.out.println("Teigiamų elementų sandauga masyve: "+ gautiTeigiamuMasyvoElementuSandauga(skaiciai));
        System.out.print("Pateikiamas naujas masyvas sudarytas iš teigiamų elementų duoto masyvo: ");
        spausdintiMasyvoElementus(gautiTeigiamusMasyvoElementus(skaiciai));
    }
    static void spausdintiMasyvoElementus(int masyvas[]) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(masyvas[i] + ", ");
        }
    }

    static void spausdintiMasyvoElementuKieki(int masyvas[]) {
        System.out.print("\nMasyvo elementų kiekis " + masyvas.length);
    }

    static int gautiNeigiamuMasyvoElementuKieki(int masyvas[]) {
        int j = 0; // kiekis neigiamų elementų
        for (int i = 0; i< masyvas.length; i++) {
            if (masyvas[i] < 0) {
                j = j + 1;
            }
        }
        return j;
    }
    static int gautiTeigiamuMasyvoElementuKieki(int masyvas[]) {
        int j = 0; // teigiamų elementų kiekis
        for(int i=0;i<masyvas.length;i++){
            if(masyvas[i]>0){
                j=j+1;
            }
        }
        return j;
    }
    static int gautiTeigiamuMasyvoElementuSuma(int masyvas[]) {
        int j = 0; // suma
        for (int i = 0; i< masyvas.length; i++) {
            if (masyvas[i] > 0) {
                j = j + masyvas[i];
            }
        }
        return j;
    }
    static int gautiTeigiamuMasyvoElementuSandauga(int masyvas[]) {
        int j = 1;
        for (int i = 0; i< masyvas.length; i++) {
            if (masyvas[i] > 0) {
                j = j * masyvas[i];
            }
        }
        return j;
    }
    static int[] gautiTeigiamusMasyvoElementus(int[] masyvas){
        int k = gautiTeigiamuMasyvoElementuKieki(masyvas); // teigiamų elementų kiekis
        int n=0;
        int j[]=new int[k];// naujas masyvas
        for (int i = 0; i< masyvas.length; i++) {
            if (masyvas[i] > 0) {
               j[n] = masyvas[i];
               n=n+1;
            }
        }
        return j;

    }
}

