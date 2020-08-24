package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegisterPage {

    public AmazonRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "ap_customer_name")
    public WebElement nameBox;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "ap_password_check")
    public WebElement rePasswordBox;

    @FindBy(id = "continue")
    public WebElement continueButton;

//User Story
//	- Amazon Register (kayıt)

//	Ben bir kullanıcı olarak, doğru bilgileri girdikten sonra kayıt olabilmeliyim,
//	        böylece satın alma işlemi gerçekleştirebilirim.

//*	AC 01 : Name box görünür olmalı.
//*	AC 02 : Name box boş bırakılamamalı.
//*	AC 03 : Email box görünür olmalı.
//*	AC 04 : Email box boş bırakılamamalı.
//	AC 05 : Emailin içerisinde 1 tane @ karakteri, 1 tane . olmalı.
//			(hamzayilmaz@gmail.com)
//	AC 06 : Emailin içerisinde @ karekterinden önce en az 1 tane, sonrada
//      	en az 3 tane karakter olmalı.
//			(@gmail.com - hamza@ - hamza@a.a)
//*	AC 07 : Şifre kutusu görünür olmalı.
//	AC 08 : Şifre kutusu boş bırakılamamalı.
//*	AC 09 : 2. Şifre kutusu görünür olmalı.
//	AC 10 : 2. Şifre kutusu boş bırakılamamalı.
//	AC 11 : Şifre en az 6 karakterden oluşmalı.
//	AC 12 : Şifreler birbiriyle aynı olmalı.
//*	AC 13 : Create you amazon account butonu görünür olmalı.

//1. Adım
//	pages paketinin altında test edeceğimiz sayfanın webelement'lerini içeren
//	bir tane class oluşturmalıyız.
//2. Adım
//	test edeceğimiz sayfa için, test methodlarını yazacağımız test class'ı oluşturmak
//	(tests paketinin altında)
//3. Adım
//	properties file'ın içerisine kullanacağımız verileri eklemek.
//	(örnek : kullanici_adi = hamzayilmaz   kullanici_sifresi = Ankara06.)

}
