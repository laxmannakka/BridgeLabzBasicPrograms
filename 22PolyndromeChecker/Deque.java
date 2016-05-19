package com.bridgelabz.deque;

public class Deque<E>
{
    public E mdata;
    public Deque<E> mnext;
    public Deque <E> mpre ;

public Deque(E val)
{
    this.mdata =val;
    this.mnext =null;
    this.mpre = null;
}



}
