package BaiTap_07;

import javax.print.attribute.standard.PagesPerMinute;

public class CTivi {
    private String [] channelList;
    private boolean isOn;
    private String currentChanel;

    public CTivi() {
        isOn = false;
        channelList = new String[3];
        channelList[0] = "VTV1";
        channelList[1] = "VTV2";
        channelList[2] = "VTV3";
        currentChanel = "VTV1";
    }

    public CTivi(String[] channelList) {
        this.channelList = channelList;
        isOn = false;
        currentChanel = channelList[0];
    }

    public String seachNextChannel(boolean isForward ){
        //xác định vị trí kênh
        int currentIndex = -1;
        for (int i = 0; i < channelList.length; i++){
            if (channelList[i].equalsIgnoreCase(currentChanel)){
                currentIndex = i;
                break;
            }
        }
        if (isForward){
            currentIndex++;
            if (currentIndex >= channelList.length){
                currentIndex = 0;
            }

        }else {
            currentIndex--;
            if (currentIndex <= 0){
                currentIndex = channelList.length - 1;
            }
        }
        currentChanel = channelList[currentIndex];
        return currentChanel;
    }

    public void On(){
        isOn = true;
        System.out.println("Tivi On");
    }

    public void Off(){
        isOn = false;
        System.out.println("Tivi Off");
    }

    public void Swich(){
        if (isOn = true){
            Off();
        }else {
            On();
        }
    }

    public void Swich(String channel){
        Swich();
        if (isOn){
            boolean isFind = false;
            for (int i = 0; i < channelList.length; i++){
                if (channelList[i].equalsIgnoreCase(channel)){
                    isFind = true;
                    break;
                }
            }
            if (isFind){
                currentChanel = channel;
                System.out.println("Kênh hiện tại đã tìm: " + channel);
            }else {
                System.out.println("ko tìm thấy kênh");
            }
        }
    }

    public void nextChannel(){
        if (isOn){
            seachNextChannel(true);
            System.out.println("Current Chanel" + currentChanel);
        }
    }

    public void previousChannel(){
        if (isOn){
            seachNextChannel(false);
            System.out.println("Current Chanel" + currentChanel);
        }
    }

    public void show(){
        if (isOn){
            System.out.printf("---Tivi is on at channel %s: ---", currentChanel);
        }else {
            System.out.println("---Tivi is off: ---");
        }
    }
}
