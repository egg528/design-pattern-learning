package org.example.templatemethod;

public abstract class CaffeineBeverageWithHook {
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (isNeedCondiments()) {
            addCondiments();
        }
    }

    // 외부 사용을 막으려면 private 그게 아니라면 final
    private void pourInCup() {
        System.out.println("Pour in cup");
    }

    // 외부 사용을 막으려면 private 그게 아니라면 final
    private void boilWater() {
        System.out.println("Boil water");
    }

    // hook
    protected boolean isNeedCondiments() {
        return false;
    }

    // hook
    protected abstract void addCondiments();

    protected abstract void brew();
}
