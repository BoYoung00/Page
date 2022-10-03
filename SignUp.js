// window.addEventListener('load', function () {
//     var formElem = document.querySelector('form');
//     formElem.onsubmit = signupForm();
// });

// function submitForm() {
//     let name = document.querySelector('input[name="memberName"]');
//     let id = document.querySelector('input[name="id"]');
//     let pw = document.querySelector('input[name="memberPassword"]');
//     let rpw = document.querySelector('input[name="rePassword"]');
//     let number = document.querySelector('input[name="PhoneNumber"]');
//     let mail = document.querySelector('input[name="memberEmail"]');
//
//     console.log(name.value);
//     console.log(id.value);
//     console.log(pw.value);
//     console.log(rpw.value);
//     console.log(number.value);
//     console.log(mail.value);
//
//     return false;
// }


function signupForm() {
    let pw = document.querySelector('input[name="memberPassword"]');
    let rpw = document.querySelector('input[name="rePassword"]');
    let mail = document.querySelector('input[name="memberEmail"]');
    const patten = /@/;

    var success = true;
    //비밀번호 일치 확인
    if (pw.value !== rpw.value) {
        document.getElementById("message").style.display = "block";
        rpw.focus();
        success = false;
    } else {
        document.getElementById("message").style.display = "none";
        success = true;
    }

    //이메일 '@'포함 확인
    if(patten.test(mail) !== true){
        mail.setCustomValidity('@가 포함되어있지 않습니다.');
        success = false;
    } else {
        mail.setCustomValidity('');
        success = true;
    }

    return success;

}

let name = $('#memberName');
let id = $('#id');
let pw = $('#memberPassword');
let rpw = $('#rpw');
let number = $('#PhoneNumber');
let mail = $('#memberEmail');
let btu = $('#signBut');

$(btu).on('click', function () {
    if ($(name).val() == "") {
        $(name).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    } else if($(id).val() == "") {
        $(id).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    } else if($(pw).val() == "") {
        $(pw).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    } else if($(rpw).val() == "") {
        $(rpw).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    } else if($(number).val() == "") {
        $(number).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    } else if($(mail).val() == "") {
        $(mail).next('label').addClass('warning');
        setTimeout(function () {
            $('label').removeClass('warning');
        }, 1500);
    }
});