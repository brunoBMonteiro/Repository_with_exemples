public class TesteEnum {
    public static void main(String[] args) {
        AprendendoEnum.LOJA.getOrigem();
        System.out.println(Enum.valueOf(AprendendoEnum.class, "DOMINGO"));
    }
}
