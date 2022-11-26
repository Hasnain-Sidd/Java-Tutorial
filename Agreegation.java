import java.util.*;

public class Agreegation{
	String name;
	int releaseyear;
	String duration;
	
	public actor a=new actor();
  
	public director d=new director();
	public cameraman c=new cameraman();
	public void shoot(String place,int noofactors) {
		
		
		
		System.out.println("Place Of Shoot :"+place);
		System.out.println("Number of Actors acting in this Movie :"+noofactors);
		}
	void theatrerelease(String date) {
		
		System.out.println("Date of Theatre Release:"+date);
	}

class actor{
		String heroname;
		String Heroinename;}
	class  director{
		String name;
		
String  rankofdirector;
	int noofmovies;
	
	}
	class cameraman{
		int noofcameraman;
		String production;
		}
        public static void main(String[] args) {
		Movie m1=new Movie();
				
				
		m1.name="Spider No way Home";
		m1.duration="2hr:15min:45sec";
		m1.releaseyear=2021;
				
	System.out.println("Movie Name:"+m1.name);
		System.out.println("Duration Of movie:"+m1.duration);
		System.out.println("Releasse Year Of Movie:"+m1.releaseyear);
			 m1.shoot("London", 35);
			   m1.theatrerelease("31st December");
			 m1.a.heroname="Tom Holland";
			 m1.a.Heroinename="Zendaya";
			 System.out.println("Hero Name:"+m1.a.heroname);
			 System.out.println("Heroine Name:"+m1.a.Heroinename);
		       m1.d.name="Stanlee";
		       m1.d.noofmovies=55;
		       m1.d.rankofdirector="3rd";
		       System.out.println("Director Name OF a Film:"+m1.d.name);
		       System.out.println("Number OF Films Shooted By The Director:"+m1.d.noofmovies);
		       System.out.println("RAnk OF a Director In fillm Industry:"+m1.d.rankofdirector);
		       m1.c.noofcameraman=250;
		       m1.c.production="MARVEL STUDIOS";
		       System.out.println("Number Of Cameramen Working In The Film:"+m1.c.noofcameraman);
		       System.out.println("Production Of a Film:"+m1.c.production);
		       Movie m2=new Movie();
		       System.out.println("*************************************************************");
		       m2.name="Hawkeye";
		       m2.duration="3hr:54mins:57secs";
		       m2.releaseyear=2022;
		       m2.a.heroname="Clint Clark";
		       m2.a.Heroinename="Katie Bush";
		       m2.d.name="Steve Rogers";
		       m2.d.noofmovies=40;
		       m2.d.rankofdirector="5th";
		       m2.c.noofcameraman=289;
		       m2.c.production="MARVEL STUDIOS";
		       System.out.println("Movie Name:"+m2.name);
		       System.out.println("Durations Of a Movie:"+m2.duration);
		       System.out.println("Release Year Of a Movie:"+m2.releaseyear);
		       System.out.println("Hero Name OF a Movie:"+m2.a.heroname);
		       System.out.println("Heroine Name Of a Movie:"+m2.a.Heroinename);
		       System.out.println("Director Name OF a Movie:"+m2.d.name);
		       System.out.println("Number OF Movie Shooted By a Director:"+m2.d.noofmovies);
		       System.out.println("Rank Of a Director in Movie Industry:"+m2.d.rankofdirector);
		       System.out.println("Number Of Cameraman Used in This Movie:"+m2.c.noofcameraman);
		       System.out.println("Production Of a Movie:"+m2.c.production);
			   }
            }
			


