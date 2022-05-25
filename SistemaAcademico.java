//Crie um sistema que armazene dados do aluno e do professor.

//Exemplo de classe e objeto

package sistemaacademico;

//Classe principal do programa

public class SistemaAcademico {
 
    public static void main(String[] args) {
     
        //Tela inicial do sistema       
        System.out.println("***** SISTEMA ACADÊMICO *****");
        System.out.println("\n Dados do Aluno");
        
        //Criando objeto
        Aluno aluno1 = new Aluno(); 
        
        //Acessando o atributo da classe aluno
        aluno1.nome = "Eilen";
        aluno1.endereco = "Rua X, Nº X, Bairro X, Sao Paulo-SP";
        aluno1.telefone = "(XX) XXXXX-XXXX";
        aluno1.email = "eilen@gmail.com";
        
        //Acessando o método da classe aluno
        aluno1.exibir(); 
        
        System.out.println("\nGrade Curricular");
 
        //Adicionando um professor e disciplina 
        Professor grade = new Professor();
        grade.nome = "Ryan";
        grade.disciplina = "Programação Orientada a Objetos em Java";
        grade.nota = "";
        
        //Acessando o método da classe grade
        grade.exibir();
    }
    
}
