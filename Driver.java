public class Driver{
	public static void main(String[] args){
	boolean hascar = false;
	boolean haslicense = false;
	boolean hasinsured = false;
if(hascar && haslicense && hasinsured){
	System.out.println("You can drive.");
}
else if(haslicense && hasinsured){
	System.out.println("Sorry you cannot drive you don't have a car");
}
else if(hascar &&  hasinsured){
	System.out.println("Sorry you cannot drive, you don't have a license.");
}
else if(hascar && haslicense){
	System.out.println("Sorry you cannot drive, you have not insured.");
}
else if(hascar && !haslicense && !hasinsured){
	System.out.println("You are missing license and insurence");
}
else if(!hascar && haslicense && !hasinsured){
	System.out.println("You are missing car and insurence");
}
else if(!hascar && !haslicense && hasinsured){
	System.out.println("You are missing car and license");
}
else{
	System.out.println("You don't have car, license and insurence");
}
	}

}
/*	int choice = 2;
	switch(choice){
	case 1:
	System.out.println("We coun't find your car approve.");
	break;
	case 2:
	System.out.println("We couldn't find your driving license.");
	break;
	case 3:
	System.out.println("We couldn't find your car insurence.");
	break;
	}
	} */