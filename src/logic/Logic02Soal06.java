package logic;

public class Logic02Soal06 extends BasicLogic {
    public Logic02Soal06(int n) {
        super(n);
    }

    public void isiArray() {
        int tempArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= 1) tempArray[j] = 1;
                else tempArray[j] = tempArray[j - 1] + tempArray[j - 2];

                if (j >= i && j <= n - i - 1
                        || j <= i && j >= n - i - 1) {
                    this.array[i][j] = String.valueOf(tempArray[i]);
                }
            }
        }
    }

    public void cetakArray() {
        this.isiArray();
        this.print();
    }

}
