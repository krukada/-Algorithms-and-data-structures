#include <iostream>
#include "list.hpp"
using namespace std;

int main() {

   // Node::InitNil(5);
    Node<int> h(4);
    Node<int> p(8);

    h<<p;
    Node<int> m(6);
    h<<m;

   // p.nextNode(m);

    Node<int> e(19);
   h<<e;
   h.printList();
   h*(e);
   h*(p);
    Node<int> a(10);
   e<<a;
    e.printList();
   h+=e;
    h.printList();

   h.operator++(2);
   //h.printList();


    return 0;
}