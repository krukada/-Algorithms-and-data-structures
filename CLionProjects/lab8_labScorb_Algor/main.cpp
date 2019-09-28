#include <iostream>
#include "sequence.h"
using namespace std;
int main() {
    Seq<int,5> p;
    p.print();
    p.set(3);
    return 0;
}