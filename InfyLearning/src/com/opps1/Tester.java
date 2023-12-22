package com.opps1;

class Room {
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    */ 
    int roomNo;
    int capacity;
 static    int roomCounter;
    
    int getRoomNo(){
    return roomNo;
    }
    int getCapacity(){
    return capacity;
    }
    int getRoomCounter(){
    return roomCounter;
    }
    void setRoomNo(int roomNo){
    this.roomNo=roomNo;
    }
    void setCapacity(int capacity){
    this.capacity=capacity;
    }
    static {
        roomCounter=500;

      }
    Room(){
//    roomCounter=500;
    this.capacity=4;
    this.roomNo= ++roomCounter;
    }
   
    
}

class Member {
	//Implement your code here 
	
	//Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
    */
	int memberId;
	String name;
	Room room;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	Member(int memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
}

class Admin {
	//Implement your code here 
	Admin(){
		
	}
	void assignRoom(Room[] rooms, Member member) {
		for(Room room:rooms) {
			if(room.getCapacity()>0&&room.getCapacity()<=4) {
				member.setRoom(room);
				room.setCapacity(room.getCapacity()-1);
				break;
			}
		}
	}
}


class Tester {
	public static void main(String args[]) {
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
//		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
//		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}
} 
 


