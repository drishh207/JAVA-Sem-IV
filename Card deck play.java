import java.util.*;
import java.io.*;

class card
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
        System.out.println("Deck Created");
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
                count=1;
        }
        if(count==1)
            System.out.println("Card Found");
        else
            System.out.println("Card Not Found");
    }
    
    
}


public class cards {
     
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        System.out.println("DECK OF CARDS");
        char ch='y';
        while(ch!='n'||ch!='N')
        {
            System.out.println("Enter \n 1. Create Deck \n 2. Print Deck \n 3. Print card \n 4. Checking for same card \n 5. Comparing cards ");
            System.out.println(" 6. Sorting cards \n 7. Finding a particular card \n 8. Dealing cards");
            int n=scan.nextInt();
            card c=new card();
            switch(n)
            {
                case 1: c.create_deck();
                    break;
                 
                case 2: c.print_deck();
                    break;
                
                case 3: System.out.println("Enter suit and rank of a card");
                    int s=scan.nextInt();
                    int r=scan.nextInt();
                    card c1=new card(r,s);
                    c.print_card(c1);
                    break;
                  
                case 4: System.out.println("First card");
                    System.out.println("Enter suit and rank of a card");
                    int s1=scan.nextInt();
                    int r1=scan.nextInt();
                    card c2=new card(r1,s1);
                    
                    System.out.println("Second11 card");
                    System.out.println("Enter suit and rank of a card");
                    int s2=scan.nextInt();
                    int r2=scan.nextInt();
                    card c3=new card(r2,s2);
                    
                    c.same_card(c2,c3);
                    break;
                    
                case 5: System.out.println("First card");
                    System.out.println("Enter suit and rank of a card");
                    int s4=scan.nextInt();
                    int r4=scan.nextInt();
                    card c4=new card(r4,s4);
                    
                    System.out.println("Second card");
                    System.out.println("Enter suit and rank of a card");
                    int s5=scan.nextInt();
                    int r5=scan.nextInt();
                    card c5=new card(r5,s5);
                    
                    c.compare_card(c4,c5);
                    break;
                
                case 6: ArrayList<card> deck=new ArrayList<>(); 
                    System.out.println("Enter no of cards");
                    int l=scan.nextInt();
                    for(int i=0;i<l;i++)
                    {
                        System.out.println("Enter suit and rank of a card");
                        int suit=scan.nextInt();
                        int rank=scan.nextInt();
                        deck.add(new card(rank,suit));
                    }
                    c.sort_cards(deck);
                    break;
                
                case 7: System.out.println("Enter suit and rank of a card");
                        int suit=scan.nextInt();
                        int rank=scan.nextInt();
                        card cc=new card(rank,suit);
                        c.find_card(cc);
                        break;
                 
                case 8: System.out.println("Enter a particular deck");
                        int d=scan.nextInt();
                        System.out.println("Five random cards of deck entered are ");
                        for(int i=0;i<5;i++)
                        {
                            c.print_card(new card(random.nextInt(12),d));
                        }
                        
            }
            System.out.println("Do you want to continue(Y/N)");
            ch=scan.next().charAt(0);
            System.gc();                                                     //Internally finalize method is called
            if(ch=='n'||ch=='N')
                System.exit(0);
        }
        
    }
    
}
