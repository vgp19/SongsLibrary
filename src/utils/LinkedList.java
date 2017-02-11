package utils;

/**
 * Created by vivekpatel on 2/11/17.
 */
public class LinkedList{
    SongNode head;
    int size;
    public LinkedList(){
        head=null;
        size=0;
    }
    public boolean add(SongNode n){
        if(head==null){
            head=n;
            size++;
            return true;
        }else{
            SongNode tmp=head;
            SongNode prev=head;
            while(tmp!=null){
                if(n.equals(tmp))
                    return false;
                int c=n.compareTo(tmp);
                if(c<0){
                    n.next=tmp;
                    if(prev==head)
                        head=n;
                    else
                        prev.next=n;
                    size++;
                    return true;
                }else{
                    prev=tmp;
                    tmp=tmp.next;
                }
            }
            prev.next=n;
            size++;
            return true;
        }
    }

    public boolean delete(SongNode n){
        if(size==0) {
            return false;
        }else{
            SongNode tmp=head;
            SongNode prev=head;
            while(tmp!=null){
                if(n.equals(tmp)){
                    if(tmp==head) {
                        head = head.next;
                        size--;
                        return true;
                    }else{
                        prev.next=tmp.next;
                        size--;
                        return true;
                    }
                }
                prev=tmp;
                tmp=tmp.next;
            }
            return false;
        }
    }

    public int getSize(){
        return size;
    }
}
