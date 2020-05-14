//房间类
public class Room {
    private String id; /*房间编号*/
    private String type; /*房间类型*/
    private boolean status; /*房间状态 默认值是false: 未顶够；true：已订购*/

    //构造方法
    public Room() {
    }

    public Room(String id, String type, boolean status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    //setter and getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //订房方法 实例方法。根据房间号，预定房间
    public void book(){
        this.status = true; /*将当前状态改为true, 即为预定该房间*/
    }

    //退房
    public void checkOut(){
        this.status = false; /*将当前转态改为false, 即为退房*/
    }
}
