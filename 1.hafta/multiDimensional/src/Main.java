public class Main {
    public static void main(String[] args){

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Gaziantep";
        sehirler[0][2] = "adana";
        sehirler[1][0] = "ankara";
        sehirler[1][1] = "İzmir";
        sehirler[1][2] = "kayseri";
        sehirler[2][0] = "trabzon";
        sehirler[2][1] = "malatya";
        sehirler[2][2] = "elazığ";

        for (int i= 0; i < 3; i++){
            System.out.println("------------------");
            for (int j = 0; j < 3; j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
