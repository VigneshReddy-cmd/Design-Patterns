package Stratergy.withoutstr;

public class GoodsVechile extends Vechile{
    @Override
    public void drive() {
        System.out.print("UNIQUE DRIVE CAPABILITy");
    }
    public static void main(String[] args) {
        GoodsVechile gd=new GoodsVechile();
        gd.drive();
    }
}
