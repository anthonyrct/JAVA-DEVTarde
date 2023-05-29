package POOIntroducao;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        // criar 3 objetos ResgistraAluno
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno carlos = new RegistraAluno();
        Alunos aluno1 = new Alunos();
        //Pessoas pessoa1 = new Pessoas(); não pode instanciar objeto
        // classe pessoas é abstract

        //objeto aluno1 - classe alunos
        aluno1.setEndereco(null);
        aluno1.setNome(null);

        //objeto pessoa1 - classe Pessoas
        //pessoa1.setEndereco(null);
        
        //altera as informações com o set
        ana.setNome("Ana Machado");
        ana.setEndereco("Rua das Flores, 123");
        ana.setIdade(29);
        ana.setNotaCiencias(9.5);
        ana.setNotaMatematica(8.3);
        ana.setNotaPortugues(7.5);

        beto.setNome("Roberto da Silva");
        carlos.setNome("Carlos Alberto");
        
        //printa com as informações com o get(acessa as informações)
        System.out.println("Nome:"+ana.getNome());
        System.out.println(ana.getEndereco());
        System.out.println(ana.getIdade());
        System.out.println(ana.getMedia());
        System.out.println("=================");
        System.out.println("Contador: "
                + RegistraAluno.getQuantidadeAlunos());
        System.out.println("++++++++++++++++++++++++++");

        Alunos aluno1 = new Alunos();
        aluno1.setNome("Alberto");
        System.out.println(aluno1.getNome());
    }
}
