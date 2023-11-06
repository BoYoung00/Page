const mailList = document.querySelector('#mail-sel');
const domain = document.querySelector('#domain');

mailList.addEventListener('change', (event) => {

    if(event.target.value !== "type") {
        domain.value = event.target.value;
        domain.disabled = true;
    } else {
        domain.value = "";
        domain.disabled = false;
    }
});


const year = document.querySelector('#year');
year.addEventListener('focus', function () {
    for (i = 2022; i >= 1940; i--) {
        const YearOption = document.createElement('option');
        YearOption.setAttribute('value', i);
        YearOption.innerText = i;
        this.appendChild(YearOption);
    }
});


const month = document.querySelector('#month');
month.addEventListener('focus', function () {
    for (j = 12; j >= 1; j--) {
        const monthOption = document.createElement('option');
        monthOption.setAttribute('value', j);
        monthOption.innerText = j;
        this.appendChild(monthOption);
    }
});


const day = document.querySelector('#day');
day.addEventListener('focus', function () {
    for (i = 31; i >= 1; i--) {
        const dayOption = document.createElement('option');
        dayOption.setAttribute('value', i);
        dayOption.innerText = i;
        this.appendChild(dayOption);
    }
});


function signupForm() {
        var p1 = document.querySelector('#pw');
        var p2 = document.querySelector('#repw');
        if (p1.value != p2.value) {
            // alert("비밀번호가 일치하지 않습니다.");
            document.getElementById("message2").style.display = "block";
            p1.focus();
            return false;
        } else {
            document.getElementById("message2").style.display = "none";
            alert("환영합니다. 회원가입이 완료되었습니다.");
            return true;
        }
}