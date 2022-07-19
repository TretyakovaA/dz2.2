public class Comparison {

    public void Best (Gryffindor [] gryffindors, String student1, String student2){
        int sumPoints1 = 0;
        int sumPoints2 = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors [i];
            if (gryffindor.getName().equals(student1))
                sumPoints1 = gryffindor.getBravery()+ gryffindor.getHonour()+ gryffindor.getNobility();
            if (gryffindor.getName().equals(student2))
                sumPoints2 = gryffindor.getBravery()+ gryffindor.getHonour()+ gryffindor.getNobility();

        }
        if (sumPoints1> sumPoints2)
            System.out.println("Первый студент "+student1 +" имеет больше очков "+ sumPoints1+ " чем второй студент " + student2+" "+ sumPoints2);
        else
            System.out.println("Второй студент "+student2 +" имеет больше очков "+ sumPoints2+ " чем первый студент " + student1+" "+ sumPoints1);
    }
    public void Best (Slytherin [] slytherins, String student1, String student2){
        int sumPoints1 = 0;
        int sumPoints2 = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins [i];
            if (slytherin.getName().equals(student1))
                sumPoints1 = slytherin.getCunning()+ slytherin.getResourcefulness()+slytherin.getLustForPower()+ slytherin.getDetermination();
            if (slytherin.getName().equals(student2))
                sumPoints2 = slytherin.getCunning()+ slytherin.getResourcefulness()+slytherin.getLustForPower()+ slytherin.getDetermination();

        }
        if (sumPoints1> sumPoints2)
            System.out.println("Первый студент "+student1 +" имеет больше очков "+ sumPoints1+ " чем второй студент " + student2+" "+ sumPoints2);
        else
            System.out.println("Второй студент "+student2 +" имеет больше очков "+ sumPoints2+ " чем первый студент " + student1+" "+ sumPoints1);
    }
    public void Best (Ravenclaw [] ravenclaws, String student1, String student2){
        int sumPoints1 = 0;
        int sumPoints2 = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws [i];
            if (ravenclaw.getName().equals(student1))
                sumPoints1 = ravenclaw.getCreative()+ravenclaw.getWitty()+ravenclaw.getWise();
            if (ravenclaw.getName().equals(student2))
                sumPoints2 = ravenclaw.getCreative()+ravenclaw.getWitty()+ravenclaw.getWise();

        }
        if (sumPoints1> sumPoints2)
            System.out.println("Первый студент "+student1 +" имеет больше очков "+ sumPoints1+ " чем второй студент " + student2+" "+ sumPoints2);
        else
            System.out.println("Второй студент "+student2 +" имеет больше очков "+ sumPoints2+ " чем первый студент " + student1+" "+ sumPoints1);
    }
    public void Best (Hufflepuff [] hufflepuffs, String student1, String student2){
        int sumPoints1 = 0;
        int sumPoints2 = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs [i];
            if (hufflepuff.getName().equals(student1))
                sumPoints1 = hufflepuff.getDedication()+ hufflepuff.getHardworking()+ hufflepuff.getHonour();
            if (hufflepuff.getName().equals(student2))
                sumPoints2 = hufflepuff.getDedication()+ hufflepuff.getHardworking()+ hufflepuff.getHonour();

        }
        if (sumPoints1> sumPoints2)
            System.out.println("Первый студент "+student1 +" имеет больше очков "+ sumPoints1+ " чем второй студент " + student2+" "+ sumPoints2);
        else
            System.out.println("Второй студент "+student2 +" имеет больше очков "+ sumPoints2+ " чем первый студент " + student1+" "+ sumPoints1);
    }

    public void generalSkills (Ravenclaw [] ravenclaws, Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Slytherin [] slytherins, String student1, String student2) {
        int i = 0;
        int magic1 = 0;
        int magic2 = 0;
        int distance1 = 0;
        int distance2 = 0;
        for (i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            if (ravenclaw.getName().equals(student1)) {
                magic1 = ravenclaw.getMagic();
                distance1 = ravenclaw.getDistance();
            }
            if (ravenclaw.getName().equals(student2)) {
                distance2 = ravenclaw.getDistance();
                magic2 = ravenclaw.getMagic();
            }
        }
        for (i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            if (gryffindor.getName().equals(student1)) {
                magic1 = gryffindor.getMagic();
                distance1 = gryffindor.getDistance();
            }
            if (gryffindor.getName().equals(student2)) {
                distance2 = gryffindor.getDistance();
                magic2 = gryffindor.getMagic();
            }
        }

            for (i = 0; i < slytherins.length; i++) {
                Slytherin slytherin = slytherins[i];
                if (slytherin.getName().equals(student1)) {
                    magic1 = slytherin.getMagic();
                    distance1 = slytherin.getDistance();
                }
                if (slytherin.getName().equals(student2)) {
                    distance2 = slytherin.getDistance();
                    magic2 = slytherin.getMagic();
                }
            }
        for (i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            if (hufflepuff.getName().equals(student1)) {
                magic1 = hufflepuff.getMagic();
                distance1 = hufflepuff.getDistance();
            }
            if (hufflepuff.getName().equals(student2)) {
                distance2 = hufflepuff.getDistance();
                magic2 = hufflepuff.getMagic();
            }
        }
                if (magic1 > magic2)
                    System.out.println("Первый студент " + student1 + " имеет магию сильнее " + magic1 + " чем второй студент " + student2 + " " + magic2);
                else
                    System.out.println("Второй студент " + student2 + " имеет магию сильнее " + magic2 + " чем первый студент " + student1 + " " + magic1);

                if (distance1 > distance2)
                    System.out.println("Первый студент " + student1 + " имеет большее растояние трансгрессии " + distance1 + " чем второй студент " + student2 + " " + distance2);
                else
                    System.out.println("Второй студент " + student2 + " имеет магию сильнее " + distance2 + " чем первый студент " + student1 + " " + distance1);
            }
        }

