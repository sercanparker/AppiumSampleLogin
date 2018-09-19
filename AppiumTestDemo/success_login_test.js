var expect = require('chai').expect;
const wdio = require("webdriverio");
var config = require('./config.js').config;
const client = wdio.remote(config);


client.init()
.click('android=new UiSelector().resourceId("sercanparker.com.samplelogin:id/username_EditText_LoginActivity")')
.keys('sercanparker@foo.com')
.click('android=new UiSelector().resourceId("sercanparker.com.samplelogin:id/password_EditText_LoginActivity")')
.keys('bar')
.click('android=new UiSelector().resourceId("sercanparker.com.samplelogin:id/loginButton_LoginActivity")')
.element('android=new UiSelector().resourceId("sercanparker.com.samplelogin:id/loginInfoTextView_LoginActivity")')
.getText().then(function(text){
  expect(text).to.equal('Login Success');
}).end();



