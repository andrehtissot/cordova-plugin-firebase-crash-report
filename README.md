# cordova-plugin-firebase-crash-report
[![npm](https://img.shields.io/npm/dt/cordova-plugin-firebase-crash-report.svg)](https://www.npmjs.com/package/cordova-plugin-firebase-crash-report)
[![npm](https://img.shields.io/npm/v/cordova-plugin-firebase-crash-report.svg)](https://www.npmjs.com/package/cordova-plugin-firebase-crash-report)
[![GitHub license](https://img.shields.io/github/license/andrehtissot/cordova-plugin-firebase-crash-report.svg)](https://github.com/andrehtissot/cordova-plugin-firebase-crash-report/blob/master/LICENSE)
[![Known Vulnerabilities](https://snyk.io/test/github/andrehtissot/cordova-plugin-firebase-crash-report/badge.svg?targetFile=package.json)](https://snyk.io/test/github/andrehtissot/cordova-plugin-firebase-crash-report?targetFile=package.json)

Simple Firebase crash report plugin for cordova


## Simple use:
```javascript
FirebaseCrashReport.log(errorMessage);
```

## With callbacks:
```javascript
FirebaseCrashReport.log(errorMessage, successFunction, failureFunction);
```

### Global error reporting example:
```javascript
window.onerror = function(msg, url, line, col, error) {
  FirebaseCrashReport.log("Error: " + msg + "\nurl: " + url
     + "\nline: " + line + (!col ? '' : '\ncolumn: ' + col)
     + (!error ? '' : '\nerror: ' + error));
};
```
