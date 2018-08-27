import java.util.Scanner;

class Unyokakunin {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[][] Unyo = {
				{ "2340M", "2341M", "2320M", "2321M", "2350M", "2351M", "2328M", "2329M", "2330M", "2331M", "2370M",
						"2371M", "2376M",
						"2377M" },
				{ "2342M-D6", "2343M-D6", "1349M-D6", "1354M-D6" },
				{ "2346M-D6", "2347M-D6", "2358M", "2359M", "2364M", "2365M", "2334M-U4", "2377M-U4" },
				{ "2344M-U4", "2345M-U4", "1349M-C6", "1354M-C6" },
				{ "2346M-C6", "2347M-C6", "2356M", "2357M", "2362M", "2363M", "2372M-U4", "2373M-U4" },
				{ "2342M-U6", "2343M-U6", "2348M-U4", "2349M-U4", "1349M-U6", "1354M-U6" },
				{ "2346M-C6", "2347M-C6", "2356M", "2355M", "2360M", "2361M", "2372M-D4", "2373M-D4" },
				{ "2342M-C6", "2343M-C6", "2348M-D4", "2349M-D4", "2326M", "2327M", "2366M", "2367M", "2332M", "2335M",
						"2334M-U4", "2337M-U4" },
				{ "2344M-U4", "2345M-U4", "2352M", "2353M", "2368M", "2369M", "2374M", "2375M" } };
		Scanner sc = new Scanner(System.in);

		System.out.println("連結方向記号　凡例");
		System.out.println("D：下り方");
		System.out.println("C:中間");
		System.out.println("U：上り方");
		System.out.println("2346M-C(方向記号)6(両数)");

		System.out.println();
		System.out.println("妙高はねうまライン　運用確認");

		System.out.println("列車番号を入力すると、運用を確認できます。 2編成以上による列車の場合、どこに連結しているかも入力してください。");
		System.out.println("記入例 > 2346M-U6");
		System.out.print("列車番号 > ");
		String TrainNO = sc.next();

		boolean flag = true;

		for (int i = 0; i < Unyo.length; i++) {
			for (int j = 0; j < Unyo[i].length; j++) {
				if (Unyo[i][j].equals(TrainNO)) {
					for (int k = 0; k < Unyo[i].length; k++) {
						System.out.print(Unyo[i][k] + " , ");

					}
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("その列車は存在しません。");
		}
		sc.close();
	}

}
