package bridgelabzproject;

public class demo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("5000", "Gaming", "dualcore", "amd", 4);
        System.out.println(l1);
        screen s1 = new screen(20, "led", "SZXR", "Offie", 15500);
        System.out.println(s1);
        headphone h1 = new headphone("gmz", "gaming", "corded", 999);
        System.out.println(h1);
        Speaker c1 = new Speaker("bluetooth", "wireless", "lbqwe", 20000);
        System.out.println(c1);
        mouse m1 = new mouse("normal", "abzqq", 600);
        System.out.println(m1);
        Keyboard1 k1 = new Keyboard1("corded", "gamimg mouse", 1999);
        System.out.println(k1);
        bag b1 = new bag("l", "black", 3, 500);
        System.out.println(b1);
        Mousepad1 mp1 = new Mousepad1("blue", 300);
        System.out.println(mp1);
    }
}
    class Laptop implements Lenovo{
    String model;
    String type;
    String processor;
    String graphics;
    int ram;
    public Laptop(String model, String type, String processor, String graphics, int ram){
    this.model= model;
    this.type= type;
    this.processor= processor;
    this.graphics= graphics;
    this.ram= ram;
    }

    @Override
    public void lv() {
        System.out.println("Lenovo makes laptop");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model=" + model +
                ", type='" + type + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}

    class screen implements Lenovo{
    int screensize;
    String name;
    String modelseries;
    String type;
    int price;

    public screen(int screensize, String name, String modelseries, String type, int price){
    this.screensize= screensize;
    this.name= name;
    this.modelseries= modelseries;
    this.type= type;
    this.price= price;
    }
    @Override
        public void lv(){
        System.out.println("Lenovo Screen");
        }

        @Override
        public String toString() {
            return "screen{" +
                    "screensize=" + screensize +
                    ", name='" + name + '\'' +
                    ", modelseries='" + modelseries + '\'' +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    class headphone implements Lenovo{
    String model;
    String type;
    String cord;
    int price;

        public headphone(String model, String type, String cord, int price){
            this.model= model;
            this.type= type;
            this.cord= cord;
            this.price= price;
        }

        @Override
        public void lv() {
        System.out.println("Lenovo brand headphone");
        }

        @Override
        public String toString() {
            return "headphone{" +
                    "model='" + model + '\'' +
                    ", type='" + type + '\'' +
                    ", cord='" + cord + '\'' +
                    ", price=" + price +
                    '}';
        }

    }
        class Speaker implements Lenovo{
        String connectivity;
        String mode;
        String modelname;
        int price;

        public Speaker(String connectivity, String mode, String modelname, int price){
          this.connectivity= connectivity;
          this.mode= mode;
          this.modelname= modelname;
          this.price= price;
        }

        @Override
            public void lv() {
            System.out.println("Lenovo Speaker");
    }

            @Override
            public String toString() {
                return "Speaker{" +
                        "connectivity='" + connectivity + '\'' +
                        ", mode='" + mode + '\'' +
                        ", modelname='" + modelname + '\'' +
                        ", price=" + price +
                        '}';
            }
        }

        class mouse implements Lenovo {
            String type;
            String modelname;
            int price;

            public mouse(String type, String modelname, int price) {
                this.type = type;
                this.modelname = modelname;
                this.price = price;
            }

            @Override
            public void lv() {
            System.out.println("Lenovo Mouse");
        }

            @Override
            public String toString() {
                return "mouse{" +
                        "type='" + type + '\'' +
                        ", modelname='" + modelname + '\'' +
                        ", price=" + price +
                        '}';
            }
        }


