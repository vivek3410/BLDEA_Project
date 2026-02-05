package Strings;

public class MyString {
    
    private String str;

    MyString(String str){
        this.str = str;
    }

    public MyString modify(String str){

        if(this.str == str){
            return this;
        }else{
            return new MyString(str);
        }
    }

    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        MyString s = new MyString("vivek");
        MyString modifyString = s.modify("vivekhhh");
        System.out.println(modifyString.toString());
    }
}

