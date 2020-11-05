package BaiTap_11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Ko the khoi tao duoc object tu IRunning va Animal
        var dog = new Dog();
        var cat = new Cat();
        dog.showSound();
        cat.onRunning();

        //khoi tao mot doi tuong tu abstract class

        var tiger = new Animal() {
            @Override
            public void showSound() {
                System.out.println("Gao...gao...");
            }
        };//tao da chi dung mot lan ko co kha nang tai su dung
        tiger.showSound();



        var dog2 = new Animal() {
            @Override
            public void showSound() {
                System.out.println("Di...Di...");
            }
            public void test(){
                System.out.println("ookokok");
            }
        };
        dog2.showSound();
        var r = new IRunning() {
            @Override
            public void onRunning() {
                System.out.println("a....a....");
            }
        };
        r.onRunning();
        IRunning r1 = () -> System.out.println("Test lambada....");
        r1.onRunning();

        IRunning r2 = () -> {
            System.out.println("hayyyyyy");
        };
        IAcction ac = new IAcction() {
            @Override
            public void IRunging() {
                System.out.println("aaaaaaa");
            }

            @Override
            public void  Isleeping() {
                System.out.println("bbbbbbbb");
            }
        };
        ac.IRunging();
        ac.Isleeping();
        //từ 2 phương thức chở lên ko chuyển đc về lamda

        IRunning r3 = () -> {
            System.out.println("11111111");
            System.out.println("222222");
        };
        //TH ==> phương thức có chưa tham số;
//    IMessage m = new IMessage() {
//        @Override
//        public void message(String msg) {
//            System.out.println("show message => " + msg);
//        }
//    };
        IMessage m = msg -> System.out.println("show message => " + msg);
        m.onMessage("123");

        // hành vi code
        List<Integer> ms = new ArrayList<>();
        ms.add(12);
        ms.add(112);
        ms.add(122);
        ms.add(132);
        ms.add(142);
        System.out.println("===================");
        for (int i = 0; i < ms.size(); i++){
            System.out.println("show data =>" + ms.get(i));
        }
        System.out.println("===================");
//        for (Integer v : ms){
//            System.out.println(v);
//        }
        Stream t = ms.stream();
        System.out.println("===================");
        t.forEach(System.out::println);
        System.out.println("===================");
        ms.forEach(System.out::println);
        System.out.println("===================");
        Stream t2 = ms.parallelStream();
        t2.forEach(System.out::println);

    }
}
