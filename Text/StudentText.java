package com.hqyj.mc.Text;

public class StudentText {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("张三");
        st.setStuNumber("123456789");
        st.setGenner("男");
        st.setAge(18);
        st.show();
        Student st1 = new Student("zzz","1008611","男",18);
        st1.show();
    }
}
