import java.util.Scanner;

public class LAB01_Question3 {
    
    public static void main(String[] args) {

        int calorie_to_maintain;
        int calorie_to_lose1kg;
        int daily_deficit_of_calories;
        double recommended_daily_calorie_to_lose;
        int carbohydrate_percantage;
        double recommended_calories_carbohydrate;
        int fat_percantage;
        int protein_percantage;
        double recommended_calories_protein;
        double recommended_calories_fat;
        double carbohydrate_per_gram;
        double fat_per_gram;
        double protein_per_gram;
        double grams_carbohydrate;
        double grams_fat;
        double grams_protein;




        Scanner myScan = new Scanner (System.in);

        System.out.print("Enter kilograms to lose: ");

        int kilogram_to_lose = myScan.nextInt();

        System.out.print("Enter days to lose " + kilogram_to_lose + " kilograms: ");

        int days = myScan.nextInt();

        myScan.close();

        calorie_to_maintain = 2000;
        calorie_to_lose1kg = 7700;
        carbohydrate_percantage = 50;
        fat_percantage = 30;
        protein_percantage = 20;
        carbohydrate_per_gram = 4;
        fat_per_gram = 9;
        protein_per_gram = 4;

        daily_deficit_of_calories = (calorie_to_lose1kg * kilogram_to_lose) / days;

        recommended_daily_calorie_to_lose = calorie_to_maintain - daily_deficit_of_calories;
        recommended_calories_carbohydrate = recommended_daily_calorie_to_lose * carbohydrate_percantage / 100;
        recommended_calories_fat = recommended_daily_calorie_to_lose * fat_percantage / 100;
        recommended_calories_protein = recommended_daily_calorie_to_lose * protein_percantage / 100;


        grams_carbohydrate = recommended_calories_carbohydrate / carbohydrate_per_gram;
        grams_fat = recommended_calories_fat / fat_per_gram;
        grams_protein = recommended_calories_protein / protein_per_gram;

        System.out.println("***********************************************************************************************");

        System.out.println("To lose " + kilogram_to_lose + " kilograms in " + days + " days you will need a daily deficit of " + daily_deficit_of_calories + " calories.");

        System.out.println("***********************************************************************************************");

        System.out.print("RECOMMENDED DAILY CALORIES TO LOSE " + kilogram_to_lose + " KILOS IN " + days + " DAYS: ");
        System.out.printf("%.0f %n", recommended_daily_calorie_to_lose);

        System.out.println("***********************************************************************************************");

        System.out.printf("MACRO           RECOMMENDED PERCENT   CALORIES PER GRAM       RECOMMENDED CALORIES        GRAMS %n");
        System.out.printf("CARBOHYDRATE                    %d%s                   %.0f                        %.0f        %.1f %n", carbohydrate_percantage,'%',carbohydrate_per_gram,recommended_calories_carbohydrate,grams_carbohydrate);
        System.out.printf("FAT                             %d%s                   %.0f                        %.0f         %.1f %n", fat_percantage, '%',fat_per_gram,recommended_calories_fat,grams_fat);
        System.out.printf("PROTEIN                         %d%s                   %.0f                        %.0f         %.1f %n", protein_percantage,'%',protein_per_gram,recommended_calories_protein,grams_protein);

        System.out.println("***********************************************************************************************");


}

}