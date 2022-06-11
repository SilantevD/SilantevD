package pr3;

public class Room {
    private int Id;
    private int codeNumber;
    private int numberPeople;
    private int comfortType;
    private int price;
    public Room(int Id, int codeNumber, int numberPeople, int comfortType, int price){
        this.Id=Id;
        this.codeNumber=codeNumber;
        this.numberPeople=numberPeople;
        this.comfortType=comfortType;
        this.price=price;
    }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }
    public int getCodeNumber(){
        return codeNumber;
    }
    public void setCodeNumber(int codeNumber){
        this.codeNumber=codeNumber;
    }
    public int getNumberPeople(){
        return numberPeople;
    }
    public void setNumberPeople(int numberPeople){
        this.numberPeople=numberPeople;
    }
    public int getComfortType(){
        return comfortType;
    }
    public void setComfortType(int comfortType){
        this.comfortType=comfortType;
    }
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "Идентификатор-"+Id+"\n"+"Название товара-"+codeNumber+"\n"+"курьер-"+numberPeople+"\name"+"Дата и Время-"+comfortType+"/5"+"\n"+"тип товара-"+price+"\n";
    }
}