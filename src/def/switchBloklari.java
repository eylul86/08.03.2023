package def;

public class switchBloklari {

    public static void main(String[] args) {

        char grade='H';

        switch (grade) {

            case 'A':


                System.out.println("mukemmel Gectiniz");
                break;
                case 'B':

                    System.out.println("cok guzel gectiniz");
                    break;

                    case 'C':
                        System.out.println("iyi gectiniz");
                        break;

                        case 'D':
                            System.out.println("fena degıl gectınız");
                            break;

                            case 'F':
                                System.out.println("Maalesef Kaldiniz");
                                break;
            default:
                System.out.println("gecersiz not girdiniz");

        }


    }
}
