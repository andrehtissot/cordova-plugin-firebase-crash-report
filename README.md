# cordova-plugin-firebase-crash-report
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
