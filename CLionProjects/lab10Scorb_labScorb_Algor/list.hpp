//
// Created by Ade on 15.05.19.
//

#include <vector>

#ifndef LAB10SCORB_LIST_HPP
#define LAB10SCORB_LIST_HPP
using namespace std;
#endif //LAB10SCORB_LIST_HPP

template <typename T>
class Node{
private:
    T p;
    Node* next;
public:

    Node(T elem){

        this->p = elem;
    };
    bool Next(Node m){
        return next == m;

    };
    T getP(){
        return p;
    }
    void nextNode(Node& y){
        next = &y;
    };
};

template <typename T>
class List{
private:
    vector<Node<T>> list;
public:
    List(){
    };
    vector<Node<T>>&operator << (Node<T>&  obj){
        if (list.size() > 0 ) {
            reverse(list.begin(),list.end());
            list.push_back(obj);
            reverse(list.begin(),list.end());
        }
        if (list.size() == 0){
            list.push_back(obj);
            list.push_back(0);
        }
        return list;
    };
    T&operator*(Node<T>&  obj){
        T m = NULL;
        for(auto i = list.begin(); i!= list.end();i++){
            if (i->getP() ==obj.getP()){
                m = obj.getP();
            }
        }
        cout<<m<<endl;
        return m;
    };
    vector<Node<T>>&operator+=(List&  obj){
        list.insert(list.end()-1,obj.list.begin(),obj.list.end()-1);
        return list;
    };

    vector<Node<T>> &operator++ (int n){
        for(auto i = list.begin()+n;i != list.end(); i++)
            cout << i->getP() << " ";
        cout << endl;
        return list;
    };
    void printList(){
        for(auto i = list.begin();i != list.end(); i++)
            cout << i->getP()<< " ";
        cout << endl;
    };
};



