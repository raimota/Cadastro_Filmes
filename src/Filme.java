
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Filme{
    private String titulo, diretor, genero, pais;
    private int ano;
    JLabel p5;
    // End of variables declaration
    JLabel p1;
    JLabel p3;
    JLabel p2;
    JLabel p4;

    public Filme(String titulo, String diretor, String genero, String pais, int ano) {
        if(ano >= 1895){
            this.setTitulo(titulo);
            this.setDiretor(diretor);
            this.setGenero(genero);
            this.setPais(pais);
            this.setAno(ano);
        }
        else{
            titulo = null;
            diretor = null;
            genero = null;
            pais = null;
            ano = -1;
        }
                      
    }
    public Filme(){}

    @Override
    public String toString() {
        return titulo + ", diretor: " + diretor + ", gênero: " + genero + ", " + pais + ", " + ano;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getDiretor() {
        return diretor;
    }

    private void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        this.genero = genero;
    }

    private String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    public int getAno() {
        return ano;        
    }

    public void setAno(int ano) {
        int anoAtual =  LocalDate.now().getYear();
        if(ano >= 1895 && ano <= anoAtual)
            this.ano = ano;
        else JOptionPane.showMessageDialog(null, "Ano Inválido!", "Aviso", JOptionPane.ERROR_MESSAGE);
    }   
    
}
