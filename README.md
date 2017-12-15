# cordova-plugin-firebase-crash-report
[![npm](https://img.shields.io/npm/dt/cordova-plugin-firebase-crash-report.svg)](https://www.npmjs.com/package/cordova-plugin-firebase-crash-report)
[![npm](https://img.shields.io/npm/v/cordova-plugin-firebase-crash-report.svg)](https://www.npmjs.com/package/cordova-plugin-firebase-crash-report)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

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
