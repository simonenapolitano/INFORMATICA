public class TestGerarchia {
    int max;
    String idMax;
    Pc pc1 = new Pc("PC001", 1500.99, "HP", true, "Windows 11", 8, "RTX 2060");
    Pc pc2 = new Pc("PC002", 1600.99, "HP", true, "Windows 11", 16, "RTX 3070");
    Pc pc3 = new Pc("PC003", 1700.99, "HP", true, "Windows 11", 32, "RTX 4080");
    Pc[] inventario = {pc1, pc2, pc3};
    public TestGerarchia(){
        max = pc1.ramGB;
        for(Pc pc : inventario){
            pc.eseguiBenchmark();
            pc.eseguiProgramma("super Mario");
            if(max < pc.ramGB){
                max = pc.ramGB;
                idMax = pc.getId();
            }
        }
        System.out.println("Il dispositivo con la ram piu' grande ha l'idunivoco di: " +idMax);
    }
    public static void main(String[] args) throws Exception {
        new TestGerarchia();
    }
}
