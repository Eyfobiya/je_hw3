package task_2;

public class BadPupil extends Pupil{
    BadPupil(){
        super();
    }
    @Override
    void study(){System.out.print("bad /");}
    @Override
    void read(){System.out.print("bad /");}
    @Override
    void write(){System.out.print("bad /");}
    @Override
    void relax(){System.out.print("bad /");}
}
