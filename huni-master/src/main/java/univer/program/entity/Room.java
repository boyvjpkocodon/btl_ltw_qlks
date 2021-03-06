package univer.program.entity;

import javax.persistence.*;

@Entity
public class Room {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int number;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    private String type;
    private int bed_cnt;
    private int price;
    private String description;
    @org.jetbrains.annotations.Contract(pure = true)
    public Room() {
    }

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Room(int id, int number, int hotel_id, String type, int bed_cnt, int price, Hotel hotel,String description) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.bed_cnt = bed_cnt;
        this.price = price;
        this.hotel = hotel;
        this.description = description;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBed_cnt() {
        return bed_cnt;
    }

    public void setBed_cnt(int bed_cnt) {
        this.bed_cnt = bed_cnt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Number: %s,Type: %s,Bed_Cnt: %d,Price: %d", number, type, bed_cnt, price);
    }
}
