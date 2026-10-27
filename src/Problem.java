public class Problem {
    private int id;
    private String title;
    private String topic;
    private String difficulty;
    private String status;

    public Problem(int id,String title,String topic,String difficulty,String status){
        this.id = id;
        this.title = title;
        this.topic = topic;
        this.difficulty = difficulty;
        this.status = status;
    }

    public void display(){
        System.out.println("ID : " + id);
        System.out.println("Title : " + title);
        System.out.println("Topic : "+ topic);
        System.out.println("Difficulty :"+ difficulty);
        System.out.println("Status :" + status);
    }
}
