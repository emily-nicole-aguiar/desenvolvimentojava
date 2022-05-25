//Exemplo de classe e objeto

package sistemaacademico;

//Classe principal do programa

public class SistemaAcademico {
 
    public static void main(String[] args) {
        
        System.out.println("***** SISTEMA ACADÊMICO *****");
        System.out.println("\n Dados do Aluno");
        
        //Criando objeto
        Aluno aluno1 = new Aluno(); 
        
        //Acessando o atributo da classe aluno
        aluno1.nome = "Emily Nicole Aguiar Nepomuceno";
        aluno1.endereco = "Rua X, Nº X, Bairro X, Manaus-AM";
        aluno1.telefone = "(XX) XXXXX-XXXX";
        aluno1.email = "emilyaguiar@gmail.com";
        
        //Acessando o método da classe aluno
        aluno1.exibir(); 
        
        System.out.println("\nGrade Curricular");
 
        
        Professor grade = new Professor();
        grade.nome = "Leandro Reis Fonseca";
        grade.disciplina = "Programação Orientada a Objetos em Java";
        grade.nota = "";
                
        grade.exibir();
    }
    
}
