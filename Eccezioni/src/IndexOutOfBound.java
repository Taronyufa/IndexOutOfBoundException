public class IndexOutOfBound extends Exception{
    private String msg;
    public IndexOutOfBound (){
        msg = "the index is out of bound";
    }
    public String toString (){
        return msg;
    }
}