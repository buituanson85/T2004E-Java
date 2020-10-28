package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IRunning> iRunningList = new ArrayList<>();
        iRunningList.add(new Student());
        iRunningList.add(new Student());
        iRunningList.add(new Anima());
        iRunningList.add(new Anima());
        iRunningList.add(new Anima());

        for (int i = 0; i < iRunningList.size(); i++){
            iRunningList.get(i).rungning();
        }
    }
}
