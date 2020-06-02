public class Link {
    Node header;
    private int size;
    public Link(){
        header = null;
        size = 0;
    }
    //添加数据（这里添加的是一个结点）
    public void add(Node node){
        if(header == null)
        {
            header = node; //将数据传给结点
            header.next = null; //头部结点的指针为空
        }
        else
        {
            //找到最后一个结点
            Node last = findLast(header);
            last.next = node;
            node.next = null;
        }
        size++;
    }

    private Node findLast(Node node) {
        if (node.next == null) return node;
        return findLast(node.next);
    }

    //链表中元素的数目
    public int size(){
        return this.size;
    }
    //遍历链表数据
    public void travel(){
        Node node = this.header;
        while (true)
        {
            System.out.print("输出：");
            System.out.println(node.data); // 1 2 3
            node = node.next;
            if (null == node) break;
        }
    }
    //删除链表中元素
    //修改某个元素
    //查找链表中某个元素 返回下标

    //增删改查
}
