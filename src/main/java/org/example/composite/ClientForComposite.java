package org.example.composite;

public class ClientForComposite {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("팬케익 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "달콤한 디저트입니다.");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴입니다.");

        dessertMenu.add(new MenuItem("초코 케익", "정말 맛있어요", 4500));
        dessertMenu.add(new MenuItem("딸기 케익", "정말 상큼해요", 4600));
        dessertMenu.add(new MenuItem("생크림 케익", "정말 달달해요", 4700));

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        allMenus.print();
    }
}
