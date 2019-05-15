/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

/**
 *
 * @author admin
 */
public class MainStatis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stackstatis st = new stackstatis(7);
        st.push(8);
        st.push(10);
        st.push(32);
        st.push(2);
        st.push(14);
        st.push(53);
        st.push(3);
        st.toShow();
        System.out.println();
        st.push(4);
        st.pop();
        st.push(4);
        st.toShow();
    }
    
}
