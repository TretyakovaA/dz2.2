public class Main {

    public static void main(String[] args) {
      Hufflepuff [] hufflepuffs = {
          new Hufflepuff("Захария Смит", 1, 2, 3,4,5),
          new Hufflepuff("Седрик Диггори", 2,3,4,5,6),
              new Hufflepuff("Джастин Финч-Флетчли", 3,4,5,6,7)
        };
        Ravenclaw [] ravenclaws ={
                new Ravenclaw("Джоу Чанг", 6,5,4,3,2),
                new Ravenclaw("Падма Патил", 5,4,3,2,1),
                new Ravenclaw("Маркус Белби", 3,2,1,4,5)
        };
        Gryffindor [] gryffindors ={
                new Gryffindor("Гарри Поттер", 10,10,10,10,10),
                new Gryffindor("Гермиона Грейнджер", 9,8,9,9, 8),
                new Gryffindor("Рон Уизли", 7,6,5,6,7)
        };
        Slytherin [] slytherins ={
                new Slytherin("Драко Малфой", 6, 5,10,8,7,10),
                new Slytherin("Грэхем Монтегю", 2,3,6,6,5,4),
                new Slytherin("Грегори Гойл", 1,2,3,4,2,3)
        };
      PrintStudent printStudent= new PrintStudent();
      printStudent.Print(hufflepuffs);
      printStudent.Print(ravenclaws);
printStudent.Print(gryffindors);
printStudent.Print(slytherins);
Comparison comparison = new Comparison();
comparison.Best(gryffindors, "Гарри Поттер", "Гермиона Грейнджер");
comparison.Best(slytherins, "Драко Малфой", "Грегори Гойл");
comparison.Best(ravenclaws, "Джоу Чанг", "Падма Патил");
comparison.Best(hufflepuffs, "Захария Смит", "Седрик Диггори");
comparison.generalSkills(ravenclaws, gryffindors, hufflepuffs, slytherins, "Гарри Поттер", "Драко Малфой");
    }

}
