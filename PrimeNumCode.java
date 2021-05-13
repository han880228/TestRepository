
public class 시험0513 {

	public static void main(String[] args) {

		//소수와 합성수를 비교할 수 있는 소스코드를 출력하시오.
		//1. 소수인지 합성수인지 판별할 변수값을 define 한다.
		//2. 해당 변수값에서 -2 한만큼의 루프를 만든다.
		//3. 합성수를 판별하기 위한 코드를 만든다.
		//4. 논리연산자 boolean을 적용하여 소수 혹은 합성수를 출력한다.
		
		int val = 12;
		int di = 2;
		boolean ispn = true;
		
		for(int i = 0; i < val-2; i++)
		{
			if ( 0 == val % di) // '%'는 계속 빼고 남은 값
			{	//합성수
				ispn = false;
			}
		di++;
		}
		
		
		if ( ispn == true )
		{	
			System.out.println(val + " 은 소수입니다.");
		}
		
		else
		{
			System.out.println(val + " 은 합성수입니다.");
		}
		
	
	}

}
