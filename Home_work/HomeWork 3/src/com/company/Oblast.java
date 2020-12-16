package com.company;

public class Oblast {
    double x1=0;
    double y1=0;
    double x2 =2;
    double y2 = 0;
    double x3 = 2;
    double y3 =2;

    double area(double x1, double y1, double x2, double y2, double x3, double y3){
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }

    /* A function to check whether point P(x, y) lies
       inside the triangle formed by A(x1, y1),
       B(x2, y2) and C(x3, y3) */
     boolean isInside( double x, double y) {
         if(x<0||y>0) {
             x1 = 0;
             y1 = 0;
             x2 = -2;
             y2 = 0;
             x3 = -2;
             y3 = 2;
         }
         if(x<0||y<0){
             x1 = -1;
             y1 = 0;
             x2 = 0;
             y2 = 0;
             x3 = 0;
             y3 = -1;

         }
         if(x>0||y<0){
             x1 = 1;
             y1 = 0;
             x2 = 0;
             y2 = 0;
             x3 = 0;
             y3 = -1;
         }


        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }
}
