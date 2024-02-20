package RPG.life;

public class Merchant implements Seller {
    @Override
    public String sell(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result = "potion";
        }
        return result;
    }

    // TODO покупка у игрока

    public enum Goods {
        POTION
    }
}
