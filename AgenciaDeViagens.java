import javax.swing.JOptionPane;
public class AgenciaDeViagens {
    static void main() {
        String nome = JOptionPane.showInputDialog("Insira o nome completo do passageiro:");
        String passaporte = JOptionPane.showInputDialog("Insira o número do passaporte:");
        String[] opcoes1 = {"Europa", "Ásia", "Oceania", "África", "América do Norte", "América Central", "América do Sul"};
        String selecao = (String) JOptionPane.showInputDialog(null,
                "Escolha um destino:",
                "Destino",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes1,
                opcoes1[0]);
        Double valorbase = (double) 0;
        if (selecao == "Europa"){
            valorbase = 5000.0;
        } else if (selecao == "Ásia"){
            valorbase = 6000.0;
        } else if (selecao == "Oceania"){
            valorbase = 7000.0;
        } else if (selecao == "América do Norte"){
            valorbase = 3000.0;
        } else if (selecao == "América do Sul"){
            valorbase = 1500.0;
        } else if (selecao == "América Central"){
            valorbase = 2500.0;
        } else if (selecao == "África"){
            valorbase = 5000.0;
        }
        String[] opcoes2 = {"Econômica", "Executiva", "Primeira Classe"};
        String classe = "";
        Double multiplicador = 0.0;
        int escolha = JOptionPane.showOptionDialog( null,
                "Escolha a classe da viagem:",
                "Classe",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes2,
                opcoes2[0]);
        if (escolha == 0){
            classe = "Econômica";
            multiplicador = 1.0;
        } else if (escolha == 1){
            classe = "Executiva";
            multiplicador = 1.5;
        } else if (escolha == 2){
            classe = "Primeira classe";
            multiplicador = 2.0;
        }
        Double valortotal = valorbase * multiplicador;
        JOptionPane.showMessageDialog(null,
                "Nome Completo do passageiro: " + nome + "\nNúmero do passaporte: " + passaporte + "\nDestino da viagem: " + selecao + "\nClasse da viagem: " + classe + "\nValor total estimado: R$" + valortotal);
    }

}
