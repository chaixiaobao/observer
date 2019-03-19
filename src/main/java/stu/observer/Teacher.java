package stu.observer;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void getQuestion(Question question) {
        System.out.println(
                this.name + "老师，您接收到一个提问，提问者：" + question.getUserName() + "，提问内容：" + question.getContent());
    }

}
