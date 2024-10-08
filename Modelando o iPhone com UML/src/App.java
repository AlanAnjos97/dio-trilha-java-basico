import com.iphone.iphone;


public class App {
    public static void main(String[] args) throws Exception {
        
        iphone telefone = new iphone();

        telefone.adicionarNovaAba();
        telefone.exibirPagina("https://github.com/AlanAnjos97/dio-trilha-java-basico/tree/main/Modelando%20o%20iPhone%20com%20UML");
        telefone.atualizarPagina();
        telefone.atender();
        telefone.ligar("075911112222");
        telefone.iniciarCorreioVoz();
        telefone.selecionarMusica("Florentina - Tiririca");
        telefone.tocar();
        telefone.pausar();

    }
}
