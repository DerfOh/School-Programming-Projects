//  Determine real and complex roots of a quadratic equation and check results
//   ax^2 + bx + c = 0

#include <iostream>
#include <math.h>
#include <complex>
using namespace std;

int main(void)
{
    float a, b, c, x1, x2, root;
    complex<float> z;

    cout << "Roots of quadratic equation, Enter a, b and c ? ";
    cin >> a >> b >> c;

    root = b * b - 4.0f * a * c;                                    // b*b - 4ac
    if (root >= 0.0f)                                                    // if +
        {
        root = sqrt(root);                                         // real roots
        x1 = (-b + root) / (2.0f * a);
        x2 = (-b - root) / (2.0f * a);
        cout << "Real roots " << x1 << " and " << x2 << endl;
        cout << "Test " << a * x1 * x1 + b * x1 + c              // check result
             << " and " << a * x2 * x2 + b * x2 + c << endl;
        }
    else
        {                                                       // complex roots
        root = sqrt(-root) / (2.0f * a);
        x1 = -b / (2.0f * a);
        cout << "Complex roots " << x1 << " +- i " << root << endl;
        z = complex<float>(x1, root);
        cout << "Test " << a * z * z + b * z + c;                // check result
        z = complex<float>(x1, -root);
        cout << " and " << a * z * z + b * z + c << endl;
        }

    return 0;
}
