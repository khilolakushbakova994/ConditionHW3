public class Part3 {
    public static void main(String[] args) {
        //Task Number 1
        System.out.println("Task Number 1\n");
int ageOfperson = 25;
        System.out.println("Человеку   " + ageOfperson + "  лет");
        if (ageOfperson >= 2 && ageOfperson<6) {
            System.out.println("Если возраст человека равен  " +ageOfperson + "   нужно ходить в детский сад");
        }else if (ageOfperson >= 7 && ageOfperson <18) {
            System.out.println("Если возраст человека равен  " +ageOfperson + "   нужно ходить в школу");
        } else if (ageOfperson > 18 && ageOfperson < 24) {
            System.out.println("Если возраст человека равен  " +ageOfperson + "   нужно идти в университет");
        } else if (ageOfperson > 24) {
            System.out.println("Если возраст человека равен  " +ageOfperson + "   нужно идти на работу\n");
            //Task Number 2
            System.out.println("Task Number 2\n");
            //
            //
            int ageOfkid = 10;
            System.out.println("Ребенку   " + ageOfkid + "  лет");
            if (ageOfkid< 5) {
                System.out.println("Ребенку меньше 5 лет, то он не может кататься на аттракционе");
            } else if (ageOfkid >= 5 && ageOfkid <14) {
                System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            }else if (ageOfkid > 14) {
                System.out.println("может кататься без сопровождения взрослого\n") ;

            //Task Number 3
                //
                System.out.println("Task Number 3\n");
                int one = 7;
                int two = 15;
                int three = 27;
                if (one > two && one > three) {
                    System.out.println("число  " + one + "больше других");
                } else if (two > three && two > one) {
                    System.out.println("число  " + two + "больше других");
                } else if ( three > one && three > two) {
                    System.out.println("число  " + three + "больше других");
                } else {
                    System.out.println("Все числа равны");
                }
            }
        }
    }
}
