
package com.huit.mathutil;

/**
 *
 * @author Windows
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        
        System.out.println("expected: 7! = 720; actual: " + MathUtil.getFactorial(6));

        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));

        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 1:44PM 28/01/2024
        System.out.println("expected: 1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("expected: 3! = 6; actual: " + MathUtil.getFactorial(3));

        
        
        
        //MathUtil.getFactorial(-5); ném ngoại lệ thật, ai biểu đem cà chớn
        
        //kỹ thuật kiểm thử phần mềm; ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //mày/hàm ai đó viết khi chạy thực tế - actual, giả sử 120
        //if expected == actual, hàm ngon
    }
    
}
