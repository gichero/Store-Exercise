package com.week1Group;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Products pineapple = new Products("Pineapple", "Fruit", 3.00);
        Products kiwi = new Products("Kiwi", "Fruit", 1.00);
        Products papaya = new Products("Papaya", "Fruit", 4.00);
        Products mango = new Products("Mango", "Fruit", 2.00);
        Products orange = new Products("Orange", "Fruit", 3.00);
        Products fruits[] = {pineapple, kiwi, papaya, mango, orange};
        Vendor fruitVendor = new Vendor("Fruit Vendor");

        Products pencil = new Products("Pencil", "Stationery", 3.00);
        Products pen = new Products("Pen", "Stationery", 1.00);
        Products ruler = new Products("Ruler", "Stationery", 4.00);
        Products notepad = new Products("Note Pad", "Stationery", 2.00);
        Products eraser = new Products("Eraser", "Stationery", 3.00);
        Products stationery[] = {pencil, pen, ruler, notepad, eraser};
        Vendor schoolVendor = new Vendor("School Vendor");

        Products nails = new Products("Nails", "Fruit", 3.00);
        Products timber = new Products("Timber", "Fruit", 1.00);
        Products windows = new Products("Windows", "Fruit", 4.00);
        Products pipes = new Products("Pipes", "Fruit", 2.00);
        Products tools = new Products("Tools", "Fruit", 3.00);
        Products hardware[] = {nails, timber, windows, pipes, tools};
        Vendor hardwareVendor = new Vendor("Hardware Vendor");



        System.out.println(pineapple.getName());
        System.out.println(kiwi.getName());
        System.out.println(papaya.getName());
        System.out.println(mango.getName());
        System.out.println(orange.getName());
        System.out.println(fruitVendor.name);


    }
}
