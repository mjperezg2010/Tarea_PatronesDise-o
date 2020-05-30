package Observer;


public class JobSeeker implements Observer {
    private String seeker;
   
    public JobSeeker(){
        
    }
    public JobSeeker(String seeker) {
        this.seeker = seeker;
    }
    @Override
    public void update(Subject update){
        System.out.println("Atencion "+this.seeker+ " Hay nuevos trabajos!");

    }
}
