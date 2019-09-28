//
// Created by Ade on 17.04.19.
//
#include "sequence.h"

#include <cstdlib>
#include <iostream>
using namespace std;

template <typename T, int M>
T& Seq<T,M>::operator [](int i) {
    return a[i];
};

template <typename T,int M>
void Seq<T,M>::set(T x) {
    for (int i=0;i < M;i++){
        a[i] = rand()%10-5;
    }
};

template <typename T,int M>
void Seq<T,M>::print() {
    for (int i=0;i < M;i++){
        cout << " Seq <T, M> = " << a[i] << " " ;
    };
};

template <typename T>
Seq<T,0>::Seq(int x) {

  this->x = x;

};
template <typename T>
int Seq<T,0>::size() {
  cout<< "size max sequence = " << x << endl;
    return x;
};

template <typename T, int M>
Seq<T,0> Seq<T,M>::maxSum() {
    int ans = a[0];
    int sum = 0;
    for(int i=0;i<M; ++i){
        sum += a[i];
        ans = max(ans,sum);
        sum = max(sum,0);
    }
    Seq<T,0> p = new Seq<T,0>(sum);
    return p;
};
