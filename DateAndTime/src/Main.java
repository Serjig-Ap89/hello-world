public class Main {
    public static void main(String[] args){
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 50;
        boolean hasDiscount = false;

        double fuel92Price = 60.2;
        double fuel95Price = 67.33;

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92Price;

        }
        else if(fuelType == 95) {
            fuelPrice = fuel95Price;

        } else {
            System.out.println("Указан неверный тип топлева");

        }
        if (hasDiscount){
            System.out.println("Указано слишком мало колличество топлева");
            amount = 0;
        }
        System.out.println(" Цена выбраного топлева:" + fuelPrice + "руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки:" + totalPrice + "руб.");

        }



    }




