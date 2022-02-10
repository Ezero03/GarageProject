public class Car {
    
    private String marca, model, matricula;
    private int gascapacity, gasactual, gasconsumida, kmtotals, kmreinici, kmoli, kmrodes;

    public Car(){
        this.marca = "";
        this.model = "";
        this.matricula = "";
        this.gascapacity = 0;
        this.gasactual = 0;
        this.gasconsumida = 0;
        this.kmtotals = 0;
        this.kmreinici = 0;
        this.kmoli = 0;
        this.kmrodes = 0;
    }

    public Car(String marca, String model, String matricula, int gascapacity, int gasactual, int gasconsumida, int kmtotals, int kmreinici, int kmoli, int kmrodes){
        this.marca = marca;
        this.model = model;
        this.matricula = matricula;
        this.gascapacity = gascapacity;
        this.gasactual = gasactual;
        this.gasconsumida = gasconsumida;
        this.kmtotals = kmtotals;
        this.kmreinici = kmreinici;
        this.kmoli = kmoli;
        this.kmrodes = kmrodes;
    }

    public String getMarca(){
        return this.marca;
    }

    public String setMarca(){
        if(this.marca.equals("")){
            return this.marca = marca;
        }
    }

    public String getModel(){
        return this.model;
    }

    public String setModel(){
        if(this.model.equals("")){
            return this.model = model;
        }
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String setMatricula(){
        if(this.matricula.equals("")){
            return this.matricula = matricula;
        }
    }

    public String getGasCapacity(){
        return this.gascapacity;
    }

    public String setGasCapacity(){
        if(this.gascapacity.equals(0)){
            return this.gascapacity = gascapacity;
        }
    }

    public String getKmTotals(){
        return this.kmtotals;
    }

    public String setKmTotals(){
        if(this.kmtotals.equals(0)){
            return this.kmtotals = kmtotals;
        }
    }
}
