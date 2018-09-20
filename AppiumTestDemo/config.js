exports.config = {
  port: 4723,
  desiredCapabilities: {
    platformName: "Android",
    platformVersion: "5.0.2",
    deviceName: "LENOVO Lenovo K920",
    app: "/PATH/SampleLogin/app/build/outputs/apk/debug/app-debug.apk",
    automationName: "UiAutomator2"
  }
};
