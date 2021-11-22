public enum TipoDocumentos {
    CPF{
        @Override
        protected String cpf() {
            return null;
        }

        public String geraNumeroTeste(){
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ{
        public String geraNumeroTeste(){
            return GeraCpfCnpj.cnpj();
        }
    }, GeraCpfCnpj {
        @Override
        protected String cpf() {
            return null;
        }

        @Override
        public String geraNumeroTeste() {
            return null;
        }
    };

    protected abstract String cnpj();

    protected abstract String cpf();

    public abstract String geraNumeroTeste();

}
