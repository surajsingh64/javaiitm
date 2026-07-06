import java.util.*;

class rectangle{
    int w;    //width
    int h;    //height

    void setw(int w){
        this.w=w;
    }
    void seth(int h){
        this.h=h;
    }
    int area(){
        return w * h;
    }

   
}

public class computearea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());

        rectangle r = new rectangle();

        r.setw(w);
        r.seth(h);

        int area = r.area();

        System.out.print(area);
    }
}
