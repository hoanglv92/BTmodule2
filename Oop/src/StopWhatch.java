import java.time.LocalTime;

class StopWhatchDemo {
    public static void main(String[] args) {

    }
}
class StopWhatch{
   private  int startTime;
   private int  endTime;
    public StopWhatch(){
    }
    public StopWhatch(int  startTime,int  endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public int  getStartTime() {
        return this.startTime;
    }

    public int  getEndTime() {
        return this.endTime;
    }
    public LocalTime start(){
        return java.time.LocalTime.now();
    }
    public LocalTime stop(){
        return java.time.LocalTime.now();
    }
    public void getElapsedTime(){

    }
}
