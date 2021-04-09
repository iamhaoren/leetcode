package MyPackage;

import DesignModel.Person;

public class PackageTest {
    public static void main(String[] args) {
        new Person(){
            @Override
            protected void say() {
                super.say();
            }
        }.say();
    }
}
