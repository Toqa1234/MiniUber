/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UBER;

/**
 *
 * @author DELL
 */
public class PayTypeContext {

    IPayType payType;
    //request req;

    private PayTypeContext() {
    }

    private static PayTypeContext payTypeInstance = null;

    public static PayTypeContext getInstance() {
        if (payTypeInstance == null) {
            payTypeInstance = new PayTypeContext();
        }
        return payTypeInstance;
    }

    public void setPTStrateg(IPayType payType) {
        this.payType = payType;
    }

    public void payment()//request r)
    {

        payType.Pay();
    }
}
