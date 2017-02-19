var exec = require('cordova/exec');
module.exports = FirebaseCrashReport = {
  log: function(message, success, error){
  	var success = success || function(){}, error = error || function(){};
  	exec(success, error, 'FirebaseCrashReport', 'log', [message]);
  }
};
