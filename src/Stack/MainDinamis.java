/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author JY
 */
public class MainDinamis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stackdinamis st = new stackdinamis();
        st.push(8);
        st.push(10);
        st.push(32);
        st.push(2);
        st.push(14);
        st.push(50);
        System.out.println(st.toString());
        st.pop();
        st.push(3);
        System.out.println(st.toString());
        st.push(4);
        System.out.println(st.toString());
    }
    
}
