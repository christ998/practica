package practica.modelo;

import javax.persistence.Id;

public class Dato {
    @Id
    private String id;

    private String timeStamp;

    private int turbidez;

    private int presion;
   
    private int caudal;

    private String nivel;

    public Dato() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTurbidez() {
        return turbidez;
    }

    public void setTurbidez(int turbidez) {
        this.turbidez = turbidez;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public void setCaudal(int caudal){
	this.caudal = caudal;
    }

    public int getCaudal(){
	return caudal;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
