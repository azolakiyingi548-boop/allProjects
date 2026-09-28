public class ProductSales implements IProductSales{
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        for( int i = 0; i < productSales.length; i++){
            for(int j = 0; j < productSales[i].length; j++){
                total += productSales[i][j];
            }
        }
        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {
        double ave = 0;
        for(int i = 0; i < productSales.length; i++){
            for (int j = 0; j < productSales[i].length; j++) {
                ave += productSales[i][j];
            }
        }
        double average = Math.round((double) ave/6);
        return average;
    }

    @Override
    public int MaxSales(int[][] productSales) {
        int MaxSales = productSales[0][0];
        for(int i = 0; i < productSales.length; i++){
            for (int j = 0; j < productSales[i].length; j++) {
                if (MaxSales < productSales[i][j]){
                    MaxSales = productSales[i][j];
                }
            }
            }

        return MaxSales;
    }

    @Override
    public int MinSales(int[][] productSales) {
        int MinSales = productSales[0][0];
        for(int i = 0; i < productSales.length; i++){
            for (int j = 0; j < productSales[i].length; j++) {
                if(MinSales > productSales[i][j]){
                    MinSales = productSales[i][j];
                }
            }
        }
        return MinSales;
    }
}

