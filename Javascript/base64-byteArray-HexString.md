
# javascript base64 to ByteArray(ArrayBuffer) / ByteArray to Hex String
```javascript
		function base64ToArrayBuffer(base64_string) {
			return Uint8Array.from(atob(base64_string), function(c) {
				c.charCodeAt(0);
			});
		}
    
    function toHexString(byteArray) {
			return Array.prototype.map.call(byteArray, function(byte) {
				return ('0' + (byte & 0xFF).toString(16)).slice(-2);
			}).join('');
		}
   
```
