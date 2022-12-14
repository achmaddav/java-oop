package logic;

public class Logic02Soal05 extends BasicLogic {

    public Logic02Soal05(int n) {
        super(n);
    }

    public void isiArray() {
        int tempArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= 2) tempArray[j] = 1;
                else tempArray[j] = tempArray[j - 1] + tempArray[j - 2] + tempArray[j - 3];

                if (j >= i && j >= n - i - 1
                        || j <= i && j <= n - i - 1) {
                    this.array[i][j] = String.valueOf(tempArray[j]);
                }
            }
        }
    }

    public void cetakArray() {
        this.isiArray();
        this.print();
    }

}
