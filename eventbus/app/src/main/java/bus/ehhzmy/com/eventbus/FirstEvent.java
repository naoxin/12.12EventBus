package bus.ehhzmy.com.eventbus;

/**
 * 1.作用
 * 2.作者：李延
 * 3.时间：2016、11、24
 */

public class FirstEvent {
    private String mMsg;
    public FirstEvent(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }


}
