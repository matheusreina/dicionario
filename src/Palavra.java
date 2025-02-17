public class Palavra {
    private String palavra;
    private String definicao;

    public Palavra(String palavra, String definicao) {
        this.setPalavra(palavra);
        this.setDefinicao(definicao);
    }

    @Override
    public String toString() {
        return "{ "+getPalavra()+" | \""+getDefinicao()+"\" }";
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDefinicao() {
        return definicao;
    }

    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
}
