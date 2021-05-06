public class main {

    public static void main(string[] args) {

        Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");

        System.out.println("O nome do autor é: " + autor1.nome + "A nacionalidade é: " + autor1.nacionalidade);

        Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");

        System.out.println("O nome do autor é: " + autor2.nome + "A nacionalidade é: " + autor2.nacionalidade);

        Aluno aluno = new Aluno("Duda", "3130");

        System.out.println("O nome do aluno é: " + aluno.nome + "O codigo do aluno é: " + aluno.codigo);

        Professor professor = new Professor("Andre", "3131");

        System.out.println("O nome do professor é: " + professor.nome + "O codigo do professor é: " + professor.codigo);

        Livro livro1 = new Livro("O nome do Livro é: " " Uma breve historia do tempo ",autor1);
        Livro1.emprestadoPor = aluno;

        System.out.println("O nome do livro é: " + livro1.nome + "O nome do autor é: " + autor1.nome);
        System.out.println("emprestador Por:" + "+livro1.emprestadoPor.nome");

        Livro livro2 = new Livro("O nome do livro é: " "os 7 habitos das pessoas altamente eficazes", autor2);

        Livro2.emprestadoPor = professor;

        System.out.println("O nome do livro é: " + livro2.nome + "O nome do autor é: " + autor2.nome);
        System.out.println("emprestado por:" + "livro2.emprestadoPor.nome");  

        }
 }

