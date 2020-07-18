//validate.js
/* ^ : 시작을 의미
	  	 $ : 끝을 의미
		 a-z : 알파벳 소문자를 의미
		 A-Z : 알파벳 대문자
		 0-9 : 숫자를 의미
		 + : 패턴이 1번 이상 반복됨을 의미
	  	RegExr.com
	  */
     function isUserid(obj){
        var val=obj.value;//사용자가 입력한 값
        //alert(val);
        var pattern=new RegExp(/^[a-zA-Z]{1}[a-zA-Z0-9_!]{3,7}$/);
        //알파벳이 맨앞에 1개 와야함을 의미4~8자 이내로 
        //RegExp객체의 함수test()==> 패턴에 해당하는 문자열이면 true를
        // 반환하고, 아니면 false를 반환한다.
        var b=pattern.test(val);
        console.log('isUserid() b= '+b);
        return b;
    }//usUserid()-------------------------------------
      /*[A-Za-z]{1} : 알파벳이 1자 필수 입력(알파벳으로 시작)
        \w: 알파벳 대소문자, 숫자를 의미(\W==> 알파벳, 숫자가 아니어야 함을 의미)
        .,_,! : 마침표, _ , !를 허용함을 의미
        {3,7} : 3자 이상 7자 이내
      */
    function isPasswd(obj){
        var val=obj.value;
        var pattern=new RegExp(/^[A-Za-z]{1}[\w!_\.]{3,7}$/g);
        var b=pattern.test(val);
        console.log('isPasswd() b='+b);
        return b;
    }
    /*가-힣 : 한글
      \s : 공백문자 허용
      \S : 공백문자 비허용
        + : 패턴이 1개이상 옴을 의미*/
    function isKor(obj){
        var val=obj.value;
        var pattern=/^[가-힣\s]+$/;//이름은 자리수 제한을 안둘꺼야\s는 공백문자 허용
        var b=pattern.test(val);
       console.log("isKor() b="+b);
        return b;
    }
    // \b : 단어의 경계를 나타냄. 정확히 패턴이 일치해야 함을 의미
    // \d{4} : 숫자가 4개 와야함을 의미
    // [-\/] : - 이거나 / 기호를 허용함을 의미
    // \d{1,2} : 숫자가 1개 오거나 2개 올 수 있단 의미
    function isDate(obj){
        var val=obj.value;
        var pattern=/^\b\d{4}[-\/]\d{1,2}[-\/]\d{1,2}\b$/;
        var b=pattern.test(val);
        console.log("isDate() b="+b);
        return b;
    }

    function isphone(obj1,obj2,obj3){
        var val=obj1.value+"-"+obj2.value+"-"+obj3.value;
        //핸드폰 앞자리는 숫자로 3자이며 010또는 011또는 016또는 019
        //중에 하나여야 하고, [-]하이픈이 들어가고 중간자리는 숫자3~4자리
        //마지막번호는 숫자 4자리
        var pattern=/^\b(010|011|016|019)[-]\d{3,4}[-]\d{4}\b$/;
        var b=pattern.test(val);
        console.log("isphone() b="+b);
        return b;
    }
    /*
       asDF-12@naver.com
       asdf.my@google.com
       asdf_12@daum.net
       asdf12@abc.co.kr
       식의 이메일 형식을 체크하는 함수를 작성하기
       알파벳 대소문자, 숫자, -,_,. 허용
       @필수 입력 
    */
    function isEmail(obj){
        var val=obj.value;
        //var pattern=/^(-|_|.|\w)+(\.[\w])*$/;
        var pattern=/^[\w-_]+(\.[\w]+)*@([a-zA-z]+\.)+[a-z]{2,3}$/;
        var b=pattern.test(val);
        console.log('isEmail() b='+b);
        return b;
    }