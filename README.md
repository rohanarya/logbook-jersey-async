# logbook-jersey-async
logbook-jersey-async demo project

* Do ./gradlew bootRun to start the service
* Call the below URL and watch the log pattern on the console



1) Test URL - http://localhost:8080/hello
------------------------------------------------

Log Pattern Sync
----------------
2019-10-16 10:28:44.133 demo TRACE 9739 --- [nio-8080-exec-3] org.zalando.logbook.Logbook              : {"origin":"remote","type":"request","correlation":"d3ff000249890612","protocol":"HTTP/1.1","remote":"0:0:0:0:0:0:0:1","method":"GET","uri":"http://localhost:8080/hello","headers":{"accept":["text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3"],"accept-encoding":["gzip, deflate, br"],"accept-language":["en-US,en;q=0.9,hi;q=0.8"],"cache-control":["max-age=0"],"connection":["keep-alive"],"host":["localhost:8080"],"sec-fetch-mode":["navigate"],"sec-fetch-site":["none"],"sec-fetch-user":["?1"],"upgrade-insecure-requests":["1"],"user-agent":["Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36"]}}
2019-10-16 10:28:44.135 demo  INFO 9739 --- [nio-8080-exec-3] c.e.logbook.demo.resource.HelloResource  : Adding logging test sync
2019-10-16 10:28:44.137 demo TRACE 9739 --- [nio-8080-exec-3] org.zalando.logbook.Logbook              : {"origin":"local","type":"response","correlation":"d3ff000249890612","duration":4,"protocol":"HTTP/1.1","status":200,"headers":{"Content-Length":["17"],"Content-Type":["text/html"],"Date":["Wed, 16 Oct 2019 17:28:44 GMT"]},"body":"logbook demo sync"}


2) Test URL - http://localhost:8080/hello/async
------------------------------------------------

Log Pattern A-Sync
----------------
2019-10-16 10:29:22.816 demo TRACE 9739 --- [nio-8080-exec-5] org.zalando.logbook.Logbook              : {"origin":"remote","type":"request","correlation":"ee686a0e7babbb6d","protocol":"HTTP/1.1","remote":"0:0:0:0:0:0:0:1","method":"GET","uri":"http://localhost:8080/hello/async","headers":{"accept":["text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3"],"accept-encoding":["gzip, deflate, br"],"accept-language":["en-US,en;q=0.9,hi;q=0.8"],"connection":["keep-alive"],"host":["localhost:8080"],"sec-fetch-mode":["navigate"],"sec-fetch-site":["none"],"sec-fetch-user":["?1"],"upgrade-insecure-requests":["1"],"user-agent":["Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.120 Safari/537.36"]}}
2019-10-16 10:29:22.821 demo  INFO 9739 --- [nio-8080-exec-5] c.e.logbook.demo.resource.HelloResource  : Adding logging test async