#include <iostream>

using namespace std;

class Point2D
{
    public:
        Point2D();
        Point2D(double xIn, double yIn);

        double getX(){return x;};
        double getY(){return y;};

//        double setX();
//        double setY();

        void display();

        Point2D operator +(Point2D pointIn){return Point2D(x + pointIn.getX(), y + pointIn.getY());}

        Point2D friend operator *(Point2D pointIn1, Point2D pointIn2);

        Point2D operator /(Point2D pointIn){return Point2D(x / pointIn.getX(), y / pointIn.getY());}





    private:
        double x, y;


};

Point2D operator -(Point2D pointIn1, Point2D pointIn2)
{
    return Point2D(pointIn1.getX() - pointIn2.getX(), pointIn1.getY() - pointIn2.getY());
}

Point2D operator *(Point2D pointIn1, Point2D pointIn2)
{
    return Point2D(pointIn1.x * pointIn2.x, pointIn1.y * pointIn2.y);
}


Point2D::Point2D()
{

}

Point2D::Point2D(double xIn, double yIn) : x(xIn), y(yIn)
{
//    x = xIn;
//    y = yIn;
}

void Point2D::display()
{
    cout << "(" << getX() << "," << getY() << ")" <<endl;
}

int main ()
{
    Point2D p1(1,2), p2(3,4), p3(0,0);
    p1.display();
    p2.display();
    p3.display();

    cout << "-----" << endl;

    p3 = p1 + p2;
    p3.display();
    p3 = p1 - p2;
    p3.display();
    p3 = p1 * p2;
    p3.display();
    p3 = p1 / p2;
    p3.display();





    return(0);
}
