package polynomial;
import java.util.*;
import java.io.*;

public class polynode
{
    double coef;
    int exp;
    polynode next;
    polynode()
    {
        this.coef=0;
        this.exp=0;
    }
    polynode(double coef,int exp)
    {
        this.coef=coef;
        this.exp=exp;
    }
}
