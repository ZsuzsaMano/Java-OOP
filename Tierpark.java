public class Tierpark {
    public static void main(String[] args){

                int beine = -1;
                boolean flugfähig = false;
                boolean hatFedern =false;
                String gefährlich = "no data";

        switch (args[0]) {
            case "Spinne":
                beine = 8;
                flugfähig = false;
                hatFedern = false;
                gefährlich= "eventuell";
                break;
            case "Hase":
            case "Panda":
                beine = 4;
                flugfähig = false;
                hatFedern = false;
                gefährlich= "harmlos";
                break;
            case "Tiger":
            case "Löwe":
                beine = 4;
                flugfähig = false;
                hatFedern = false;
                gefährlich= "abstand halten";
                break;
            case "Flamingo":
            case "Pelickan":
                beine = 2;
                flugfähig = true;
                hatFedern = true;
                gefährlich= "abstand halten";
                break;
            case "Pinguin":
            case "Strauss":
                beine = 2;
                flugfähig = false;
                hatFedern = true;
                gefährlich= "harmlos";
                break;
            case "Boa":
            case "Klapperschlange":
                beine = 0;
                flugfähig = false;
                hatFedern = false;
                gefährlich= "harmlos";
                break;
        
            default:
               System.out.println("Tier nicht im Zoo Databank");
                break;
        }

        if (gefährlich != "no data"){
            System.out.println(beine + " Beine");
            System.out.println("flugfähig: " + (flugfähig ? "ja": "nein"));
            System.out.println("hat Federn: " + (hatFedern ? "ja": "nein"));   
            System.out.println("gefährlich für Menschen: "+ gefährlich);
        }
    }
    
}
