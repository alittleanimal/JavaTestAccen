package test1103;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestLambda {
	public static void main(String[] args) {
		Random random = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 10; i++) {
			heros.add(new Hero("hero"+i,random.nextInt(1000),random.nextInt(100)));
		}
		System.out.println("初始化后的集合： ");
		System.out.println(heros);
		
		//内部类实现
		System.out.println("filter out heros whose hp>100 && damange<50 using anonymous class");
		HeroChecker checker = new HeroChecker() {
			@Override
			public boolean test(Hero hero) {
				return (hero.hp>100 && hero.damage<50);
			}
		};
		filter(heros, checker);
		
		//Lambda表达式实现过程
		HeroChecker checker2 = (Hero h)->{
			return (h.hp>100 && h.damage<50);
		};
		HeroChecker checker3 = (Hero h)->h.hp>100 && h.damage<50;
		HeroChecker checker4 = h->h.hp>100 && h.damage<50;
		filter(heros, checker4);
		System.out.println("filter out heros whose hp>100 && damange<50 using Lambda");
		filter(heros, h->h.hp>100 && h.damage<50);
		
		//使用静态方法
		System.out.println("在Lambda表达式使用静态方法");
		filter(heros, h->TestLambda.testHero(h));
		System.out.println("直接引用静态方法");
		filter(heros, TestLambda::testHero);
		
		//使用容器对象方法
		System.out.println("在lambda表达式中调用容器对象的matched方法： ");
		filter(heros, h->h.matched());
		System.out.println("直接引用容器中的对象方法");
		filter(heros, Hero::matched);
		
		//聚合操作
		System.out.println("通过聚合操作方式找出满足条件的数据");
		heros.stream().filter(h->h.hp >100 && h.damage<50).forEach(h->System.out.println(h.name));
	}
	
	private static void filter(List<Hero> heros, HeroChecker checker){
		for (Hero hero : heros) {
			if (checker.test(hero)) {
				System.out.print(hero);
			}
		}
	}
	
	public static boolean testHero(Hero hero) {
		return hero.hp>100 && hero.damage<50;
	}
}
