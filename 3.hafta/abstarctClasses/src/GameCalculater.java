public abstract class GameCalculater {
    public abstract void hesapla();
//abstract classlar Anne classda bir işlem yaptırmaz.Sadece işlemin olması gerektriğini belirtiriz.
//Çocuklar için ayrı ayrı hesapla yazmamız gerekecektir.
    public void gameOver(){
        System.out.println("Oyun bitti");
    }
}
