const terms = document.querySelectorAll(".term input");
const forms = document.querySelectorAll(".signup-form>ul>li");
const termNextBtn = document.querySelector(".term-next");
const labelPlaceholers = document.querySelectorAll(".form-text");
const mailText = document.querySelector("#mail")
const firstnameText = document.querySelector("#firstname");
const lastnameText = document.querySelector("#lastname");
const passwordText = document.querySelector("#password-text");
const passwordCheck = document.querySelector(".pass-check");
const passImage = document.querySelector(".password-see");
const birthText = document.querySelector("#birth");
const genderText = document.querySelector("#gender");
const nicknameText= document.querySelector("#nickname-text");
const nextBtn = document.querySelector(".next-btn");
const signupForm = document.querySelector(".signup-form-input");
const currentMail = document.querySelector(".current-mail");
const certification = document.querySelector("#certification");
const submitBtn = document.querySelector(".submit-btn");
const reSendBtn = document.querySelector(".re-send-btn");
const timerText = document.querySelector(".timer");

const CLASSNAME_HIDDEN = "hidden";
const CLASSNAME_LABELMOVE = "labelmove";

const MAILREG = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
const PASSWORDREG_1 = /[A-Za-z\d#?!@$%^&*-]{8,}$/;
const PASSWORDREG_2 = /(?=.*?[a-z])(?=.*?[A-Z])/;
const PASSWORDREG_3 = /(?=.*?[0-9#?!@$%^&*-])/;
const BIRTHREG = /[\d]{6}/;
const GENDERREG = /[1-4]{1}/;

var locationPermission = 'N';
var mailFlag = false;
var firstnameFlag = false;
var lastnameFlag = false;
var passFlag = false;
var birthFlag = false;
var genderFlag = false;
var nicknameFlag = false;
var timer;

terms[0].addEventListener("click",function(){
    if(this.checked){
        for(const term of terms){
            term.checked = true;
        }
    }else{
        for(const term of terms){
            term.checked = false;
        }
    }
});

termNextBtn.addEventListener("click",function(){
    if(!terms[1].checked||!terms[2].checked){
        alert("필수 사항은 체크해주셔야 합니다.");
        return;
    }
    if(terms[3].checked)locationPermission = 'Y';
    $(forms[0]).toggle("slide",1000,function(){
        forms[1].classList.remove(CLASSNAME_HIDDEN);
    });
});

labelPlaceholers.forEach(labelPlaceholder =>{
    labelPlaceholder.addEventListener("focus",function() {
        const label = this.nextSibling.nextSibling;
        label.classList.add(CLASSNAME_LABELMOVE);
        label.style.color = "blue";
    })
    labelPlaceholder.addEventListener("blur",function() {
        const label = this.nextSibling.nextSibling;
        if(this.value===""){
            label.classList.remove(CLASSNAME_LABELMOVE);
            label.style.color = "#808080";
        }else{
            label.style.color = "#808080";
        }
    })
});

mailText.addEventListener("keyup",  function() {
    const img = document.querySelector(`.${this.id} img`);
    if(MAILREG.test(this.value)){
        img.classList.remove(CLASSNAME_HIDDEN);
        mailFlag = true;
    }else{
        img.classList.add(CLASSNAME_HIDDEN);
        mailFlag = false;
    }
});

firstnameText.addEventListener("keyup",function() {
    const img = document.querySelector(".firstname img");
    if(this.value===""){
        img.classList.add(CLASSNAME_HIDDEN);
        firstnameFlag = false;
    }else{
        img.classList.remove(CLASSNAME_HIDDEN);
        firstnameFlag = true;
    }
});

lastnameText.addEventListener("keyup",function() {
    const img = document.querySelector(".lastname img");
    if(this.value===""){
        img.classList.add(CLASSNAME_HIDDEN);
        lastnameFlag = false;
    }else{
        img.classList.remove(CLASSNAME_HIDDEN);
        lastnameFlag = true;
    }
});

passwordText.addEventListener("keyup",  function() {
    if(this.value===""){
        passwordCheck.classList.add(CLASSNAME_HIDDEN);
    }else{
        const firstImg = document.querySelector(".first-check");
        const secondImg = document.querySelector(".second-check");
        const lastImg = document.querySelector(".last-check");
		const passSuccess = document.querySelector(".password-success");
        var flag1 = false;
        var flag2 = false;
        var flag3 = false;
        passFlag = false;
        if(PASSWORDREG_1.test(this.value)){
            firstImg.src = "../img/check.jpg"
            flag1 = true;
        }else{
            firstImg.src = "../img/x.jpg"
        }
        if(PASSWORDREG_2.test(this.value)){
            secondImg.src = "../img/check.jpg"
            flag2 = true;
        }else{
            secondImg.src = "../img/x.jpg"
        }
        if(PASSWORDREG_3.test(this.value)){
            lastImg.src = "../img/check.jpg"
            flag3 = true;
        }else{
            lastImg.src = "../img/x.jpg"
        }
        if(flag1&&flag2&&flag3){
            passwordCheck.classList.add(CLASSNAME_HIDDEN);
			passSuccess.classList.remove(CLASSNAME_HIDDEN);
            passFlag = true;
        }else{
			passSuccess.classList.add(CLASSNAME_HIDDEN);
	        passwordCheck.classList.remove(CLASSNAME_HIDDEN);	
		}
    }
});

passImage.addEventListener("click",function() {
    if(passwordText.type==="password"){
        passwordText.type = "text";
        this.src="../img/passwordSee.jpg";
    }else{
        passwordText.type = "password";
        this.src="../img/passwordNoSee.jpg";
    }
});

birthText.addEventListener("keyup", function() {
    const img = document.querySelector(".birth img");
    if(BIRTHREG.test(birthText.value)){
        genderText.focus();
        birthFlag = true;
        img.classList.remove(CLASSNAME_HIDDEN);
    }else{
        birthFlag = false;
        img.classList.add(CLASSNAME_HIDDEN);
    }
});

genderText.addEventListener("keyup", function() {
    const img = document.querySelector(".gender img");
    if(GENDERREG.test(genderText.value)){
        genderFlag = true;
        img.classList.remove(CLASSNAME_HIDDEN);
    }else{
        genderFlag = false;
        img.classList.add(CLASSNAME_HIDDEN);
    }
});

nicknameText.addEventListener("keyup",function() {
    const img = document.querySelector(".nickname img");
    if(this.value===""){
        img.classList.add(CLASSNAME_HIDDEN);
        nicknameFlag = false;
    }else{
        img.classList.remove(CLASSNAME_HIDDEN);
        nicknameFlag = true;
    }
});

nextBtn.addEventListener("click",function() {
    if(!mailFlag){
        mailText.focus();
        return;
    }
    if(!firstnameFlag){
        firstnameText.focus();
        return;
    }
    if(!lastnameFlag){
        lastnameText.focus();
        return;
    }
    if(!passFlag){
        passwordText.focus();
        return;
    }
    if(!birthFlag){
        birthText.focus();
        return;
    }
    if(!genderFlag){
        genderText.focus();
        return;
    }
    if(!nicknameFlag){
        nicknameText.focus();
        return;
    }
	nextBtn.disabled="true";
	$.ajax({
		type:'POST',
		url:'/signUp',
		data: {
			cmd : 'checkmember',
			mail : mailText.value
		},	
		dataType: 'json',
		success: function(res){
			if(res.sw==='no'){
				alert("회원가입이 불가능합니다.(중복확인)");
                mailText.value = "";
                mailText.focus();
			}else{
                $(forms[1]).toggle("slide",1000,function(){
                    forms[2].classList.remove(CLASSNAME_HIDDEN);
                });
	            currentMail.innerText = mailText.value;
                var time = 300;
    			certification.disabled = false;
			    timer = setInterval(function(){
			        time--;
			        timerText.innerText = `${Math.floor(time/60)}:${(Math.floor(time%60)+"").padStart(2,'0')}`;
			        if(time<=0) {
			            certification.disabled = true;
			            clearInterval(timer);
			        }
			    },1000);
			}
		},
		error: function(request,status,error){
			nextBtn.removeAttribute("disabled");
            alert('code:'+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
        }
	});
});


submitBtn.addEventListener("click",function(){
    if(certification.value.length!==6){
        certification.focus();
    }else{
		submitBtn.disabled="true";
		$.ajax({
			type:'POST',
			url:'/signUp',
			data: {
				cmd : 'signUp',
				mail : mailText.value,
				certification : certification.value,
				firstname : firstnameText.value,
				lastname : lastnameText.value,
				password : passwordText.value,
				regidentNumber : `${birthText.value}${genderText.value}`,
				nickname : nicknameText.value
			},	
			dataType: 'json',
			success: function(res){
                alert("회원가입이 완료되었습니다.");
			},
			error: function(request,status,error){
				submitBtn.removeAttribute("disabled");
	            alert('code:'+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
	        }
		});
    }
});

reSendBtn.addEventListener("click",function(){
	$.ajax({
		type:'POST',
		url:'/signUp',
		data: {
			cmd : 'resend',
			mail : mailText.value
		},	
		dataType: 'json',
		success: function(res){
			alert("메일이 재전송 되었습니다.");
            var time = 300;
		    certification.disabled = false;
			clearInterval(timer);
		    timer = setInterval(function(){
		        time--;
		        timerText.innerText = `${Math.floor(time/60)}:${(Math.floor(time%60)+"").padStart(2,'0')}`;
		        if(time<=0) {
		            certification.disabled = true;
		            clearInterval(timer);
		        }
		    },1000);
		},
		error: function(request,status,error){
            alert('code:'+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);
        }
	});
});