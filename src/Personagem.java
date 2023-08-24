import java.util.Random;

public class Personagem{
    String nome;
    int nivel;
    int forca;

    // void = não está retornando nada
    public void mostrarStatus(){
        // "Personagem: <nome> (lvl <nivel>) com <forca> de força."
        System.out.format("Personagem: %s (lvl %d) com %d de força.\n", nome, nivel, forca);
    }

    public int calcularDano(){
        Random gerador = new Random();
        // 1..20
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    public void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, forca);
        } else{
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n",
                             nome, habilidade, alvo, danoCausado);
        }
    }
}