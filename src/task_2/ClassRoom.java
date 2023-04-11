package task_2;

public class ClassRoom {
    Pupil[] pupils;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupils = new Pupil[] {pupil1, pupil2, pupil3, pupil4};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupils = new Pupil[] {pupil1, pupil2, pupil3};
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupils = new Pupil[] {pupil1, pupil2};
    }

    public void studyInfo(){
        System.out.println("\n" + (char) 27 + "[32mPupils know how to study: " + (char)27 + "[0m");
        for (Pupil temp : pupils) {
            temp.study();
        }
    }
    public void readInfo(){
        System.out.println("\n" + (char) 27 + "[32mPupils can read: " + (char)27 + "[0m");
        for (Pupil temp : pupils) {
            temp.read();
        }
    }
    public void writeInfo(){
        System.out.println("\n" + (char) 27 + "[32mPupils can write: " + (char)27 + "[0m");
        for (Pupil temp : pupils) {
            temp.write();
        }
    }
    public void relaxInfo(){
        System.out.println("\n" + (char) 27 + "[32mPupils can relax: " + (char)27 + "[0m");
        for (Pupil temp : pupils) {
            temp.relax();
        }
    }
}
