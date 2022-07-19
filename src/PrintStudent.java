public class PrintStudent {
    public void Print(Hufflepuff[] hufflepuffs){
        System.out.println("Количество студентов Пуффендуй "+ hufflepuffs.length);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs [i];
            System.out.println(hufflepuff.getName()+ " "+
                    hufflepuff.getDistance()+ " "+
                    hufflepuff.getMagic()+ " "+
                    hufflepuff.getDedication()+ " "+
                    hufflepuff.getHonour()+" "+
                    hufflepuff.getHardworking());
        }

    }
    public void Print ( Ravenclaw[] ravenclaws){
        System.out.println("Количество студентов Когтевран " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.getName()+ " "+
                    ravenclaw.getDistance()+ " " +
            ravenclaw.getMagic()+ " "+
                    ravenclaw.getCreative()+ " "+
                    ravenclaw.getWise()+ " "+
                    ravenclaw.getWitty());
        }
    }
    public void Print (Gryffindor [] gryffindors){
        System.out.println("Количество студентов Гриффиндор " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors [i];
            System.out.println(gryffindor.getName()+" "+
                    gryffindor.getDistance()+ " "+
                    gryffindor.getMagic()+" "+
                    gryffindor.getBravery()+ " "+
                    gryffindor.getNobility()+" "+
                    gryffindor.getHonour());

        }
    }
    public void Print (Slytherin[] slytherins){
        System.out.println(" Количество студентов Слизерин "+ slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins [i];
            System.out.println(slytherin.getName()+" "+
                    slytherin.getMagic()+ " "+
                    slytherin.getDistance()+" "+
                    slytherin.getDetermination()+ " "+
                    slytherin.getCunning()+" "+
                    slytherin.getLustForPower()+" "+
                    slytherin.getResourcefulness());
        }
    }

}
