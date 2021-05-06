public class autor extends pessoa {

    public String nacionalidade;

    public autor(string nome, string nacionalidade)
    {
        super(nome, nacionalidade);
        this.nacionalidade = nacionalidade;
    }
    public String getnacionalidade()
    {
        return nacionalidade;
    }

    public void setnacionalidade (string nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }

}