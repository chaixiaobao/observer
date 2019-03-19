package stu.observer;

public class GuavaTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Teacher tom = new Teacher("Tom");
        Teacher jack = new Teacher("jack");
        
        EventBusHolder.register(tom);
        EventBusHolder.register(jack);
        Question question1 = new Question("Lily", "怎么才能学好设计模式？");
        EventBusHolder.post(question1);
        
        EventBusHolder.unregister(jack);
        Question question2 = new Question("Rose", "怎么才能学好java？");
        EventBusHolder.post(question2);
    }

}
