/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huit.mathutil;

/**
 *
 * @author Windows
 */
//TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//MÀ KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ
//CHO RIÊNG TA, HÀM STATIC SẼ GIÚP TA CHUYỆN NÀY

public class MathUtil {
    
    //0! = 1! = 1
    //ko tính giai thừa cho số âmm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 số 0
    //21! lố kiểu long
    //nếu đưa vào âm hay 21! ta ếu tính và ta đập vào mặt ai xài hàm này
    //1 cái ngoại lệ, ếu tính đc
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 & 20");
        //hàm dùng liền éo cần return
        
        //xuống đây là n - 0 20 oiù
        if(n == 0 || n == 1)
            return 1;
      
        //xuống đến đây
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bưu nhồi thịt
        //i = 2, i = 3, i = 4
        long product = 1; //tích ban đâuù = 1;, nhồi 2 3 4 5 6 7 n
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
