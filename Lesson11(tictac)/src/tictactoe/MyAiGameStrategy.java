package tictactoe;

/**
 * Created by DyXx on 22.03.2017.
 */
public class MyAiGameStrategy implements AiGameStrategy{

    @Override
    public int aiMakeTurn(int[] field) {
        int toPlace = 0;
        for (int i = 0 ;i<field.length;i++){
            if (field[i]==0){
                return i;
            }
        }
        return toPlace;
    }
}
