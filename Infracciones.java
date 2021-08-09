package clase33plus;

public enum Infracciones {
    LEVE("1 día"), SIMPLE("3 dias"), GRAVE("1 mes"), PERMABAN("para siempre");

    private String tiempo;

    Infracciones(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }
}
