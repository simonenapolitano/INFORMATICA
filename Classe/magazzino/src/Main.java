public class Main {
    Prodotti[] prodotti = new Prodotti[7];
    int max=0, min, tot=0, numprod=0, i=0, indexmax, indexmin;
    Main(){
        prodotti[0] = new Prodotti("Pasta", 12);
        prodotti[1] = new Prodotti("Riso", 8);
        prodotti[2] = new Prodotti("Biscotti", 4);
        prodotti[3] = new Prodotti("Latte", 0);
        prodotti[4] = new Prodotti("Uova", 20);
        prodotti[5] = new Prodotti("Pane", 3);
        prodotti[6] = new Prodotti("Farina", 6);
        min = prodotti[0].getScorta();
        for(Prodotti prodotto : prodotti){
            tot += prodotto.getScorta();
            if(prodotto.getScorta()>max){
                max = prodotto.getScorta();
                indexmax = i;
            } else if(prodotto.getScorta()<min){
                min = prodotto.getScorta();
                indexmin = i;
            } else if(prodotto.getScorta()<5){
                numprod++;
            }
            System.out.println("|Indice: " + i + "| |Prodotto: " + prodotto.getNome() + "| |Scorta: " + prodotto.getNome() + "|");
            i++;
        }
        System.out.println("|Prodotto con scorta più alta: " + prodotti[indexmax].getNome() + "| |Scorta: " + prodotti[indexmax].getScorta() + "|");
        if(prodotti[indexmin].getScorta() !=0){
            System.out.println("|Prodotto con scorta più bassa: " + prodotti[indexmin].getNome() + "| |Scorta: " + prodotti[indexmin].getScorta() + "|");
        } else{
            System.out.println("|Prodotto con scorta più bassa: " + prodotti[indexmin].getNome() + "| |Scorta: " + prodotti[indexmin].getScorta() + " (esaurito)|");
        }
        
    }
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
