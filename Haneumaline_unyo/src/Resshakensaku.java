import java.util.Scanner;

class Resshakensaku {

	public static void main(String[] args) {
		int[][] Timetable = {{2340,2342,2344,2320,2346,2348,2350,3012,2352,2322,2324,2354,3014,2356,2358,2360,3016,2326,2362,2328,2364,2366,2330,2368,3018,2370,3374,2372,2332,2374,3020,2376,2334						//列車番号上り
											  ,2341,2343,3011,2321,2345,2347,2349,2351,3013,2323,2325,2353,2355,3015,2357,2359,2327,2361,2329,2363,3017,2365,2331,2367,2369,2333,2371,2335,2373,3019,2375,2337,2377},	//列車番号下り

							   {509, 603, 652, 708, 741, 812, 843, 925, 944,1017,1054,1134,1212,1236,1334,1428,1451,1511,1542,1601,1633,1708,1740,1800,1810,1845,1916,1936,2022,2054,2149,2208,2222						//時刻上り
											  , 603, 711, 717, 752, 802, 845, 944,1024,1025,1103,1126,1206,1300,1307,1351,1509,1552,1601,1657,1707,1727,1800,1809,1834,1917,2016,2026,2111,2111,2128,2151,2258,2312},	//時刻下り

					   		   { 10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10  					//始発駅上り
											  ,	  1,   1,   4,   4,   1,   1,   1,   1,   4,   4,   4,   1,   1,   6,   1,   5,   1,   5,   1,   6,   4,   1,   4,   1,   1,   4,   1,   1,   3,   6,   1,   4,   1},	//始発駅下り

					   		   {  1,   1,   1,   4,   1,   1,   1,   7,   1,   4,   4,   1,   6,   1,   1,   1,   6,   4,   1,   4,   1,   1,   4,   1,   6,   1,   4,   1,   3,   1,   4,   1,   1   					//行き先下り
											  ,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10,  10},	//行き先上り
		};

		String[] Station = {"","妙高高原","関山","二本木","新井","北新井","上越妙高","南高田","高田","春日山","直江津"};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("妙高はねうまライン　列車検索 ");
		System.out.println("モードを選択してください");
		System.out.println("０：列車番号→時刻 , １：時刻→列車番号");
		int mode = sc.nextInt();
		
		/////////////////////////列車番号→時刻/////////////////////
		if(mode == 0) {
		System.out.println("列車番号を入力してください。");
		System.out.print("その列車の始発駅・出発時刻・行き先を表示します(末尾のアルファベットは不要) > ");
		
		int Trainnum = sc.nextInt();
		boolean flag = true;
		int i = 0;

		while(i<Timetable[0].length) {
			if(Timetable[0][i] == Trainnum) {

				System.out.println(Station[Timetable[2][i]] + " " + Timetable[1][i] + "発 " + Station[Timetable[3][i]] + "行き");
				System.out.println("引き続き、運用を確認するには、Unyokakunin,java を開いてください。");
				flag = false;
			break;
	}
			i++;
		}
			if(flag) {
				System.out.println("その列車は存在しません。Shu*kura、雪月花など臨時列車には対応していません。ご了承ください。");
			}

			
			/////////////////////////////時刻→列車番号//////////////////////////////////
		}else if(mode == 1) {
			
			for(int i =0;i<Station.length;i++) {	//駅リスト
				System.out.println(i+":"+Station[i]);
			}
			
			System.out.println();
			System.out.println("始発駅No、発時刻(コンマなし)を入力してください。");
			System.out.println("その列車の列車番号を表示します");
			
			System.out.print("始発駅No>");
			int StationNO = sc.nextInt();
			System.out.print("発時刻>");
			int Time = sc.nextInt();
			boolean flag = true;
			int i = 0;

			while(i<Timetable[0].length) {
				if(Timetable[1][i] == Time && Timetable[2][i] == StationNO) {

					System.out.println(Timetable[0][i] + " (末尾アルファベット省略)");
					System.out.println("引き続き、運用を確認するには、Unyokakunin,java を開いてください。");
					flag = false;
				break;
		}
				i++;
			}
				if(flag) {
					System.out.println("その列車は存在しません。Shu*kura、雪月花など臨時列車には対応していません。ご了承ください。");
				}
			
			
		}
		
		
		
		
		
	sc.close();
}


	}