public class Part2 {
    public static void main(String[] args) {
        //Task Number 1
//С помощью условного оператора и конструкции else перепишите программу, которая выводит в консоль:
//поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
//информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        System.out.println("Task Number 1\n");
        int age = 28;
        System.out.println("Человек выбрал, что ему  " + age + "лет");
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Ваш возраст не достиг совершеннолетия, нужно немного подождать!\n");
        }
        // Version 2
        short ageVersion2 = 15;
        System.out.println("Человек выбрал, что ему  " + ageVersion2 + "лет");
        if (ageVersion2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Ваш возраст не достиг совершеннолетия, нужно немного подождать!\n");

//Task Number 2
            System.out.println("Task Number 2\n");
            //
            //
            int schoolAge = 7;
            System.out.println("Если ребенку  " + schoolAge + "  лет");
            if (schoolAge >= 7) {
                System.out.println("может пойти в школу");
            } else {
                System.out.println("Не может пойти в школу");
            }
            int universityAge = 18;
            System.out.println("Если человеку " + universityAge + "  лет");
            if (universityAge >= 18) {
                System.out.println("может поступать в университет");
            } else {
                System.out.println("Не может пойти в  университет");
            }
            int workingAge = 24;
            System.out.println("Если человеку " + workingAge + "  лет");
            if (workingAge >= 24) {
                System.out.println("может искать работу\n");
            } else {
                System.out.println("Не может пойти в школу\n");
            }
            //
            //
            //Task Number 3
            System.out.println("Task Number 3\n");
            //Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест,
            // все остальные – стоячие. С помощью условного оператора и конструкции else перепишите программу,
            // которая выводит в консоль сообщение о том, есть ли место в вагоне:
            // сидячее или стоячее или вагон уже полностью забит.
            int totalCapacity = 102;
            System.out.println("Звпрос на  " + totalCapacity + "  мест");
            if (totalCapacity <= 102) {
                System.out.println("Есть место в вагоне");
                int totalCapacityofTrain = 200;
                System.out.println("Запрос на  " + totalCapacityofTrain + "  мест");
                if (totalCapacityofTrain <= 102) {
                    System.out.println("Есть место в вагоне");
                } else {
                    System.out.println("Вагон забит");
                    int seatPlace = 60;
                    System.out.println("Запрос на  " + seatPlace + "  мест");
                    if (seatPlace <= 60) ;
                    System.out.println("Имеются сидячие места");
                    int seatPlacebooked = 85;
                    System.out.println("Запрос на  " + seatPlacebooked + "  мест");
                    if (seatPlacebooked <= 60) {
                        System.out.println("Имеются сидячие места");
                    } else {
                        System.out.println("Не имеются сидячие места");
                        int standingSeatscapacity = totalCapacity - seatPlace;
                        System.out.println("Если общее количество места  " + totalCapacity + "  и сидячих мест  " + seatPlace + "  , то стоячих мест -  " + standingSeatscapacity);
                        if (standingSeatscapacity <= 42) ;
                        System.out.println("имеются стоячие места");
                        int standingSeatsnumber = 50;
                        System.out.println("Запрос на  " + standingSeatsnumber + "  мест");
                        if (standingSeatsnumber <= 42) {
                            System.out.println("имеются стоячие места");
                        } else {
                            System.out.println("Не имеются стоячие места");
                        }
                    }
                }
            }
        }
    }
}

