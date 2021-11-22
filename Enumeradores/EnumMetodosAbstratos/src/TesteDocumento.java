public class TesteDocumento {
    public static void main(String[] args) {
        for (TipoDocumentos doc: TipoDocumentos.values()
             ) {
                System.out.println(doc + " - " + doc.geraNumeroTeste());
        }
    }
}
