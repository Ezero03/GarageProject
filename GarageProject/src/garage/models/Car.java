public class Car {
    
    private String marca, model, matricula;
    private int gascapacity, gasactual, gasconsumida, kmreinici, kmoli, kmrodes;

    public Car(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        this.gascapacity = 0;
        this.gasactual = 0;
        this.gasconsumida = 0;
        this.kmreinici = 0;
        this.kmoli = 0;
        this.kmrodes = 0;
    }

    public Car(String marca, String model, String matricula, int gascapacity, int gasactual, int gasconsumida, int kmreinici, int kmoli, int kmrodes){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.gascapacity = gascapacity;
        this.gasactual = gasactual;
        this.gasconsumida = gasconsumida;
        this.kmreinici = kmreinici;
        this.kmoli = kmoli;
        this.kmrodes = kmrodes;
    }

    public String getModel(){
        return this.model;
    }

    public String setModel(){
        if(this.model.equals("")){
            return this.model = model;
        }
    }
}
