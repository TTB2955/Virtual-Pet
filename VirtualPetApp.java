import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to The Virtual Pet!");

        System.out.println("Enter the name of your pet:");
        String petName = input.nextLine();

        VirtualPet pet = new VirtualPet(petName);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n" + pet.getName());
            System.out.println("Hunger:" + pet.getHunger());
            System.out.println("Thirst:" + pet.getThirst());
            System.out.println("Waste:" + pet.getWaste());
            System.out.println("Boredom:" + pet.getBoredom());
            System.out.println("Sickness:" + pet.getSickness());

            System.out.println("\nWhat do your pet need?");
            System.out.println("1. Feed" + pet.getName());
            System.out.println("2. Water" + pet.getName());
            System.out.println("3. Pick up" + pet.getName() + "poop");
            System.out.println("4. Play with" + pet.getName());
            System.out.println("5. Take" + pet.getName() + "to the Vet");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    pet.feed();
                    System.out.println("You fed" + pet.getName() + ".");
                    break;

                case 2:
                    pet.water();
                    System.out.println("You watered" + pet.getName() + ".");
                    break;

                case 3:
                    pet.waste();
                    System.out.println("You cleaned" + pet.getName() + "waste.");
                    break;

                case 4:
                    pet.play();
                    System.out.println("You played with" + pet.getName() + ".");
                    break;

                case 5:
                    pet.takeToDoctor();
                    System.out.println("You took" + pet.getName() + "to the Vet");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            pet.tick();

            if (pet.getHunger() >= 150 || pet.getThirst() >= 150 || pet.getWaste() >= 150 || pet.getBoredom() >= 150
                    || pet.getSickness() >= 150) {
                System.out.println(pet.getName() + "is no longer satisfied. Game over!!");
                exit = true;
            }
        }

        input.close();
    }
}
