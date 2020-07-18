//joinCheck.js
function check(){
    if(!f.userid.value){
        alert('아이디를 입력하세요');
        f.userid.focus();
        return;
    }
    if(!isUserid(f.userid)){
        alert('아이디는 영문, 숫자,_,!로 4~8자만 가능해요');
        f.userid.select();
        return;
    }
    if(!isPasswd(f.userpwd)){
        alert('비밀번호는 영문자로 시작하고, 영문,숫자,!,_,. 를 포함하여 4~8자 이내여야 해요');
        f.userpwd.select();
        return;
    }
    if(f.userpwd.value != f.userpwd2.value){
        alert('비밀번호와 비밀번호 확인이 달아요');
        f.userpwd2.select();
        return;
    }
    if(!isKor(f.uname)){
        alert('이름은 한글만 가능합니다.');
        f.uname.select();
        return;
    }
    if(!isDate(f.birth)){
      alert('생년월일은 날짜 형식이어야 함');
      f.birth.select();
      return;
  }
  if(!isphone(f.hp1,f.hp2,f.hp3)){
      alert('휴대폰 번호의 형식이 잘못 되었습니다.(010-2222-2222)');
      f.hp1.select();
      return;
  }
  if(!f.hp.value){
      alert('통신사를 선택하세요');
      f.hp.select();
      return;
  }
  if(!isEmail(f.email)){
      alert('이메일 현식에 맞지 않아');
      f.email.select();
      return;
  }
    //월 : 1~12 체크 var mm=f.birth.value.substr(5,1)


    f.submit();
  }