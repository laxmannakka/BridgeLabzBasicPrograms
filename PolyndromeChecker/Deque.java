package com.bridgelabz.nodedeque;


public class Deque<E>
{
    public E mdata; //data value
    public Deque<E> mnext; // mnext pointing to next of node
    public Deque <E> mpre ; // mpre poiting to pre of the value

    //construcor of deque
    public Deque(E val)
    {
        this.mdata =val;
        this.mnext =null;
        this.mpre = null;
    }
}
