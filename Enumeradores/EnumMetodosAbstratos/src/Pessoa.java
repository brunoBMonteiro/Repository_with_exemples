public class Pessoa {

    private TipoDocumentos tipoDocumentos;
    private String numeroDocumentos;

    public Pessoa() {
    }

    public Pessoa(TipoDocumentos tipoDocumentos, String numeroDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
        this.numeroDocumentos = numeroDocumentos;
    }

    public TipoDocumentos getTipoDocumentos() {
        return tipoDocumentos;
    }

    public void setTipoDocumentos(TipoDocumentos tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }

    public String getNumeroDocumentos() {
        return numeroDocumentos;
    }

    public void setNumeroDocumentos(String numeroDocumentos) {
        this.numeroDocumentos = numeroDocumentos;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "tipoDocumentos=" + tipoDocumentos +
                ", numeroDocumentos='" + numeroDocumentos + '\'' +
                '}';
    }
}
