public class bitwiseAndRange {

    public int rangeBitwiseAnd(int left, int right) {

        int result = left;
        for(int i = left; i<=right && (result != 0); i++){

            result = result & i;
        }

        return result;
    }
}
