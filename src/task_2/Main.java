package task_2;
//Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
public class Main {
    public static void main(String[] args) {

        ClassRoom classAll = new ClassRoom(new ExcellentPupil(), new GoodPupil(), new BadPupil(), new ExcellentPupil());

        classAll.studyInfo();
        classAll.readInfo();
        classAll.writeInfo();
        classAll.relaxInfo();
    }
}
