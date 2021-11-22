public enum AprendendoEnum {
    SEGUNDA(1, "24"), TERCA(2, ""), QUARTA(3,"24"), QUINTA(4,"24"),
    SEXTA(5,"24"), SABADO(6,"24"), DOMINGO(5,"I"), LOJA(1, "F");

    private int origem;
    private String perfil;

    private AprendendoEnum(int origem, String perfil){
        this.origem = origem;
        this.perfil = perfil;
    }

    public int getOrigem(){
        return origem;
    }

    public String getPefil(){
        return perfil;
    }


}
