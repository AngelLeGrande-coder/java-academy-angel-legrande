public class studentmovie {
    public static void main(String[] args) {
        String movieTitle = ("Weapons");
        int friends = 4;
        int mySelf = 1;
        ;
        double pizzaSlicePrice = 4.99;
        boolean hasPopcorn = true;
        double totalPrice = friends * pizzaSlicePrice;

        System.out.println("We are watching " + movieTitle + " tonight with " + friends + " of my friends!" );
        System.out.println("Pizza is about " + pizzaSlicePrice + ".");
        if (hasPopcorn)
        { System.out.println("we got popcorn!");
        } else if(!hasPopcorn)
        { System.out.println("We don't have popcorn yet.");
         }
    }
}

