package sistemadereservas;

public class Reserva {
    private final int id;
    private final int idSala;
    private final String responsavel;
    private final String data;
    private final String horario;

    public Reserva(int id, int idSala, String responsavel, String data, String horario) {
        this.id = id;
        this.idSala = idSala;
        this.responsavel = responsavel;
        this.data = data;
        this.horario = horario;
    }

    public Reserva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public int getIdSala() {
        return idSala;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public void setId(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setResponsavel(String joão_Silva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setHorario(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}