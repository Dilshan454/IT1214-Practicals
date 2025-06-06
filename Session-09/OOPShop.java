import java.util.Scanner;

class Item {
    String description;
    int unitPrice;

    Item(String desc, int unitPrice) {
        this.description = desc;
        this.unitPrice = unitPrice;
    }
}

class Basket {
    Item[] itm = new Item[5];
    int count = 0;

    void addItem(Item i) {
        if (count < itm.length) {
            itm[count] = i;
            count++;
        } else {
            System.out.println("Basket is full.");
        }
    }

    void calculatePrice() {
        int total = 0;
        for (int j = 0; j < count; j++) {
            total += itm[j].unitPrice;
        }
        System.out.println("Total price: " + total);
    }
}

class ShopDemo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Item[] itemList = new Item[10];

        Basket basket1 = new Basket();
        char input = 'y';
        int i = 0;

        do {
            System.out.print("Enter item description: ");
            String desc = sc.next();
            System.out.print("Enter unit price: ");
            int up = sc.nextInt();

            Item newItem = new Item(desc, up);
            itemList[i] = newItem;
            basket1.addItem(newItem);
            i++;

            System.out.print("Add another item? (y/n): ");
            input = sc.next().charAt(0);
        } while (input == 'y' && i < itemList.length);

        basket1.calculatePrice();
    }
}
