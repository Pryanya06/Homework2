public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println (dog);
        dog = dog - 3.5;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        cat = cat + 4;
        System.out.println (cat);
        cat = cat - 1.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
        paper = paper + 4;
        System.out.println (paper);
        paper = paper - 7639;
        System.out.println (paper);

        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println (" Общий вес " + totalWeight + " кг ");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println (" Разница в весе " + differenceWeight + " кг ");
        var differenceWeight2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println ( " Разница в весе " + differenceWeight2 + " кг! ");

        var totalHours = 640;
        var humanHours = 8;
        var totalWorkers = totalHours / humanHours;
        System.out.println (" Всего работников в компании - " + totalWorkers + " человек ");

        var moreWorkers = 94;
        var totalWorkers2 = totalWorkers + moreWorkers;
        var humanHours2 = humanHours * totalWorkers2;
        var humanHours3 = totalHours / totalWorkers2;
        System.out.println (" Если в компании работает " + totalWorkers2 + " человека, то всего " + humanHours2 + " часов работы может быть поделено между сотрудниками ЛИБО Если в компании работает " + totalWorkers2 + " человека, то всего " + humanHours3 + " часа работы может быть поделено между сотрудниками");

    }
}