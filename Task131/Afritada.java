package Task131;

    class Afritada {
        public void showIngredients() {
            String[] Ingredients = {"Tomato Sauce","Meat"};
            System.out.println("Afritada = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
        }
    }
// extend Afritada Class here



//    class Caldereta extends Afritada {
//        public void showIngredients() {
 //           String[] Ingredients =
 //                   {"Tomato Sauce",
 //                           "Meat",
 //                           "Potatoes & Carrots",
 //                           "Tomato Paste",
 //                           "Liver Spread",
 //                           "Raisins",
 //                           "Hotdog",
 //                           "Siling Labuyo",
 //                           "Cheese"};
 //           System.out.println("Caldereta = "+java.util.Arrays.toString(Ingredients)+"🍲 \n");
 //       }
//    }

    class Mechado extends Afritada {
        public void showIngredients() {
            String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes and Carrots", "Tomato Paste"};
            System.out.println("Mechado = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
        }
    }
class Menudo extends Afritada {

   public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes and Carrots",
                "Liver Spread" , "Raisins", "Hotdog"};
        System.out.println("Menudo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

class Caldereta extends Afritada {

    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat", "Potatoes and Carrots",
               "Tomato Paste", "Liver Spread" , "Raisins", "Hotdog", "Cheese"};
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}