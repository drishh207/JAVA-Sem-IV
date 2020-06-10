package cards;
import java.util.*;
import java.io.*;

public class card
{
    private int rank;
    private int suit;
    private int diamond=1;
    private int club=0;
    private int spades=3;
    private int hearts=2;
    public static final int ncards = 52;
    ArrayList<card> deck=new ArrayList<>(ncards);
    card()
    {
        this.rank=0;
        this.suit=0;
    }
    
    card(int rank,int suit)
    {
        this.rank=rank;
        this.suit=suit;
    }
    
    void create_deck()
    {
        for(int suit=club;suit<=spades;suit++)
        {
            for(int rank=0;rank<=12;rank++)
            {
                deck.add(new card(rank,suit));
            }
        }
        //print_deck();
        
    }
    
    void print_card(card c)
    {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6","7", "8", "9", "10", "Jack", "Queen", "King" };
        System.out.println (""+ranks[c.rank] + " of " + suits[c.suit]);
    }
    
    void print_deck()
    {
        create_deck();
        Iterator itr=deck.iterator();
        while(itr.hasNext())
        {
            print_card((card)itr.next());
        }
    }
    
    void compare_card(card c1,card c2)
    {
        if(c1.suit>c2.suit)
            System.out.println("C1 has more priority than C2");
        else if(c1.suit<c2.suit)
            System.out.println("C2 has more priority than C1");
        else
        {
            if(c1.rank>c2.rank)
                System.out.println("C1 has more priority than C2");
            else
                System.out.println("C2 has more priority than C1");
        }
    }
    void same_card(card c1,card c2)
    {
        if(c1.suit==c2.suit&&c1.rank==c2.rank)
            System.out.println("C1 and C2 are the same cards");
        else
            System.out.println("C1 and C2 are different cards");
    }
    
    void sort_cards(ArrayList<card> Deck)
    {
        card c=new card();
        for(int i=0;i<Deck.size();i++)
        {
            for(int j=0;j<Deck.size()-i-1;j++)
            {
                if(Deck.get(j).suit<Deck.get(j+1).suit||Deck.get(j).rank<Deck.get(j+1).rank)
                {
                    c=Deck.get(j);
                    Deck.set(j,Deck.get(j+1));                   
                    Deck.set(j+1,c);
                }
                                                              
            }
        }
        System.out.println("The sorted cards are:");
        Iterator itr=Deck.iterator();
        while(itr.hasNext())
        {
            print_card((card)itr.next());
        }
    }
    
    void find_card(card c)
    {
        create_deck();
        int count=0;
        System.out.println("Your card is ");
        print_card(c);
        Iterator itr=deck.iterator();
        while(itr.hasNext())
        {
            card c1=(card)itr.next();
            if(c.suit==c1.suit && c.rank==c1.rank)
            {
                count++;
                break;
            }
        }
        System.out.println(count);
        if(count!=0)
            System.out.println("Card Found");
        else
            System.out.println("Card Not Found");
    }
    
    
}
