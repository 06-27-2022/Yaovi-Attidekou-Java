<!DOCTYPE html>
<!-- saved from url=(0068)https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1 -->
<html lang="en" ng-controller="AppCtrl"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style type="text/css">[uib-typeahead-popup].dropdown-menu{display:block;}</style><style type="text/css">.uib-time input{width:50px;}</style><style type="text/css">[uib-tooltip-popup].tooltip.top-left > .tooltip-arrow,[uib-tooltip-popup].tooltip.top-right > .tooltip-arrow,[uib-tooltip-popup].tooltip.bottom-left > .tooltip-arrow,[uib-tooltip-popup].tooltip.bottom-right > .tooltip-arrow,[uib-tooltip-popup].tooltip.left-top > .tooltip-arrow,[uib-tooltip-popup].tooltip.left-bottom > .tooltip-arrow,[uib-tooltip-popup].tooltip.right-top > .tooltip-arrow,[uib-tooltip-popup].tooltip.right-bottom > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.top-left > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.top-right > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.bottom-left > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.bottom-right > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.left-top > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.left-bottom > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.right-top > .tooltip-arrow,[uib-tooltip-html-popup].tooltip.right-bottom > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.top-left > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.top-right > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.bottom-left > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.bottom-right > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.left-top > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.left-bottom > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.right-top > .tooltip-arrow,[uib-tooltip-template-popup].tooltip.right-bottom > .tooltip-arrow,[uib-popover-popup].popover.top-left > .arrow,[uib-popover-popup].popover.top-right > .arrow,[uib-popover-popup].popover.bottom-left > .arrow,[uib-popover-popup].popover.bottom-right > .arrow,[uib-popover-popup].popover.left-top > .arrow,[uib-popover-popup].popover.left-bottom > .arrow,[uib-popover-popup].popover.right-top > .arrow,[uib-popover-popup].popover.right-bottom > .arrow,[uib-popover-html-popup].popover.top-left > .arrow,[uib-popover-html-popup].popover.top-right > .arrow,[uib-popover-html-popup].popover.bottom-left > .arrow,[uib-popover-html-popup].popover.bottom-right > .arrow,[uib-popover-html-popup].popover.left-top > .arrow,[uib-popover-html-popup].popover.left-bottom > .arrow,[uib-popover-html-popup].popover.right-top > .arrow,[uib-popover-html-popup].popover.right-bottom > .arrow,[uib-popover-template-popup].popover.top-left > .arrow,[uib-popover-template-popup].popover.top-right > .arrow,[uib-popover-template-popup].popover.bottom-left > .arrow,[uib-popover-template-popup].popover.bottom-right > .arrow,[uib-popover-template-popup].popover.left-top > .arrow,[uib-popover-template-popup].popover.left-bottom > .arrow,[uib-popover-template-popup].popover.right-top > .arrow,[uib-popover-template-popup].popover.right-bottom > .arrow{top:auto;bottom:auto;left:auto;right:auto;margin:0;}[uib-popover-popup].popover,[uib-popover-html-popup].popover,[uib-popover-template-popup].popover{display:block !important;}</style><style type="text/css">.uib-datepicker-popup.dropdown-menu{display:block;float:none;margin:0;}.uib-button-bar{padding:10px 9px 2px;}</style><style type="text/css">.uib-position-measure{display:block !important;visibility:hidden !important;position:absolute !important;top:-9999px !important;left:-9999px !important;}.uib-position-scrollbar-measure{position:absolute !important;top:-9999px !important;width:50px !important;height:50px !important;overflow:scroll !important;}.uib-position-body-scrollbar-measure{overflow:scroll !important;}</style><style type="text/css">.uib-datepicker .uib-title{width:100%;}.uib-day button,.uib-month button,.uib-year button{min-width:100%;}.uib-left,.uib-right{width:100%}</style><style type="text/css">.ng-animate.item:not(.left):not(.right){-webkit-transition:0s ease-in-out left;transition:0s ease-in-out left}</style><style>@charset "UTF-8";[ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide:not(.ng-hide-animate){display:none !important;}ng\:form{display:block;}.ng-animate-shim{visibility:hidden;}.ng-anchor{position:absolute;}</style><!--<base href="/">--><base href="."><title data-cg-meta="">Coding Games and Programming Challenges to Code Better</title><meta name="description" data-cg-meta="" content="CodinGame is a challenge-based training platform for programmers where you can play with the hottest programming topics. Solve games, code AI bots, learn from your peers, have fun."><meta name="robots" data-cg-meta="" content="index, follow"><meta name="viewport" content="width=device-width,user-scalable=no"><meta property="og:site_name" content="CodinGame"><meta property="og:type" content="website"><meta property="og:title" data-cg-meta="" content="Coding Games and Programming Challenges to Code Better"><meta property="og:description" data-cg-meta="" content="CodinGame is a challenge-based training platform for programmers where you can play with the hottest programming topics. Solve games, code AI bots, learn from your peers, have fun."><meta property="og:image" data-cg-meta="" content="https://files.codingame.com/codingame/codingame_share_pics.jpg"><meta name="twitter:card" content="summary_large_image"><meta name="twitter:title" data-cg-meta="" content="Coding Games and Programming Challenges to Code Better"><meta name="twitter:description" data-cg-meta="" content="CodinGame is a challenge-based training platform for programmers where you can play with the hottest programming topics. Solve games, code AI bots, learn from your peers, have fun."><meta name="twitter:image" data-cg-meta="" content="https://files.codingame.com/codingame/codingame_share_pics.jpg"><link rel="alternate" type="application/atom+xml" title="CodinGame - Blog - Atom" href="https://www.codingame.com/blog/feed/atom/"><link rel="alternate" type="application/rss+xml" title="CodinGame - Blog - RSS" href="https://www.codingame.com/blog/feed/"><link rel="icon" type="image/png" sizes="16x16" href="https://static.codingame.com/assets/favicon_16_16.6776a532.png"><link rel="icon" type="image/png" sizes="32x32" href="https://static.codingame.com/assets/favicon_32_32.0042ee23.png"><link rel="shortcut icon" type="image/x-icon" sizes="32x32" href="https://static.codingame.com/assets/favicon_32_32.61e066ad.ico"><link rel="shortcut icon" type="image/x-icon" sizes="16x16" href="https://static.codingame.com/assets/favicon_16_16.0c96a3a0.ico"><link rel="apple-touch-icon" href="https://static.codingame.com/assets/apple-touch-icon-192x192.0172d90b.png"><link rel="apple-touch-icon-precomposed" sizes="152x152" href="https://static.codingame.com/assets/apple-touch-icon-152x152-precomposed.5cb052db.png"><link rel="apple-touch-icon-precomposed" sizes="120x120" href="https://static.codingame.com/assets/apple-touch-icon-120x120-precomposed.51603488.png"><link href="./Java_code_files/css" rel="stylesheet"><link href="./Java_code_files/css(1)" rel="stylesheet"><link href="./Java_code_files/css(2)" rel="stylesheet"><!----><link rel="canonical" ng-href="https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1" href="https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1"><script type="text/javascript" async="" src="./Java_code_files/analytics.js.download"></script><script gtm="GTM-MXDVJH6" type="text/javascript" async="" src="./Java_code_files/optimize.js.download"></script><script src="./Java_code_files/226638292107391" async=""></script><script async="" src="./Java_code_files/fbevents.js.download"></script><script src="./Java_code_files/sdk.js.download" async="" crossorigin="anonymous"></script><script async="" src="./Java_code_files/gtm.js.download"></script><script type="text/javascript" id="www-widgetapi-script" src="./Java_code_files/www-widgetapi.js.download" async=""></script><script src="./Java_code_files/cb=gapi.loaded_0" async=""></script><script>window.application={"communityAssetsPrefix":"community/","leftTableOfContentPlaygroundIds":[408,25775,40701],"disqusApiKey":"nFj6QPF1t37nIJ4hsdi5A6mv0aGQisKD3k33nmpEJ8pWPRYB7OkGGStCX6IBnxyz","disqusShortname":"techio","codemachineHost":"coderunner.codingame.com","codemachineViewerUrl":"https://{reference}.codingame-app.com","stormUrl":"https://tech.io","codingEscapeUrl":"https://escape.codingame.com","googleApiKey":"657009003548.apps.googleusercontent.com","facebookApiKey":"165331130336219","slackUrl":"https://betacontributors.slack.com/","forumUrl":"https://forum.codingame.com","forumLoginUrl":"https://forum.codingame.com/session/sso?return_path\u003dhttps://www.codingame.com/servlet/ping","forumLogoutUrl":"https://forum.codingame.com/session/logout","jobStoreEnabled":true,"chatServerUrl":"chat.codingame.com","chatPort":443,"codingamerCount":3009934,"userEmailDomainIrcChannels":{"(cs\\.)?example\\.edu":"#example344884","example2\\.edu":"#example321354"},"urlRedirects":[{"id":1,"route":"^/the-accountant$","dest":"/hackathon/the-accountant"},{"id":2,"route":"^/games/puzzles/121","dest":"/training/easy/the-descent"},{"id":4,"route":"^/cg$","dest":"/"},{"id":6,"route":"^/hackathon/nokia-openday-2","dest":"/hackathon/nokia-openday"},{"id":8,"route":"^/clashofcode/?$","dest":"/multiplayer/clashofcode"},{"id":9,"route":"^/training/community/erdos-number$","dest":"/training/community/erdos-number"},{"id":10,"route":"^/training/hard/winamax-golf$","dest":"/training/hard/winamax-sponsored-contest-2"},{"id":11,"route":"^/training/medium/winamax-sponsored-contest$","dest":"/training/medium/winamax-battle"},{"id":12,"route":"^/training/hard/winamax-sponsored-contest-2$","dest":"/training/hard/winamax-sponsored-contest"},{"id":13,"route":"^/training/community/binary-neural-network$","dest":"/training/community/binary-neural-network---part-1"},{"id":14,"route":"^/training/community/the-hungry-duck$","dest":"/training/community/the-hungry-duck---part-1"},{"id":15,"route":"^/multiplayer/bot-programming/coders-of-the-carribean$","dest":"/multiplayer/bot-programming/coders-of-the-caribbean"},{"id":16,"route":"^/contests/community-contest-01","dest":"/contests/mean-max"},{"id":17,"route":"^/training/community/fill-the-square!$","dest":"/training/community/fill-the-square"},{"id":18,"route":"^/multiplayer/optimization/bank-of-america$","dest":"/multiplayer/optimization/the-great-dispatch"},{"id":19,"route":"^/ide/980141293426648e9f31adb0881e1e01ae52d38$","dest":"/ide/puzzle/onboarding"},{"id":20,"route":"^/training/community/box-of-cigars$","dest":"/training/community/box-of-cigars---i"},{"id":21,"route":"^/training/community/box-of-cigars---i$","dest":"/training/community/box-of-cigars"},{"id":22,"route":"^/training/community/the-grand-festival$","dest":"/training/community/the-grand-festival---i"},{"id":23,"route":"^/contests/community-contest-02","dest":"/contests/botters-of-the-galaxy"},{"id":24,"route":"^/training/community/flood-fill-simple-example$","dest":"/training/community/flood-fill-example"},{"id":25,"route":"^/games/community","dest":"/training/medium/depot-organization"},{"id":26,"route":"^/hackathon/decathlon-preview","dest":"/hackathon/hackathlon"},{"id":27,"route":"^/contests/community-contest-03","dest":"/contests/code-royale"},{"id":28,"route":"^/multiplayer/bot-programming/code-royale$","dest":"/multiplayer/bot-programming/code-royale-8"},{"id":29,"route":"^/multiplayer/bot-programming/code-royale-8$","dest":"/multiplayer/bot-programming/code-royale"},{"id":30,"route":"^/training/expert/einstein\u0027s-riddle-solver$","dest":"/training/medium/einsteins-riddle-solver"},{"id":31,"route":"^/training/easy/jack-silver:-the-casino-part1$","dest":"/training/easy/jack-silver-the-casino"},{"id":32,"route":"^/training/medium/aneo-demo-397eef024eb61f2da707df8dd6c96c2a2da$","dest":"/training/medium/aneo-demo-df8dd6c96c2a2da"},{"id":33,"route":"^/training/medium/may-the-triforce-be-with-you!$","dest":"/training/easy/may-the-triforce-be-with-you"},{"id":34,"route":"^/hackathon/amadeus-student-challenge","dest":"/hackathon/amadeus-challenge"},{"id":35,"route":"^/training/medium/aneo-demo-df8dd6c96c2a2da$","dest":"/training/medium/aneo"},{"id":36,"route":"^/multiplayer/bot-programming/cok-tmp$","dest":"/multiplayer/bot-programming/code-of-kutulu"},{"id":37,"route":"^/multiplayer/bot-programming/locm-666$","dest":"/multiplayer/bot-programming/locm"},{"id":38,"route":"^/multiplayer/bot-programming/locm$","dest":"/multiplayer/bot-programming/legend-of-code-magic"},{"id":39,"route":"^/multiplayer/bot-programming/legend-of-code-magic$","dest":"/multiplayer/bot-programming/legends-of-code-magic"},{"id":40,"route":"^/hackathon/thales-towers-2018","dest":"/hackathon/thales-hackathon-2018"},{"id":41,"route":"^/contests/community-contest-06","dest":"/contests/a-star-craft"},{"id":43,"route":"^/multiplayer/optimization/a-star-craft-unfinished$","dest":"/multiplayer/optimization/a-star-craft"},{"id":44,"route":"^/training/medium/langton\u0027s-ant$","dest":"/training/medium/langtons-ant"},{"id":45,"route":"^/hackathon/klee-group","dest":"/hackathon/klee"},{"id":46,"route":"^/contests/community-contest-07","dest":"/contests/xmas-rush"},{"id":47,"route":"^/societe-generale","dest":"/hackathon/societe-generale"},{"id":48,"route":"^/training/medium/equaling-arrays$","dest":"/training/medium/equalizing-arrays"},{"id":49,"route":"^/ranking-multiplayer/platinum-rift$","dest":"/leaderboards/puzzle/platinum-rift/global"},{"id":50,"route":"^/contests/community-contest-08","dest":"/contests/code-a-la-mode"},{"id":51,"route":"^/multiplayer/codegolf/chuck-norris-code-golf$","dest":"/multiplayer/codegolf/chuck-norris-codesize"},{"id":52,"route":"^/multiplayer/bot-programming/utg2018-demo-c380c$","dest":"/multiplayer/bot-programming/utg2019-demo-c370c"},{"id":53,"route":"^/contests/worldcup-july-2019","dest":"/contests/detective-pikaptcha"},{"id":54,"route":"^/hackathon/enedis-2019-demo-55oAl421","dest":"/hackathon/enedis-2019-demo-55oal421"},{"id":55,"route":"^/hackathon/enedis-2019-55oAl421","dest":"/hackathon/enedis-2019-55oal421"},{"id":56,"route":"^/contests/july-contest","dest":"/contests/detective-pikaptcha"},{"id":58,"route":"^/training/medium/quarternion-multiplication$","dest":"/training/medium/quaternion-multiplication"},{"id":60,"route":"^/hackathon/unleash-the-geek-2019$","dest":"/hackathon/unleash-the-geek-2019-86477221"},{"id":61,"route":"^/contests/mystery-sponsor$","dest":"/contests/unleash-the-geek-amadeus"},{"id":62,"route":"^/hackathon/facebook-2019$","dest":"/hackathon/facebook-2019-xk7"},{"id":63,"route":"^/leaderboards/challenge/facebook-2019/global$","dest":"/leaderboards/challenge/facebook-2019-xk7/global"},{"id":64,"route":"^/hackathon/ea-2019-tron-plus$","dest":"/hackathon/ea-2019-battlegrounds"},{"id":65,"route":"^/training/easy/advanced-graffiti-on-the-fence$","dest":"/training/easy/graffiti-on-the-fence"},{"id":66,"route":"^/multiplayer/bot-programming/utg2019-demo-c370c$","dest":"/multiplayer/bot-programming/utg2019-demo-c370c-disabled"},{"id":67,"route":"^/sc2020","dest":"/contests/spring-challenge-2020"},{"id":68,"route":"^/fc2020","dest":"/contests/fall-challenge-2020"},{"id":69,"route":"^/hackathon/ubisoft-bordeaux/coding-challenge","dest":"/hackathon/ubisoft-bordeaux-coding-challenge"},{"id":71,"route":"^/multiplayer/bot-programming/appsflyer-510ce8$","dest":"/multiplayer/bot-programming/appsflyer-510ce8-disabled"},{"id":72,"route":"^/sc2021","dest":"/contests/spring-challenge-2021"},{"id":73,"route":"^/multiplayer/bot-programming/7306c92c81ee1c7be241c3d5d2282af54d2$","dest":"/multiplayer/bot-programming/spring-challenge-2021"},{"id":74,"route":"^/training/easy/sum-of-spirals-diagonales$","dest":"/training/easy/sum-of-spirals-diagonals"},{"id":75,"route":"^/training/medium/ancestors-\u0026-descendants$","dest":"/training/medium/ancestors-descendants"},{"id":76,"route":"^/training/medium/ascii-art-:-glass-stacking$","dest":"/training/medium/ascii-art-glass-stacking"},{"id":77,"route":"^/training/medium/divine!$","dest":"/training/medium/divine"},{"id":78,"route":"^/fc2021","dest":"/contests/fall-challenge-2021"},{"id":79,"route":"^/multiplayer/bot-programming/code-keeper---the-hero-beta$","dest":"/multiplayer/bot-programming/code-keeper---the-hero"},{"id":80,"route":"^/multiplayer/bot-programming/wondev-woman$","dest":"/multiplayer/bot-programming/amazonial"},{"id":82,"route":"^/multiplayer/bot-programming/coders-of-the-caribbean$","dest":"/multiplayer/bot-programming/galleon-wars"},{"id":83,"route":"^/multiplayer/bot-programming/coders-strike-back$","dest":"/multiplayer/bot-programming/mad-pod-racing"},{"id":84,"route":"^/multiplayer/bot-programming/ghost-in-the-cell$","dest":"/multiplayer/bot-programming/cyborg-uprising"},{"id":85,"route":"^/multiplayer/optimization/code-of-the-rings$","dest":"/multiplayer/optimization/brain-fork"},{"id":86,"route":"^/multiplayer/bot-programming/codebusters$","dest":"/multiplayer/bot-programming/soul-snatchers"},{"id":87,"route":"^/multiplayer/bot-programming/fantastic-bits$","dest":"/multiplayer/bot-programming/broomstick-flyers"},{"id":88,"route":"^/multiplayer/bot-programming/tron-battle$","dest":"/multiplayer/bot-programming/line-racing"},{"id":89,"route":"^/training/medium/bender-episode-1$","dest":"/training/medium/blunder-episode-1"},{"id":90,"route":"^/training/hard/bender-episode-2$","dest":"/training/hard/blunder-episode-2"},{"id":91,"route":"^/training/hard/bender-episode-3$","dest":"/training/hard/blunder-episode-3"},{"id":92,"route":"^/training/medium/the-last-crusade-episode-1$","dest":"/training/medium/the-fall-episode-1"},{"id":93,"route":"^/training/hard/the-last-crusade-episode-2$","dest":"/training/hard/the-fall-episode-2"},{"id":94,"route":"^/training/expert/the-last-crusade-episode-3$","dest":"/training/expert/the-fall-episode-3"},{"id":95,"route":"^/multiplayer/bot-programming/back-to-the-code$","dest":"/multiplayer/bot-programming/time-travelers"},{"id":96,"route":"^/training/easy/chuck-norris$","dest":"/training/easy/unary"},{"id":97,"route":"^/training/medium/skynet-revolution-episode-1$","dest":"/training/medium/death-first-search-episode-1"},{"id":98,"route":"^/training/hard/skynet-revolution-episode-2$","dest":"/training/hard/death-first-search-episode-2"},{"id":99,"route":"^/sc2022","dest":"contests/spring-challenge-2022"},{"id":132,"route":"^/training/easy/cubic-bezier-curves$","dest":"/training/easy/linear-bezier-curves"},{"id":165,"route":"^/training/easy/linear-bezier-curves$","dest":"/training/easy/cubic-bezier-curves"},{"id":198,"route":"^/training/hard/n-perls-necklace$","dest":"/training/hard/n-pearls-necklace"}],"googleCaptchaKey":"6Lf11wcUAAAAAE5-uVa1hraNn_XmEp5Z3M40uQ9z","googleInvisibleCaptchaKey":"6LdJABoUAAAAAKVXN6wjUbw-CwWSWTyN9sKXDNl1","documentationPlaygroundId":408,"githubApiKey":"510157f40e1344c2cfb3","serverTime":1659536773053,"programmingLanguageNames":{"Swift3":"Swift 3","Cross":"set","Hadoop":"Hadoop Ecosystem","DataScience":"Data Science","Spring":"Spring Framework","Angular":"Angular 2+","WindowsAdmin":"Windows Administration","AngularOld":"Angular-unused","NetworkAdmin":"Network Administration","Python3":"Python 3","ObjectiveC":"Objective-C","Javascript":"JavaScript","Spark":"Apache Spark","Python":"Python 2"},"advertisingConsole":[],"advertisingBanner":[{"imageBinaryId":76558264472322,"link":"https://www.codingame.com/work/codingame-coderpad-tech-hiring-survey-2022/"}],"languageServerConfig":{"C#":{"fileUri":{"player":"file:///tmp/project/Player.cs","solution":"file:///tmp/project/Main.cs"},"language":"csharp"},"Java":{"fileUri":{"player":"file:///tmp/project/src/main/java/Player.java","solution":"file:///tmp/project/src/main/java/Solution.java"},"language":"java"},"C++":{"fileUri":{"player":"file:///tmp/project/main.cpp","solution":"file:///tmp/project/main.cpp"},"language":"cpp"},"Rust":{"fileUri":{"player":"file:///tmp/project/main.rs","solution":"file:///tmp/project/main.rs"},"language":"rust"},"C":{"fileUri":{"player":"file:///tmp/project/main.c","solution":"file:///tmp/project/main.c"},"language":"c"},"Scala":{"fileUri":{"player":"file:///tmp/project/src/main/scala/Main.scala","solution":"file:///tmp/project/src/main/scala/Main.scala"},"language":"scala"},"Go":{"fileUri":{"player":"file:///tmp/project/main.go","solution":"file:///tmp/project/main.go"},"language":"go"},"Bash":{"fileUri":{"player":"file:///tmp/project/main.bash","solution":"file:///tmp/project/main.bash"},"language":"bash"},"Groovy":{"fileUri":{"player":"file:///tmp/project/Main.gy","solution":"file:///tmp/project/Main.gy"},"language":"groovy"},"Angular":{"fileUri":{"cross":"file:///tmp/project/main.ts","tester":"file:///tmp/project/src/app/answer.component.test.ts","solution":"file:///tmp/project/src/app/answer.component.ts","validator":"file:///tmp/project/src/app/validator.ts","possibleSolution":"file:///tmp/project/src/app/possible_solution.component.ts"},"language":"angular"},"Kotlin":{"fileUri":{"player":"file:///tmp/project/Main.kt","solution":"file:///tmp/project/Main.kt"},"language":"kotlin"},"OCaml":{"fileUri":{"player":"file:///tmp/project/main.ml","solution":"file:///tmp/project/main.ml"},"language":"ocaml"},"Python3":{"fileUri":{"player":"file:///tmp/project/main.py","solution":"file:///tmp/project/main.py"},"language":"python"},"ObjectiveC":{"fileUri":{"cross":"file:///tmp/project/main.m","tester":"file:///tmp/project/Tester.m","solution":"file:///tmp/project/Answer.m","validator":"file:///tmp/project/Validator.m","possibleSolution":"file:///tmp/project/PossibleAnswer.m"},"language":"objective-c"},"PHP":{"fileUri":{"player":"file:///tmp/project/main.php","solution":"file:///tmp/project/main.php"},"language":"php"},"Lua":{"fileUri":{"player":"file:///tmp/project/main.lua","solution":"file:///tmp/project/main.lua"},"language":"lua"},"Swift":{"fileUri":{"player":"file:///tmp/project/Sources/project/main.swift","solution":"file:///tmp/project/Sources/project/main.swift"},"language":"swift"},"Ruby":{"fileUri":{"player":"file:///tmp/project/main.rb","solution":"file:///tmp/project/main.rb"},"language":"ruby"},"Python":{"fileUri":{"player":"file:///tmp/project/main.py","solution":"file:///tmp/project/main.py"},"language":"python"},"Dart":{"fileUri":{"player":"file:///tmp/project/main.dart","solution":"file:///tmp/project/main.dart"},"language":"dart"},"Clojure":{"fileUri":{"player":"file:///tmp/project/main.clj","solution":"file:///tmp/project/main.clj"},"language":"clojure"}},"languageServerUrl":"wss://lsp-mutualized-community.codingame.com","initialVisibleLiveStreamsCount":0,"newChatUrl":"wss://new-chat.codingame.com","name":"codingame","codingameUrl":"https://www.codingame.com","completionUrl":"https://completion.codingame.com/completion","pushServerUrl":"https://push-community.codingame.com","mixpanelFilter":"(52\\.1\\.3\\.129)|(52\\.20\\.190\\.26)|(109\\.205\\.6\\.57)|(88\\.188\\.240\\.30)|(34\\.193\\.168\\.145)|(54\\.89\\.200\\.91)|(77\\.136\\.86\\.88)|(52\\.173\\.198\\.76)|(52\\.173\\.247\\.126)|(52\\.176\\.49\\.24)|(52\\.173\\.198\\.86)|(13\\.67\\.140\\.206)|(52\\.176\\.96\\.140)","mixpanelIgnoreEventRegex":"Onboarding|Chat|Solution|Read|View|Scroll|Ping","amplitudeToken":"ecc0b9f76710f07825ed40270d4623e5","userIP":"162.199.147.121","hashedUserIP":"sZaS/M/MWO4HHIWpQO4DZqEw9PP60jZVWudN5nEMXQ0\u003d","isProd":true},window.session={"codinGamer":{"globalId":"e824a208-a50c-1340-09f3-0911255d4476","userId":5014813,"email":"mattidekou@gmail.com","countryId":"US","publicHandle":"340204ba8042864a1c980d18330c7a2d3184105","privateHandle":"a9b92a1ad50891d8d27c5bebc8ddd915c0d90506","formValues":{},"registerOrigin":"GOOGLE","enable":false,"rank":578500,"formCachedValues":{},"creationTime":1659369717420,"onlineSince":1659536460248,"hiddenFromFriendFinder":false,"shareAllSolutions":false,"level":1,"xp":5,"category":"UNKNOWN","privateUser":false,"createdCoursesCount":0,"alreadyAnsweredOptin":false},"countryCode":"US","newFeatures":[],"enabledNotifications":["clash-invite","contest-scheduled","contest-started","contest-over","clash-over","following","new-puzzle","friend-registered","invitation-accepted","new-comment","new-comment-response","achievement-unlocked","new-hint","promoted-league","contest-soon","puzzle-of-the-week","eligible-for-next-league","feature","new-level","career-new-candidate","career-update-candidate","custom","new-blog","contribution-received","contribution-accepted","contribution-refused","contribution-clash-mode-removed","quest-completed","new-league-opened"],"notificationConfig":{"soundEnabled":true,"nativeNotificationEnabled":false},"actionTypes":{"deleteContribution":{"authorPolicy":"ALLOWED"},"receiveCareerNotification":{"authorPolicy":"ROLE"},"deleteComment":{"authorPolicy":"ALLOWED"},"submitMultiContribution":{"authorPolicy":"ROLE"},"sendPingEmailToAll":{"authorPolicy":"ROLE"},"accessCoursesBeta":{"authorPolicy":"ROLE"},"editAcceptedContribution":{"authorPolicy":"ALLOWED"},"hideStream":{"authorPolicy":"ROLE"},"createComment":{"authorPolicy":"ROLE"},"updateAvatar":{"minCodinGamerCount":1,"authorPolicy":"ROLE"},"updateAllAvatar":{"authorPolicy":"ROLE"},"accessDisabledLeaderboard":{"authorPolicy":"ROLE"},"createContribution":{"authorPolicy":"ROLE"},"impersonate":{"authorPolicy":"DENIED"},"editComment":{"authorPolicy":"ALLOWED"},"editContribution":{"authorPolicy":"ALLOWED"},"denyPuzzleContribution":{"authorPolicy":"DENIED"},"sendPingEmailToOptinCodingamers":{"authorPolicy":"ROLE"},"denyClashContribution":{"authorPolicy":"DENIED"},"validateClashContribution":{"authorPolicy":"DENIED"},"sendPrivateMessageToAll":{"authorPolicy":"ROLE"},"denyContribution":{"authorPolicy":"DENIED"},"editClashContribution":{"authorPolicy":"ALLOWED"},"updateCover":{"minCodinGamerCount":1,"authorPolicy":"ROLE"},"editPuzzleContribution":{"authorPolicy":"ALLOWED"},"sendPrivateMessageToOptinCodingamers":{"authorPolicy":"ROLE"},"editAcceptedPuzzleContribution":{"authorPolicy":"ALLOWED"},"updateCareerSettings":{"authorPolicy":"ROLE"},"editAcceptedClashContribution":{"authorPolicy":"ALLOWED"},"validateContribution":{"authorPolicy":"DENIED"},"validatePuzzleContribution":{"authorPolicy":"DENIED"},"banStreamer":{"authorPolicy":"ROLE"},"updateAllCover":{"authorPolicy":"ROLE"}},"chatToken":"5014813 2022-08-03 eOru5dks5uZM1FZkQ6AvwWtg2fqDEFSy/01eXmm9lLDUEPgW5aahhCN2Ml4fVP9URVfPLVgime3X3um36Vq79QZzuUYDt5+FSu3Er+0YDjzkOMlFXrukGaTAQyl4VlcIjYCfjnmAiPLg/sjX1M0nUzJfWemtgEOImSpCEgmeTiQ\u003d","disqusSsoPayload":"eyJpZCI6IjUwMTQ4MTMiLCJ1c2VybmFtZSI6IkFub255bW91cyIsImVtYWlsIjoibWF0dGlkZWtvdUBnbWFpbC5jb20ifQ\u003d\u003d 6be9f448a52159c10964029aca3b4b5884e733a4 1659536773","gaveFeedbackOnCurrentCompany":false,"xpThresholds":[{"level":1,"xpThreshold":0,"cumulativeXp":0},{"level":2,"xpThreshold":28,"cumulativeXp":28,"rewardLanguages":{"1":"Les niveaux vous permettent de suivre vos progrès sur la plate-forme.","2":"Levels allow you to keep track of your progression while sharpening your skills."}},{"level":3,"xpThreshold":51,"cumulativeXp":79},{"level":4,"xpThreshold":80,"cumulativeXp":159},{"level":5,"xpThreshold":111,"cumulativeXp":270},{"level":6,"xpThreshold":146,"cumulativeXp":416},{"level":7,"xpThreshold":185,"cumulativeXp":601},{"level":8,"xpThreshold":226,"cumulativeXp":827},{"level":9,"xpThreshold":270,"cumulativeXp":1097},{"level":10,"xpThreshold":316,"cumulativeXp":1413},{"level":11,"xpThreshold":364,"cumulativeXp":1777},{"level":12,"xpThreshold":415,"cumulativeXp":2192},{"level":13,"xpThreshold":468,"cumulativeXp":2660},{"level":14,"xpThreshold":523,"cumulativeXp":3183},{"level":15,"xpThreshold":580,"cumulativeXp":3763},{"level":16,"xpThreshold":640,"cumulativeXp":4403},{"level":17,"xpThreshold":700,"cumulativeXp":5103},{"level":18,"xpThreshold":763,"cumulativeXp":5866},{"level":19,"xpThreshold":828,"cumulativeXp":6694},{"level":20,"xpThreshold":894,"cumulativeXp":7588,"rewardLanguages":{"1":"Vous venez d\u0027obtenir les droits de modération des contributions communautaires. Plus d\u0027infos sur \u003ca target\u003d\"_blank\" href\u003d\"https://www.codingame.com/forum/t/community-contributions-and-moderator-rights/1844\"\u003ele forum\u003c/a\u003e.","2":"You have just obtained the moderation rights on community contributions. More info in \u003ca target\u003d\"_blank\" href\u003d\"https://www.codingame.com/forum/t/community-contributions-and-moderator-rights/1844\"\u003ethe forum\u003c/a\u003e."}},{"level":21,"xpThreshold":962,"cumulativeXp":8550},{"level":22,"xpThreshold":1031,"cumulativeXp":9581},{"level":23,"xpThreshold":1103,"cumulativeXp":10684},{"level":24,"xpThreshold":1175,"cumulativeXp":11859},{"level":25,"xpThreshold":1250,"cumulativeXp":13109},{"level":26,"xpThreshold":1325,"cumulativeXp":14434},{"level":27,"xpThreshold":1402,"cumulativeXp":15836},{"level":28,"xpThreshold":1481,"cumulativeXp":17317},{"level":29,"xpThreshold":1561,"cumulativeXp":18878,"rewardLanguages":{"1":"Vous pouvez maintenant éditer les contributions communautaires acceptées. Plus d\u0027infos sur \u003ca target\u003d\"_blank\" href\u003d\"https://www.codingame.com/forum/t/community-contributions-and-moderator-rights/1844\"\u003ele forum\u003c/a\u003e.","2":"You can now edit the accepted community contributions. More info in \u003ca target\u003d\"_blank\" href\u003d\"https://www.codingame.com/forum/t/community-contributions-and-moderator-rights/1844\"\u003ethe forum\u003c/a\u003e."}},{"level":30,"xpThreshold":1643,"cumulativeXp":20521},{"level":31,"xpThreshold":1726,"cumulativeXp":22247},{"level":32,"xpThreshold":1810,"cumulativeXp":24057},{"level":33,"xpThreshold":1895,"cumulativeXp":25952},{"level":34,"xpThreshold":1982,"cumulativeXp":27934},{"level":35,"xpThreshold":2070,"cumulativeXp":30004},{"level":36,"xpThreshold":2160,"cumulativeXp":32164},{"level":37,"xpThreshold":2250,"cumulativeXp":34414},{"level":38,"xpThreshold":2342,"cumulativeXp":36756},{"level":39,"xpThreshold":2435,"cumulativeXp":39191},{"level":40,"xpThreshold":2529,"cumulativeXp":41720},{"level":41,"xpThreshold":2625,"cumulativeXp":44345},{"level":42,"xpThreshold":2721,"cumulativeXp":47066,"rewardLanguages":{"1":"La réponse à toutes les questions, n\u0027est-ce pas ?","2":"The answer to everything, right?"}},{"level":43,"xpThreshold":2819,"cumulativeXp":49885},{"level":44,"xpThreshold":2918,"cumulativeXp":52803},{"level":45,"xpThreshold":3018,"cumulativeXp":55821},{"level":46,"xpThreshold":3119,"cumulativeXp":58940},{"level":47,"xpThreshold":3222,"cumulativeXp":62162},{"level":48,"xpThreshold":3325,"cumulativeXp":65487},{"level":49,"xpThreshold":3430,"cumulativeXp":68917},{"level":50,"xpThreshold":3535,"cumulativeXp":72452}],"nextVisibleChallenges":[],"user":{"id":5014813,"email":"mattidekou@gmail.com","languageId":2,"status":"ACTIVE","properties":{"testSessionConfig":{"predilectionLanguage":"Java"},"xpConfig":{"lastTotalXp":5},"privacySettings-codingame":{"facebook":true,"analytics":true,"advertising":true},"featuredEventsListLastVisit":"1659449980327","abtesting":{"Quick AB 1":"variant-1A"},"ideHelperStatus":{"multiPlayViews":2},"cookiesBanner-codingame":{"seen":true}}},"visitor":false,"admin":false,"recruiterAdmin":false,"languageId":2,"userId":5014813,"userEmail":"mattidekou@gmail.com","impersonated":false,"activatedFeatures":[]}</script><script>cgDataLayer=[],cgDataLayer.push({site:"b2c"}),cgDataLayer.push({event:"cgPageview"})</script><style>.async-hide{opacity:0!important}</style><script>window.session&&window.session.userId||-1!==window.navigator.userAgent.toLowerCase().indexOf("phantomjs")||function(e,n,s,t,a,o,i,d,c){n.className+=" "+s,o.start=1*new Date,o.end=i=function(){n.className=n.className.replace(RegExp(" ?"+s),"")},(e[t]=e[t]||[]).hide=o,setTimeout((function(){i(),o.end=null}),4e3),o.timeout=4e3}(window,document.documentElement,"async-hide","cgDataLayer",0,{"GTM-MXDVJH6":!0})</script><script>window.loadGtm=function(){!function(e,t,a,n,g){e[n]=e[n]||[],e[n].push({"gtm.start":(new Date).getTime(),event:"gtm.js"});var m=t.getElementsByTagName(a)[0],o=t.createElement(a);o.async=!0,o.src="https://www.googletagmanager.com/gtm.js?id=GTM-MXDVJH6&l=cgDataLayer",m.parentNode.insertBefore(o,m)}(window,document,"script","cgDataLayer")}</script><script src="./Java_code_files/js" async="" defer="defer"></script><script src="./Java_code_files/client.js.download" gapi_processed="true"></script><script src="./Java_code_files/iframe_api" async="" defer="defer"></script><link href="./Java_code_files/app-82f7e61d.css" rel="stylesheet"><script id="facebook-jssdk" async="" src="./Java_code_files/sdk.js(1).download"></script><style data-jss="" data-meta="Themed">
.codingamerCard-0-1-2 {
  width: 370px;
  cursor: initial;
  height: 275px;
  display: inline-block;
  position: relative;
  text-align: left;
  background-color: #ffffff;
}
.header-0-1-3 {
  width: 100%;
  height: 135px;
  display: block;
  position: relative;
}
.headerOverlay-0-1-4 {
  left: 0;
  width: 100%;
  bottom: 0;
  height: 107px;
  position: absolute;
  background-image: linear-gradient(rgba(19, 28, 37, 0), rgba(19, 28, 37, 0.9));;
}
.coverLink-0-1-5 {
  width: 100%;
  height: 100%;
  display: block;
  background-size: cover;
  background-repeat: no-repeat;
  background-position: right;
}
.profilePicture-0-1-6 {
  width: 95px;
  border: none;
  bottom: 0;
  height: 95px;
  display: block;
  position: absolute;
  margin-left: 12px;
  margin-bottom: 12px;
  background-size: cover;
  background-color: #454c55;
  background-repeat: no-repeat;
  background-position: center;
}
.onlineMarker-0-1-7 {
  top: 5px;
  right: 5px;
  width: 7px;
  height: 7px;
  position: absolute;
  border-radius: 50%;
  background-color: #4aad6d;
}
.pseudoContainer-0-1-8 {
  left: 107px;
  width: calc(100%-95px-12px-12px-12px);
  bottom: 0;
  margin: 12px;
  display: flex;
  position: absolute;
  margin-bottom: 9px;
  flex-direction: column;
  justify-content: flex-end;
}
.pseudoCard-0-1-9 {
  overflow: hidden;
  font-size: 17px;
  transition: opacity 0.2s;
  font-weight: 700;
  white-space: normal;
  text-overflow: ellipsis;
}
.pseudoCard-0-1-9, .pseudoCard-0-1-9:visited, .pseudoCard-0-1-9:active, .pseudoCard-0-1-9:hover {
  color: #ffffff;
}
.taglineCard-0-1-10 {
  color: #ffffff;
  overflow: hidden;
  font-size: 14px;
  font-weight: 400;
  white-space: normal;
  text-overflow: ellipsis;
}
.taglineCard-0-1-10 a {
  color: #f2bb13;
  border: none;
  transition: opacity 0.2s;
  text-decoration: none;
}
.taglineCard-0-1-10 a:hover {
  opacity: 0.7;
}
.infoContainer-0-1-11 {
  margin: 12px;
  display: flex;
  align-items: center;
}
.infoField-0-1-12 {
  color: #454c55;
  display: flex;
  font-size: 13px;
  align-items: center;
  font-weight: 400;
}
.infoField-0-1-12 sup {
  font-size: 8px;
  margin-left: 3px;
  marginbottom: 4;
  text-transform: uppercase;
}
.codingamerCardLevel-0-1-13 {
  margin-right: 22px;
}
.icon-0-1-14 {
  width: 17px;
  height: 17px;
  margin-right: 5px;
}
.icon-0-1-14.xp-level-10 {
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAMAAAAMs7fIAAAAPFBMVEVHcEx8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXZ8xXabyRAvAAAAE3RSTlMAzIHjeunH8lwV2CagT0bqGqq+iIh2gQAAAHVJREFUGNNtkDkSxDAIBMc2Eki+3f//qwNpay93AtUBNYMkqdjg+GBFnUg0UjQx8maUpOCTkMr0ZaYi66v3acpdRFdZDjnBqRNSBhewrPt16Lj2dQHkUF/BVMGVgblsEbGVGcgyoLarXgF7yPOf+aHXQ/ef/9xZwg3VCNb3cwAAAABJRU5ErkJggg==);
}
.icon-0-1-14.xp-level-20 {
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAMAAAAMs7fIAAAAPFBMVEVHcEy2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oou2oovcAGgHAAAAE3RSTlMAzIHjeunH8lwV2CagT0bqGqq+iIh2gQAAAHVJREFUGNNtkDkSxDAIBMc2Eki+3f//qwNpay93AtUBNYMkqdjg+GBFnUg0UjQx8maUpOCTkMr0ZaYi66v3acpdRFdZDjnBqRNSBhewrPt16Lj2dQHkUF/BVMGVgblsEbGVGcgyoLarXgF7yPOf+aHXQ/ef/9xZwg3VCNb3cwAAAABJRU5ErkJggg==);
}
.icon-0-1-14.xp-level-30 {
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAMAAAAMs7fIAAAAPFBMVEVHcEyEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqSEmqQw9Rv6AAAAE3RSTlMAzIHjeunH8lwV2CagT0bqGqq+iIh2gQAAAHVJREFUGNNtkDkSxDAIBMc2Eki+3f//qwNpay93AtUBNYMkqdjg+GBFnUg0UjQx8maUpOCTkMr0ZaYi66v3acpdRFdZDjnBqRNSBhewrPt16Lj2dQHkUF/BVMGVgblsEbGVGcgyoLarXgF7yPOf+aHXQ/ef/9xZwg3VCNb3cwAAAABJRU5ErkJggg==);
}
.icon-0-1-14.xp-level-40 {
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAMAAAAMs7fIAAAARVBMVEX6qwD6qwD6qwD6qwD6qwD6qwD6qwBHcEz6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwD6qwBiWiDgAAAAFnRSTlP8W157F8rpAAPygeN52MOfJhNPR6u+F1rjqAAAAIpJREFUGNNtkDESwjAQAzeJ7fNBQiDA/v+pFJgqqNDcaFSsjogeZalp1qVEjyB6TM2v2hQ96HERUAEv0YlZGB1wDspV1J9dC+u4c0QrVQRzTkGspN6avuKl7aaJuB/tXaK827GLpG49vuqbJlW5P57TPD0fd7Syiluqmpu4Dh4ABs+Z+c+u0/bTfz4TYA1dkwcPkQAAAABJRU5ErkJggg==);
}
.icon-0-1-14.xp-level-50 {
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAARCAMAAAAMs7fIAAAAQlBMVEX4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4UzhHcEz4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4Uzj4UzjQLdRJAAAAFXRSTlP86VteF3rKAAPygePYw6AmE09Gq74nEbVqAAAAiUlEQVQY022QORLDMAwDV7Ykiolz2vv/r6aIUjkoMBwMigWJGFFbT7O3GiOCGLEUvypLjGDERUAFvMQgVmF2wDWoV1F/dq20eeeMGl0Ec01B7KTeiu6xa7lpIt5f5ahRj/K6i6RuI74amyZdeTzfy7q8nw+008QtVc1NbJMHgMlzZv6z67T99J8PrvIMuMSW2SMAAAAASUVORK5CYII=);
}
.codingamerCardRank-0-1-15 {
  width: 17px;
  height: 17px;
  display: inline-block;
  margin-right: 7px;
  vertical-align: middle;
  background-size: contain;
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAMAAAC6V+0/AAAAn1BMVEVHcEwgJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSrEJaeUAAAANHRSTlMABJmJ26xWBlsDVeD531PjXIr6VOSmq8epxvzhhD/9Csity9mL8lJRlNeTB/P4TEsSvBG7x814fAAAALNJREFUGBldwQdywkAQBMBRXGVyzhkbHMDz/7d5V6eigG7UJB6UxfVjkAkeTiEb4RFOGvBJkMJ0+CKAyvimB0iLzmhEpy9I2IhjNtoY0pl53oxOhJxq4/sVUPn+hirHF9V6hdpqTVXgQHMTKPmjKbBj7Rvqh7UcQ5rlLxYL3Jc0ERKarTefTufelqYNaVGNJ1STMVX/AsR8k0Ht+aIDk37yyTmFU4VshD08SBKV3W4ZJQLzD6kuM7D5S0b9AAAAAElFTkSuQmCC);
}
.rankSup-0-1-16 {
  margin-bottom: 4px;
}
.codingamerCardCity-0-1-17 {
  overflow: hidden;
  margin-left: 22px;
  white-space: nowrap;
  text-overflow: ellipsis;
  text-transform: capitalize;
}
.codingamerCardFlag-0-1-18 {
  display: inline-block;
  min-width: 30px;
  transform: scale(0.80);
}
.unknownSize-0-1-19 {
  color: #838891;
  margin: 0 12px;
  display: flex;
  overflow: hidden;
  font-size: 13px;
  font-weight: 400;
  flex-direction: column;
}
.companyOrSchool-0-1-20 {
  color: #838891;
  margin: 0;
  overflow: hidden;
  font-weight: 700;
  white-space: nowrap;
  text-overflow: ellipsis;
  text-transform: capitalize;
}
.languages-0-1-21 {
  color: #838891;
  margin: 0;
  overflow: hidden;
  font-weight: 400;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.buttons-0-1-22 {
  width: 100%;
  bottom: 12px;
  display: flex;
  padding: 0 15px;
  position: absolute;
  text-align: center;
  padding-top: 40px;
  justify-content: center;
}
.button-0-1-23 {
  color: #454c55;
  width: 165px;
  height: 42px;
  display: inline-block;
  font-size: 13px;
  text-align: center;
  font-weight: 600;
  text-transform: uppercase;
}
.buttonFollow-0-1-24 {
  transition: background 0.2s;
  background-color: #f2bb13;
}
.buttonFollow-0-1-24:hover {
  background-color: rgba(242, 187, 19, 0.7);
}
.buttonUnfollow-0-1-25 {
  transition: background-color 0.2s;
  background-color: #454c5514;
}
.buttonUnfollow-0-1-25:hover {
  background-color: #454c551A;
}
.followingContainer-0-1-26 {
  display: flex;
  align-items: center;
  justify-content: center;
}
.followingIcon-0-1-27 {
  width: 15px;
  height: 15px;
  margin-right: 3px;
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAAPCAMAAAAMCGV4AAAAn1BMVEVHcEwgJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSogJSrEJaeUAAAANHRSTlMACkezEvAVAQIGaQeML7W4HaEF/ChwNnPzM9gUjrfb0lQmlP18Uuz2N8xLb4jv9DCX2ngWh+CotAAAAGdJREFUCB0FwQUCggAQALCpKGB3d3fe/9/mBgBkRQBQq1cAoFBqAEDerAKATisFgMG4DUhnmPRGgGy+JV9Nu0B/Eaefb6yB4TIi7kn5kgLy/S6e7zgAcC1HfDIAvI5xAwDnRwIAbAD+pfUHcMtivrMAAAAASUVORK5CYII=);
  background-repeat: no-repeat;
}
</style><style data-jss="" data-meta="Themed">
.container-0-1-47 {
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.langButton-0-1-48 {
  width: 33px;
  height: 24px;
  display: flex;
  align-items: center;
}
.langButton-0-1-48:hover {
  opacity: 0.7;
}
</style><style data-jss="" data-meta="Themed">
.container-0-1-28 {
  width: 100%;
  display: flex;
  position: absolute;
  align-items: center;
  justify-content: center;
  background-color: #20252a;
}
@media (max-width: 720px) {
  .container-0-1-28 {
    flex-direction: column;
  }
}
.leftContainer-0-1-29 {
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: flex-end;
}
@media (max-width: 720px) {
  .leftContainer-0-1-29 {
    display: none;
  }
}
.rightContainer-0-1-30 {
  width: 50%;
  display: flex;
  align-items: center;
  border-left: 1px solid #454c55;
  justify-content: space-between;
}
@media (max-width: 720px) {
  .rightContainer-0-1-30 {
    width: 100%;
    align-items: flex-start;
    border-left: none;
    flex-direction: column;
  }
}
.rightContentContainer-0-1-31 {
  width: 100%;
  display: flex;
  max-width: 618px;
  align-items: center;
  justify-content: space-between;
}
@media (max-width: 720px) {
  .rightContentContainer-0-1-31 {
    align-items: flex-start;
    flex-direction: column;
  }
}
.mobileBorder-0-1-32 {
  width: 100%;
  display: none;
  border-bottom: 1px solid #454c55;
}
@media (max-width: 720px) {
  .mobileBorder-0-1-32 {
    display: block;
  }
}
.codingameContainer-0-1-33 {
  display: flex;
  padding: 20px 50px 5px 20px;
  flex-direction: column;
}
.codingameMobileContainer-0-1-34 {
  display: none;
  padding: 20px 20px 0 20px;
  align-item: center;
  flex-direction: column;
}
@media (max-width: 720px) {
  .codingameMobileContainer-0-1-34 {
    display: flex;
  }
}
.codingameImageContainer-0-1-35 {
  width: 132px;
  height: 53px;
  display: flex;
  align-items: center;
  flex-direction: column;
  justify-content: flex-start;
}
@media (max-width: 720px) {
  .codingameImageContainer-0-1-35 {
    display: none;
  }
}
.codingameImage-0-1-36 {
  width: 132px;
  height: 18px;
}
.codingameImage-0-1-36:hover {
  opacity: 0.7;
}
.codingameForWorkContainer-0-1-37 {
  display: flex;
  padding: 20px 20px 5px 50px;
  flex-direction: column;
}
@media (max-width: 720px) {
  .codingameForWorkContainer-0-1-37 {
    width: 100%;
    padding: 20px 20px 5px 20px;
  }
}
.codingameForWorkImageContainer-0-1-38 {
  width: 132px;
  height: 53px;
  display: flex;
  align-items: center;
  flex-direction: column;
  justify-content: flex-start;
}
.codingameForWorkImage-0-1-39 {
  width: 132px;
  height: 30px;
}
.codingameForWorkImage-0-1-39:hover {
  opacity: 0.7;
}
.linksContainer-0-1-40 {
  display: flex;
  align-items: flex-start;
  flex-direction: column;
  justify-content: space-between;
}
.linkContainer-0-1-41 {
  display: flex;
  font-size: 15px;
  align-items: center;
  font-weight: 600;
  margin-bottom: 15px;
}
.linkContainer-0-1-41, .linkContainer-0-1-41:hover, .linkContainer-0-1-41:visited, .linkContainer-0-1-41:active {
  color: #ffffff;
}
.linkContainer-0-1-41:hover {
  opacity: 0.7;
}
.codingameForWorkTitle-0-1-42 {
  color: #ffffff;
  display: flex;
  font-size: 15px;
  align-items: center;
  font-weight: 600;
  margin-bottom: 15px;
}
.buttonsContainer-0-1-43 {
  height: 109px;
  display: flex;
  padding: 20px;
  align-items: flex-end;
  flex-direction: column;
  justify-content: space-between;
}
@media (max-width: 1000px) {
  .buttonsContainer-0-1-43 {
    height: 93px;
    padding: 0 20px 30px 20px;
    align-items: flex-start;
  }
}
.socialNetworksContainer-0-1-44 {
  width: 126px;
  height: 24px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
.socialNetworkButton-0-1-45 {
  width: 24px;
  height: 24px;
  display: flex;
  align-items: center;
}
.socialNetworkButton-0-1-45:hover {
  opacity: 0.7;
}
.langsContainer-0-1-46 {
  width: 88px;
  height: 24px;
  display: flex;
  align-items: center;
  justify-content: space-between;
}
</style><style data-jss="" data-meta="Themed">
.container-0-1-58 {
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}
.container-0-1-58:hover .liveIconImage-0-1-60 {
  opacity: 0.7;
}
.contentContainer-0-1-59 {
  display: flex;
  padding: 0 15px;
  position: relative;
  align-items: center;
}
.contentContainer-0-1-59.on {
  padding: 0 25px 0 15px;
}
.liveIconImage-0-1-60 {
  color: #ffffff;
  width: 29px;
  height: 20px;
}
.liveIconImage-0-1-60.selected, .theme-white .liveIconImage-0-1-60 {
  color: #f2bb13;
}
.badgeContainer-0-1-61 {
  right: 4px;
  display: flex;
  position: absolute;
  min-width: 23px;
  min-height: 23px;
  align-items: center;
  border-radius: 50%;
  justify-content: center;
  background-color: #252e38;
}
.theme-white .badgeContainer-0-1-61 {
  background-color: #eef1f2;
}
.badge-0-1-62 {
  color: #131c25;
  display: flex;
  font-size: 14px;
  min-width: 20px;
  min-height: 20px;
  text-align: center;
  align-items: center;
  font-weight: 700;
  border-radius: 50%;
  justify-content: center;
  background-color: #f2bb13;
}
</style><style data-jss="" data-meta="Themed">
</style><style data-jss="" data-meta="Themed">
.container-0-1-1 {
  width: 100%;
  height: 60px;
  display: flex;
  z-index: 35;
  position: relative;
  box-shadow: 0px 25px 25px -25px #131c25;
  align-items: center;
  border-bottom: 1px solid #131c25;
  background-color: #252e38;
}
.container-0-1-1.impersonated {
  background: repeating-linear-gradient(-45deg, #454c55, #454c55 10px, #f95850 0, #f95850 20px);
}
.container-0-1-1.start {
  height: unset;
  min-height: 60px;
}
</style><link rel="stylesheet" type="text/css" href="./Java_code_files/538-b59586f7.css"><link rel="stylesheet" type="text/css" href="./Java_code_files/2857-7ec0f895.css"><link rel="stylesheet" type="text/css" href="./Java_code_files/2450-c421b25a.css"><link rel="stylesheet" type="text/css" href="./Java_code_files/3049-ea25220d.css"><link rel="stylesheet" type="text/css" href="./Java_code_files/ide-5786f233.css"><script type="application/javascript" async="" src="./Java_code_files/2517.js.download"></script><style type="text/css" data-fbcssmodules="css:fb.css.base css:fb.css.dialog css:fb.css.iframewidget css:fb.css.customer_chat_plugin_iframe">.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_hidden{position:absolute;top:-10000px;z-index:10001}.fb_reposition{overflow:hidden;position:relative}.fb_invisible{display:none}.fb_reset{background:none;border:0;border-spacing:0;color:#000;cursor:auto;direction:ltr;font-family:"lucida grande", tahoma, verdana, arial, sans-serif;font-size:11px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:1;margin:0;overflow:visible;padding:0;text-align:left;text-decoration:none;text-indent:0;text-shadow:none;text-transform:none;visibility:visible;white-space:normal;word-spacing:normal}.fb_reset>div{overflow:hidden}@keyframes fb_transform{from{opacity:0;transform:scale(.95)}to{opacity:1;transform:scale(1)}}.fb_animate{animation:fb_transform .3s forwards}
.fb_dialog{background:rgba(82, 82, 82, .7);position:absolute;top:-10000px;z-index:10001}.fb_dialog_advanced{border-radius:8px;padding:10px}.fb_dialog_content{background:#fff;color:#373737}.fb_dialog_close_icon{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 0 transparent;cursor:pointer;display:block;height:15px;position:absolute;right:18px;top:17px;width:15px}.fb_dialog_mobile .fb_dialog_close_icon{left:5px;right:auto;top:5px}.fb_dialog_padding{background-color:transparent;position:absolute;width:1px;z-index:-1}.fb_dialog_close_icon:hover{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -15px transparent}.fb_dialog_close_icon:active{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yq/r/IE9JII6Z1Ys.png) no-repeat scroll 0 -30px transparent}.fb_dialog_iframe{line-height:0}.fb_dialog_content .dialog_title{background:#6d84b4;border:1px solid #365899;color:#fff;font-size:14px;font-weight:bold;margin:0}.fb_dialog_content .dialog_title>span{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/yd/r/Cou7n-nqK52.gif) no-repeat 5px 50%;float:left;padding:5px 0 7px 26px}body.fb_hidden{height:100%;left:0;margin:0;overflow:visible;position:absolute;top:-10000px;transform:none;width:100%}.fb_dialog.fb_dialog_mobile.loading{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/ya/r/3rhSv5V8j3o.gif) white no-repeat 50% 50%;min-height:100%;min-width:100%;overflow:hidden;position:absolute;top:0;z-index:10001}.fb_dialog.fb_dialog_mobile.loading.centered{background:none;height:auto;min-height:initial;min-width:initial;width:auto}.fb_dialog.fb_dialog_mobile.loading.centered #fb_dialog_loader_spinner{width:100%}.fb_dialog.fb_dialog_mobile.loading.centered .fb_dialog_content{background:none}.loading.centered #fb_dialog_loader_close{clear:both;color:#fff;display:block;font-size:18px;padding-top:20px}#fb-root #fb_dialog_ipad_overlay{background:rgba(0, 0, 0, .4);bottom:0;left:0;min-height:100%;position:absolute;right:0;top:0;width:100%;z-index:10000}#fb-root #fb_dialog_ipad_overlay.hidden{display:none}.fb_dialog.fb_dialog_mobile.loading iframe{visibility:hidden}.fb_dialog_mobile .fb_dialog_iframe{position:sticky;top:0}.fb_dialog_content .dialog_header{background:linear-gradient(from(#738aba), to(#2c4987));border-bottom:1px solid;border-color:#043b87;box-shadow:white 0 1px 1px -1px inset;color:#fff;font:bold 14px Helvetica, sans-serif;text-overflow:ellipsis;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0;vertical-align:middle;white-space:nowrap}.fb_dialog_content .dialog_header table{height:43px;width:100%}.fb_dialog_content .dialog_header td.header_left{font-size:12px;padding-left:5px;vertical-align:middle;width:60px}.fb_dialog_content .dialog_header td.header_right{font-size:12px;padding-right:5px;vertical-align:middle;width:60px}.fb_dialog_content .touchable_button{background:linear-gradient(from(#4267B2), to(#2a4887));background-clip:padding-box;border:1px solid #29487d;border-radius:3px;display:inline-block;line-height:18px;margin-top:3px;max-width:85px;padding:4px 12px;position:relative}.fb_dialog_content .dialog_header .touchable_button input{background:none;border:none;color:#fff;font:bold 12px Helvetica, sans-serif;margin:2px -12px;padding:2px 6px 3px 6px;text-shadow:rgba(0, 30, 84, .296875) 0 -1px 0}.fb_dialog_content .dialog_header .header_center{color:#fff;font-size:16px;font-weight:bold;line-height:18px;text-align:center;vertical-align:middle}.fb_dialog_content .dialog_content{background:url(https://static.xx.fbcdn.net/rsrc.php/v3/y9/r/jKEcVPZFk-2.gif) no-repeat 50% 50%;border:1px solid #4a4a4a;border-bottom:0;border-top:0;height:150px}.fb_dialog_content .dialog_footer{background:#f5f6f7;border:1px solid #4a4a4a;border-top-color:#ccc;height:40px}#fb_dialog_loader_close{float:left}.fb_dialog.fb_dialog_mobile .fb_dialog_close_icon{visibility:hidden}#fb_dialog_loader_spinner{animation:rotateSpinner 1.2s linear infinite;background-color:transparent;background-image:url(https://static.xx.fbcdn.net/rsrc.php/v3/yD/r/t-wz8gw1xG1.png);background-position:50% 50%;background-repeat:no-repeat;height:24px;width:24px}@keyframes rotateSpinner{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}
.fb_iframe_widget{display:inline-block;position:relative}.fb_iframe_widget span{display:inline-block;position:relative;text-align:justify}.fb_iframe_widget iframe{position:absolute}.fb_iframe_widget_fluid_desktop,.fb_iframe_widget_fluid_desktop span,.fb_iframe_widget_fluid_desktop iframe{max-width:100%}.fb_iframe_widget_fluid_desktop iframe{min-width:220px;position:relative}.fb_iframe_widget_lift{z-index:1}.fb_iframe_widget_fluid{display:inline}.fb_iframe_widget_fluid span{width:100%}
.fb_mpn_mobile_landing_page_slide_out{animation-duration:200ms;animation-name:fb_mpn_landing_page_slide_out;transition-timing-function:ease-in}.fb_mpn_mobile_landing_page_slide_out_from_left{animation-duration:200ms;animation-name:fb_mpn_landing_page_slide_out_from_left;transition-timing-function:ease-in}.fb_mpn_mobile_landing_page_slide_up{animation-duration:500ms;animation-name:fb_mpn_landing_page_slide_up;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_in{animation-duration:300ms;animation-name:fb_mpn_bounce_in;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_out{animation-duration:300ms;animation-name:fb_mpn_bounce_out;transition-timing-function:ease-in}.fb_mpn_mobile_bounce_out_v2{animation-duration:300ms;animation-name:fb_mpn_fade_out;transition-timing-function:ease-in}.fb_customer_chat_bounce_in_v2{animation-duration:300ms;animation-name:fb_bounce_in_v2;transition-timing-function:ease-in}.fb_customer_chat_bounce_in_from_left{animation-duration:300ms;animation-name:fb_bounce_in_from_left;transition-timing-function:ease-in}.fb_customer_chat_bounce_out_v2{animation-duration:300ms;animation-name:fb_bounce_out_v2;transition-timing-function:ease-in}.fb_customer_chat_bounce_out_from_left{animation-duration:300ms;animation-name:fb_bounce_out_from_left;transition-timing-function:ease-in}.fb_invisible_flow{display:inherit;height:0;overflow-x:hidden;width:0}@keyframes fb_mpn_landing_page_slide_out{0%{margin:0 12px;width:100% - 24px}60%{border-radius:18px}100%{border-radius:50%;margin:0 24px;width:60px}}@keyframes fb_mpn_landing_page_slide_out_from_left{0%{left:12px;width:100% - 24px}60%{border-radius:18px}100%{border-radius:50%;left:12px;width:60px}}@keyframes fb_mpn_landing_page_slide_up{0%{bottom:0;opacity:0}100%{bottom:24px;opacity:1}}@keyframes fb_mpn_bounce_in{0%{opacity:.5;top:100%}100%{opacity:1;top:0}}@keyframes fb_mpn_fade_out{0%{bottom:30px;opacity:1}100%{bottom:0;opacity:0}}@keyframes fb_mpn_bounce_out{0%{opacity:1;top:0}100%{opacity:.5;top:100%}}@keyframes fb_bounce_in_v2{0%{opacity:0;transform:scale(0, 0);transform-origin:bottom right}50%{transform:scale(1.03, 1.03);transform-origin:bottom right}100%{opacity:1;transform:scale(1, 1);transform-origin:bottom right}}@keyframes fb_bounce_in_from_left{0%{opacity:0;transform:scale(0, 0);transform-origin:bottom left}50%{transform:scale(1.03, 1.03);transform-origin:bottom left}100%{opacity:1;transform:scale(1, 1);transform-origin:bottom left}}@keyframes fb_bounce_out_v2{0%{opacity:1;transform:scale(1, 1);transform-origin:bottom right}100%{opacity:0;transform:scale(0, 0);transform-origin:bottom right}}@keyframes fb_bounce_out_from_left{0%{opacity:1;transform:scale(1, 1);transform-origin:bottom left}100%{opacity:0;transform:scale(0, 0);transform-origin:bottom left}}@keyframes slideInFromBottom{0%{opacity:.1;transform:translateY(100%)}100%{opacity:1;transform:translateY(0)}}@keyframes slideInFromBottomDelay{0%{opacity:0;transform:translateY(100%)}97%{opacity:0;transform:translateY(100%)}100%{opacity:1;transform:translateY(0)}}</style><style type="text/css">/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-workbench > .notifications-toasts {
	position: absolute;
	z-index: 1000;
	right: 3px;
	bottom: 26px;
	display: none;
	overflow: hidden;
}

.monaco-workbench.nostatusbar > .notifications-toasts {
	bottom: 3px;
}

.monaco-workbench > .notifications-toasts.visible {
	display: flex;
	flex-direction: column;
}

.monaco-workbench > .notifications-toasts .notification-toast-container {
	overflow: hidden; /* this ensures that the notification toast does not shine through */
}

.monaco-workbench > .notifications-toasts .notification-toast-container > .notification-toast {
	margin: 8px; /* enables separation and drop shadows around toasts */
	transform: translate3d(0px, 100%, 0px); /* move the notification 50px to the bottom (to prevent bleed through) */
	opacity: 0; /*  fade the toast in */
	transition:	transform 300ms ease-out, opacity 300ms ease-out;
}

.monaco-workbench > .notifications-toasts .notification-toast-container > .notification-toast.notification-fade-in {
	opacity: 1;
	transform: none;
}

.monaco-workbench > .notifications-toasts .notification-toast-container > .notification-toast.notification-fade-in-done {
	opacity: 1;
	transform: none;
	transition:	none;
}
</style><style type="text/css">/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/** Notification: Container */

.monaco-workbench .notifications-list-container .notification-list-item {
	display: flex;
	flex-direction: column;
	flex-direction: column-reverse; /* the details row appears first in order for better keyboard access to notification buttons */
	padding: 10px 5px;
	height: 100%;
	box-sizing: border-box;
}

.monaco-workbench .notifications-list-container .notification-offset-helper {
	opacity: 0;
	position: absolute;
	line-height: 22px;
	word-wrap: break-word; /* never overflow long words, but break to next line */
}

/** Notification: Main Row */

.monaco-workbench .notifications-list-container .notification-list-item > .notification-list-item-main-row {
	display: flex;
	flex-grow: 1;
}

/** Notification: Icon */

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-icon {
	display: flex;
	align-items: center;
	flex: 0 0 16px;
	height: 22px;
	margin-right: 4px;
	margin-left: 4px;
	font-size: 18px;
	background-position: center;
	background-repeat: no-repeat;
}

/** Notification: Message */

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-message {
	line-height: 22px;
	overflow: hidden;
	text-overflow: ellipsis;
	flex: 1; /* let the message always grow */
	user-select: text;
	-webkit-user-select: text;
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-message a:focus {
	outline-width: 1px;
	outline-style: solid;
}

.monaco-workbench .notifications-list-container .notification-list-item.expanded .notification-list-item-message {
	white-space: normal;
	word-wrap: break-word; /* never overflow long words, but break to next line */
}

/** Notification: Toolbar Container */

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-toolbar-container {
	display: none;
	height: 22px;
}

.monaco-workbench .notifications-list-container .notification-list-item:hover .notification-list-item-toolbar-container,
.monaco-workbench .notifications-list-container .monaco-list-row.focused .notification-list-item .notification-list-item-toolbar-container,
.monaco-workbench .notifications-list-container .notification-list-item.expanded .notification-list-item-toolbar-container {
	display: block;
}

/** Notification: Details Row */

.monaco-workbench .notifications-list-container .notification-list-item > .notification-list-item-details-row {
	display: none;
	align-items: center;
	padding-left: 5px;
	overflow: hidden; /* details row should never overflow */
}

.monaco-workbench .notifications-list-container .notification-list-item.expanded > .notification-list-item-details-row {
	display: flex;
}

/** Notification: Source */

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-source {
	flex: 1;
	font-size: 12px;
	overflow: hidden; /* always give away space to buttons container */
	text-overflow: ellipsis;
}

/** Notification: Buttons */

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container {
	display: flex;
	overflow: hidden;
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container > .monaco-button-dropdown,
.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container > .monaco-button {
	margin: 4px 5px; /* allows button focus outline to be visible */
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container .monaco-button {
	outline-offset: 2px !important;
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container .monaco-text-button {
	width: fit-content;
	width: -moz-fit-content;
	padding: 5px 10px;
	display: inline-block;	/* to enable ellipsis in text overflow */
	font-size: 12px;
	overflow: hidden;
	text-overflow: ellipsis;
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-buttons-container .monaco-dropdown-button {
	padding: 5px
}

/** Notification: Progress */

.monaco-workbench .notifications-list-container .progress-bit {
	height: 2px;
	bottom: 0;
}
</style><style type="text/css">/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-toolbar-container .action-item,
.monaco-workbench > .notifications-center > .notifications-center-header > .notifications-center-header-toolbar .action-item {
	margin-right: 4px;
}

.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-toolbar-container .action-item:first-child,
.monaco-workbench > .notifications-center > .notifications-center-header > .notifications-center-header-toolbar .action-item:first-child {
	margin-left: 4px;
}
</style><style type="text/css">/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *--------------------------------------------------------------------------------------------*/

/** Dialog: Modal Block */
.monaco-dialog-modal-block {
	position: fixed;
	height: 100%;
	width: 100%;
	left:0;
	top:0;
	z-index: 2600;
	display: flex;
	justify-content: center;
	align-items: center;
}

.monaco-dialog-modal-block.dimmed {
	background: rgba(0, 0, 0, 0.3);
}

/** Dialog: Container */
.monaco-dialog-box {
	display: flex;
	flex-direction: column-reverse;
	width: min-content;
	min-width: 500px;
	max-width: 90vw;
	min-height: 75px;
	padding: 10px;
	transform: translate3d(0px, 0px, 0px);
}

/** Dialog: Title Actions Row */
.monaco-dialog-box .dialog-toolbar-row {
	height: 22px;
	padding-bottom: 4px;
}

.monaco-dialog-box .dialog-toolbar-row .actions-container {
	justify-content: flex-end;
}

/** Dialog: Message Row */
.monaco-dialog-box .dialog-message-row {
	display: flex;
	flex-grow: 1;
	align-items: center;
	padding: 0 10px;
}

.monaco-dialog-box .dialog-message-row > .dialog-icon.codicon {
	flex: 0 0 48px;
	height: 48px;
	align-self: baseline;
	font-size: 48px;
}

/** Dialog: Message Container */
.monaco-dialog-box .dialog-message-row .dialog-message-container {
	display: flex;
	flex-direction: column;
	overflow: hidden;
	text-overflow: ellipsis;
	padding-left: 24px;
	user-select: text;
	-webkit-user-select: text;
	-ms-user-select: text;
	word-wrap: break-word; /* never overflow long words, but break to next line */
	white-space: normal;
}

/** Dialog: Message */
.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-message {
	line-height: 22px;
	font-size: 18px;
	flex: 1; /* let the message always grow */
	white-space: normal;
	word-wrap: break-word; /* never overflow long words, but break to next line */
	min-height: 48px; /* matches icon height */
	margin-bottom: 8px;
	display: flex;
	align-items: center;
}

/** Dialog: Details */
.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-message-detail {
	line-height: 22px;
	flex: 1; /* let the message always grow */
}

.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-message a:focus {
	outline-width: 1px;
	outline-style: solid;
}

/** Dialog: Checkbox */
.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-checkbox-row {
	padding: 15px 0px 0px;
	display: flex;
}

.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-checkbox-row .dialog-checkbox-message {
	cursor: pointer;
	user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}

/** Dialog: Input */
.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-message-input {
	padding: 15px 0px 0px;
	display: flex;
}

.monaco-dialog-box .dialog-message-row .dialog-message-container .dialog-message-input .monaco-inputbox {
	flex: 1;
}

/** Dialog: File Path */
.monaco-dialog-box code {
	font-family: var(--monaco-monospace-font);
}

/** Dialog: Buttons Row */
.monaco-dialog-box > .dialog-buttons-row {
	display: flex;
	align-items: center;
	padding-right: 1px;
	overflow: hidden; /* buttons row should never overflow */
}

.monaco-dialog-box > .dialog-buttons-row {
	display: flex;
	white-space: nowrap;
	padding: 20px 10px 10px;
}

/** Dialog: Buttons */
.monaco-dialog-box > .dialog-buttons-row > .dialog-buttons {
	display: flex;
	width: 100%;
	justify-content: flex-end;
	overflow: hidden;
	margin-left: 67px; /* for long buttons, force align with text */
}

.monaco-dialog-box > .dialog-buttons-row > .dialog-buttons > .monaco-button {
	width: fit-content;
	width: -moz-fit-content;
	padding: 5px 10px;
	overflow: hidden;
	text-overflow: ellipsis;
	margin: 4px 5px; /* allows button focus outline to be visible */
	outline-offset: 2px !important;
}
</style><style id="angular-vs-repeat-style">
	  	.vs-repeat-debug-element {
        top: 50%;
        left: 0;
        right: 0;
        height: 1px;
        background: red;
        z-index: 99999999;
        box-shadow: 0 0 20px red;
      }

      .vs-repeat-debug-element + .vs-repeat-debug-element {
        display: none;
      }

      .vs-repeat-before-content,
      .vs-repeat-after-content {
        border: none !important;
        padding: 0 !important;
      }
    </style><style>
.react-monaco-editor-react-container {
  position: relative;
  width: 100%;
  font-size: 12px;
}

.react-monaco-editor-react-wrapper {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  display: flex;
  flex-direction: column;
  align-items: stretch;
}

.react-monaco-editor-react {
  flex: 1;
  min-height: 0;
}

.react-monaco-editor-react h1, .react-monaco-editor-react h2, .react-monaco-editor-react h3 {
  /* For tooltips */
  font-size: initial;
  font-weight: initial;
}

.react-monaco-editor-react-status-bar {
  flex: none;
  display: none;
  padding: 3px 8px 0px 8px;
  font-size: 13px;
  font-family: "Courier New", Courier, monospace;
  font-weight: bold;
}

.react-monaco-editor-react-status-bar input {
  all: initial;
  color: yellow;
  outline: none;
  border: none;
  background: transparent;
}
</style><style type="text/css" media="screen" class="monaco-colors">.codicon-add:before { content: '\ea60'; }
.codicon-plus:before { content: '\ea60'; }
.codicon-gist-new:before { content: '\ea60'; }
.codicon-repo-create:before { content: '\ea60'; }
.codicon-lightbulb:before { content: '\ea61'; }
.codicon-light-bulb:before { content: '\ea61'; }
.codicon-repo:before { content: '\ea62'; }
.codicon-repo-delete:before { content: '\ea62'; }
.codicon-gist-fork:before { content: '\ea63'; }
.codicon-repo-forked:before { content: '\ea63'; }
.codicon-git-pull-request:before { content: '\ea64'; }
.codicon-git-pull-request-abandoned:before { content: '\ea64'; }
.codicon-record-keys:before { content: '\ea65'; }
.codicon-keyboard:before { content: '\ea65'; }
.codicon-tag:before { content: '\ea66'; }
.codicon-tag-add:before { content: '\ea66'; }
.codicon-tag-remove:before { content: '\ea66'; }
.codicon-person:before { content: '\ea67'; }
.codicon-person-follow:before { content: '\ea67'; }
.codicon-person-outline:before { content: '\ea67'; }
.codicon-person-filled:before { content: '\ea67'; }
.codicon-git-branch:before { content: '\ea68'; }
.codicon-git-branch-create:before { content: '\ea68'; }
.codicon-git-branch-delete:before { content: '\ea68'; }
.codicon-source-control:before { content: '\ea68'; }
.codicon-mirror:before { content: '\ea69'; }
.codicon-mirror-public:before { content: '\ea69'; }
.codicon-star:before { content: '\ea6a'; }
.codicon-star-add:before { content: '\ea6a'; }
.codicon-star-delete:before { content: '\ea6a'; }
.codicon-star-empty:before { content: '\ea6a'; }
.codicon-comment:before { content: '\ea6b'; }
.codicon-comment-add:before { content: '\ea6b'; }
.codicon-alert:before { content: '\ea6c'; }
.codicon-warning:before { content: '\ea6c'; }
.codicon-search:before { content: '\ea6d'; }
.codicon-search-save:before { content: '\ea6d'; }
.codicon-log-out:before { content: '\ea6e'; }
.codicon-sign-out:before { content: '\ea6e'; }
.codicon-log-in:before { content: '\ea6f'; }
.codicon-sign-in:before { content: '\ea6f'; }
.codicon-eye:before { content: '\ea70'; }
.codicon-eye-unwatch:before { content: '\ea70'; }
.codicon-eye-watch:before { content: '\ea70'; }
.codicon-circle-filled:before { content: '\ea71'; }
.codicon-primitive-dot:before { content: '\ea71'; }
.codicon-close-dirty:before { content: '\ea71'; }
.codicon-debug-breakpoint:before { content: '\ea71'; }
.codicon-debug-breakpoint-disabled:before { content: '\ea71'; }
.codicon-debug-hint:before { content: '\ea71'; }
.codicon-primitive-square:before { content: '\ea72'; }
.codicon-edit:before { content: '\ea73'; }
.codicon-pencil:before { content: '\ea73'; }
.codicon-info:before { content: '\ea74'; }
.codicon-issue-opened:before { content: '\ea74'; }
.codicon-gist-private:before { content: '\ea75'; }
.codicon-git-fork-private:before { content: '\ea75'; }
.codicon-lock:before { content: '\ea75'; }
.codicon-mirror-private:before { content: '\ea75'; }
.codicon-close:before { content: '\ea76'; }
.codicon-remove-close:before { content: '\ea76'; }
.codicon-x:before { content: '\ea76'; }
.codicon-repo-sync:before { content: '\ea77'; }
.codicon-sync:before { content: '\ea77'; }
.codicon-clone:before { content: '\ea78'; }
.codicon-desktop-download:before { content: '\ea78'; }
.codicon-beaker:before { content: '\ea79'; }
.codicon-microscope:before { content: '\ea79'; }
.codicon-vm:before { content: '\ea7a'; }
.codicon-device-desktop:before { content: '\ea7a'; }
.codicon-file:before { content: '\ea7b'; }
.codicon-file-text:before { content: '\ea7b'; }
.codicon-more:before { content: '\ea7c'; }
.codicon-ellipsis:before { content: '\ea7c'; }
.codicon-kebab-horizontal:before { content: '\ea7c'; }
.codicon-mail-reply:before { content: '\ea7d'; }
.codicon-reply:before { content: '\ea7d'; }
.codicon-organization:before { content: '\ea7e'; }
.codicon-organization-filled:before { content: '\ea7e'; }
.codicon-organization-outline:before { content: '\ea7e'; }
.codicon-new-file:before { content: '\ea7f'; }
.codicon-file-add:before { content: '\ea7f'; }
.codicon-new-folder:before { content: '\ea80'; }
.codicon-file-directory-create:before { content: '\ea80'; }
.codicon-trash:before { content: '\ea81'; }
.codicon-trashcan:before { content: '\ea81'; }
.codicon-history:before { content: '\ea82'; }
.codicon-clock:before { content: '\ea82'; }
.codicon-folder:before { content: '\ea83'; }
.codicon-file-directory:before { content: '\ea83'; }
.codicon-symbol-folder:before { content: '\ea83'; }
.codicon-logo-github:before { content: '\ea84'; }
.codicon-mark-github:before { content: '\ea84'; }
.codicon-github:before { content: '\ea84'; }
.codicon-terminal:before { content: '\ea85'; }
.codicon-console:before { content: '\ea85'; }
.codicon-repl:before { content: '\ea85'; }
.codicon-zap:before { content: '\ea86'; }
.codicon-symbol-event:before { content: '\ea86'; }
.codicon-error:before { content: '\ea87'; }
.codicon-stop:before { content: '\ea87'; }
.codicon-variable:before { content: '\ea88'; }
.codicon-symbol-variable:before { content: '\ea88'; }
.codicon-array:before { content: '\ea8a'; }
.codicon-symbol-array:before { content: '\ea8a'; }
.codicon-symbol-module:before { content: '\ea8b'; }
.codicon-symbol-package:before { content: '\ea8b'; }
.codicon-symbol-namespace:before { content: '\ea8b'; }
.codicon-symbol-object:before { content: '\ea8b'; }
.codicon-symbol-method:before { content: '\ea8c'; }
.codicon-symbol-function:before { content: '\ea8c'; }
.codicon-symbol-constructor:before { content: '\ea8c'; }
.codicon-symbol-boolean:before { content: '\ea8f'; }
.codicon-symbol-null:before { content: '\ea8f'; }
.codicon-symbol-numeric:before { content: '\ea90'; }
.codicon-symbol-number:before { content: '\ea90'; }
.codicon-symbol-structure:before { content: '\ea91'; }
.codicon-symbol-struct:before { content: '\ea91'; }
.codicon-symbol-parameter:before { content: '\ea92'; }
.codicon-symbol-type-parameter:before { content: '\ea92'; }
.codicon-symbol-key:before { content: '\ea93'; }
.codicon-symbol-text:before { content: '\ea93'; }
.codicon-symbol-reference:before { content: '\ea94'; }
.codicon-go-to-file:before { content: '\ea94'; }
.codicon-symbol-enum:before { content: '\ea95'; }
.codicon-symbol-value:before { content: '\ea95'; }
.codicon-symbol-ruler:before { content: '\ea96'; }
.codicon-symbol-unit:before { content: '\ea96'; }
.codicon-activate-breakpoints:before { content: '\ea97'; }
.codicon-archive:before { content: '\ea98'; }
.codicon-arrow-both:before { content: '\ea99'; }
.codicon-arrow-down:before { content: '\ea9a'; }
.codicon-arrow-left:before { content: '\ea9b'; }
.codicon-arrow-right:before { content: '\ea9c'; }
.codicon-arrow-small-down:before { content: '\ea9d'; }
.codicon-arrow-small-left:before { content: '\ea9e'; }
.codicon-arrow-small-right:before { content: '\ea9f'; }
.codicon-arrow-small-up:before { content: '\eaa0'; }
.codicon-arrow-up:before { content: '\eaa1'; }
.codicon-bell:before { content: '\eaa2'; }
.codicon-bold:before { content: '\eaa3'; }
.codicon-book:before { content: '\eaa4'; }
.codicon-bookmark:before { content: '\eaa5'; }
.codicon-debug-breakpoint-conditional-unverified:before { content: '\eaa6'; }
.codicon-debug-breakpoint-conditional:before { content: '\eaa7'; }
.codicon-debug-breakpoint-conditional-disabled:before { content: '\eaa7'; }
.codicon-debug-breakpoint-data-unverified:before { content: '\eaa8'; }
.codicon-debug-breakpoint-data:before { content: '\eaa9'; }
.codicon-debug-breakpoint-data-disabled:before { content: '\eaa9'; }
.codicon-debug-breakpoint-log-unverified:before { content: '\eaaa'; }
.codicon-debug-breakpoint-log:before { content: '\eaab'; }
.codicon-debug-breakpoint-log-disabled:before { content: '\eaab'; }
.codicon-briefcase:before { content: '\eaac'; }
.codicon-broadcast:before { content: '\eaad'; }
.codicon-browser:before { content: '\eaae'; }
.codicon-bug:before { content: '\eaaf'; }
.codicon-calendar:before { content: '\eab0'; }
.codicon-case-sensitive:before { content: '\eab1'; }
.codicon-check:before { content: '\eab2'; }
.codicon-checklist:before { content: '\eab3'; }
.codicon-chevron-down:before { content: '\eab4'; }
.codicon-drop-down-button:before { content: '\eab4'; }
.codicon-chevron-left:before { content: '\eab5'; }
.codicon-chevron-right:before { content: '\eab6'; }
.codicon-chevron-up:before { content: '\eab7'; }
.codicon-chrome-close:before { content: '\eab8'; }
.codicon-chrome-maximize:before { content: '\eab9'; }
.codicon-chrome-minimize:before { content: '\eaba'; }
.codicon-chrome-restore:before { content: '\eabb'; }
.codicon-circle-outline:before { content: '\eabc'; }
.codicon-debug-breakpoint-unverified:before { content: '\eabc'; }
.codicon-circle-slash:before { content: '\eabd'; }
.codicon-circuit-board:before { content: '\eabe'; }
.codicon-clear-all:before { content: '\eabf'; }
.codicon-clippy:before { content: '\eac0'; }
.codicon-close-all:before { content: '\eac1'; }
.codicon-cloud-download:before { content: '\eac2'; }
.codicon-cloud-upload:before { content: '\eac3'; }
.codicon-code:before { content: '\eac4'; }
.codicon-collapse-all:before { content: '\eac5'; }
.codicon-color-mode:before { content: '\eac6'; }
.codicon-comment-discussion:before { content: '\eac7'; }
.codicon-compare-changes:before { content: '\eafd'; }
.codicon-credit-card:before { content: '\eac9'; }
.codicon-dash:before { content: '\eacc'; }
.codicon-dashboard:before { content: '\eacd'; }
.codicon-database:before { content: '\eace'; }
.codicon-debug-continue:before { content: '\eacf'; }
.codicon-debug-disconnect:before { content: '\ead0'; }
.codicon-debug-pause:before { content: '\ead1'; }
.codicon-debug-restart:before { content: '\ead2'; }
.codicon-debug-start:before { content: '\ead3'; }
.codicon-debug-step-into:before { content: '\ead4'; }
.codicon-debug-step-out:before { content: '\ead5'; }
.codicon-debug-step-over:before { content: '\ead6'; }
.codicon-debug-stop:before { content: '\ead7'; }
.codicon-debug:before { content: '\ead8'; }
.codicon-device-camera-video:before { content: '\ead9'; }
.codicon-device-camera:before { content: '\eada'; }
.codicon-device-mobile:before { content: '\eadb'; }
.codicon-diff-added:before { content: '\eadc'; }
.codicon-diff-ignored:before { content: '\eadd'; }
.codicon-diff-modified:before { content: '\eade'; }
.codicon-diff-removed:before { content: '\eadf'; }
.codicon-diff-renamed:before { content: '\eae0'; }
.codicon-diff:before { content: '\eae1'; }
.codicon-discard:before { content: '\eae2'; }
.codicon-editor-layout:before { content: '\eae3'; }
.codicon-empty-window:before { content: '\eae4'; }
.codicon-exclude:before { content: '\eae5'; }
.codicon-extensions:before { content: '\eae6'; }
.codicon-eye-closed:before { content: '\eae7'; }
.codicon-file-binary:before { content: '\eae8'; }
.codicon-file-code:before { content: '\eae9'; }
.codicon-file-media:before { content: '\eaea'; }
.codicon-file-pdf:before { content: '\eaeb'; }
.codicon-file-submodule:before { content: '\eaec'; }
.codicon-file-symlink-directory:before { content: '\eaed'; }
.codicon-file-symlink-file:before { content: '\eaee'; }
.codicon-file-zip:before { content: '\eaef'; }
.codicon-files:before { content: '\eaf0'; }
.codicon-filter:before { content: '\eaf1'; }
.codicon-flame:before { content: '\eaf2'; }
.codicon-fold-down:before { content: '\eaf3'; }
.codicon-fold-up:before { content: '\eaf4'; }
.codicon-fold:before { content: '\eaf5'; }
.codicon-folder-active:before { content: '\eaf6'; }
.codicon-folder-opened:before { content: '\eaf7'; }
.codicon-gear:before { content: '\eaf8'; }
.codicon-gift:before { content: '\eaf9'; }
.codicon-gist-secret:before { content: '\eafa'; }
.codicon-gist:before { content: '\eafb'; }
.codicon-git-commit:before { content: '\eafc'; }
.codicon-git-compare:before { content: '\eafd'; }
.codicon-git-merge:before { content: '\eafe'; }
.codicon-github-action:before { content: '\eaff'; }
.codicon-github-alt:before { content: '\eb00'; }
.codicon-globe:before { content: '\eb01'; }
.codicon-grabber:before { content: '\eb02'; }
.codicon-graph:before { content: '\eb03'; }
.codicon-gripper:before { content: '\eb04'; }
.codicon-heart:before { content: '\eb05'; }
.codicon-home:before { content: '\eb06'; }
.codicon-horizontal-rule:before { content: '\eb07'; }
.codicon-hubot:before { content: '\eb08'; }
.codicon-inbox:before { content: '\eb09'; }
.codicon-issue-closed:before { content: '\eba4'; }
.codicon-issue-reopened:before { content: '\eb0b'; }
.codicon-issues:before { content: '\eb0c'; }
.codicon-italic:before { content: '\eb0d'; }
.codicon-jersey:before { content: '\eb0e'; }
.codicon-json:before { content: '\eb0f'; }
.codicon-kebab-vertical:before { content: '\eb10'; }
.codicon-key:before { content: '\eb11'; }
.codicon-law:before { content: '\eb12'; }
.codicon-lightbulb-autofix:before { content: '\eb13'; }
.codicon-link-external:before { content: '\eb14'; }
.codicon-link:before { content: '\eb15'; }
.codicon-list-ordered:before { content: '\eb16'; }
.codicon-list-unordered:before { content: '\eb17'; }
.codicon-live-share:before { content: '\eb18'; }
.codicon-loading:before { content: '\eb19'; }
.codicon-location:before { content: '\eb1a'; }
.codicon-mail-read:before { content: '\eb1b'; }
.codicon-mail:before { content: '\eb1c'; }
.codicon-markdown:before { content: '\eb1d'; }
.codicon-megaphone:before { content: '\eb1e'; }
.codicon-mention:before { content: '\eb1f'; }
.codicon-milestone:before { content: '\eb20'; }
.codicon-mortar-board:before { content: '\eb21'; }
.codicon-move:before { content: '\eb22'; }
.codicon-multiple-windows:before { content: '\eb23'; }
.codicon-mute:before { content: '\eb24'; }
.codicon-no-newline:before { content: '\eb25'; }
.codicon-note:before { content: '\eb26'; }
.codicon-octoface:before { content: '\eb27'; }
.codicon-open-preview:before { content: '\eb28'; }
.codicon-package:before { content: '\eb29'; }
.codicon-paintcan:before { content: '\eb2a'; }
.codicon-pin:before { content: '\eb2b'; }
.codicon-play:before { content: '\eb2c'; }
.codicon-run:before { content: '\eb2c'; }
.codicon-plug:before { content: '\eb2d'; }
.codicon-preserve-case:before { content: '\eb2e'; }
.codicon-preview:before { content: '\eb2f'; }
.codicon-project:before { content: '\eb30'; }
.codicon-pulse:before { content: '\eb31'; }
.codicon-question:before { content: '\eb32'; }
.codicon-quote:before { content: '\eb33'; }
.codicon-radio-tower:before { content: '\eb34'; }
.codicon-reactions:before { content: '\eb35'; }
.codicon-references:before { content: '\eb36'; }
.codicon-refresh:before { content: '\eb37'; }
.codicon-regex:before { content: '\eb38'; }
.codicon-remote-explorer:before { content: '\eb39'; }
.codicon-remote:before { content: '\eb3a'; }
.codicon-remove:before { content: '\eb3b'; }
.codicon-replace-all:before { content: '\eb3c'; }
.codicon-replace:before { content: '\eb3d'; }
.codicon-repo-clone:before { content: '\eb3e'; }
.codicon-repo-force-push:before { content: '\eb3f'; }
.codicon-repo-pull:before { content: '\eb40'; }
.codicon-repo-push:before { content: '\eb41'; }
.codicon-report:before { content: '\eb42'; }
.codicon-request-changes:before { content: '\eb43'; }
.codicon-rocket:before { content: '\eb44'; }
.codicon-root-folder-opened:before { content: '\eb45'; }
.codicon-root-folder:before { content: '\eb46'; }
.codicon-rss:before { content: '\eb47'; }
.codicon-ruby:before { content: '\eb48'; }
.codicon-save-all:before { content: '\eb49'; }
.codicon-save-as:before { content: '\eb4a'; }
.codicon-save:before { content: '\eb4b'; }
.codicon-screen-full:before { content: '\eb4c'; }
.codicon-screen-normal:before { content: '\eb4d'; }
.codicon-search-stop:before { content: '\eb4e'; }
.codicon-server:before { content: '\eb50'; }
.codicon-settings-gear:before { content: '\eb51'; }
.codicon-settings:before { content: '\eb52'; }
.codicon-shield:before { content: '\eb53'; }
.codicon-smiley:before { content: '\eb54'; }
.codicon-sort-precedence:before { content: '\eb55'; }
.codicon-split-horizontal:before { content: '\eb56'; }
.codicon-split-vertical:before { content: '\eb57'; }
.codicon-squirrel:before { content: '\eb58'; }
.codicon-star-full:before { content: '\eb59'; }
.codicon-star-half:before { content: '\eb5a'; }
.codicon-symbol-class:before { content: '\eb5b'; }
.codicon-symbol-color:before { content: '\eb5c'; }
.codicon-symbol-customcolor:before { content: '\eb5c'; }
.codicon-symbol-constant:before { content: '\eb5d'; }
.codicon-symbol-enum-member:before { content: '\eb5e'; }
.codicon-symbol-field:before { content: '\eb5f'; }
.codicon-symbol-file:before { content: '\eb60'; }
.codicon-symbol-interface:before { content: '\eb61'; }
.codicon-symbol-keyword:before { content: '\eb62'; }
.codicon-symbol-misc:before { content: '\eb63'; }
.codicon-symbol-operator:before { content: '\eb64'; }
.codicon-symbol-property:before { content: '\eb65'; }
.codicon-wrench:before { content: '\eb65'; }
.codicon-wrench-subaction:before { content: '\eb65'; }
.codicon-symbol-snippet:before { content: '\eb66'; }
.codicon-tasklist:before { content: '\eb67'; }
.codicon-telescope:before { content: '\eb68'; }
.codicon-text-size:before { content: '\eb69'; }
.codicon-three-bars:before { content: '\eb6a'; }
.codicon-thumbsdown:before { content: '\eb6b'; }
.codicon-thumbsup:before { content: '\eb6c'; }
.codicon-tools:before { content: '\eb6d'; }
.codicon-triangle-down:before { content: '\eb6e'; }
.codicon-triangle-left:before { content: '\eb6f'; }
.codicon-triangle-right:before { content: '\eb70'; }
.codicon-triangle-up:before { content: '\eb71'; }
.codicon-twitter:before { content: '\eb72'; }
.codicon-unfold:before { content: '\eb73'; }
.codicon-unlock:before { content: '\eb74'; }
.codicon-unmute:before { content: '\eb75'; }
.codicon-unverified:before { content: '\eb76'; }
.codicon-verified:before { content: '\eb77'; }
.codicon-versions:before { content: '\eb78'; }
.codicon-vm-active:before { content: '\eb79'; }
.codicon-vm-outline:before { content: '\eb7a'; }
.codicon-vm-running:before { content: '\eb7b'; }
.codicon-watch:before { content: '\eb7c'; }
.codicon-whitespace:before { content: '\eb7d'; }
.codicon-whole-word:before { content: '\eb7e'; }
.codicon-window:before { content: '\eb7f'; }
.codicon-word-wrap:before { content: '\eb80'; }
.codicon-zoom-in:before { content: '\eb81'; }
.codicon-zoom-out:before { content: '\eb82'; }
.codicon-list-filter:before { content: '\eb83'; }
.codicon-list-flat:before { content: '\eb84'; }
.codicon-list-selection:before { content: '\eb85'; }
.codicon-selection:before { content: '\eb85'; }
.codicon-list-tree:before { content: '\eb86'; }
.codicon-debug-breakpoint-function-unverified:before { content: '\eb87'; }
.codicon-debug-breakpoint-function:before { content: '\eb88'; }
.codicon-debug-breakpoint-function-disabled:before { content: '\eb88'; }
.codicon-debug-stackframe-active:before { content: '\eb89'; }
.codicon-debug-stackframe-dot:before { content: '\eb8a'; }
.codicon-debug-stackframe:before { content: '\eb8b'; }
.codicon-debug-stackframe-focused:before { content: '\eb8b'; }
.codicon-debug-breakpoint-unsupported:before { content: '\eb8c'; }
.codicon-symbol-string:before { content: '\eb8d'; }
.codicon-debug-reverse-continue:before { content: '\eb8e'; }
.codicon-debug-step-back:before { content: '\eb8f'; }
.codicon-debug-restart-frame:before { content: '\eb90'; }
.codicon-call-incoming:before { content: '\eb92'; }
.codicon-call-outgoing:before { content: '\eb93'; }
.codicon-menu:before { content: '\eb94'; }
.codicon-expand-all:before { content: '\eb95'; }
.codicon-feedback:before { content: '\eb96'; }
.codicon-group-by-ref-type:before { content: '\eb97'; }
.codicon-ungroup-by-ref-type:before { content: '\eb98'; }
.codicon-account:before { content: '\eb99'; }
.codicon-bell-dot:before { content: '\eb9a'; }
.codicon-debug-console:before { content: '\eb9b'; }
.codicon-library:before { content: '\eb9c'; }
.codicon-output:before { content: '\eb9d'; }
.codicon-run-all:before { content: '\eb9e'; }
.codicon-sync-ignored:before { content: '\eb9f'; }
.codicon-pinned:before { content: '\eba0'; }
.codicon-github-inverted:before { content: '\eba1'; }
.codicon-debug-alt:before { content: '\eb91'; }
.codicon-server-process:before { content: '\eba2'; }
.codicon-server-environment:before { content: '\eba3'; }
.codicon-pass:before { content: '\eba4'; }
.codicon-stop-circle:before { content: '\eba5'; }
.codicon-play-circle:before { content: '\eba6'; }
.codicon-record:before { content: '\eba7'; }
.codicon-debug-alt-small:before { content: '\eba8'; }
.codicon-vm-connect:before { content: '\eba9'; }
.codicon-cloud:before { content: '\ebaa'; }
.codicon-merge:before { content: '\ebab'; }
.codicon-export:before { content: '\ebac'; }
.codicon-graph-left:before { content: '\ebad'; }
.codicon-magnet:before { content: '\ebae'; }
.codicon-notebook:before { content: '\ebaf'; }
.codicon-redo:before { content: '\ebb0'; }
.codicon-check-all:before { content: '\ebb1'; }
.codicon-pinned-dirty:before { content: '\ebb2'; }
.codicon-pass-filled:before { content: '\ebb3'; }
.codicon-circle-large-filled:before { content: '\ebb4'; }
.codicon-circle-large-outline:before { content: '\ebb5'; }
.codicon-combine:before { content: '\ebb6'; }
.codicon-gather:before { content: '\ebb6'; }
.codicon-table:before { content: '\ebb7'; }
.codicon-variable-group:before { content: '\ebb8'; }
.codicon-type-hierarchy:before { content: '\ebb9'; }
.codicon-type-hierarchy-sub:before { content: '\ebba'; }
.codicon-type-hierarchy-super:before { content: '\ebbb'; }
.codicon-git-pull-request-create:before { content: '\ebbc'; }
.codicon-run-above:before { content: '\ebbd'; }
.codicon-run-below:before { content: '\ebbe'; }
.codicon-notebook-template:before { content: '\ebbf'; }
.codicon-debug-rerun:before { content: '\ebc0'; }
.codicon-workspace-trusted:before { content: '\ebc1'; }
.codicon-workspace-untrusted:before { content: '\ebc2'; }
.codicon-workspace-unspecified:before { content: '\ebc3'; }
.codicon-terminal-cmd:before { content: '\ebc4'; }
.codicon-terminal-debian:before { content: '\ebc5'; }
.codicon-terminal-linux:before { content: '\ebc6'; }
.codicon-terminal-powershell:before { content: '\ebc7'; }
.codicon-terminal-tmux:before { content: '\ebc8'; }
.codicon-terminal-ubuntu:before { content: '\ebc9'; }
.codicon-terminal-bash:before { content: '\ebca'; }
.codicon-arrow-swap:before { content: '\ebcb'; }
.codicon-copy:before { content: '\ebcc'; }
.codicon-person-add:before { content: '\ebcd'; }
.codicon-filter-filled:before { content: '\ebce'; }
.codicon-wand:before { content: '\ebcf'; }
.codicon-debug-line-by-line:before { content: '\ebd0'; }
.codicon-inspect:before { content: '\ebd1'; }
.codicon-layers:before { content: '\ebd2'; }
.codicon-layers-dot:before { content: '\ebd3'; }
.codicon-layers-active:before { content: '\ebd4'; }
.codicon-compass:before { content: '\ebd5'; }
.codicon-compass-dot:before { content: '\ebd6'; }
.codicon-compass-active:before { content: '\ebd7'; }
.codicon-azure:before { content: '\ebd8'; }
.codicon-issue-draft:before { content: '\ebd9'; }
.codicon-git-pull-request-closed:before { content: '\ebda'; }
.codicon-git-pull-request-draft:before { content: '\ebdb'; }
.codicon-debug-all:before { content: '\ebdc'; }
.codicon-debug-coverage:before { content: '\ebdd'; }
.codicon-run-errors:before { content: '\ebde'; }
.codicon-folder-library:before { content: '\ebdf'; }
.codicon-debug-continue-small:before { content: '\ebe0'; }
.codicon-beaker-stop:before { content: '\ebe1'; }
.codicon-graph-line:before { content: '\ebe2'; }
.codicon-graph-scatter:before { content: '\ebe3'; }
.codicon-pie-chart:before { content: '\ebe4'; }
.codicon-bracket:before { content: '\eb0f'; }
.codicon-bracket-dot:before { content: '\ebe5'; }
.codicon-bracket-error:before { content: '\ebe6'; }
.codicon-lock-small:before { content: '\ebe7'; }
.codicon-azure-devops:before { content: '\ebe8'; }
.codicon-verified-filled:before { content: '\ebe9'; }
.codicon-newline:before { content: '\ebea'; }
.codicon-layout:before { content: '\ebeb'; }
.codicon-layout-activitybar-left:before { content: '\ebec'; }
.codicon-layout-activitybar-right:before { content: '\ebed'; }
.codicon-layout-panel-left:before { content: '\ebee'; }
.codicon-layout-panel-center:before { content: '\ebef'; }
.codicon-layout-panel-justify:before { content: '\ebf0'; }
.codicon-layout-panel-right:before { content: '\ebf1'; }
.codicon-layout-panel:before { content: '\ebf2'; }
.codicon-layout-sidebar-left:before { content: '\ebf3'; }
.codicon-layout-sidebar-right:before { content: '\ebf4'; }
.codicon-layout-statusbar:before { content: '\ebf5'; }
.codicon-layout-menubar:before { content: '\ebf6'; }
.codicon-layout-centered:before { content: '\ebf7'; }
.codicon-target:before { content: '\ebf8'; }
.codicon-indent:before { content: '\ebf9'; }
.codicon-record-small:before { content: '\ebfa'; }
.codicon-error-small:before { content: '\ebfb'; }
.codicon-arrow-circle-down:before { content: '\ebfc'; }
.codicon-arrow-circle-left:before { content: '\ebfd'; }
.codicon-arrow-circle-right:before { content: '\ebfe'; }
.codicon-arrow-circle-up:before { content: '\ebff'; }
.codicon-dialog-error:before { content: '\ea87'; }
.codicon-dialog-warning:before { content: '\ea6c'; }
.codicon-dialog-info:before { content: '\ea74'; }
.codicon-dialog-close:before { content: '\ea76'; }
.codicon-tree-item-expanded:before { content: '\eab4'; }
.codicon-tree-filter-on-type-on:before { content: '\eb83'; }
.codicon-tree-filter-on-type-off:before { content: '\eb85'; }
.codicon-tree-filter-clear:before { content: '\ea76'; }
.codicon-tree-item-loading:before { content: '\eb19'; }
.codicon-menu-selection:before { content: '\eab2'; }
.codicon-menu-submenu:before { content: '\eab6'; }
.codicon-menubar-more:before { content: '\ea7c'; }
.codicon-scrollbar-button-left:before { content: '\eb6f'; }
.codicon-scrollbar-button-right:before { content: '\eb70'; }
.codicon-scrollbar-button-up:before { content: '\eb71'; }
.codicon-scrollbar-button-down:before { content: '\eb6e'; }
.codicon-toolbar-more:before { content: '\ea7c'; }
.codicon-quick-input-back:before { content: '\ea9b'; }
.codicon-widget-close:before { content: '\ea76'; }
.codicon-goto-previous-location:before { content: '\eaa1'; }
.codicon-goto-next-location:before { content: '\ea9a'; }
.codicon-diff-review-insert:before { content: '\ea60'; }
.codicon-diff-review-remove:before { content: '\eb3b'; }
.codicon-diff-review-close:before { content: '\ea76'; }
.codicon-diff-insert:before { content: '\ea60'; }
.codicon-diff-remove:before { content: '\eb3b'; }
.codicon-folding-expanded:before { content: '\eab4'; }
.codicon-folding-collapsed:before { content: '\eab6'; }
.codicon-notifications-clear:before { content: '\ea76'; }
.codicon-notifications-clear-all:before { content: '\eabf'; }
.codicon-notifications-hide:before { content: '\eab4'; }
.codicon-notifications-expand:before { content: '\eab7'; }
.codicon-notifications-collapse:before { content: '\eab4'; }
.codicon-notifications-configure:before { content: '\eaf8'; }
.codicon-marker-navigation-next:before { content: '\ea9a'; }
.codicon-marker-navigation-previous:before { content: '\eaa1'; }
.codicon-find-selection:before { content: '\eb85'; }
.codicon-find-collapsed:before { content: '\eab6'; }
.codicon-find-expanded:before { content: '\eab4'; }
.codicon-find-replace:before { content: '\eb3d'; }
.codicon-find-replace-all:before { content: '\eb3c'; }
.codicon-find-previous-match:before { content: '\eaa1'; }
.codicon-find-next-match:before { content: '\ea9a'; }
.codicon-suggest-more-info:before { content: '\eab6'; }
.codicon-parameter-hints-next:before { content: '\eab4'; }
.codicon-parameter-hints-previous:before { content: '\eab7'; }
.codicon-extensions-warning-message:before { content: '\ea6c'; }
.monaco-editor, .monaco-editor-background, .monaco-editor .inputarea.ime-input { background-color: #252e38; }
.monaco-editor, .monaco-editor .inputarea.ime-input { color: #d4d4d4; }
.monaco-editor .margin { background-color: #252e38; }
.monaco-editor .rangeHighlight { background-color: rgba(255, 255, 255, 0.04); }
.monaco-editor .symbolHighlight { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .mtkw { color: rgba(227, 228, 226, 0.16) !important; }
.monaco-editor .mtkz { color: rgba(227, 228, 226, 0.16) !important; }
.monaco-editor .line-numbers { color: #858585; }
.monaco-editor .line-numbers.active-line-number { color: #c6c6c6; }
.monaco-editor .view-overlays .current-line { border: 2px solid #282828; }
.monaco-editor .margin-view-overlays .current-line-margin { border: 2px solid #282828; }

			.monaco-scrollable-element > .shadow.top {
				box-shadow: #000000 0 6px 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.left {
				box-shadow: #000000 6px 0 6px -6px inset;
			}

			.monaco-scrollable-element > .shadow.top.left {
				box-shadow: #000000 6px 6px 6px -6px inset;
			}
		

			.monaco-scrollable-element > .scrollbar > .slider {
				background: rgba(121, 121, 121, 0.4);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-scrollable-element > .scrollbar > .slider.active {
				background: rgba(191, 191, 191, 0.4);
			}
		
.monaco-editor .lines-content .core-guide-indent { box-shadow: 1px 0 0 0 #404040 inset; }
.monaco-editor .lines-content .core-guide-indent-active { box-shadow: 1px 0 0 0 #707070 inset; }
.monaco-editor .bracket-indent-guide.lvl-0 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-1 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-2 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-3 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-4 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-5 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-6 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-7 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-8 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-9 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-10 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-11 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-12 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-13 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-14 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-15 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-16 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-17 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-18 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-19 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-20 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-21 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-22 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-23 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-24 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-25 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-26 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .bracket-indent-guide.lvl-27 { --guide-color: rgba(255, 215, 0, 0.3); --guide-color-active: #ffd700; }
.monaco-editor .bracket-indent-guide.lvl-28 { --guide-color: rgba(218, 112, 214, 0.3); --guide-color-active: #da70d6; }
.monaco-editor .bracket-indent-guide.lvl-29 { --guide-color: rgba(23, 159, 255, 0.3); --guide-color-active: #179fff; }
.monaco-editor .vertical { box-shadow: 1px 0 0 0 var(--guide-color) inset; }
.monaco-editor .horizontal-top { border-top: 1px solid var(--guide-color); }
.monaco-editor .horizontal-bottom { border-bottom: 1px solid var(--guide-color); }
.monaco-editor .vertical.indent-active { box-shadow: 1px 0 0 0 var(--guide-color-active) inset; }
.monaco-editor .horizontal-top.indent-active { border-top: 1px solid var(--guide-color-active); }
.monaco-editor .horizontal-bottom.indent-active { border-bottom: 1px solid var(--guide-color-active); }
.monaco-editor .minimap-slider .minimap-slider-horizontal { background: rgba(121, 121, 121, 0.2); }
.monaco-editor .minimap-slider:hover .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.35); }
.monaco-editor .minimap-slider.active .minimap-slider-horizontal { background: rgba(191, 191, 191, 0.2); }
.monaco-editor .minimap-shadow-visible { box-shadow: #000000 -6px 0 6px -6px inset; }
.monaco-editor .view-ruler { box-shadow: 1px 0 0 0 #5a5a5a inset; }
.monaco-editor .scroll-decoration { box-shadow: #000000 0 6px 6px -6px inset; }
.monaco-editor .focused .selected-text { background-color: #264f78; }
.monaco-editor .selected-text { background-color: #3a3d41; }
.monaco-editor .inputarea.ime-input { caret-color: #aeafad; }
.monaco-editor .cursors-layer .cursor { background-color: #aeafad; border-color: #aeafad; color: #515052; }
.monaco-editor .unexpected-closing-bracket { color: rgba(255, 18, 18, 0.8); }
.monaco-editor .bracket-highlighting-0 { color: #ffd700; }
.monaco-editor .bracket-highlighting-1 { color: #da70d6; }
.monaco-editor .bracket-highlighting-2 { color: #179fff; }
.monaco-editor .bracket-highlighting-3 { color: #ffd700; }
.monaco-editor .bracket-highlighting-4 { color: #da70d6; }
.monaco-editor .bracket-highlighting-5 { color: #179fff; }
.monaco-editor .bracket-highlighting-6 { color: #ffd700; }
.monaco-editor .bracket-highlighting-7 { color: #da70d6; }
.monaco-editor .bracket-highlighting-8 { color: #179fff; }
.monaco-editor .bracket-highlighting-9 { color: #ffd700; }
.monaco-editor .bracket-highlighting-10 { color: #da70d6; }
.monaco-editor .bracket-highlighting-11 { color: #179fff; }
.monaco-editor .bracket-highlighting-12 { color: #ffd700; }
.monaco-editor .bracket-highlighting-13 { color: #da70d6; }
.monaco-editor .bracket-highlighting-14 { color: #179fff; }
.monaco-editor .bracket-highlighting-15 { color: #ffd700; }
.monaco-editor .bracket-highlighting-16 { color: #da70d6; }
.monaco-editor .bracket-highlighting-17 { color: #179fff; }
.monaco-editor .bracket-highlighting-18 { color: #ffd700; }
.monaco-editor .bracket-highlighting-19 { color: #da70d6; }
.monaco-editor .bracket-highlighting-20 { color: #179fff; }
.monaco-editor .bracket-highlighting-21 { color: #ffd700; }
.monaco-editor .bracket-highlighting-22 { color: #da70d6; }
.monaco-editor .bracket-highlighting-23 { color: #179fff; }
.monaco-editor .bracket-highlighting-24 { color: #ffd700; }
.monaco-editor .bracket-highlighting-25 { color: #da70d6; }
.monaco-editor .bracket-highlighting-26 { color: #179fff; }
.monaco-editor .bracket-highlighting-27 { color: #ffd700; }
.monaco-editor .bracket-highlighting-28 { color: #da70d6; }
.monaco-editor .bracket-highlighting-29 { color: #179fff; }
.monaco-editor .squiggly-error { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23f14c4c'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-warning { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23cca700'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-info { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%233794ff'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-hint { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20height%3D%223%22%20width%3D%2212%22%3E%3Cg%20fill%3D%22rgba(238%2C%20238%2C%20238%2C%200.7)%22%3E%3Ccircle%20cx%3D%221%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%225%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%229%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") no-repeat bottom left; }
.monaco-editor.showUnused .squiggly-inline-unnecessary { opacity: 0.667; }
.monaco-editor.showDeprecated .squiggly-inline-deprecated { text-decoration: line-through; text-decoration-color: #d4d4d4}
.monaco-diff-editor .diff-review-line-number { color: #858585; }
.monaco-diff-editor .diff-review-shadow { box-shadow: #000000 0 -6px 6px -6px inset; }
.monaco-editor .char-insert, .monaco-diff-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .line-insert, .monaco-diff-editor .line-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .inline-added-margin-view-zone { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .gutter-insert, .monaco-diff-editor .gutter-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .char-delete, .monaco-diff-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .line-delete, .monaco-diff-editor .line-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .inline-deleted-margin-view-zone { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .gutter-delete, .monaco-diff-editor .gutter-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor.side-by-side .editor.modified { box-shadow: -6px 0 5px -5px #000000; }

			.monaco-diff-editor .diffViewport {
				background: rgba(121, 121, 121, 0.4);
			}
		

			.monaco-diff-editor .diffViewport:hover {
				background: rgba(100, 100, 100, 0.7);
			}
		

			.monaco-diff-editor .diffViewport:active {
				background: rgba(191, 191, 191, 0.4);
			}
		

	.monaco-editor .diagonal-fill {
		background-image: linear-gradient(
			-45deg,
			rgba(204, 204, 204, 0.2) 12.5%,
			#0000 12.5%, #0000 50%,
			rgba(204, 204, 204, 0.2) 50%, rgba(204, 204, 204, 0.2) 62.5%,
			#0000 62.5%, #0000 100%
		);
		background-size: 8px 8px;
	}
	
.monaco-editor .folded-background { background-color: rgba(38, 79, 120, 0.3); }

		.monaco-editor .cldr.codicon.codicon-folding-expanded,
		.monaco-editor .cldr.codicon.codicon-folding-collapsed {
			color: #c5c5c5 !important;
		}
		
.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-message a { color: #3794ff; }

		.monaco-workbench .notifications-list-container .notification-list-item .notification-list-item-message a:focus {
			outline-color: #007fd4;
		}

		.monaco-workbench .notifications-center .codicon.codicon-error,
		.monaco-workbench .notifications-toasts .codicon.codicon-error {
			color: #f14c4c;
		}

		.monaco-workbench .notifications-center .codicon.codicon-warning,
		.monaco-workbench .notifications-toasts .codicon.codicon-warning {
			color: #cca700;
		}

		.monaco-workbench .notifications-center .codicon.codicon-info,
		.monaco-workbench .notifications-toasts .codicon.codicon-info {
			color: #3794ff;
		}
.monaco-editor .bracket-match { background-color: rgba(0, 100, 0, 0.1); }
.monaco-editor .bracket-match { border: 1px solid #888888; }

		.monaco-editor .contentWidgets .codicon.codicon-light-bulb {
			color: #ffcc00;
			background-color: rgba(37, 46, 56, 0.7);
		}

		.monaco-editor .contentWidgets .codicon.codicon-lightbulb-autofix {
			color: #75beff;
			background-color: rgba(37, 46, 56, 0.7);
		}
.monaco-editor .goto-definition-link { color: #4e94ce !important; }

			.monaco-editor .zone-widget .codicon.codicon-error,
			.markers-panel .marker-icon.codicon.codicon-error,
			.text-search-provider-messages .providerMessage .codicon.codicon-error,
			.extensions-viewlet > .extensions .codicon.codicon-error {
				color: #f14c4c;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-warning,
			.markers-panel .marker-icon.codicon.codicon-warning,
			.extensions-viewlet > .extensions .codicon.codicon-warning,
			.extension-editor .codicon.codicon-warning,
			.text-search-provider-messages .providerMessage .codicon.codicon-warning,
			.preferences-editor .codicon.codicon-warning {
				color: #cca700;
			}
		

			.monaco-editor .zone-widget .codicon.codicon-info,
			.markers-panel .marker-icon.codicon.codicon-info,
			.extensions-viewlet > .extensions .codicon.codicon-info,
			.text-search-provider-messages .providerMessage .codicon.codicon-info,
			.extension-editor .codicon.codicon-info {
				color: #3794ff;
			}
		
.monaco-hover .hover-contents a.code-link span { color: #3794ff; }
.monaco-hover .hover-contents a.code-link span:hover { color: #3794ff; }
.monaco-editor .hoverHighlight { background-color: rgba(38, 79, 120, 0.25); }
.monaco-editor .monaco-hover { background-color: #252526; }
.monaco-editor .monaco-hover { border: 1px solid #454545; }
.monaco-editor .monaco-hover .hover-row:not(:first-child):not(:empty) { border-top: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover hr { border-top: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover hr { border-bottom: 0px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .monaco-hover a { color: #3794ff; }
.monaco-editor .monaco-hover a:hover { color: #3794ff; }
.monaco-editor .monaco-hover { color: #cccccc; }
.monaco-editor .monaco-hover .hover-row .actions { background-color: #2c2c2d; }
.monaco-editor .monaco-hover code { background-color: rgba(10, 10, 10, 0.4); }
.monaco-editor .findOptionsWidget { background-color: #252526; }
.monaco-editor .findOptionsWidget { color: #cccccc; }
.monaco-editor .findOptionsWidget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.36); }
.monaco-editor .findMatch { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .currentFindMatch { background-color: #515c6a; }
.monaco-editor .findScope { background-color: rgba(58, 61, 65, 0.4); }
.monaco-editor .find-widget { background-color: #252526; }
.monaco-editor .find-widget { box-shadow: 0 0 8px 2px rgba(0, 0, 0, 0.36); }
.monaco-editor .find-widget { color: #cccccc; }
.monaco-editor .find-widget.no-results .matchesCount { color: #f48771; }
.monaco-editor .find-widget .monaco-sash { background-color: #454545; }

		.monaco-editor .find-widget .button:not(.disabled):hover,
		.monaco-editor .find-widget .codicon-find-selection:hover {
			background-color: rgba(90, 93, 94, 0.31) !important;
		}
	
.monaco-editor .find-widget .monaco-inputbox.synthetic-focus { outline-color: #007fd4; }
.codicon.codicon-symbol-array { color: #cccccc; }
.codicon.codicon-symbol-boolean { color: #cccccc; }
.codicon.codicon-symbol-class { color: #ee9d28; }
.codicon.codicon-symbol-method { color: #b180d7; }
.codicon.codicon-symbol-color { color: #cccccc; }
.codicon.codicon-symbol-constant { color: #cccccc; }
.codicon.codicon-symbol-constructor { color: #b180d7; }

			.codicon.codicon-symbol-value,.codicon.codicon-symbol-enum { color: #ee9d28; }
.codicon.codicon-symbol-enum-member { color: #75beff; }
.codicon.codicon-symbol-event { color: #ee9d28; }
.codicon.codicon-symbol-field { color: #75beff; }
.codicon.codicon-symbol-file { color: #cccccc; }
.codicon.codicon-symbol-folder { color: #cccccc; }
.codicon.codicon-symbol-function { color: #b180d7; }
.codicon.codicon-symbol-interface { color: #75beff; }
.codicon.codicon-symbol-key { color: #cccccc; }
.codicon.codicon-symbol-keyword { color: #cccccc; }
.codicon.codicon-symbol-module { color: #cccccc; }
.codicon.codicon-symbol-namespace { color: #cccccc; }
.codicon.codicon-symbol-null { color: #cccccc; }
.codicon.codicon-symbol-number { color: #cccccc; }
.codicon.codicon-symbol-object { color: #cccccc; }
.codicon.codicon-symbol-operator { color: #cccccc; }
.codicon.codicon-symbol-package { color: #cccccc; }
.codicon.codicon-symbol-property { color: #cccccc; }
.codicon.codicon-symbol-reference { color: #cccccc; }
.codicon.codicon-symbol-snippet { color: #cccccc; }
.codicon.codicon-symbol-string { color: #cccccc; }
.codicon.codicon-symbol-struct { color: #cccccc; }
.codicon.codicon-symbol-text { color: #cccccc; }
.codicon.codicon-symbol-type-parameter { color: #cccccc; }
.codicon.codicon-symbol-unit { color: #cccccc; }
.codicon.codicon-symbol-variable { color: #75beff; }
.monaco-editor .ghost-text-decoration { color: rgba(255, 255, 255, 0.34) !important; }
.monaco-editor .ghost-text-decoration-preview { color: rgba(255, 255, 255, 0.34) !important; }
.monaco-editor .suggest-preview-text .ghost-text { color: rgba(255, 255, 255, 0.34) !important; }
.monaco-editor.vs .valueSetReplacement { outline: solid 2px #888888; }
.monaco-editor .linked-editing-decoration { background: rgba(255, 0, 0, 0.3); border-left-color: rgba(255, 0, 0, 0.3); }
.monaco-editor .detected-link-active { color: #4e94ce !important; }
.monaco-editor .parameter-hints-widget { border: 1px solid #454545; }
.monaco-editor .parameter-hints-widget.multiple .body { border-left: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .parameter-hints-widget .signature.has-docs { border-bottom: 1px solid rgba(69, 69, 69, 0.5); }
.monaco-editor .parameter-hints-widget { background-color: #252526; }
.monaco-editor .parameter-hints-widget a { color: #3794ff; }
.monaco-editor .parameter-hints-widget a:hover { color: #3794ff; }
.monaco-editor .parameter-hints-widget { color: #cccccc; }
.monaco-editor .parameter-hints-widget code { background-color: rgba(10, 10, 10, 0.4); }
.monaco-editor .parameter-hints-widget .parameter.active { color: #18a3ff}
.monaco-link { color: #3794ff; }
.monaco-link:hover { color: #3794ff; }
.monaco-editor .focused .selectionHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .selectionHighlight { background-color: rgba(173, 214, 255, 0.07); }
.monaco-editor .wordHighlight { background-color: rgba(87, 87, 87, 0.72); }
.monaco-editor .wordHighlightStrong { background-color: rgba(0, 73, 114, 0.72); }
.monaco-editor .accessibilityHelpWidget { background-color: #252526; }
.monaco-editor .accessibilityHelpWidget { color: #cccccc; }
.monaco-editor .accessibilityHelpWidget { box-shadow: 0 2px 8px rgba(0, 0, 0, 0.36); }
.monaco-editor .tokens-inspect-widget { border: 1px solid #454545; }
.monaco-editor .tokens-inspect-widget .tokens-inspect-separator { background-color: #454545; }
.monaco-editor .tokens-inspect-widget { background-color: #252526; }
.monaco-editor .tokens-inspect-widget { color: #cccccc; }
.monaco-editor { --vscode-foreground: #cccccc;
--vscode-errorForeground: #f48771;
--vscode-descriptionForeground: rgba(204, 204, 204, 0.7);
--vscode-icon-foreground: #c5c5c5;
--vscode-focusBorder: #007fd4;
--vscode-textSeparator-foreground: rgba(255, 255, 255, 0.18);
--vscode-textLink-foreground: #3794ff;
--vscode-textLink-activeForeground: #3794ff;
--vscode-textPreformat-foreground: #d7ba7d;
--vscode-textBlockQuote-background: rgba(127, 127, 127, 0.1);
--vscode-textBlockQuote-border: rgba(0, 122, 204, 0.5);
--vscode-textCodeBlock-background: rgba(10, 10, 10, 0.4);
--vscode-widget-shadow: rgba(0, 0, 0, 0.36);
--vscode-input-background: #3c3c3c;
--vscode-input-foreground: #cccccc;
--vscode-inputOption-activeBorder: rgba(0, 122, 204, 0);
--vscode-inputOption-hoverBackground: rgba(90, 93, 94, 0.5);
--vscode-inputOption-activeBackground: rgba(0, 127, 212, 0.4);
--vscode-inputOption-activeForeground: #ffffff;
--vscode-input-placeholderForeground: #a6a6a6;
--vscode-inputValidation-infoBackground: #063b49;
--vscode-inputValidation-infoBorder: #007acc;
--vscode-inputValidation-warningBackground: #352a05;
--vscode-inputValidation-warningBorder: #b89500;
--vscode-inputValidation-errorBackground: #5a1d1d;
--vscode-inputValidation-errorBorder: #be1100;
--vscode-dropdown-background: #3c3c3c;
--vscode-dropdown-foreground: #f0f0f0;
--vscode-dropdown-border: #3c3c3c;
--vscode-checkbox-background: #3c3c3c;
--vscode-checkbox-foreground: #f0f0f0;
--vscode-checkbox-border: #3c3c3c;
--vscode-button-foreground: #ffffff;
--vscode-button-background: #0e639c;
--vscode-button-hoverBackground: #1177bb;
--vscode-button-secondaryForeground: #ffffff;
--vscode-button-secondaryBackground: #3a3d41;
--vscode-button-secondaryHoverBackground: #45494e;
--vscode-badge-background: #4d4d4d;
--vscode-badge-foreground: #ffffff;
--vscode-scrollbar-shadow: #000000;
--vscode-scrollbarSlider-background: rgba(121, 121, 121, 0.4);
--vscode-scrollbarSlider-hoverBackground: rgba(100, 100, 100, 0.7);
--vscode-scrollbarSlider-activeBackground: rgba(191, 191, 191, 0.4);
--vscode-progressBar-background: #0e70c0;
--vscode-editorError-foreground: #f14c4c;
--vscode-editorWarning-foreground: #cca700;
--vscode-editorInfo-foreground: #3794ff;
--vscode-editorHint-foreground: rgba(238, 238, 238, 0.7);
--vscode-sash-hoverBorder: #007fd4;
--vscode-editor-background: #252e38;
--vscode-editor-foreground: #d4d4d4;
--vscode-editorWidget-background: #252526;
--vscode-editorWidget-foreground: #cccccc;
--vscode-editorWidget-border: #454545;
--vscode-quickInput-background: #252526;
--vscode-quickInput-foreground: #cccccc;
--vscode-quickInputTitle-background: rgba(255, 255, 255, 0.1);
--vscode-pickerGroup-foreground: #3794ff;
--vscode-pickerGroup-border: #3f3f46;
--vscode-keybindingLabel-background: rgba(128, 128, 128, 0.17);
--vscode-keybindingLabel-foreground: #cccccc;
--vscode-keybindingLabel-border: rgba(51, 51, 51, 0.6);
--vscode-keybindingLabel-bottomBorder: rgba(68, 68, 68, 0.6);
--vscode-editor-selectionBackground: #264f78;
--vscode-editor-inactiveSelectionBackground: #3a3d41;
--vscode-editor-selectionHighlightBackground: rgba(173, 214, 255, 0.15);
--vscode-editor-findMatchBackground: #515c6a;
--vscode-editor-findMatchHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editor-findRangeHighlightBackground: rgba(58, 61, 65, 0.4);
--vscode-searchEditor-findMatchBackground: rgba(234, 92, 0, 0.22);
--vscode-editor-hoverHighlightBackground: rgba(38, 79, 120, 0.25);
--vscode-editorHoverWidget-background: #252526;
--vscode-editorHoverWidget-foreground: #cccccc;
--vscode-editorHoverWidget-border: #454545;
--vscode-editorHoverWidget-statusBarBackground: #2c2c2d;
--vscode-editorLink-activeForeground: #4e94ce;
--vscode-editorInlayHint-foreground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-background: rgba(77, 77, 77, 0.6);
--vscode-editorInlayHint-typeForeground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-typeBackground: rgba(77, 77, 77, 0.6);
--vscode-editorInlayHint-parameterForeground: rgba(255, 255, 255, 0.8);
--vscode-editorInlayHint-parameterBackground: rgba(77, 77, 77, 0.6);
--vscode-editorLightBulb-foreground: #ffcc00;
--vscode-editorLightBulbAutoFix-foreground: #75beff;
--vscode-diffEditor-insertedTextBackground: rgba(155, 185, 85, 0.2);
--vscode-diffEditor-removedTextBackground: rgba(255, 0, 0, 0.2);
--vscode-diffEditor-diagonalFill: rgba(204, 204, 204, 0.2);
--vscode-list-focusOutline: #007fd4;
--vscode-list-activeSelectionBackground: #094771;
--vscode-list-activeSelectionForeground: #ffffff;
--vscode-list-inactiveSelectionBackground: #37373d;
--vscode-list-hoverBackground: #2a2d2e;
--vscode-list-dropBackground: #383b3d;
--vscode-list-highlightForeground: #18a3ff;
--vscode-list-focusHighlightForeground: #18a3ff;
--vscode-list-invalidItemForeground: #b89500;
--vscode-list-errorForeground: #f88070;
--vscode-list-warningForeground: #cca700;
--vscode-listFilterWidget-background: #653723;
--vscode-listFilterWidget-outline: rgba(0, 0, 0, 0);
--vscode-listFilterWidget-noMatchesOutline: #be1100;
--vscode-list-filterMatchBackground: rgba(234, 92, 0, 0.33);
--vscode-tree-indentGuidesStroke: #585858;
--vscode-tree-tableColumnsBorder: rgba(204, 204, 204, 0.13);
--vscode-tree-tableOddRowsBackground: rgba(204, 204, 204, 0.04);
--vscode-list-deemphasizedForeground: #8c8c8c;
--vscode-quickInputList-focusForeground: #ffffff;
--vscode-quickInputList-focusBackground: #094771;
--vscode-menu-foreground: #cccccc;
--vscode-menu-background: #252526;
--vscode-menu-selectionForeground: #ffffff;
--vscode-menu-selectionBackground: #094771;
--vscode-menu-separatorBackground: #bbbbbb;
--vscode-toolbar-hoverBackground: rgba(90, 93, 94, 0.31);
--vscode-toolbar-activeBackground: rgba(99, 102, 103, 0.31);
--vscode-editor-snippetTabstopHighlightBackground: rgba(124, 124, 124, 0.3);
--vscode-editor-snippetFinalTabstopHighlightBorder: #525252;
--vscode-breadcrumb-foreground: rgba(204, 204, 204, 0.8);
--vscode-breadcrumb-background: #252e38;
--vscode-breadcrumb-focusForeground: #e0e0e0;
--vscode-breadcrumb-activeSelectionForeground: #e0e0e0;
--vscode-breadcrumbPicker-background: #252526;
--vscode-merge-currentHeaderBackground: rgba(64, 200, 174, 0.5);
--vscode-merge-currentContentBackground: rgba(64, 200, 174, 0.2);
--vscode-merge-incomingHeaderBackground: rgba(64, 166, 255, 0.5);
--vscode-merge-incomingContentBackground: rgba(64, 166, 255, 0.2);
--vscode-merge-commonHeaderBackground: rgba(96, 96, 96, 0.4);
--vscode-merge-commonContentBackground: rgba(96, 96, 96, 0.16);
--vscode-editorOverviewRuler-currentContentForeground: rgba(64, 200, 174, 0.5);
--vscode-editorOverviewRuler-incomingContentForeground: rgba(64, 166, 255, 0.5);
--vscode-editorOverviewRuler-commonContentForeground: rgba(96, 96, 96, 0.4);
--vscode-editorOverviewRuler-findMatchForeground: rgba(209, 134, 22, 0.49);
--vscode-editorOverviewRuler-selectionHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-minimap-findMatchHighlight: #d18616;
--vscode-minimap-selectionOccurrenceHighlight: #676767;
--vscode-minimap-selectionHighlight: #264f78;
--vscode-minimap-errorHighlight: rgba(255, 18, 18, 0.7);
--vscode-minimap-warningHighlight: #cca700;
--vscode-minimap-foregroundOpacity: #000000;
--vscode-minimapSlider-background: rgba(121, 121, 121, 0.2);
--vscode-minimapSlider-hoverBackground: rgba(100, 100, 100, 0.35);
--vscode-minimapSlider-activeBackground: rgba(191, 191, 191, 0.2);
--vscode-problemsErrorIcon-foreground: #f14c4c;
--vscode-problemsWarningIcon-foreground: #cca700;
--vscode-problemsInfoIcon-foreground: #3794ff;
--vscode-charts-foreground: #cccccc;
--vscode-charts-lines: rgba(204, 204, 204, 0.5);
--vscode-charts-red: #f14c4c;
--vscode-charts-blue: #3794ff;
--vscode-charts-yellow: #cca700;
--vscode-charts-orange: #d18616;
--vscode-charts-green: #89d185;
--vscode-charts-purple: #b180d7;
--vscode-editor-lineHighlightBorder: #282828;
--vscode-editor-rangeHighlightBackground: rgba(255, 255, 255, 0.04);
--vscode-editor-symbolHighlightBackground: rgba(234, 92, 0, 0.33);
--vscode-editorCursor-foreground: #aeafad;
--vscode-editorWhitespace-foreground: rgba(227, 228, 226, 0.16);
--vscode-editorIndentGuide-background: #404040;
--vscode-editorIndentGuide-activeBackground: #707070;
--vscode-editorLineNumber-foreground: #858585;
--vscode-editorActiveLineNumber-foreground: #c6c6c6;
--vscode-editorLineNumber-activeForeground: #c6c6c6;
--vscode-editorRuler-foreground: #5a5a5a;
--vscode-editorCodeLens-foreground: #999999;
--vscode-editorBracketMatch-background: rgba(0, 100, 0, 0.1);
--vscode-editorBracketMatch-border: #888888;
--vscode-editorOverviewRuler-border: rgba(127, 127, 127, 0.3);
--vscode-editorGutter-background: #252e38;
--vscode-editorUnnecessaryCode-opacity: rgba(0, 0, 0, 0.67);
--vscode-editorGhostText-foreground: rgba(255, 255, 255, 0.34);
--vscode-editorOverviewRuler-rangeHighlightForeground: rgba(0, 122, 204, 0.6);
--vscode-editorOverviewRuler-errorForeground: rgba(255, 18, 18, 0.7);
--vscode-editorOverviewRuler-warningForeground: #cca700;
--vscode-editorOverviewRuler-infoForeground: #3794ff;
--vscode-editorBracketHighlight-foreground1: #ffd700;
--vscode-editorBracketHighlight-foreground2: #da70d6;
--vscode-editorBracketHighlight-foreground3: #179fff;
--vscode-editorBracketHighlight-foreground4: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground5: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-foreground6: rgba(0, 0, 0, 0);
--vscode-editorBracketHighlight-unexpectedBracket-foreground: rgba(255, 18, 18, 0.8);
--vscode-editorBracketPairGuide-background1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-background6: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground1: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground2: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground3: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground4: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground5: rgba(0, 0, 0, 0);
--vscode-editorBracketPairGuide-activeBackground6: rgba(0, 0, 0, 0);
--vscode-editorUnicodeHighlight-border: #bd9b03;
--vscode-editor-foldBackground: rgba(38, 79, 120, 0.3);
--vscode-editorGutter-foldingControlForeground: #c5c5c5;
--vscode-notifications-foreground: #cccccc;
--vscode-notifications-background: #252526;
--vscode-notificationLink-foreground: #3794ff;
--vscode-notificationsErrorIcon-foreground: #f14c4c;
--vscode-notificationsWarningIcon-foreground: #cca700;
--vscode-notificationsInfoIcon-foreground: #3794ff;
--vscode-editorOverviewRuler-bracketMatchForeground: #a0a0a0;
--vscode-peekViewTitle-background: rgba(55, 148, 255, 0.1);
--vscode-peekViewTitleLabel-foreground: #ffffff;
--vscode-peekViewTitleDescription-foreground: rgba(204, 204, 204, 0.7);
--vscode-peekView-border: #3794ff;
--vscode-peekViewResult-background: #252526;
--vscode-peekViewResult-lineForeground: #bbbbbb;
--vscode-peekViewResult-fileForeground: #ffffff;
--vscode-peekViewResult-selectionBackground: rgba(51, 153, 255, 0.2);
--vscode-peekViewResult-selectionForeground: #ffffff;
--vscode-peekViewEditor-background: #001f33;
--vscode-peekViewEditorGutter-background: #001f33;
--vscode-peekViewResult-matchHighlightBackground: rgba(234, 92, 0, 0.3);
--vscode-peekViewEditor-matchHighlightBackground: rgba(255, 143, 0, 0.6);
--vscode-editorMarkerNavigationError-background: #f14c4c;
--vscode-editorMarkerNavigationError-headerBackground: rgba(241, 76, 76, 0.1);
--vscode-editorMarkerNavigationWarning-background: #cca700;
--vscode-editorMarkerNavigationWarning-headerBackground: rgba(204, 167, 0, 0.1);
--vscode-editorMarkerNavigationInfo-background: #3794ff;
--vscode-editorMarkerNavigationInfo-headerBackground: rgba(55, 148, 255, 0.1);
--vscode-editorMarkerNavigation-background: #252e38;
--vscode-symbolIcon-arrayForeground: #cccccc;
--vscode-symbolIcon-booleanForeground: #cccccc;
--vscode-symbolIcon-classForeground: #ee9d28;
--vscode-symbolIcon-colorForeground: #cccccc;
--vscode-symbolIcon-constantForeground: #cccccc;
--vscode-symbolIcon-constructorForeground: #b180d7;
--vscode-symbolIcon-enumeratorForeground: #ee9d28;
--vscode-symbolIcon-enumeratorMemberForeground: #75beff;
--vscode-symbolIcon-eventForeground: #ee9d28;
--vscode-symbolIcon-fieldForeground: #75beff;
--vscode-symbolIcon-fileForeground: #cccccc;
--vscode-symbolIcon-folderForeground: #cccccc;
--vscode-symbolIcon-functionForeground: #b180d7;
--vscode-symbolIcon-interfaceForeground: #75beff;
--vscode-symbolIcon-keyForeground: #cccccc;
--vscode-symbolIcon-keywordForeground: #cccccc;
--vscode-symbolIcon-methodForeground: #b180d7;
--vscode-symbolIcon-moduleForeground: #cccccc;
--vscode-symbolIcon-namespaceForeground: #cccccc;
--vscode-symbolIcon-nullForeground: #cccccc;
--vscode-symbolIcon-numberForeground: #cccccc;
--vscode-symbolIcon-objectForeground: #cccccc;
--vscode-symbolIcon-operatorForeground: #cccccc;
--vscode-symbolIcon-packageForeground: #cccccc;
--vscode-symbolIcon-propertyForeground: #cccccc;
--vscode-symbolIcon-referenceForeground: #cccccc;
--vscode-symbolIcon-snippetForeground: #cccccc;
--vscode-symbolIcon-stringForeground: #cccccc;
--vscode-symbolIcon-structForeground: #cccccc;
--vscode-symbolIcon-textForeground: #cccccc;
--vscode-symbolIcon-typeParameterForeground: #cccccc;
--vscode-symbolIcon-unitForeground: #cccccc;
--vscode-symbolIcon-variableForeground: #75beff;
--vscode-editorSuggestWidget-background: #252526;
--vscode-editorSuggestWidget-border: #454545;
--vscode-editorSuggestWidget-foreground: #d4d4d4;
--vscode-editorSuggestWidget-selectedForeground: #ffffff;
--vscode-editorSuggestWidget-selectedBackground: #094771;
--vscode-editorSuggestWidget-highlightForeground: #18a3ff;
--vscode-editorSuggestWidget-focusHighlightForeground: #18a3ff;
--vscode-editorSuggestWidgetStatus-foreground: rgba(212, 212, 212, 0.5);
--vscode-editor-linkedEditingBackground: rgba(255, 0, 0, 0.3);
--vscode-editorHoverWidget-highlightForeground: #18a3ff;
--vscode-editor-wordHighlightBackground: rgba(87, 87, 87, 0.72);
--vscode-editor-wordHighlightStrongBackground: rgba(0, 73, 114, 0.72);
--vscode-editorOverviewRuler-wordHighlightForeground: rgba(160, 160, 160, 0.8);
--vscode-editorOverviewRuler-wordHighlightStrongForeground: rgba(192, 160, 192, 0.8); }

.mtk1 { color: #d4d4d4; }
.mtk2 { color: #252e38; }
.mtk3 { color: #363e48; }
.mtk4 { color: #000080; }
.mtk5 { color: #6a9955; }
.mtk6 { color: #569cd6; }
.mtk7 { color: #b5cea8; }
.mtk8 { color: #646695; }
.mtk9 { color: #d7ba7d; }
.mtk10 { color: #9cdcfe; }
.mtk11 { color: #f44747; }
.mtk12 { color: #ce9178; }
.mtk13 { color: #6796e6; }
.mtk14 { color: #808080; }
.mtk15 { color: #d16969; }
.mtk16 { color: #dcdcaa; }
.mtk17 { color: #4ec9b0; }
.mtk18 { color: #c586c0; }
.mtk19 { color: #c8c8c8; }
.mtk20 { color: #cd9731; }
.mtk21 { color: #b267e6; }
.mtk22 { color: #cc6666; }
.mtk23 { color: #608b4e; }
.mtk24 { color: #dcdcdc; }
.mtk25 { color: #a79873; }
.mtk26 { color: #dd6a6f; }
.mtk27 { color: #5bb498; }
.mtk28 { color: #909090; }
.mtk29 { color: #778899; }
.mtk30 { color: #ff00ff; }
.mtk31 { color: #b46695; }
.mtk32 { color: #ff0000; }
.mtk33 { color: #4f76ac; }
.mtk34 { color: #3dc9b0; }
.mtk35 { color: #74b0df; }
.mtk36 { color: #4864aa; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }
.mtks { text-decoration: line-through; }
.mtks.mtku { text-decoration: underline line-through; text-underline-position: under; }</style><style type="text/css" media="screen">
		.monaco-editor .codelens-decoration._ee1f61 { line-height: 16px; font-size: 10px; padding-right: 5px; font-feature-settings: var(--codelens-font-features_ee1f61) }
		.monaco-editor .codelens-decoration._ee1f61 span.codicon { line-height: 16px; font-size: 10px; }
		</style><script type="text/javascript" charset="UTF-8" src="./Java_code_files/common.js.download"></script><script type="text/javascript" charset="UTF-8" src="./Java_code_files/util.js.download"></script></head><body class="variant-1A-active fullscreen monaco-workbench" ng-class="{
      &#39;mobile&#39;: pageLayoutService.mobile,
      &#39;menuVisible&#39;: pageLayoutService.menuVisible,
      &#39;fullscreen&#39;: pageLayoutService.fullscreen,
      &#39;scrollable&#39;: pageLayoutService.scrollable,
      &#39;pageLoaded&#39;: isPageLoaded(),
    }" ng-mouseleave="careerService.showOptinPopupPlaygrounds()"><div id="fb-root" class=" fb_reset"><div style="position: absolute; top: -10000px; width: 0px; height: 0px;"><div></div></div></div><svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" style="position: absolute; width: 0; height: 0" aria-hidden="true" id="__SVG_SPRITE_NODE__"><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 40 40" id="Facebook_40-213c64f11528d6d7ff1b0b16b16a0c8d--component"><path id="Facebook_40-213c64f11528d6d7ff1b0b16b16a0c8d--component_Facebook_40" d="M725.786 298h-35.6a2.208 2.208 0 00-2.192 2.208v35.6A2.207 2.207 0 00690.2 338h19.144v-15.468h-5.2v-6.056h5.2v-4.456c0-5.18 3.156-7.98 7.764-7.98h.016a41.629 41.629 0 014.656.24v5.4h-3.176c-2.508 0-3 1.2-3 2.94v3.856h5.984l-.8 6.056h-5.2V338h10.192a2.209 2.209 0 002.208-2.208v-35.6a2.208 2.208 0 00-2.202-2.192z" transform="translate(-688 -298)" fill="#4267b2" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 40 40" id="GitHub_40-897c60654c7af4a9e50644a86f585b45--component"><path id="GitHub_40-897c60654c7af4a9e50644a86f585b45--component_GitHub_40" d="M1017.79 374h-35.6a2.208 2.208 0 00-2.192 2.208v35.6A2.207 2.207 0 00982.2 414h35.588a2.2 2.2 0 002.2-2.208v-35.6a2.2 2.2 0 00-2.198-2.192zm-22.28 34c0-.415-.015-1.512-.024-2.969-4.865 1.055-5.891-2.339-5.891-2.339a4.629 4.629 0 00-1.942-2.553c-1.588-1.083.12-1.061.12-1.061a3.672 3.672 0 012.679 1.8 3.729 3.729 0 005.09 1.451 3.734 3.734 0 011.11-2.334c-3.883-.44-7.966-1.937-7.966-8.625a6.737 6.737 0 011.8-4.683 6.266 6.266 0 01.171-4.619s1.469-.469 4.81 1.789a16.608 16.608 0 018.753 0c3.34-2.258 4.81-1.789 4.81-1.789a6.27 6.27 0 01.17 4.619 6.732 6.732 0 011.8 4.683c0 6.7-4.09 8.18-7.98 8.612a4.19 4.19 0 011.18 3.232c0 2.333-.02 4.215-.02 4.788h-8.67z" transform="translate(-980 -374)" fill="#5dbd5c" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 40 40" id="LinkedIn_40-c6d1bfac5ed22440c4f8dfadfaa7261e--component"><path id="LinkedIn_40-c6d1bfac5ed22440c4f8dfadfaa7261e--component_LinkedIn_40" d="M1017.79 298h-35.6a2.208 2.208 0 00-2.192 2.208v35.6A2.207 2.207 0 00982.2 338h35.588a2.2 2.2 0 002.2-2.208v-35.6a2.2 2.2 0 00-2.198-2.192zM992 333h-6v-20h6v20zm-3-22.991a3 3 0 112.974-3 2.985 2.985 0 01-2.974 3zm25 23h-6v-9c0-2.424.31-5-3-5-3.36 0-3 1.275-3 4v10h-6V313l6.1-.281v3.244l-.13-.189c.86-1.643 1.89-2.774 5.03-2.774 6.53 0 7 3.726 7 9.353v10.652z" transform="translate(-980 -298)" fill="#069" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" id="CheckOFF_16-2945af8bea3c6af1771b3433e46a9765--component"><path id="CheckOFF_16-2945af8bea3c6af1771b3433e46a9765--component_CheckOFF_16" d="M3825 7036h-14.02a.986.986 0 01-.98-1l-.01-14a.994.994 0 01.99-1H3825a2.894 2.894 0 011 1v14a2.894 2.894 0 01-1 1zm-13.02-2H3824v-12h-12.02v12z" transform="translate(-3810 -7020)" fill="currentColor" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16 16" id="CheckON_16-61aa48663b613d848cc6da4a7231f513--component"><path id="CheckON_16-61aa48663b613d848cc6da4a7231f513--component_CheckON_16" d="M3825 7004h-14.02a.986.986 0 01-.98-1l-.01-14a.994.994 0 01.99-1H3825a2.894 2.894 0 011 1v14a2.894 2.894 0 01-1 1zm-13.02-2H3824v-12h-12.02v12zm5.02-2a1.008 1.008 0 01-.63-.22l-3-3a1 1 0 01-.15-1.41.989.989 0 011.4-.15l2.26 2.4 4.37-5.28a.988.988 0 011.41-.09 1.006 1.006 0 01.09 1.41l-5 6a1.012 1.012 0 01-.75.34z" transform="translate(-3810 -6988)" fill="currentColor" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 26 24" id="Interviewing-6fae73053165313e1e65d57562a425c2--component"><g id="Interviewing-6fae73053165313e1e65d57562a425c2--component_Menu" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="Interviewing-6fae73053165313e1e65d57562a425c2--component_CG_menu_open" transform="translate(-910 -266)" fill="currentColor" fill-rule="evenodd"><g id="Interviewing-6fae73053165313e1e65d57562a425c2--component_sub-menu"><g id="Interviewing-6fae73053165313e1e65d57562a425c2--component_Live_interview_24" transform="translate(910 266)"><path d="M21.391 0H3.652A3.656 3.656 0 000 3.652V15.13a3.656 3.656 0 003.652 3.653h1.565v4.695a.521.521 0 00.856.4l6.116-5.095h9.202a3.656 3.656 0 003.652-3.653V3.652A3.656 3.656 0 0021.391 0zm1.898 14.257c0 1.282-1.099 2.325-2.447 2.325h-8.81a.505.505 0 00-.313.108l-5.07 4.014v-3.657a.478.478 0 00-.49-.465H4.202c-1.349 0-2.447-1.043-2.447-2.325V4.03c0-1.282 1.098-2.325 2.447-2.325h16.64c1.348 0 2.447 1.043 2.447 2.325v10.228z" id="Interviewing-6fae73053165313e1e65d57562a425c2--component_Shape"></path><path d="M10.997 8.002L7.173 4.59a.993.993 0 00-1.45.127 1.128 1.128 0 00.12 1.531l2.895 2.585-2.894 2.584a1.128 1.128 0 00-.121 1.531.993.993 0 001.45.127l3.824-3.413a1.126 1.126 0 000-1.659zm7.134 3.426h-4.884c-.6 0-1.086.426-1.086.952 0 .525.486.952 1.086.952h4.884c.6 0 1.086-.427 1.086-.952 0-.526-.486-.952-1.086-.952z" id="Interviewing-6fae73053165313e1e65d57562a425c2--component_Path"></path></g></g></g></g></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 23.91 24" id="Screening-f19b2bfd082fe11d811882fea350d11f--component"><path id="Screening-f19b2bfd082fe11d811882fea350d11f--component_Screening_24" d="M3098.59 2325.68a.982.982 0 01-.71.29.96.96 0 01-.7-.29l-4.44-4.45a5.913 5.913 0 01-2.83.75 6 6 0 115.98-5.99 5.909 5.909 0 01-1.57 4l4.27 4.28a1 1 0 010 1.41zm-8.68-13.69a4 4 0 103.99 4 3.988 3.988 0 00-3.99-4zm-.99 11.99a.988.988 0 01.99 1v7.98a.988.988 0 01-.99 1h-4.99a.988.988 0 01-.99-1v-7.98a.988.988 0 01.99-1h4.99zm-3.99 7.99l3.07.03v-6l-3.07-.03v6zm-3.98 1.99h-4.99a.988.988 0 01-.99-1v-13.98a.994.994 0 01.99-1h4.99a.994.994 0 01.99 1v13.98a.988.988 0 01-.99 1zM3080 2320l-3.04-.02v11.99l3.04.03v-12zm11.9 7.97h4.99a.994.994 0 01.99 1v4.03a.994.994 0 01-.99 1h-4.99a.994.994 0 01-.99-1v-4.03a.994.994 0 01.99-1zm1 4.03h3.1v-2l-3.1-.03v2.03z" transform="translate(-3074.97 -2310)" fill="currentColor" fill-rule="evenodd"></path></symbol><symbol xmlns="http://www.w3.org/2000/svg" viewBox="0 0 28 28" id="Sourcing-2ca881f61aa9b713a6703135a8785d8d--component"><path id="Sourcing-2ca881f61aa9b713a6703135a8785d8d--component_Sourcing_24" d="M3100 2374h-1.05a12.009 12.009 0 01-10.95 10.95v1.05a1 1 0 01-2 0v-1.05a12.009 12.009 0 01-10.95-10.95H3074a1 1 0 010-2h1.05a12 12 0 0110.95-10.95V2360a1 1 0 012 0v1.05a12 12 0 0110.95 10.95h1.05a1 1 0 010 2zm-4-2h.95a10.03 10.03 0 00-8.95-8.95v.95a1 1 0 01-2 0v-.95a10.012 10.012 0 00-8.95 8.95h.95a1 1 0 010 2h-.95a10.012 10.012 0 008.95 8.95v-.95a1 1 0 012 0v.95a10.03 10.03 0 008.95-8.95h-.95a1 1 0 010-2zm-6 6h-6a1.9 1.9 0 01-2-1.75v-.75c0-.05.02-.09.02-.13a1.18 1.18 0 01.04-.2c.03-.06.06-.11.09-.17a.764.764 0 01.11-.16.639.639 0 01.15-.13c.04-.03.06-.06.1-.09l1.81-1a4.93 4.93 0 01-.32-1.86v-2.26c0-.03.01-.05.01-.08a.272.272 0 000-.09 3.077 3.077 0 015.97 0 .333.333 0 010 .1.637.637 0 01.02.07v2.25a.01.01 0 01-.01.01 4.618 4.618 0 01-.31 1.85l1.81 1.02c.04.02.06.06.1.08a1.738 1.738 0 01.15.13 1.526 1.526 0 01.11.16 1.3 1.3 0 01.08.17 1.416 1.416 0 01.04.2.611.611 0 01.03.13v.75a1.9 1.9 0 01-2 1.75zm-2.16-3.13c-.02-.01-.03-.03-.05-.04s-.05-.02-.07-.04a.7.7 0 01-.08-.1.471.471 0 01-.13-.15.915.915 0 01-.09-.17.851.851 0 01-.06-.17 1.275 1.275 0 01-.01-.19 1.148 1.148 0 01.01-.19.6.6 0 01.06-.19.564.564 0 01.04-.12.317.317 0 01.05-.06l.03-.06a2.705 2.705 0 00.46-1.57.085.085 0 010-.05v-2.14a1.157 1.157 0 00-1-.63 1.144 1.144 0 00-1 .63v2.12c0 .01-.01.01-.01.02s.01.03.01.05a2.66 2.66 0 00.46 1.57c.02.03.02.06.04.09a.151.151 0 00.04.04c.02.03.01.06.03.09a.935.935 0 01.07.22 1.21 1.21 0 01.01.19.97.97 0 01-.01.17.826.826 0 01-.08.22.672.672 0 01-.06.12.909.909 0 01-.18.21.218.218 0 01-.04.05c-.01.01-.03.01-.04.02a.705.705 0 01-.09.07l-2 1.12h5.7z" transform="translate(-3073 -2359)" fill="currentColor" fill-rule="evenodd"></path></symbol></svg><!----><help-popup><div class="help-popup ng-hide" ng-show="helpOn" help-popup-window-resize="" ng-class="{ &#39;mobile&#39;: mobile === true }"> <div class="header" ng-mousedown="onMouseDown($event)" help-popup-drag-and-drop=""> <div class="title" ng-bind="title"></div> <div class="back-button ng-hide" ng-click="previousArticle()" ng-show="hasHistory"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAAMBAMAAABLmSrqAAAAJFBMVEX///9HcEz///////////////////////////////////////8l87hfAAAAC3RSTlP5AERKSbAGNMOOrxNl6RQAAABESURBVAjXYxAUFFkmKCjAICjosBVMi3Azg2mHDYYgWoR7p5KSUgGDw24QaGAwgNLCUHFBA4g6QWGoPkEDiDmCwmFAGgDM6xPoUWkbDAAAAABJRU5ErkJggg==" alt="Back"></div> <div class="close-button" ng-click="closePopup()"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAMAAABhq6zVAAAAP1BMVEX///////////////////////////////9HcEz///////////////////////////////////////////////9pg8LDAAAAFHRSTlMDbZ6QlI/+AQCklqChXqNfmJefkSWmj5cAAABTSURBVAjXVc45EoAwAMNAkxDscB/6/1tpodfMStm6kkT9iIaJrkQ706AGLNICNLkCpQCPFY8AMDpKfAJcTpR4Bpid/DNX4C5AtRqwSivQ/uh35wXuHQZWhWAreQAAAABJRU5ErkJggg==" alt="Close"></div> </div> <div class="content_wrapper" ng-click="$event.stopPropagation()"> <div class="content" ng-bind-html="content" help-link-manager=""></div> </div> </div></help-popup><navigation><navigation-react menu-visible="$ctrl.pageLayoutService.menuVisible" is-mobile="$ctrl.pageLayoutService.mobile"></navigation-react></navigation><instant-messages><div id="instant-messages"> <!----> </div></instant-messages><cg-codingamer-card-popup-display><codingamer-card class="codingamer-card-popup" card-data="$ctrl.popupCodinGamerCardService.popupConfig.cardData" on-card-data-change="$ctrl.onCardDataChange" style="display: none;"></codingamer-card></cg-codingamer-card-popup-display><div class="cg-confirm-popup"> <div class="cg-popup" close="defaultAction()" data-open="popupService.confirmPopup"> <!----> </div> </div><cg-solution-overlay-content><div class="cg-popup" data-open="solution" close="onHide()"> <!----> </div></cg-solution-overlay-content><div class="cg-level-popup"> <!----> </div><div class="cg-arena-popup"> <!----> </div><cg-info-map-tooltip-display><div class="info-map-tooltip" style="display: none;"> <!----> </div></cg-info-map-tooltip-display><div class="cg-helper-tooltip" ng-click="$event.stopPropagation()" style="display: none;"> <div class="overlay overlay-rect1" style="display: none; height: 568.6px; width: 1468.6px;"></div> <div class="overlay overlay-rect2" style="display: none; height: 620.6px; width: 21.4px;"></div> <div class="overlay overlay-rect3" style="display: none; height: 93.4px; width: 225px;"></div> <div class="overlay overlay-rect4" style="display: none; height: 145.4px; width: 1265px;"></div> <!----> </div><cg-career-popup><div class="cg-career-popup"> <!----> </div></cg-career-popup><div class="cg-generic-popup"> <div class="cg-popup" close="popupService.getLastGenericPopup().cancellable?reject():accept()" data-open="popupService.getLastGenericPopup()" no-overflow="popupService.getLastGenericPopup().noOverflow"> <!----> </div> </div><cg-login-popup><div class="cg-login-popup"> <div class="cg-popup" close="$ctrl.defaultAction()" data-open="$ctrl.popupService.loginPopup" non-skippable="$ctrl.popupService.loginPopup.skipMode === &#39;mandatory&#39;"> <!----> </div> </div></cg-login-popup><div id="content" ng-class="pageLayoutService.pageClass" class="global-content"><cg-cookies-banner origin="codingame"><!----> </cg-cookies-banner><div class="cgPanel" ng-class="{&#39;mobile-mode&#39;: mobileMode}" id="panelXP" data-visible="rankXpService.xpPanelOpen" close="rankXpService.closeXpPanel()" mobile-mode="pageLayoutService.mobile"> <!----> <!----> </div><invite-panel><!----> </invite-panel><div class="column-contents"><div id="scrollable-pane" cg-scroll-on-route-change=""><!----><div ui-view="" class="contentView"><ide-page test-session-handle="::$resolve.testSessionHandle"><div class="ide" ng-animate-children=""> <!----> <div class="cg-loading ng-hide" ng-show="!testSessionManager &amp;&amp; !error" message="ide.wait"> <div class="content"> <h1> <span translate="loading.loading">Loading</span> <img src="data:image/gif;base64,R0lGODlhFQAHAPUAALy+vOTi5PTy9NTS1PT6/MzKzOzu7Pz6/MTCxOTm5PT29NTW3Pz+/P///6SipLS2tKyqrKSmpLy+xISKjKyytMzS1JSWnIyKjOzq7Ly6vGxydJyepMTGxIyOlNza3Hx+hKyurFRWXNzi5HR6fNze3GRmbJyenFRaXDw+RLSytExOVMzOzCQmLKSqrNTW1GRqbExSVMTKzDQ6PHRydLS2vMzO1DxCRCQqLLzCxHx+fAAAAAAAAAAAAAAAAAAAAAAAACH/C05FVFNDQVBFMi4wAwEAAAAh+QQJCQANACwAAAAAFQAHAAAEQbAdI5q1xKhrhTmNAIwDYwUjEFjMMCJGkaqNMgMbmsrz0hg3Q2Nx441WtllF9wKOCqYG09dgGIUTIUeQ2HAMn0YEACH5BAkJAA0ALAAAAAAVAAcAAAVQYHMkRmOah6GcpmAcjQE5jsSYAQBIgckMOoThQaMtGgrdQwJYJQBLQKFIK8SgTEBpsYsSi0eFhLlc5boFQ4QmIeB0PNRgKWwQSCykKu+6hQAAIfkECQkADQAsAAAAABUABwAABU9gcwRJY5qHoZymYBxNYk0XBTcBkAGByQw6hMFBm0wGDYVuuUrsdoWLUZppYJY7TGOBBRCnlWS3+QQUZFKbKbfrNQiVpUBEYr0xBLvBkA8BACH5BAkJAA0ALAAAAAAVAAcAAAZTwAbBk2gYjQSD4mgUGA6NwEej2UCjgGzAyBhkEYYOlcppKLLoZQAN4IypoIaBDTA0FnTxGNEQoEEAamwIUlRWRmtaRgcFaHYKHltMTgJMfQYEDUEAIfkECQkADQAsAAAAABUABwAABlLABmEgahiNB4PiaBQYDg1SKRTqQBsBgDZgZAy0CMOISgU0FNr0MpsunMghU8OQ1hoaizpgTDYL9AJYdQhSVBcERiRpJEgFaXdDRUwKCYFMTohBACH5BAkJAA0ALAAAAAAVAAcAAAZTwIZi5WkYjQSD4mgUGA4NjwqFGkEbAYA2YGQMtAhDiUpNCbXoZRZdIFM7jYQ2pTU0FnPtmGxWoLUCcX8IC1NVS1hoRQ0MK2iBCgULTEIJBJROUEEAIfkECQkADQAsAAAAABUABwAABlTAhoKzaBiNB4PiaBQYDg2XjMV6QRsBgDZgZAy0CAOMSm0JtehlFh0jUz8NA1praCzmgDHZLMALsHMIA1NVBEZrAEUNDAVodQYcLoZHCglLTAZPDUEAIfkECQkAAQAsAAAAABUABwAABljAgGLlCRiNioTgaBQYDgGPCoUaQQMLhyOyMDIGgLCgRKWmhBHtdpkIhwtlaieQUGsT2HAqTC6fDWlqCnRuAAgLU1WDWIFdQmApCEsKBY5HBgkGTEIGDAFBACH5BAkJAAEALAAAAAAVAAcAAAZWwABhIAoYjQKR4Ig0HAKkUijUeQZWnUlnZWQMAGDBaDoFBAzZi3aZAIMLJ3LIBJ2o1aSAyw0ek81oE4IdbHwIUVMTVlgXHQVGBytuBkJETGdKlwZOAUEAIfkECQkACgAsAAAAABUABwAABlRABcGTUBiNhoXgaBQYDorAR6PZQBWImWYGMDIGgLCgQ6VyFIby1qBIhMMctQakWGjLi/o7TL4j0HdrUXscUlRWRghUXF4Fb2wCHgFMaANLTAZPCkEAIfkECQkABAAsAAAAABUABwAABlxAwiGQIBiNhoHhaBQYDoSEZXKhQAm0U+hEMzIGNADC4KBOJgMCRhvaYqKAOKBwOdczhFp7XyMsMgBhAGV2FWpsW0UJgXEIUnVWRllbXQRfjUtDRUwGFUucBgwEQQAh+QQJCQABACwAAAAAFQAHAAAGXsDAIWEIGI2YGOZoFBgOAQPE4ZAwjBAbygYyMgYPCcLwoFIXAYwWtU0EEhKAPGamxgIxth4RWADCABJlZmgJa21vgWExBhFUVkYgehFeA3ISAgEMCW5MBjGdRwYGV0EAIfkECQkAAQAsAAAAABUABwAABlDAwMEgCBiNCU7iaBQYDgEBDgAYMIyOG+vmMDIGVISBQ6UuE1rW9lwGkNuLAEBNxwUWbUChfU6r2WViU3pXAQ50XUJ7VAZCBo1MCThLTI9FQQAh+QQJCQABACwAAAAAFQAHAAAGW8DAwSAIGI2YGOZoNCQOAYEEABgwjCAbygYyMiQOR8QQowIeiUBCi9qmPWHxwyyRLAKFth4RiMXDBQ8Sc2lrejZvfyBkABIFVwEgehFeYGIGQhhFTAkxaUxOV0EAIfkECQkABAAsAAAAABUABwAABl1AwsEgIBiNhoHhaMQEDgQBYDpgGGmn0IlmPFAmE0uiAMgAaAmCIRvSYgiVy0TuOE8BC0Ktza8RaHJzE2R2aRhsbnCCEw4GCFMVVn9ZW10UchZvQ0VMGBVvTAlPBEEAIfkECQkACgAsAAAAABUABwAABllAxcEgUBiNhkXxqEh4CAoBYDpgGBEazQxhPGyynwBnOg0oDNrszKDgZLMd8nShWLyzdNBdU5CbDTNvawpYbx0GCFMFVoRqAF1fMzNmBwlLRwYDl0YBHgcKQQAh+QQJCQABACwAAAAAFQAHAAAGWsDAwSAIGI0CUfEYEA0IAQFgOmAYV51JZ2U8dEKhEqkwnSYChuxFWwSAwaPydBEgrSdrUsD0Dp3IZWdpeGwBbm8jBmUFVgFYWgVGBBNgYkIGBkxRJEtHJC5FQQAh+QQJCQABACwAAAAAFQAHAAAGV8DAwSAIGI2KRPEY8KwUAQFgOmAYFw5HZGE8jFAo1aIwnSaikay2mAKDS2VAiptQZ88dN5icMgcUdg5QbW4lBghUVgELaQ5cf18oNlxDS0cCCQZMi08BQQAh+QQJCQAIACwAAAAAFQAHAAAGUUDEwSBAGI0Eg+JoXMSKAoB0wDAGpICA8fBisWSuGDaLUIwBy5bXCzsvEIazAfFZewtjrXlcVK9hcVIFVQhXUm9CXV8DQgZzTAIJS0cHLgBzQQAh+QQJCQAJACwAAAAAFQAHAAAGVMDEwSBIGI0Eg+Jo9KyWAoB0wDAGpICA8ZBDoVSLAjabUIwBy5TXWzovEgZASpoyJDprr3hONo/TeSUGCFIrVQlXUh5II142b0NFTApKTAkLKwQJQQAh+QQJCQAIACwAAAAAFQAHAAAGUkDEwSBAGI0Eg+JoDAwICAFgOmA0p4CA8dAJhUqkAjaLUIwBS4DXOzovEIazAWFah05irNY8LqrXI3FTBVYIJFgkRgoXXmBCBnNMCglFTCJPCEEAIfkECQkADQAsAAAAABUABwAABlXAxsEgaBiNBIPiaEx4CA0BYDpgGANTQMB42Gg0nwAnq20oyIAl5/vtoBcNA9rQALG/BfL2PAWlGwh3HQYIUwVWDR5ZW0JeYFsHCUVMCkpMDQEDBw1BACH5BAkJAA0ALAAAAAAVAAcAAAVSYHMYQmOaBEacJhasAiAPjBkAGRCYBzVdlkQBh0s0FMScolG5TJ6OJGDRwEgxjcxvW8jljEgvYFl5Oh0GBK5Sa9xyuwaB4gzKSayjYclKBA4NIQAh+QQJCQANACwAAAAAFQAHAAAFU2BzGEJjmoShnKaRHI0gAcDAmAENBCYjOY6IoUB7SBINxQxgXHmAwQdTMls0DNOZoYGIQB2FmRSpLEqc34cBAZDYcG0Jr+EDCkWGLUuhYl0TBA0hADs="> </h1> <h2 translate="ide.wait">Nobody should wait to code</h2> <!----> </div> </div> <!----> <!----><div class="cg-ide theme-black" ng-class="&#39;theme-&#39;+getTheme()" ng-if="testSessionManager &amp;&amp; !error" test-session-manager="testSessionManager" state="state"> <!----><cg-ide-helper ng-if="!isOnboardingLaunched()" testsession-manager="testSessionManager"></cg-ide-helper><!----> <!----><cg-ide-external-editor ng-if="apis.externalEditor &amp;&amp; !showOnboarding" api="apis.externalEditor" external-editor-configuration="externalEditorConfig"> </cg-ide-external-editor><!----> <!----><cg-ide-analytics ng-if="apis.analytics" api="apis.analytics"> </cg-ide-analytics><!----> <!----><div class="cg-popup" data-open="testcaseDetailsOpen" close="openTestcasesDetails(false)" ng-if="apis.testcases"> <!----> </div><!----> <div class="cg-popup" data-open="!!nicknameChooserDeferred" close="nicknameChooserDeferred.reject()"> <!----> </div> <div class="menu"> <div class="cg-ide-menu" test-session-manager="testSessionManager" test-session-type="testSessionManager.getTypeUniqueId().toString()" quit-url="testSessionManager.getQuitUrl()" open-panel="state.openPanel"> <div class="avatar" ng-style="getAvatarUrl() &amp;&amp; {&#39;background-image&#39;: &#39;url(&#39;+(getAvatarUrl())+&#39;)&#39;}"> <div class="avatar-header"> <!----><button ng-if="isLogged()" analytics-on="" analytics-category="Notification" analytics-event="click notification icon" analytics-label="from IDE" analytics-value="0" translate="" translate-attr-title="ideMenu.notifications" class="notification-button" ng-click="togglePanel(&#39;notifications&#39;)" ng-class="{unseen: notificationsStatistics.getUnseenNotificationCount() &gt; 0}" title="Notifications"></button><!----> </div> </div> <div class="progress-bar" ng-show="isLogged()" title="5 / 28 XP" ng-click="rankXpService.toggleXpPanel({&#39;Menu action&#39;: &#39;open xp&#39;});"> <div class="overlay-xp"> <div class="xp" ng-style="{&#39;width&#39;: getProgressPercent()+&#39;%&#39;, &#39;background-color&#39;:getColor()}" style="width: 17.8571%; background-color: rgb(124, 197, 118);"></div> <div class="missing-xp" ng-style="{&#39;width&#39;: 100-getProgressPercent()+&#39;%&#39;, &#39;background-color&#39;:getColor()}" style="width: 82.1429%; background-color: rgb(124, 197, 118);"></div> </div> <div class="progress-content"> <div class="level-container"> <span class="icon-level"></span><span class="level" ng-bind="getLevel()">1</span> </div> </div> </div> <div ng-transclude="" class="menu-entries ps" cg-perfect-scrollbar=""> <!----><div class="menu-entry quit" ng-class="backButton.name" ng-if="quitUrl !== null"> <a class="menu-entry-inner" ng-href="/training/" href="https://www.codingame.com/training/"><span class="entry-label" translate="ideMenu.entries.quit">Back</span></a> </div><!----> <!----><div class="menu-entry forum" ng-class="entry.name" ng-repeat="entry in entries | filter:isEnabled"> <!----> <!----><a class="menu-entry-inner" ng-if="entry.link" ng-href="/forum/t/shadows-of-the-knight-episode-1-puzzle-discussion/264" target="_blank" href="https://www.codingame.com/forum/t/shadows-of-the-knight-episode-1-puzzle-discussion/264"> <span class="entry-label" translate="ideMenu.entries.forum">Forum</span> </a><!----> </div><!----><div class="menu-entry results" ng-class="entry.name" ng-repeat="entry in entries | filter:isEnabled"> <!----><button ng-class="{selected: (openPanel === entry.name), notif: entry.hasNotif &amp;&amp; entry.hasNotif()}" class="menu-entry-inner" ng-disabled="entry.available &amp;&amp; !entry.available()" ng-if="!entry.link" ng-click="togglePanel(entry.name)" disabled="disabled"> <span class="entry-label" translate="ideMenu.entries.results">Results</span> </button><!----> <!----> </div><!----><div class="menu-entry settings" ng-class="entry.name" ng-repeat="entry in entries | filter:isEnabled"> <!----><button ng-class="{selected: (openPanel === entry.name), notif: entry.hasNotif &amp;&amp; entry.hasNotif()}" class="menu-entry-inner" ng-disabled="entry.available &amp;&amp; !entry.available()" ng-if="!entry.link" ng-click="togglePanel(entry.name)"> <span class="entry-label" translate="ideMenu.entries.settings">Settings</span> </button><!----> <!----> </div><!----> <!----><div class="share-container" ng-if="testSessionManager.isShareable()"> <cg-sharebuttons class="share-button-widget" hide-find-friends="testSessionManager.isIsolated()" data="shareButtonsConfiguration"><div ng-class="{visible: $ctrl.loaded}" class="sharebuttons visible"> <!----> <!----> <!----><div ng-if="!$ctrl.hideFindFriends" ng-click="$ctrl.inviteFriends()" analytics-on="" analytics-category="Social" analytics-event="click invite friends" analytics-label="/ide/puzzle/shadows-of-the-knight-episode-1" analytics-value="" class="button button-invite" title="Find your friends"> <div class="button-icon"><div class="sharebuttons-icon_invite_friends_small"></div></div> <div class="button-label" translate="ideMenu.share.friendsLabel" ng-show="!$ctrl.smallIcons">Friends</div> </div><!----> <div ng-click="$ctrl.toggleShowMore($event);" class="button button-more"> <div class="button-icon button-icon-more"><div class="sharebuttons-icon_more_sharing_options_small"></div></div> </div> <!----> </div> </cg-sharebuttons> </div><!----> <div class="ps__rail-x" style="left: 0px; bottom: 0px;"><div class="ps__thumb-x" tabindex="0" style="left: 0px; width: 0px;"></div></div><div class="ps__rail-y" style="top: 0px; right: 0px;"><div class="ps__thumb-y" tabindex="0" style="top: 0px; height: 0px;"></div></div></div> </div> </div> <div class="main"> <!----> <!----><div class="cg-ide-panel" ng-if="apis.report || apis.submissions" data-open="isOpenPanel(&#39;results&#39;)" close="togglePanel(&#39;results&#39;, false)"> <!----> <div class="panel" ng-class="{&#39;right-panel&#39;:right}"> <!----> </div> </div><!----> <div class="cg-ide-panel" data-open="isOpenPanel(&#39;settings&#39;)" close="togglePanel(&#39;settings&#39;, false)"> <!----> <div class="panel" ng-class="{&#39;right-panel&#39;:right}"> <!----> </div> </div> <!----> <!----><cg-ide-hints-updater ng-show="false" ng-if="apis.hints" api="apis.hints" digest="ideRootScope.$digest()" class="ng-hide"><div> <!----> </div> </cg-ide-hints-updater><!----> <!----><div class="cg-ide-panel" ng-if="apis.hints" data-open="isOpenPanel(&#39;hints&#39;)" close="togglePanel(&#39;hints&#39;, false)"> <!----> <div class="panel" ng-class="{&#39;right-panel&#39;:right}"> <!----> </div> </div><!----> <div class="cg-ide-panel" data-open="isOpenPanel(&#39;notifications&#39;)" close="togglePanel(&#39;notifications&#39;, false)"> <!----> <div class="panel" ng-class="{&#39;right-panel&#39;:right}"> <!----> </div> </div> <cg-live-streams-panel is-open="isOpenPanel(&#39;live-streams&#39;)" on-close="onLiveStreamsPanelClose"></cg-live-streams-panel> <div class="main-inner"> <div class="ide-header"> <div class="question-infos"> <h1 class="cg-ide-title" api="apis.title"><!----><span ng-bind="api.title">Shadows of the Knight - Episode 1</span></h1> <!----> </div> <div class="division-infos"> <!----> <!----> </div> <div class="extra-infos"> <!----> </div> <div class="session-infos"> <!----><div class="cg-ide-user-ranking" ng-if="apis.userRank" api="apis.userRank"> <!----> <!----><div class="ranking" ng-if="!isComputing()"> <!----><div class="notice" ng-if="criteria || api.hasReport" translate="ideUserRanking.bestScore">Best score</div><!----> <!----> <!----><div title="Score" class="score" ng-if="api.hasReport"> <!----> <!----><span class="score-value" ng-if="score===null" translate="ideUserRanking.noScore">N/A</span><!----> </div><!----> <!----> <!----> <!----> <!----> </div><!----> </div><!----> <!----> </div> <div class="optin"> <navigation-optin origin="&#39;ide&#39;" variant="&#39;button&#39;"><!----> </navigation-optin> </div> <div class="live-streams-button-container"> <!----><cg-ide-live-streams-button ng-if="apis.liveStreams" toggle-panel="togglePanel(&#39;live-streams&#39;)"><div ng-click="$ctrl.togglePanel()"> <cg-live-streams-button in-ide="true"><live-streams-button-react class="live-streams-button-react-container" in-ide="$ctrl.inIde" application="$ctrl.application"><button class="container-0-1-58"><div class="contentContainer-0-1-59"><svg viewBox="0 0 29 20" xmlns="http://www.w3.org/2000/svg" class="liveIconImage-0-1-60"><g fill="none" fill-rule="evenodd"><g transform="translate(-1575 -20)"><g transform="translate(1575 20)"><g transform="translate(-0)" fill="currentColor" fill-rule="nonzero"><circle cx="14.302" cy="9.9881" r="3.848"></circle><path id="a" d="m7.9527 16.337 1.814-1.814c-2.5062-2.5062-2.5068-6.5632 0-9.0699l-1.814-1.814c-3.509 3.5089-3.5092 9.1886 0 12.698z"></path><path d="m20.651 16.337c3.5088-3.5088 3.5094-9.1885 0-12.698l-1.814 1.814c2.5063 2.5061 2.5068 6.5632 0 9.0699l1.814 1.814z"></path><path d="m6.1387 18.151c-4.501-4.5011-4.501-11.825 0-16.326l-1.814-1.814c-5.5013 5.5013-5.5013 14.453 0 19.954l1.814-1.814z"></path><path d="m22.465 1.8252c4.501 4.5011 4.501 11.825 0 16.326l1.814 1.814c5.5013-5.5013 5.5013-14.453 0-19.954l-1.814 1.814z"></path></g></g></g></g></svg></div></button></live-streams-button-react> </cg-live-streams-button> </div> </cg-ide-live-streams-button><!----> </div> </div> <div class="ide-content console-normal code-normal" ng-class="[&#39;console-&#39;+consoleLayout, &#39;code-&#39;+codeLayout]"> <div class="blocs-container"> <div class="resize-handle ui-draggable ui-draggable-handle" cg-ide-resize-handle="" data-enabled="layoutEnabled" style="left: calc(100% - (510px + 0.5 * (100% - 1020px)));"></div> <div class="left-bloc top-bloc statement-bloc bloc" style="right: calc(100% - (510px + 0.5 * (100% - 1020px))); bottom: calc(100% - (0.6044 * (100% - 58px)));"> <!----> <!----><div class="cg-ide-player" ng-class="{disabled: disabled}" ng-if="apis.player" api="apis.player" disabled="disabled"> <div class="player-container"> <!----><cg-player-sandbox ng-if="playerVisible" game-manager-adapter="api.gameManagerAdapter" analytics-type="api.analyticsType" show-replay-prompt="api.showReplayPrompt" shareable="!api.disableReplays" analytics-game-id="api.analyticsGameId" async-rendering="api.asyncRenderingEnabled" show-console="false" show-rankings="false" on-player-ready="playerLoaded($playerApi)" location="ide"><!----><div class="cg-player-sandbox" ng-class="{&#39;tv-mode&#39;: $ctrl.tvMode}" ng-if="!$ctrl.isPhantom()" style="position: relative; padding-top: calc(47px + 56.25%);"><iframe src="./Java_code_files/09ee8eb2e0c41abdf042cc5deae7ee3c.html" allowfullscreen="" sandbox="allow-scripts allow-popups allow-popups-to-escape-sandbox" data-gtm-yt-inspected-30092605_94="true" style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; border: 0px; display: block;"></iframe></div><!----></cg-player-sandbox><!----> </div> </div><!----> <!----><cg-ide-statement ng-if="apis.statement" statement="apis.statement.statement"><div class="cg-ide-statement"> <cg-statement statement="$ctrl.statement"><div ng-class="{&#39;hide-protocol&#39;: hideProtocol}" class="cg-statement" ng-bind-html="statementHtml"><div class="statement_back" id="statement_back" style="display:none">&nbsp;</div>

<div class="statement-body"><!-- GOAL -->
<div class="statement-section statement-goal">
<h2><span class="icon icon-goal">&nbsp;</span> <span>The Goal</span></h2>

<div class="statement-goal-content">You will look for the hostages on a given building by jumping from one window to another using your grapnel gun. Your goal is to jump to the window where the hostages are located in order to disarm the bombs. Unfortunately, you have a limited number of jumps before the bombs go off...</div>
</div>
<!-- RULES -->

<div class="statement-section statement-rules">
<h2><span class="icon icon-rules">&nbsp;</span> <span>Rules</span></h2>

<div>
<div class="statement-rules-content">Before each jump, the heat-signature device will provide you with the direction of the bombs based on your current position: 
<ul>
	<li><action>U</action> (Up)</li>
	<li><action>UR</action> (Up-Right)</li>
	<li><action>R</action> (Right)</li>
	<li><action>DR</action> (Down-Right)</li>
	<li><action>D</action> (Down)</li>
	<li><action>DL</action> (Down-Left)</li>
	<li><action>L</action> (Left)</li>
	<li><action>UL</action> (Up-Left)</li>
</ul>
<br>
Your mission is to program the device so that <b>it indicates the location of the next window you should jump to</b> in order to reach the bombs' room <strong>as soon as possible</strong>.<br>
<br>
Buildings are represented as a rectangular array of windows, the window in the<strong> top left corner of the building is at index (0,0)</strong>.</div>
</div>
</div>
<!-- WARNING -->

<div class="statement-section statement-warning">
<h2><span class="icon icon-warning">&nbsp;</span> <span>Note</span></h2>

<div class="statement-warning-content">For some tests, <b>the bombs' location may change from one&nbsp;execution to the other</b>: the goal is to help you find the best algorithm in all cases.<br>
<br>
The tests provided are similar to the validation tests used to compute the final score but remain different.</div>
</div>
<!-- PROTOCOL -->

<div class="statement-section statement-protocol">
<h2><span class="icon icon-protocol">&nbsp;</span> <span>Game Input</span></h2>
<!-- Protocol block -->

<div class="blk">
<div class="text">The program must first read the initialization data from standard input. Then, within an infinite loop, read the device data from the standard input and provide to the standard output the next movement instruction.</div>
</div>
<!-- Protocol block -->

<div class="blk">
<div class="title">Initialization input</div>

<div class="text">
<p><span class="statement-lineno">Line 1 : </span> 2 integers <var>W H</var>. The (<var>W</var>, <var>H</var>) couple represents the width and height of the building as a number of windows.</p>

<p><span class="statement-lineno">Line 2 : </span> 1 integer <var>N</var>, which represents the number of jumps you can make before the bombs go off.</p>

<p><span class="statement-lineno">Line 3 : </span> 2 integers <var>X0</var> <var>Y0</var>, representing your starting position.</p>
</div>
</div>
<!-- Protocol block -->

<div class="blk">
<div class="title">Input for one game turn</div>
The direction indicating where the bomb is.</div>
<!-- Protocol block -->

<div class="blk">
<div class="title">Output for one game turn</div>

<div class="text">A <span class="statement-lineno">single line</span> with 2 integers <var>X</var> <var>Y</var> separated by a space character. (<var>X</var>, <var>Y</var>) represents the location of the next window you should jump to. <var>X</var> represents the index along the horizontal axis, <var>Y</var> represents the index along the vertical axis. (0,0) is located in the top-left corner of the building.</div>
</div>
<!-- Protocol block -->

<div class="blk">
<div class="title">Constraints</div>

<div class="text">1 ≤ <var>W</var> ≤ 10000<br>
1 ≤ <var>H</var> ≤ 10000<br>
2 ≤ <var>N</var> ≤ 100<br>
0 ≤ <var>X</var>, <var>X0</var> &lt; W<br>
0 ≤ <var>Y</var>, <var>Y0</var> &lt; H<br>
Response time per turn ≤ 150ms<br>
Response time per turn ≤ 150ms</div>
</div>
<!-- Protocol block -->

<div class="blk">
<div class="title">Example</div>

<div class="text">
<div class="statement-inout">
<div class="statement-inout-in" style="background-color: white">
<div class="title" style="color: #989898; padding:0">Initialization input</div>

<pre>10 10     <i>Building has 100 windows (10x10)</i>
6         <i>You have 6 jumps to find the bombs</i>
2 5       <i>You start at position (2,5)</i>
</pre>

<div style="text-align: center; margin: 10px"><img src="./Java_code_files/example0.png"></div>
</div>

<div class="statement-inout-out" style="background-color: white">
<div class="title" style="color: #989898; padding:0">No output expected</div>
</div>
</div>

<div class="statement-inout">
<div class="statement-inout-in" style="background-color: white">
<div class="title" style="color: #989898; padding:0">Input for turn 1</div>

<pre>UR
<i>Hostages are in the upward-right direction</i>
</pre>

<div style="text-align: center; margin: 10px"><img src="./Java_code_files/example1.png"></div>
</div>

<div class="statement-inout-out" style="background-color: white">
<div class="title" style="color: #989898; padding:0">Output for turn 1</div>

<pre>5 4
<i>You jump to window (5,4)</i>
</pre>
</div>
</div>

<div class="statement-inout">
<div class="statement-inout-in" style="background-color: white">
<div class="title" style="color: #989898; padding:0">Input for turn 2</div>

<pre>R
<i>Hostages are located to your right</i>
</pre>

<div style="text-align: center; margin: 10px"><img src="./Java_code_files/example2.png"></div>
</div>

<div class="statement-inout-out" style="background-color: white">
<div class="title" style="color: #989898; padding:0">Output for turn 2</div>

<pre>7 4
<i>You jump to window (7,4)</i>
</pre>
</div>
</div>

<div class="statement-inout">
<div class="statement-inout-in" style="background-color: white">
<div style="text-align: center; margin: 10px"><img src="./Java_code_files/example3.png"></div>
</div>

<div class="statement-inout-out" style="background-color: white;"><i>You found the hostages. You can defuse the bombs in time. You win!</i></div>
</div>
</div>
</div>
</div>
<!-- STORY 

<div class="statement-story-background">
<div class="statement-story-cover" style="background-size: cover; background-image: url(https://www.codingame.com/servlet/fileservlet?id=2210346891055)">
<div class="statement-story" style="min-height: 300px; position: relative">
<h2>Synopsis</h2>

<div class="story-text">
<div style="line-height: 1.5em"><span style="color:#D80000;"><strong>Batman:</strong></span> &ldquo;<i>Come on Joker, give it up, I know you&#39;re hiding in here somewhere, you can&#39;t escape from me.</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Joker:</strong></span> &ldquo;<i>Oh, but I think I can Batman! Just look behind you. See these buildings over there? In each one of them there is a room full of hostages trapped with my sweet little Joker-BOMBS. They are about to go off any minute now in a marvellous firework! KA-BOOOM!!!</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Batman:</strong></span> &ldquo;<i>Damn you Joker, you won&#39;t get away with this.</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Joker:</strong></span> &ldquo;<i>So what will it be Batman? Do you want to waste time chasing me or will you try to save the poor, poor hostages? I&#39;d hurry if I were you...Ha-ha-ha</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Batman:</strong></span> &ldquo;<i>Alfred, I don&#39;t have time to check all the buildings&#39; windows: I need a gadget to help me.</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Alfred:</strong></span> &ldquo;<i>Certainly sir. I have the perfect device: it can track the bombs heat signature. I&#39;m sending it to you as soon as I&#39;m done reprogramming it.</i>&rdquo;<br />
<span style="color:#D80000;"><strong>Joker:</strong></span> &ldquo;<i>So long Batman! Ha-ha-ha OH-OH-OH...</i>&rdquo;</div>
</div>
</div>
</div>
</div>
</div>
--></div></div> </cg-statement> <!----> </div></cg-ide-statement><!----> <!----> </div> <div class="left-bloc statement-resize-handle ui-draggable ui-draggable-handle" cg-ide-statement-resize-handle="" data-enabled="layoutEnabled" style="right: calc(100% - (510px + 0.5 * (100% - 1020px))); top: calc(0.6044 * (100% - 58px));"></div> <div class="left-bloc console-bloc bloc" ng-class="{&#39;with-leaderboard&#39;: !!apis.miniLeaderboard}" style="right: calc(100% - (510px + 0.5 * (100% - 1020px))); top: calc(0.6044 * (100% - 58px));"> <div class="bloc-header"> <h3 class="console-left-header bloc-title" cg-ide-console-title="" translate="cgIde.console">Console output</h3> <div class="console-filter-selector"> <div class="cg-ide-console-filter" ng-class="{open: isOpen}" ng-show="apis.console" filter="consoleFilter"> <div class="selected-items" ng-click="open()"> <!----><!----><span ng-if="selected" class="selected-item" ng-repeat="(name, selected) in filter" translate="ideConsoleFilter.gameInfo">Game information</span><!----><!----><!----><span ng-if="selected" class="selected-item" ng-repeat="(name, selected) in filter" translate="ideConsoleFilter.stdout">Action (Output Stream)</span><!----><!----><!----><span ng-if="selected" class="selected-item" ng-repeat="(name, selected) in filter" translate="ideConsoleFilter.stderr">Debug (Errors Stream)</span><!----><!----> </div> <!----> </div> </div> <div class="header-buttons"> <!----><button ng-disabled="!layoutEnabled" translate="" translate-attr-title="cgIde.minimize" ng-if="consoleLayout!==&#39;minimized&#39;" class="header-button minimize-button" ng-click="setConsoleLayout(&#39;minimized&#39;)" title="Minimize"> </button><!----><!----><button ng-disabled="!layoutEnabled" translate="" translate-attr-title="cgIde.expand" ng-if="consoleLayout===&#39;normal&#39;" class="header-button expand-button" ng-click="setConsoleLayout(&#39;expanded&#39;)" title="Expand"> </button><!----><!----><!----> </div> </div> <!----> <!----> <div class="console-right-bloc console-content"> <div class="bloc-content-wrapper"> <!----><div class="cg-ide-console playing" ng-if="apis.console" api="apis.console" data-filter="consoleFilter"> <!----> <div class="cg-ide-console-content"> <div class="server-side-problem ng-hide" ng-show="refereeError"> <!----><p ng-if="!failCause" translate="ideConsole.refereeError">Internal error. An error report has been sent to the CodinGame team.</p><!----> <!----> </div> <div class="frames with-frame-counter" ng-class="{&#39;with-frame-counter&#39;: validFrameCount &gt; 2}"> <div class="cg-ide-console-frame-container"> <!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Locate the bombs, save the hostages!
Batman is on window (54,77)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">00</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">5027 5038</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (54,77) to window (5027,5038)
The bombs are located above and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">01</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">7513 2557</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (5027,5038) to window (7513,2557)
The bombs are located above and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">02</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">8756 1317</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (7513,2557) to window (8756,1317)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">03</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9378 1937</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (8756,1317) to window (9378,1937)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">04</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9689 2247</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9378,1937) to window (9689,2247)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">05</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9844 2402</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9689,2247) to window (9844,2402)
The bombs are located below and to the left of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">06</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9766 2479</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9844,2402) to window (9766,2479)
The bombs are located below and to the left of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">07</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe currentFrame" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players mySubFrame" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9727 2518</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9766,2479) to window (9727,2518)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">08</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9746 2537</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9727,2518) to window (9746,2537)
The bombs are located above and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">09</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9756 2527</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9746,2537) to window (9756,2527)
The bombs are located below and to the left of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">10</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9751 2532</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9756,2527) to window (9751,2532)
The bombs are located above and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">11</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9753 2529</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9751,2532) to window (9753,2529)
The bombs are located below and to the right of Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">12</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9754 2530</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml">Batman moved from window (9753,2529) to window (9754,2530)
The bombs are located below Batman
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">13</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----><div class="frame keyframe" ng-class="::{
					keyframe: frame.keyframe,
					empty: !isFrameValid(frame)
				}" ng-repeat="frame in frames" style=""> <!----><!----><div class="frame-players" ng-repeat="subframe in frame.subframes" ng-if="isSubframeValid(subframe)" style=""> <!----> <div class="frame-hover" ng-style="::{&#39;background-color&#39;: subframe.agent.color}"></div> <!----><div ng-if="::subframe.stdout" class="stdout"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.stdout">Standard Output Stream:</h3> <pre ng-bind-html="::subframe.stdout | secureOutput | promptOutput | trustHtml"><div class="outputLine">9754 2531</div></pre> </div><!----> <!----><div ng-if="::subframe.gameInformation" class="game-info"> <h3 class="title" ng-style="::{color: subframe.agent.color}" translate="ideConsole.gameInfo">Game information:</h3> <pre ng-bind-html="::subframe.gameInformation | formatConsole:agents | trustHtml"><span class="consoleSuccess">Success: you defused the bombs in time. The hostages are safe. You win :)</span>
Batman moved from window (9754,2530) to window (9754,2531)
</pre> </div><!----> <div class="frame-number-bloc" ng-style="::{color: getFrameNumberBlockColor(frame)}" ng-click="gotoFrame(frame.idx)"> <span class="frame-number" ng-bind="::frame.idx | zeroPad:(frames.length - 1).toString().length">14</span> <span class="frame-count" ng-bind="::frames.length - 1">14</span> </div> </div><!----><!----> <!----> </div><!----> </div> </div> </div> </div><!----> <!----> <!----> </div> </div> </div> <div class="right-bloc top-bloc code-bloc bloc angular-animate" style="left: calc(100% - (510px + 0.5 * (100% - 1020px)));"> <div class="code-header"> <div class="code-management"> <!----> <!----><div class="programminglanguage-selector" ng-if="apis.languageSelector"> <div class="cg-ide-language-selector" data-forced-open="state.languageSelectorForcedOpen" api="apis.languageSelector"> <div class="language-selector-container"> <div class="cg-ide-language-select ng-not-empty ng-valid" data-ng-class="{open: isOpen, disabled: disabled}" data-open="open" languages="api.availableLanguages" ng-model="api.currentLanguage" data-disabled="api.isReadOnly"> <div class="selected-items" tabindex="0" ng-click="open()" ng-keydown="open()"> <!----><span class="selected-item" ng-if="ngModel" ng-bind="getLanguageName(ngModel)">Java</span><!----> <!----> </div> <!----> </div> </div> </div> </div><!----> </div> <div class="code-buttons"> <!----><div class="cg-ide-code-restore" ng-if="apis.codeRestore" api="apis.codeRestore"> <button ng-disabled="api.defaultAnswer" translate="" translate-attr-title="ideCodeRestore.generateDefaultCode" ng-click="api.restoreDefaultCode()" class="refresh" title="Restore default code"> </button></div><!----> <!----><!----><button ng-disabled="!layoutEnabled" translate="" translate-attr-title="cgIde.expand" ng-if="codeLayout!==&#39;expanded&#39;" class="header-button expand-button" ng-click="setCodeLayout(&#39;expanded&#39;)" title="Expand"> </button><!----><!----> <!----> </div> </div> <!----><div class="code-content" ng-if="apis.code"> <div class="cg-ide-code" configuration="codeEditorConfig" api="apis.code" action-api="apis.actions" theme="getTheme()"> <div class="cg-ide-code_editor_container"> <!----><cg-ide-code-editor class="cg-ide-code_editor" ng-show="api.currentCode === code" ng-repeat="code in api.codes" code="code.code" logs="code.logs" is-read-only="api.isReadOnly" programming-language="code.programmingLanguage" unique-session-id="api.testSessionId" configuration="configuration" on-load="onLoad(code, api)" theme="theme" game="api.isTurnBased"><div class="code-editor-container fitParent" ng-class="{&#39;wrong-focus&#39;: $ctrl.wrong, fitParent: $ctrl.autoResizeMaxLines == null}"> <div class="code-editor ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse" cg-monaco-editor="" file-uri="$ctrl.getFileUri()" programming-language-id="$ctrl.programmingLanguage" options="$ctrl.editorOptions" on-ready="$ctrl.monacoLoaded(editor)" ng-model="$ctrl.code" ng-readonly="$ctrl.isReadOnly" ng-class="{
			&#39;code-editor-readonly&#39;: $ctrl.isReadOnly,
			focused: $ctrl.focused
		}" status-bar-selector="#code-editor-status-bar-MXLbagdtV4mWyuoA" mode="$ctrl.configuration.mode" data-keybinding-context="1" data-mode-id="java" style="--codelens-font-features_ee1f61:&quot;liga&quot; off, &quot;calt&quot; off; --code-editorInlayHintsFontFamily:Consolas, &quot;Courier New&quot;, monospace;"><div class="monaco-editor no-user-select  showUnused showDeprecated vs-dark focused" role="code" data-uri="file:///tmp/project/src/main/java/Player.java" style="width: 683px; height: 363px;"><div data-mprt="3" class="overflow-guard" style="width: 683px; height: 363px;"><div class="margin" role="presentation" aria-hidden="true" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; height: 1819px; width: 57px;"><div class="glyph-margin" style="left: 0px; width: 16px; height: 1819px;"></div><div class="margin-view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="margin-view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; width: 57px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 16px; letter-spacing: 0px; height: 1819px;"><div style="position:absolute;top:304px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">20</div></div><div style="position:absolute;top:320px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">21</div></div><div style="position:absolute;top:336px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">22</div></div><div style="position:absolute;top:240px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">16</div></div><div style="position:absolute;top:256px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">17</div></div><div style="position:absolute;top:272px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">18</div></div><div style="position:absolute;top:288px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">19</div></div><div style="position:absolute;top:176px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">12</div></div><div style="position:absolute;top:192px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">13</div></div><div style="position:absolute;top:208px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">14</div></div><div style="position:absolute;top:224px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">15</div></div><div style="position:absolute;top:112px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">8</div></div><div style="position:absolute;top:128px;width:100%;height:16px;"><div class="cldr codicon codicon-folding-expanded" style="left:36px;width:21px;"></div><div class="line-numbers" style="left:16px;width:20px;">9</div></div><div style="position:absolute;top:144px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">10</div></div><div style="position:absolute;top:160px;width:100%;height:16px;"><div class="cldr codicon codicon-folding-expanded" style="left:36px;width:21px;"></div><div class="line-numbers" style="left:16px;width:20px;">11</div></div><div style="position:absolute;top:0px;width:100%;height:16px;"><div class="cldr codicon codicon-folding-expanded" style="left:36px;width:21px;"></div><div class="line-numbers" style="left:16px;width:20px;">1</div></div><div style="position:absolute;top:16px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">2</div></div><div style="position:absolute;top:32px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">3</div></div><div style="position:absolute;top:48px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">4</div></div><div style="position:absolute;top:64px;width:100%;height:16px;"><div class="cldr codicon codicon-folding-expanded" style="left:36px;width:21px;"></div><div class="line-numbers" style="left:16px;width:20px;">5</div></div><div style="position:absolute;top:80px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">6</div></div><div style="position:absolute;top:96px;width:100%;height:16px;"><div class="current-line current-line-margin-both" style="width:57px; height:16px;"></div><div class="active-line-number line-numbers" style="left:16px;width:20px;">7</div></div><div style="position:absolute;top:352px;width:100%;height:16px;"><div class="line-numbers" style="left:16px;width:20px;">23</div></div></div></div><div class="monaco-scrollable-element editor-scrollable vs-dark" role="presentation" data-mprt="5" style="position: absolute; overflow: hidden; left: 57px; width: 626px; height: 363px;"><div class="lines-content monaco-editor-background" style="position: absolute; overflow: hidden; width: 1e+06px; height: 1e+06px; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; left: 0px;"><div class="view-overlays focused" role="presentation" aria-hidden="true" style="position: absolute; height: 0px; width: 626px;"><div style="position:absolute;top:304px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:320px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:336px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:240px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:256px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:272px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:288px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:176px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div><div class="cdr squiggly-warning" style="left:106px;width:13px;height:16px;"></div></div><div style="position:absolute;top:192px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:208px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:224px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div><div class="cdr squiggly-warning" style="left:79px;width:7px;height:16px;"></div></div><div style="position:absolute;top:112px;width:100%;height:16px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:128px;width:100%;height:16px;"></div><div style="position:absolute;top:144px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:160px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:0px;width:100%;height:16px;"></div><div style="position:absolute;top:16px;width:100%;height:16px;"><div class="cdr squiggly-warning" style="left:46px;width:46px;height:16px;"></div></div><div style="position:absolute;top:32px;width:100%;height:16px;"><div class="cdr squiggly-warning" style="left:46px;width:59px;height:16px;"></div></div><div style="position:absolute;top:48px;width:100%;height:16px;"></div><div style="position:absolute;top:64px;width:100%;height:16px;"></div><div style="position:absolute;top:80px;width:100%;height:16px;"><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:96px;width:100%;height:16px;"><div class="current-line" style="width:626px; height:16px;"></div><div class="core-guide core-guide-indent-active vertical" style="left:0px;height:16px;width:6.59765625px"></div></div><div style="position:absolute;top:352px;width:100%;height:16px;"><div class="core-guide core-guide-indent vertical" style="left:0px;height:16px;width:6.59765625px"></div><div class="core-guide core-guide-indent vertical" style="left:26.390625px;height:16px;width:6.59765625px"></div></div></div><div role="presentation" aria-hidden="true" class="view-rulers"></div><div class="view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="view-lines monaco-mouse-cursor-text" role="presentation" aria-hidden="true" data-mprt="7" style="position: absolute; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 16px; letter-spacing: 0px; width: 626px; height: 1819px;"><div style="top:304px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">yMax</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">H</span><span class="mtk1">;</span></span></div><div style="top:320px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">xMin</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk7">0</span><span class="mtk1">;</span></span></div><div style="top:336px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">xMax</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">W</span><span class="mtk1">;</span></span></div><div style="top:240px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">X</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">in</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">();</span></span></div><div style="top:256px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">Y</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">in</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">();</span></span></div><div style="top:272px;height:16px;" class="view-line"><span><span></span></span></div><div style="top:288px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">yMin</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk7">0</span><span class="mtk1">;</span></span></div><div style="top:176px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17 mtkb">Scanner</span><span class="mtk1">&nbsp;</span><span class="mtk10">in</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk18">new</span><span class="mtk1">&nbsp;</span><span class="mtk16">Scanner</span><span class="mtk1">(</span><span class="mtk17 mtkb">System</span><span class="mtk1">.</span><span class="mtk10 mtkb">in</span><span class="mtk1">);</span></span></div><div style="top:192px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">W</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">in</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">();&nbsp;</span><span class="mtk5">//&nbsp;width&nbsp;of&nbsp;the&nbsp;building.</span></span></div><div style="top:208px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10">H</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">in</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">();&nbsp;</span><span class="mtk5">//&nbsp;height&nbsp;of&nbsp;the&nbsp;building.</span></span></div><div style="top:224px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk17">int</span><span class="mtk1">&nbsp;</span><span class="mtk10 squiggly-inline-unnecessary">N</span><span class="mtk1">&nbsp;=&nbsp;</span><span class="mtk10">in</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">();&nbsp;</span><span class="mtk5">//&nbsp;maximum&nbsp;number&nbsp;of&nbsp;turns&nbsp;before&nbsp;game&nbsp;over.</span></span></div><div style="top:112px;height:16px;" class="view-line"><span><span class="mtk5">&nbsp;**/</span></span></div><div style="top:128px;height:16px;" class="view-line"><span><span class="mtk6">class</span><span class="mtk1">&nbsp;</span><span class="mtk17">Player</span><span class="mtk1">&nbsp;{</span></span></div><div style="top:144px;height:16px;" class="view-line"><span><span></span></span></div><div style="top:160px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">public</span><span class="mtk1">&nbsp;</span><span class="mtk6">static</span><span class="mtk1">&nbsp;</span><span class="mtk17">void</span><span class="mtk1">&nbsp;</span><span class="mtk16 mtki">main</span><span class="mtk1">(</span><span class="mtk17 mtkb">String</span><span class="mtk1">&nbsp;</span><span class="mtk10">args</span><span class="mtk1">[])&nbsp;{</span></span></div><div style="top:0px;height:16px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;</span><span class="mtk17">java</span><span class="mtk1">.</span><span class="mtk17">util</span><span class="mtk1">.*;</span></span></div><div style="top:16px;height:16px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;</span><span class="mtk17 squiggly-inline-unnecessary">java</span><span class="mtk1 squiggly-inline-unnecessary">.</span><span class="mtk17 squiggly-inline-unnecessary">io</span><span class="mtk1">.*;</span></span></div><div style="top:32px;height:16px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;</span><span class="mtk17 squiggly-inline-unnecessary">java</span><span class="mtk1 squiggly-inline-unnecessary">.</span><span class="mtk17 squiggly-inline-unnecessary">math</span><span class="mtk1">.*;</span></span></div><div style="top:48px;height:16px;" class="view-line"><span><span></span></span></div><div style="top:64px;height:16px;" class="view-line"><span><span class="mtk5">/**</span></span></div><div style="top:80px;height:16px;" class="view-line"><span><span class="mtk5">&nbsp;*&nbsp;Auto-generated&nbsp;code&nbsp;below&nbsp;aims&nbsp;at&nbsp;helping&nbsp;you&nbsp;p</span><span class="mtk5">arse</span></span></div><div style="top:96px;height:16px;" class="view-line"><span><span class="mtk5">&nbsp;*&nbsp;the&nbsp;standard&nbsp;input&nbsp;according&nbsp;to&nbsp;the&nbsp;problem&nbsp;sta</span><span class="mtk5">tement.</span></span></div><div style="top:352px;height:16px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span></span></div></div><div data-mprt="1" class="contentWidgets" style="position: absolute; top: 0px;"><div class="codicon-light-bulb codicon" widgetid="LightBulbWidget" title="Show Code Actions (Ctrl+.)" style="position: absolute; display: block; visibility: inherit; max-width: 626px; top: 80px; left: 0px;" monaco-visible-content-widget="true"></div></div><div role="presentation" aria-hidden="true" class="cursors-layer cursor-line-style cursor-solid"><div class="cursor monaco-mouse-cursor-text " style="height: 16px; top: 96px; left: 376px; font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 16px; letter-spacing: 0px; display: block; visibility: inherit; width: 1.6px;"></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 618px; height: 8px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 8px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 618px;"></div></div><canvas class="decorationsOverviewRuler" aria-hidden="true" width="10" height="453" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; top: 0px; right: 0px; width: 8px; height: 363px; display: block;"></canvas><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical fade" style="position: absolute; width: 8px; height: 363px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 8px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 72px;"></div></div></div><div role="presentation" aria-hidden="true" style="width: 683px;" class=""></div><textarea data-mprt="6" class="inputarea monaco-mouse-cursor-text" wrap="off" autocorrect="off" autocapitalize="off" autocomplete="off" spellcheck="false" aria-label="Editor content;Press Alt+F1 for Accessibility Options." tabindex="0" role="textbox" aria-roledescription="editor" aria-multiline="true" aria-haspopup="false" aria-autocomplete="both" style="font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 16px; letter-spacing: 0px; top: 96px; left: 433px; width: 1px; height: 1px;"></textarea><div class="monaco-editor-background textAreaCover margin" style="position: absolute; top: 0px; left: 0px; width: 0px; height: 0px;"></div><div data-mprt="4" class="overlayWidgets" style="width: 683px;"><div widgetid="editor.contrib.quickInputWidget" style="position: absolute; top: 0px; right: 50%;"></div><div class="accessibilityHelpWidget" role="dialog" aria-hidden="true" widgetid="editor.contrib.accessibilityHelpWidget" style="display: none; position: absolute;"><div role="document"></div></div><div class="monaco-hover hidden" tabindex="0" role="tooltip" widgetid="editor.contrib.modesGlyphHoverWidget" style="position: absolute;"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-hover-content" style="overflow: hidden;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div></div><div class="editor-widget find-widget no-results" aria-hidden="true" widgetid="editor.contrib.findWidget" style="width: 419px; height: 33px; position: absolute;"><div title="Toggle Replace" tabindex="-1" class="button toggle left codicon-find-collapsed disabled codicon" role="button" aria-label="Toggle Replace" aria-expanded="false" aria-disabled="true"></div><div class="find-part"><div class="monaco-findInput disabled"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-inputbox idle" data-keybinding-context="2" style="overflow: hidden; background-color: rgb(60, 60, 60); color: rgb(204, 204, 204);"><div class="ibwrapper"><textarea class="input" autocorrect="off" autocapitalize="off" spellcheck="false" wrap="off" aria-label="Find" placeholder="Find" title="Find" disabled="" style="background-color: inherit; width: calc(100% - 66px); height: 23px; color: rgb(204, 204, 204);"></textarea><div class="mirror" style="white-space: pre; overflow-wrap: initial; padding-right: 66px;">Y0</div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 0px; height: 10px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 0px;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 10px; height: 23px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 23px;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div><div class="controls" style="display: block;"><div title="Match Case (Alt+C)" class="monaco-custom-checkbox codicon codicon-case-sensitive" tabindex="0" role="checkbox" aria-checked="false" aria-label="Match Case (Alt+C)" aria-disabled="true" style="color: inherit;"></div><div title="Match Whole Word (Alt+W)" class="monaco-custom-checkbox codicon codicon-whole-word" tabindex="0" role="checkbox" aria-checked="false" aria-label="Match Whole Word (Alt+W)" aria-disabled="true" style="color: inherit;"></div><div title="Use Regular Expression (Alt+R)" class="monaco-custom-checkbox codicon codicon-regex" tabindex="0" role="checkbox" aria-checked="false" aria-label="Use Regular Expression (Alt+R)" aria-disabled="true" style="color: inherit;"></div></div></div><div class="find-actions"><div class="matchesCount" title="" style="min-width: 69px;">No results</div><div title="Previous Match (Shift+Enter)" tabindex="-1" class="button codicon codicon-find-previous-match disabled" role="button" aria-label="Previous Match (Shift+Enter)" aria-disabled="true"></div><div title="Next Match (Enter)" tabindex="-1" class="button codicon codicon-find-next-match disabled" role="button" aria-label="Next Match (Enter)" aria-disabled="true"></div><div title="Find in Selection (Alt+L)" class="monaco-custom-checkbox codicon codicon-find-selection" tabindex="0" role="checkbox" aria-checked="false" aria-label="Find in Selection (Alt+L)" aria-disabled="true" style="color: inherit;"></div><div title="Close (Escape)" tabindex="-1" class="button codicon codicon-widget-close disabled" role="button" aria-label="Close (Escape)" aria-disabled="true"></div></div></div><div class="replace-part"><div class="monaco-findInput disabled"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-inputbox idle" data-keybinding-context="3" style="overflow: hidden; background-color: rgb(60, 60, 60); color: rgb(204, 204, 204);"><div class="ibwrapper"><textarea class="input empty" autocorrect="off" autocapitalize="off" spellcheck="false" wrap="off" aria-label="Replace" placeholder="Replace" title="Replace" disabled="" style="background-color: inherit; color: rgb(204, 204, 204); height: 0px;"></textarea><div class="mirror" style="white-space: pre; overflow-wrap: initial;">&nbsp;</div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div><div class="controls" style="display: block;"><div title="Preserve Case (Alt+P)" class="monaco-custom-checkbox codicon codicon-preserve-case" tabindex="0" role="checkbox" aria-checked="false" aria-label="Preserve Case (Alt+P)" aria-disabled="true" style="color: inherit;"></div></div></div><div class="replace-actions"><div title="Replace (Enter)" tabindex="-1" class="button codicon codicon-find-replace disabled" role="button" aria-label="Replace (Enter)" aria-disabled="true"></div><div title="Replace All (Ctrl+Alt+Enter)" tabindex="-1" class="button codicon codicon-find-replace-all disabled" role="button" aria-label="Replace All (Ctrl+Alt+Enter)" aria-disabled="true"></div></div></div><div class="monaco-sash vertical" style="width: 2px; left: -1px;"></div></div><div class="findOptionsWidget" role="presentation" aria-hidden="true" widgetid="editor.contrib.findOptionsWidget" style="display: none; top: 0px; position: absolute; right: 16px;"><div title="Match Case (Alt+C)" class="monaco-custom-checkbox codicon codicon-case-sensitive" tabindex="0" role="checkbox" aria-checked="false" aria-label="Match Case (Alt+C)" style="color: inherit;"></div><div title="Match Whole Word (Alt+W)" class="monaco-custom-checkbox codicon codicon-whole-word" tabindex="0" role="checkbox" aria-checked="false" aria-label="Match Whole Word (Alt+W)" style="color: inherit;"></div><div title="Use Regular Expression (Alt+R)" class="monaco-custom-checkbox codicon codicon-regex" tabindex="0" role="checkbox" aria-checked="false" aria-label="Use Regular Expression (Alt+R)" style="color: inherit;"></div></div></div><div data-mprt="8" class="minimap slider-mouseover" role="presentation" aria-hidden="true" style="position: absolute; left: 0px; width: 0px; height: 363px;"><div class="minimap-shadow-hidden" style="height: 363px;"></div><canvas width="0" height="453" style="position: absolute; left: 0px; width: 0px; height: 363px;"></canvas><canvas class="minimap-decorations-layer" width="0" height="453" style="position: absolute; left: 0px; width: 0px; height: 363px;"></canvas><div class="minimap-slider" style="position: absolute; transform: translate3d(0px, 0px, 0px); contain: strict; width: 0px;"><div class="minimap-slider-horizontal" style="position: absolute; width: 0px; height: 0px;"></div></div></div></div><div data-mprt="2" class="overflowingContentWidgets"><div class="monaco-editor rename-box" widgetid="__renameInputWidget" style="background-color: rgb(37, 37, 38); box-shadow: rgba(0, 0, 0, 0.36) 0px 0px 8px 2px; color: rgb(204, 204, 204); position: fixed; display: none; visibility: hidden; max-width: 1490px;"><input class="rename-input" type="text" aria-label="Rename input. Type new name and press Enter to commit." style="font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; background-color: rgb(60, 60, 60); border-width: 0px; border-style: none;"><div class="rename-label" style="font-size: 9.6px;">Enter to Rename, Shift+Enter to Preview</div></div><div class="monaco-hover hidden" tabindex="0" role="tooltip" widgetid="editor.contrib.contentHoverWidget" style="position: fixed; display: none; visibility: hidden; max-width: 1490px; top: 63px; left: 977.8px;"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-hover-content" style="overflow: hidden; font-size: 12px; line-height: 1.33333; max-height: 250px; max-width: 500px;"><div class="hover-row markdown-hover"><div class="hover-contents code-hover-contents"><div><div data-code="id#182"><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; font-weight: normal; font-size: 12px; font-feature-settings: &quot;liga&quot; 0, &quot;calt&quot; 0; line-height: 16px; letter-spacing: 0px;"><div class="monaco-tokenized-source"><span class="mtk17">int</span><span class="mtk1"> </span><span class="mtk10">java</span><span class="mtk1">.</span><span class="mtk10">util</span><span class="mtk1">.</span><span class="mtk10">Scanner</span><span class="mtk1">.</span><span class="mtk16">nextInt</span><span class="mtk1">()</span></div></span></div></div></div></div><div class="hover-row markdown-hover"><div class="hover-contents"><div><p>Scans the next token of the input as an <code>int</code>.</p><p>An invocation of this method of the form <code>nextInt()</code> behaves in exactly the same way as the invocation <code>nextInt(radix)</code>, where <code>radix</code> is the default radix of this scanner.</p><ul>
<li><p><strong>Returns:</strong></p><ul>
<li>the <code>int</code> scanned from the input</li>
</ul>
</li>
<li><p><strong>Throws:</strong></p><ul>
<li><a data-href="jdt://contents/java.base/java.util/InputMismatchException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.util%28InputMismatchException.class#38" title="jdt://contents/java.base/java.util/InputMismatchException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.util%28InputMismatchException.class#38">InputMismatchException</a> - if the next token does not match the <em>Integer</em> regular expression, or is out of range</li>
<li><a data-href="jdt://contents/java.base/java.util/NoSuchElementException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.util%28NoSuchElementException.class#38" title="jdt://contents/java.base/java.util/NoSuchElementException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.util%28NoSuchElementException.class#38">NoSuchElementException</a> - if input is exhausted</li>
<li><a data-href="jdt://contents/java.base/java.lang/IllegalStateException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.lang%28IllegalStateException.class#38" title="jdt://contents/java.base/java.lang/IllegalStateException.class?=project-7b5564d9-bde0-4a43-b687-33928711fd10/%5C/usr%5C/local%5C/openjdk-11%5C/lib%5C/jrt-fs.jar%60java.base=/maven.pomderived=/true=/=/javadoc_location=/https:%5C/%5C/docs.oracle.com%5C/en%5C/java%5C/javase%5C/11%5C/docs%5C/api%5C/=/%3Cjava.lang%28IllegalStateException.class#38">IllegalStateException</a> - if this scanner is closed</li>
</ul>
</li>
</ul>
</div></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 490px; height: 10px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 490px;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 10px; height: 215px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 215px;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div></div><div class="editor-widget parameter-hints-widget multiple" widgetid="editor.widget.parameterHintsWidget" style="user-select: text; position: fixed; display: none; visibility: hidden; max-width: 1490px; font-size: 12px; line-height: 1.33333; max-height: 250px; top: 247px; left: 1037.8px;"><div class="phwrapper" tabindex="-1" style="max-height: 250px;"><div class="controls"><div class="button codicon codicon-parameter-hints-previous"></div><div class="overloads">08/10</div><div class="button codicon codicon-parameter-hints-next"></div></div><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="body" style="overflow: hidden;"><div class="signature"><div class="code" style="font-size: 12px; font-family: Consolas, &quot;Courier New&quot;, monospace;"><span>println(</span><span class="parameter active">int x</span><span>) : void</span></div></div><div class="docs empty"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 139px; height: 10px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; width: 139px;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 10px; height: 44px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; transform: translate3d(0px, 0px, 0px); contain: strict; height: 44px;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow"></div></div></div></div></div><div class="shadow-root-host"></div></div></div> <div class="code-editor-status-bar dark" id="code-editor-status-bar-MXLbagdtV4mWyuoA" ng-class="{dark: $ctrl.isDarkTheme()}"></div> </div> </cg-ide-code-editor><!----> <!----><cg-ide-code-editor-completion ng-repeat="programmingLanguage in getProgrammingLanguages()" test-session-id="api.testSessionId" programming-language="programmingLanguage" on-did-change-status="handleCompletionStatusChanged(programmingLanguage, status)"> <div> <!----><cg-language-client ng-if="$ctrl.isLspEnabled()" language-client-id="$ctrl.getLanguageServerConfig().language" infrastructure="$ctrl.infrastructure" on-did-change-status="$ctrl.handleStatusChanged(status)" restart-allowed="$ctrl.restartAllowed"></cg-language-client><!----> </div></cg-ide-code-editor-completion><!----> </div> <!----> </div> <!----> </div><!----> </div> <div class="right-bloc testcases-actions-container" style="left: calc(100% - (510px + 0.5 * (100% - 1020px)));"> <div class="testcases-bloc bloc" ng-class="{&#39;with-tabs&#39;: expertMode()}"> <div class="bloc-header"> <h3 ng-show="!expertMode() &amp;&amp; apis.testcases" class="bloc-title" translate="cgIde.testcases">Test cases</h3> <h3 ng-show="!expertMode() &amp;&amp; apis.agentsManagement" class="bloc-title ng-hide" translate="cgIde.agents">Players</h3> <div class="bloc-header-tabs ng-hide" ng-show="expertMode()"> <div class="cg-ide-tabs ng-valid ng-not-empty" ng-class="{&#39;single-tab&#39;: tabs.length &lt;= 1}" tabs="getTestcaseTabs()" ng-model="selectedTestcaseTab"> <!----><!----><button ng-click="setSelected(tab)" ng-repeat="tab in tabs" ng-if="!tab.disabled" ng-class="{selected: selected === tab}" class="ide-tab selected" translate-attr-title="" translate="cgIde.testcases" title="">Test cases</button><!----><!----><!----><button ng-click="setSelected(tab)" ng-repeat="tab in tabs" ng-if="!tab.disabled" ng-class="{selected: selected === tab}" class="ide-tab" translate-attr-title="" translate="cgIde.customTestcase" title="">Custom</button><!----><!----><!----> </div> </div> <div class="agents-errors"> <!----> </div> <div class="header-buttons"> <!----> </div> </div> <div class="bloc-inner"> <!----> <!----> <!----><div class="cg-ide-testcases" ng-if="apis.testcases &amp;&amp; (selectedTestcaseTab.tab === &#39;testcases&#39; || !expertMode())" api="apis.testcases"> <div class="scroll-panel"> <!----><div class="testcase success not-up-to-date" title="A lot of jumps" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">01</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">A lot of jumps</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase success not-up-to-date" title="Less jumps" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">02</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Less jumps</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase success not-up-to-date" title="Lesser jumps" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">03</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Lesser jumps</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase success not-up-to-date" title="Tower" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">04</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Tower</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase success not-up-to-date" title="Correct cutting" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">05</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Correct cutting</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase success not-up-to-date" title="Evasive" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">06</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Evasive</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----><div class="testcase last-played success not-up-to-date" title="Not there?" ng-click="play(testcase)" cg-ensure-visible="testcase.pending" ng-class="{pending: testcase.pending, &#39;last-played&#39;: api.lastPlayedTestcase === testcase, &#39;not-up-to-date&#39;: !testcase.upToDate &amp;&amp; testcase.status !== &#39;unknown&#39; &amp;&amp; testcase.status !== &#39;pending&#39;, success: testcase.status === &#39;success&#39; &amp;&amp; !testcase.pending, failure: testcase.status === &#39;failure&#39; &amp;&amp; !testcase.pending, pending: testcase.pending}" ng-repeat="testcase in api.testcases"> <div class="testcase-number"> <div ng-bind="$index+1 | zeroPad:2">07</div> <div class="testcase-alert" translate="" translate-attr-title="ideTestcases.notUpToDate" title="Not up to date"></div> </div> <!----> <!----><div class="testcase-name" ng-if="testcase.label" ng-bind="testcase.label">Not there?</div><!----> <!----> <!----> <!----><button ng-if="!testcase.pending &amp;&amp; testcase.status === &#39;success&#39; &amp;&amp; !testcase.upToDate" class="testcase-button"><span class="button-label" translate="ideTestcases.checkAgain">Check again</span></button><!----> <!----> </div><!----> </div> </div><!----> <!----> </div> </div> <div class="actions-bloc bloc"> <div class="bloc-header"> <h3 class="bloc-title" translate="cgIde.actions">Actions</h3> </div> <div class="bloc-inner"> <!----><div class="cg-ide-actions" ng-if="apis.actions" api="apis.actions"> <!----> <!----> <!----> <!----><button class="play play-all-testcases" ng-if="api.playAllTestcases &amp;&amp; !api.playAllInProgress" ng-click="playAll()"><span translate="ideActions.playAll">Play all testcases</span></button><!----> <!----> <!----><button class="submit" ng-disabled="submitInProgress || !api.canSubmit" ng-if="api.submit" ng-click="submit()" data-test="ide-submit"> <span translate="ideActions.submit">Submit</span> </button><!----> </div><!----> </div> </div> </div> <div style="position: absolute; inset: 0px 510px; pointer-events: none;"></div><div style="position: absolute; inset: 0px 0px 58px; pointer-events: none;"></div></div> </div> </div> </div> </div><!----> </div> </ide-page></div><cg-footer-new ng-show="pageLayoutService.showFooter" class="ng-hide"><cg-footer-new-react current-language="$ctrl.getCurrentLanguage()" change-language="$ctrl.changeLanguage" campaign-params="$ctrl.campaignParams"><div class="container-0-1-28"><div class="leftContainer-0-1-29"><div class="codingameContainer-0-1-33"><a href="https://www.codingame.com/home" class="codingameImageContainer-0-1-35"><svg width="132px" height="18px" viewBox="0 0 132 18" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="codingameImage-0-1-36"><title>CodinGame - Home</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="header-" transform="translate(-30.000000, -21.000000)"><g id="CodinGame_Logo_Final_Full" transform="translate(30.000000, 21.000000)"><path d="M78.2594332,13.5779104 C78.0483401,14.7922388 79.3362753,14.6310448 79.3362753,14.6310448 C79.3362753,14.6310448 80.6990283,14.6767164 81.1906883,12.9170149 C81.2414575,12.6268657 81.3136032,12.2131343 81.3136032,12.2131343 C81.3136032,12.2131343 80.4505263,12.3931343 79.6676113,12.4602985 C78.4331174,12.6429851 78.2781377,13.4623881 78.2594332,13.5779104 Z" id="Path"></path><path d="M21.4727126,9.23104478 L21.4727126,9.23641791 C21.4727126,9.23641791 20.3050202,9.14507463 19.6717409,10.3943284 C18.9208907,12.1244776 19.2575709,13.2232836 19.2816194,13.3253731 C19.5167611,14.2898507 20.6042915,14.2576119 20.6042915,14.2576119 L20.6042915,14.2522388 C20.6042915,14.2522388 21.7719838,14.3435821 22.4052632,13.0943284 C23.1561134,11.3641791 22.8194332,10.2653731 22.7953846,10.1632836 C22.5602429,9.1961194 21.4727126,9.23104478 21.4727126,9.23104478 Z" id="Path"></path><path d="M35.9339271,9.22298507 C34.814332,9.20149254 33.9565992,10.5528358 33.7294737,11.8638806 C33.5023482,13.1749254 33.702753,14.2146269 35.0681781,14.2361194 C35.88583,14.2361194 36.8557895,13.7444776 37.2272065,11.8638806 C37.3821862,10.9692537 37.5051012,9.22298507 35.9339271,9.22298507 Z" id="Path"></path><path d="M115.475951,8.64 C113.990283,8.64 113.650931,10.6038806 113.650931,10.6038806 L116.547449,10.6038806 C116.547449,10.6038806 116.961619,8.64 115.475951,8.64 Z" id="Path"></path><path d="M7.94939271,5.91044776 C7.94939271,5.91044776 8.71360324,5.48597015 9.72097166,5.32746269 C12.5052632,5.05880597 13.86,6.17910448 13.86,6.17910448 L14.6375709,1.67910448 C14.6375709,1.67910448 10.6936032,0.470149254 7.01684211,1.76776119 C5.95336032,2.12507463 2.65603239,3.42537313 0.96194332,7.67820896 C0.550445344,8.64 0.293927126,10.3862687 0.259190283,10.8349254 C-0.0748178138,15.9850746 3.54582996,17.7071642 7.17182186,17.7313433 C9.79578947,17.7528358 11.9468016,17.038209 11.9868826,16.9925373 L12.7297166,12.6940299 C12.7297166,12.6940299 10.6989474,13.68 8.90866397,13.6128358 C7.1157085,13.5456716 6.32477733,12.718209 5.8945749,12.1137313 C5.46437247,11.5092537 5.29603239,10.0316418 5.84380567,8.41970149 C6.39157895,6.80776119 7.70890688,6.02328358 7.94939271,5.91044776 Z" id="Path" fill="#FFFFFF" fill-rule="nonzero"></path><path d="M22.0739271,5.75462687 C22.0739271,5.75462687 15.6262348,5.44029851 14.4344939,11.6865672 C13.9668826,14.3274627 14.7925506,17.7313433 20.0030769,17.7313433 C25.2136032,17.7313433 27.2149798,14.3274627 27.6612146,11.6865672 C28.628502,5.44029851 22.0739271,5.75462687 22.0739271,5.75462687 Z M22.4052632,13.0916418 C21.7719838,14.3435821 20.6042915,14.2495522 20.6042915,14.2495522 L20.6042915,14.2549254 C20.6042915,14.2549254 19.5167611,14.2871642 19.2816194,13.3226866 C19.2575709,13.220597 18.9208907,12.121791 19.6717409,10.3916418 C20.3050202,9.13970149 21.4727126,9.23373134 21.4727126,9.23373134 L21.4727126,9.22835821 C21.4727126,9.22835821 22.5602429,9.1961194 22.7953846,10.160597 C22.8194332,10.2626866 23.1534413,11.3641791 22.4052632,13.0916418 Z" id="Shape" fill="#FFFFFF" fill-rule="nonzero"></path><path d="M39.0121457,0.537313433 L37.8738462,7.12208955 L37.8738462,7.13552239 C37.3180567,6.16298507 36.3480972,5.61761194 35.0655061,5.61761194 C32.3907692,5.61761194 29.5557085,8.03820896 28.8315789,12.2292537 C28.2517409,15.5820896 29.8148988,17.7555224 32.7007287,17.7555224 C34.2665587,17.7555224 35.4556275,17.1134328 36.3213765,16.1032836 L36.3213765,16.1032836 L36.0889069,17.4519403 L40.8478543,17.4519403 L43.7710931,0.537313433 L39.0121457,0.537313433 Z M37.2272065,11.8665672 C36.8584615,13.7471642 35.88583,14.238806 35.0681781,14.238806 C33.702753,14.2173134 33.5050202,13.1776119 33.7294737,11.8665672 C33.9565992,10.5555224 34.814332,9.20149254 35.9339271,9.22567164 C37.5051012,9.22298507 37.3821862,10.9692537 37.2272065,11.8665672 Z" id="Shape" fill="#FFFFFF" fill-rule="nonzero"></path><path d="M55.4132794,6.16298507 C55.4132794,6.16298507 53.9917409,5.20656716 51.5895547,6.16298507 C50.5501215,6.56597015 49.542753,7.85820896 49.542753,7.85820896 L49.8634008,6.00985075 L45.1044534,6.00985075 L43.6802429,14.238806 L48.4391903,14.238806 L48.9842915,11.0820896 L49.002996,10.9773134 C49.0778138,10.5877612 49.4305263,9.22567164 50.6757085,9.22567164 C52.1293117,9.22567164 51.6590283,11.0686567 51.6590283,11.0686567 L50.571498,17.4546269 L55.314413,17.4546269 C55.314413,17.4546269 56.3511741,11.4555224 56.6130364,9.94298507 C57.1127126,7.05223881 55.4132794,6.16298507 55.4132794,6.16298507 Z" id="Path" fill="#FFFFFF" fill-rule="nonzero"></path><ellipse id="Oval" fill="#FFFFFF" fill-rule="nonzero" cx="47.9181377" cy="2.37223881" rx="2.18307692" ry="1.92626866"></ellipse><path d="M68.3220243,5.10447761 C71.6407287,5.10447761 72.8030769,5.97761194 72.8030769,5.97761194 C72.8030769,5.97761194 73.4871255,2.01492537 73.5352227,1.74626866 C71.3174089,1.18746269 60.6986235,-0.894626866 58.2910931,9.80597015 C56.842834,18.18 65.6499595,17.7313433 65.6499595,17.7313433 C65.6499595,17.7313433 69.1236437,17.7313433 72.0949798,16.3880597 C72.1404049,16.119403 73.134413,10.3835821 73.134413,10.3835821 L68.2819433,10.3647761 L67.731498,13.6773134 C67.731498,13.6773134 64.720081,14.4832836 63.60583,12.2104478 C63.1863158,11.3695522 63.4695547,9.7361194 63.4695547,9.7361194 C63.4695547,9.7361194 64.1135223,5.10447761 68.3220243,5.10447761 Z" id="Path" fill="#F2BB13" fill-rule="nonzero"></path><path d="M81.8426721,5.73044776 C79.2160324,5.5961194 76.3889879,6.62507463 76.3889879,6.62507463 L75.8385425,9.80328358 C75.8385425,9.80328358 77.9280972,8.66149254 80.022996,8.66149254 C82.1152227,8.66149254 81.6850202,9.99134328 81.6850202,9.99134328 C81.6850202,9.99134328 78.6014575,10.3298507 78.1445344,10.3808955 C74.3127935,11.0337313 74.0242105,14.1232836 74.0242105,14.1232836 C74.0242105,14.1232836 73.3107692,17.7313433 76.8726316,17.7313433 C79.322915,17.7313433 80.7391093,15.7110448 80.7391093,15.7110448 L80.4398381,17.4465672 L84.7605668,17.4465672 L85.9122267,10.7865672 C85.9095547,10.7919403 87.3818623,5.75462687 81.8426721,5.73044776 Z M81.1880162,12.9170149 C80.6936842,14.6740299 79.3336032,14.6310448 79.3336032,14.6310448 C79.3336032,14.6310448 78.0483401,14.7922388 78.2567611,13.5779104 C78.2754656,13.4623881 78.4331174,12.6429851 79.6649393,12.4576119 C80.4478543,12.3904478 81.3109312,12.2104478 81.3109312,12.2104478 C81.3109312,12.2104478 81.2387854,12.6268657 81.1880162,12.9170149 Z" id="Shape" fill="#F2BB13" fill-rule="nonzero"></path><path d="M104.822429,5.71970149 C102.016761,5.71970149 100.624615,7.7238806 100.624615,7.7238806 C100.624615,7.7238806 100.079514,5.71970149 97.4982996,5.71970149 C94.914413,5.71970149 93.3539271,7.79104478 93.3539271,7.79104478 L93.6585425,6.02328358 L88.894251,6.02328358 L86.9195951,17.4519403 L91.6838866,17.4519403 L92.8275304,10.8376119 C92.8275304,10.8376119 93.2176518,9.22567164 94.4868826,9.22567164 C95.7561134,9.22567164 95.451498,10.8591045 95.451498,10.8591045 L94.3105263,17.4519403 L99.0881781,17.4519403 L100.223806,10.880597 C100.223806,10.880597 100.544453,9.22298507 101.880486,9.22298507 C103.216518,9.22298507 102.834413,10.9235821 102.834413,10.9235821 L101.682753,17.4492537 L106.49247,17.4492537 L107.815142,9.80328358 C107.81247,9.80597015 108.541943,5.71970149 104.822429,5.71970149 Z" id="Path" fill="#F2BB13" fill-rule="nonzero"></path><path d="M127.428097,1.78656716 C125.536275,1.59044776 124.937733,2.55761194 124.614413,3.00895522 C124.194899,3.93850746 123.676518,4.77134328 123.676518,4.77134328 C123.676518,4.77134328 122.257652,6.40477612 120.558219,6.45044776 C118.54081,6.45044776 118.436599,5.70626866 116.355061,5.71701493 C111.908745,5.71701493 109.356923,8.86298507 108.857247,11.7510448 C107.820486,17.7501493 113.42915,17.7635821 113.931498,17.7635821 C117.036437,17.7635821 118.468664,17.0247761 118.468664,17.0247761 L118.946964,14.0695522 C118.946964,14.0695522 117.533441,14.7089552 115.497328,14.7089552 C113.461215,14.7089552 113.236761,13.0970149 113.236761,13.0970149 L120.552874,13.0970149 C120.552874,13.0970149 120.84413,11.141194 120.881538,10.9262687 C121.081943,9.89462687 120.991093,9.30358209 121.049879,9 C121.108664,8.69641791 121.664453,6.1361194 126.36996,5.52895522 C129.063401,5.05880597 129.015361,3.53283582 129.015361,3.42537313 C129.012632,3.31522388 129.012632,2.08208955 127.428097,1.78656716 Z M116.547449,10.6038806 L113.650931,10.6038806 C113.650931,10.6038806 113.990283,8.64 115.475951,8.64 C116.961619,8.64 116.547449,10.6038806 116.547449,10.6038806 Z" id="Shape" fill="#F2BB13" fill-rule="nonzero"></path><path d="M130.776194,0.247164179 C130.233765,0.247164179 129.795547,0.687761194 129.795547,1.23313433 C129.795547,1.77850746 130.233765,2.21910448 130.776194,2.21910448 C131.318623,2.21910448 131.756842,1.77850746 131.756842,1.23313433 C131.75417,0.687761194 131.315951,0.247164179 130.776194,0.247164179 Z" id="Path" fill="#FFD200" fill-rule="nonzero"></path></g></g></g></svg></a><div class="linksContainer-0-1-40"><a href="https://www.codingame.com/about/team" class="linkContainer-0-1-41">ABOUT US</a><a href="https://www.codingame.com/careers/home" class="linkContainer-0-1-41">CAREERS</a><a href="https://www.codingame.com/legal/privacy-policy" class="linkContainer-0-1-41">PRIVACY</a><a href="https://www.codingame.com/faq" class="linkContainer-0-1-41">FAQ</a></div></div></div><div class="rightContainer-0-1-30"><div class="rightContentContainer-0-1-31"><div class="codingameForWorkContainer-0-1-37"><a class="codingameForWorkImageContainer-0-1-38" href="https://www.codingame.com/work/?cg_referrer=https%3A%2F%2Fgithub.com%2F" target="_blank" rel="noopener noreferrer"><svg width="131px" height="30px" viewBox="0 0 131 30" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="codingameForWorkImage-0-1-39"><title>CodinGame - Work</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-963.000000, -905.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 885.000000)" id="work"><g transform="translate(963.000000, 20.000000)" id="Logo_CGF4"><path d="M28.3383285,21.7062554 L24.6887951,21.7062554 L24.2392275,23.6924833 L27.6175278,23.6924833 L27.0828484,25.9635725 L23.6894074,25.9635725 L22.8134156,29.8577918 L19.7836735,29.8577918 L22.1782674,19.4494315 L28.8573266,19.4494315 L28.3382204,21.7063668 L28.3383285,21.7062554 Z M38.5124869,26.7574173 C38.0429904,27.7536682 37.3044628,28.5891149 36.3855572,29.1634701 C35.4816634,29.7214536 34.4329966,30.0002967 33.2395569,29.9999998 C31.8500103,29.9999998 30.7769384,29.646449 30.020341,28.939348 C29.2637436,28.232247 28.8852286,27.2498321 28.884796,25.9921032 C28.872673,24.7866857 29.1467063,23.5964915 29.68303,22.525176 C30.1680131,21.5233542 30.9226617,20.6866297 31.8567875,20.1149995 C32.7738753,19.5622913 33.8314822,19.2858629 35.0296083,19.2857143 C36.37294,19.2857143 37.4177495,19.638076 38.1640369,20.3427994 C38.9103242,21.0475229 39.283504,22.0312009 39.2835761,23.2938335 C39.297373,24.4951002 39.0330735,25.6824491 38.5125951,26.7574173 L38.5124869,26.7574173 Z M35.8508777,22.051633 C35.6028603,21.7451508 35.243992,21.5920211 34.7742729,21.5922438 C34.2471885,21.5984897 33.7424217,21.8124373 33.3636016,22.190163 C32.9350506,22.5889986 32.5929451,23.1371746 32.3372853,23.8346911 C32.0838496,24.5190105 31.953779,25.2452625 31.9534711,25.9777264 C31.9534711,27.1263848 32.4700539,27.7007511 33.5032196,27.7008254 C33.9939913,27.7008254 34.4499036,27.5039338 34.8709565,27.1101505 C35.3216553,26.668965 35.6619297,26.1218276 35.8626657,25.5155512 C36.1085113,24.812503 36.2305069,24.0698497 36.2229039,23.3225871 C36.2229039,22.7814694 36.0988951,22.3579667 35.8508777,22.0520788 L35.8508777,22.051633 Z M48.423199,24.240585 C48.0565081,24.7914358 47.5115907,25.2115579 46.7884468,25.5009515 L48.523884,29.1745035 L48.8339418,29.8576803 L45.5330748,29.8576803 L44.022043,26.0705627 L43.4565416,26.0705627 L42.5805498,29.8577918 L39.5506995,29.8577918 L41.9450772,19.4494315 L44.9436729,19.4494315 C46.245404,19.4494315 47.2423403,19.6867788 47.934482,20.1614734 C48.6266237,20.636168 48.9726946,21.3504388 48.9726946,22.3042859 C48.9875797,22.9928065 48.7953727,23.6692081 48.4224419,24.2406965 L48.423199,24.240585 Z M45.6762616,21.8094563 C45.4980351,21.6553608 45.238482,21.5782015 44.8976022,21.5779786 L44.4866431,21.5779786 L43.944177,23.956058 L44.3391304,23.956058 C44.8299021,23.956058 45.2199167,23.826704 45.5091743,23.5679958 C45.7984318,23.3092876 45.9430967,22.9474528 45.9431688,22.4824914 C45.9592001,22.2277089 45.8605145,21.9795073 45.6756127,21.8095678 L45.6762616,21.8094563 Z M64.0451614,29.8576803 L60.4729533,29.8576803 L60.4729533,25.4443359 C60.4729533,24.7087785 60.5065149,23.9397866 60.5736382,23.1373604 C60.3243357,23.9860959 60.018935,24.8162452 59.6595786,25.6219841 L57.6991954,29.8577918 L54.3363601,29.8577918 L53.9564392,19.4494315 L56.8236362,19.4494315 L56.7460947,24.667877 C56.7152367,25.9351904 56.6506008,26.8251034 56.5521869,27.3376161 L56.8622447,26.5971549 L57.5907238,24.9458285 L60.1862552,19.4494315 L62.7897894,19.4494315 L62.7897894,25.088705 C62.7884762,25.8432593 62.72097,26.5961463 62.588095,27.3381733 C62.6397172,27.2053272 62.9832647,26.3843262 63.6187372,24.8751705 L65.9663954,19.4501002 L68.9653155,19.4501002 L64.0446207,29.8584604 L64.0451614,29.8576803 Z M77.5743686,26.7574173 C77.1048669,27.7536646 76.3663405,28.58911 75.4474388,29.1634701 C74.543545,29.7214536 73.4948782,30.0002967 72.3014385,29.9999998 C70.9118919,29.9999998 69.83882,29.646449 69.0822226,28.939348 C68.3256252,28.232247 67.9471102,27.2498321 67.9466776,25.9921032 C67.9345547,24.7866857 68.208588,23.5964915 68.7449117,22.525176 C69.2298897,21.5233506 69.9845394,20.6866248 70.9186692,20.1149995 C71.8352522,19.5622913 72.8928592,19.2858629 74.0914899,19.2857143 C75.4343169,19.2857143 76.4791264,19.638076 77.2259185,20.3427994 C77.9727105,21.0475229 78.3459714,22.0312009 78.3454577,23.2938335 C78.3592546,24.4951002 78.0949552,25.6824491 77.5744767,26.7574173 L77.5743686,26.7574173 Z M74.9127593,22.051633 C74.6647419,21.7451508 74.3056934,21.5920211 73.8356138,21.5922438 C73.3087125,21.598609 72.8041557,21.8125495 72.4254833,22.190163 C71.9969322,22.5889986 71.6548267,23.1371746 71.3991669,23.8346911 C71.1456561,24.5189888 71.015583,25.2452551 71.0153527,25.9777264 C71.0153527,27.1263848 71.5319355,27.7007511 72.5651012,27.7008254 C73.0558729,27.7008254 73.5117852,27.5039338 73.9328381,27.1101505 C74.3835403,26.6689679 74.7238152,26.1218295 74.9245474,25.5155512 C75.1703929,24.812503 75.2923886,24.0698497 75.2847855,23.3225871 C75.2847855,22.7814694 75.1607768,22.3579667 74.9127593,22.0520788 L74.9127593,22.051633 Z M87.4851887,24.240585 C87.1184978,24.7914358 86.5735805,25.2115579 85.8504366,25.5009515 L87.5861982,29.1745035 L87.8958234,29.8576803 L84.5949564,29.8576803 L83.0843572,26.0705627 L82.5185314,26.0705627 L81.6425395,29.8577918 L78.6134463,29.8577918 L81.007824,19.4494315 L84.0064197,19.4494315 C85.3081508,19.4494315 86.3050872,19.6867788 86.9972288,20.1614734 C87.6893705,20.636168 88.0354414,21.3504388 88.0354414,22.3042859 C88.0503336,22.9928074 87.858126,23.6692112 87.4851887,24.2406965 L87.4851887,24.240585 Z M84.7382514,21.8094563 C84.5600249,21.6553608 84.3004718,21.5782015 83.959592,21.5779786 L83.5486329,21.5779786 L83.0060587,23.956058 L83.4011202,23.956058 C83.8918919,23.956058 84.2819065,23.826704 84.5711641,23.5679958 C84.8604216,23.3092876 85.0050864,22.9474528 85.0051585,22.4824914 C85.0213144,22.2277795 84.9227904,21.9795831 84.7380351,21.8095678 L84.7382514,21.8094563 Z M95.7179979,24.2478291 L97.8102124,29.8576803 L94.4165552,29.8576803 L93.068393,25.7430167 L92.3168785,26.141778 L91.4800359,29.8576803 L88.4502938,29.8576803 L90.8448878,19.4493201 L93.8740892,19.4493201 L92.82809,23.8917525 L93.1226828,23.4718161 C93.4326786,22.989875 93.7689431,22.5264358 94.1298571,22.0837301 L96.4312283,19.4492086 L99.9877551,19.4492086 L95.7183223,24.2478291 L95.7179979,24.2478291 Z" id="Trac\xE9_3" fill="#F2BB13"></path><path d="M13.5414225,6.21300215 C13.5414225,6.21300215 12.1952085,5.10393541 9.42574612,5.37012446 C8.81217108,5.46796032 8.21781691,5.66258731 7.66464765,5.9468131 C7.42392818,6.05748084 6.11606947,6.83378412 5.57315414,8.43037539 C5.03023881,10.0269667 5.19705698,11.4907349 5.6244745,12.0894702 C6.05189201,12.6882055 6.8395244,13.5088193 8.6213671,13.5749593 C10.4032098,13.6410993 12.4213422,12.6658331 12.4213422,12.6658331 L11.6822211,16.9231202 C11.6414889,16.9675393 9.50342893,17.677051 6.8947343,17.6550043 C3.28988457,17.6332835 -0.310211272,15.9251556 0.0212641956,10.8245564 C0.0536770509,10.3812338 0.309738608,8.65149367 0.719004928,7.69816545 C2.4022045,3.48562328 5.68098091,2.19909718 6.73861238,1.84428705 C10.3938101,0.558086764 14.3146851,1.75544877 14.3146851,1.75544877 L13.5413144,6.21300215 L13.5414225,6.21300215 Z M27.2621082,11.6681943 C26.8191325,14.2849054 24.8281189,17.6557645 19.6474642,17.6560903 C14.4668095,17.6564162 13.6458999,14.2849054 14.1112404,11.6681943 C15.2957142,5.48090081 21.7066529,5.79172621 21.7066529,5.79172621 C21.7066529,5.79172621 28.2254183,5.48100941 27.2623243,11.6681943 L27.2621082,11.6681943 Z M22.4236252,10.158595 C22.191009,9.20200868 21.1089598,9.23545879 21.1089598,9.23545879 L21.1083116,9.23980296 C21.1083116,9.23980296 19.9479313,9.14835818 19.3175013,10.3876414 C18.5720056,12.1005479 18.905858,13.1896314 18.9301677,13.2896559 C19.1627839,14.2460251 20.2448331,14.2127922 20.2448331,14.2127922 L20.2460216,14.2081222 C20.2460216,14.2081222 21.4061857,14.299567 22.0362916,13.0606096 C22.7817873,11.3474859 22.4479349,10.2579679 22.4236252,10.1583778 L22.4236252,10.158595 Z M40.3741886,17.3779548 L35.6412635,17.3779548 L35.8734476,16.0410363 C35.0148311,17.0413902 33.8303573,17.6785714 32.2743241,17.6785714 C29.407083,17.6785714 27.8524544,15.5237542 28.4279986,12.2036133 C29.1483203,8.0535186 31.9666181,5.65575367 34.626309,5.65575367 C35.9012146,5.65575367 36.865281,6.19616849 37.4173799,7.15851086 L37.4167317,7.14612998 L38.5492368,0.624552573 L43.2815137,0.624552573 L40.3741886,17.3780634 L40.3741886,17.3779548 Z M35.4897874,9.22861673 C34.3757576,9.20689587 33.5234075,10.5472897 33.297706,11.8459795 C33.0720045,13.1446693 33.2700471,14.1744549 34.6279296,14.1965015 C35.4409521,14.1965015 36.4062069,13.7087598 36.7737687,11.8459795 C36.9277297,10.9586826 37.0508986,9.22861673 35.4898955,9.22861673 L35.4897874,9.22861673 Z M56.0508822,9.93823698 C55.7915794,11.4351295 54.7596621,17.377629 54.7596621,17.377629 L50.0440238,17.377629 L51.1254247,11.0527339 C51.1254247,11.0527339 51.5915216,9.22818231 50.1468806,9.22818231 C48.9083854,9.22818231 48.5586507,10.5779161 48.4839931,10.9642215 L48.4655178,11.0692418 L47.9229266,14.1960671 L43.1906497,14.1960671 L44.6050386,6.0462946 L49.3373155,6.0462946 L49.0197776,7.87595063 C49.0197776,7.87595063 50.0227394,6.59539776 51.0547647,6.19616849 C53.4445645,5.24816187 54.857873,6.19616849 54.857873,6.19616849 C54.857873,6.19616849 56.5480954,7.07749208 56.0515305,9.93823698 L56.0508822,9.93823698 Z M47.4050772,4.34989601 C46.20699,4.34989601 45.2352526,3.49637511 45.2352526,2.44269654 C45.2352526,1.38901798 46.20699,0.535714286 47.4050772,0.535714286 C48.6031644,0.535714286 49.5749018,1.389561 49.5749018,2.44302236 C49.5749018,3.49648371 48.6032724,4.35022182 47.4050772,4.35022182 L47.4050772,4.34989601 Z" id="Trac\xE9_4" fill="#FFFFFF"></path><path d="M65.2217445,1.36158333 C68.550087,0.502208631 71.9311901,1.18477316 73.0738652,1.46812005 C73.0274835,1.73108227 72.345922,5.60867534 72.345922,5.60867534 L72.345922,5.60867534 C72.345922,5.60867534 71.1890838,4.75423588 67.8877701,4.75423588 C63.7006643,4.75423588 63.0584569,9.28918086 63.0584569,9.28918086 C63.0584569,9.28918086 62.777356,10.887768 63.1952233,11.7099139 C64.3025446,13.9335593 67.29908,13.14478 67.29908,13.14478 L67.8466861,9.90265209 L72.6735127,9.91981813 C72.6735127,9.91981813 71.6866323,15.5325756 71.640575,15.7955379 C68.6844749,17.1100271 65.2284476,17.1100271 65.2284476,17.1100271 C65.2284476,17.1100271 56.4666412,17.5479756 57.9068508,9.35505553 C59.0621754,4.30309098 62.1190394,2.16248623 65.2216363,1.36147605 M85.3869488,10.3189285 L84.2409221,16.8356924 L79.9429977,16.8356924 L80.241289,15.1386151 C80.241289,15.1386151 78.8308113,17.1143186 76.3934504,17.1143186 C72.8489845,17.1143186 73.5584399,13.5827285 73.5584399,13.5827285 C73.5584399,13.5827285 73.8460277,10.5594676 77.6584044,9.91981813 C78.1138959,9.8702512 81.1817877,9.53830297 81.1817877,9.53830297 C81.1817877,9.53830297 81.6097097,8.23743926 79.5276171,8.23743926 C77.4455245,8.23743926 75.3651617,9.35494824 75.3651617,9.35494824 L75.9121192,6.24360412 C75.9121192,6.24360412 78.725939,5.23595778 81.3395286,5.36738524 C86.8522412,5.38948652 85.3874894,10.3184993 85.3874894,10.3184993 L85.3869488,10.3189285 Z M79.17343,11.9508821 C77.9481545,12.1316619 77.7933328,12.9339596 77.7735476,13.0461825 C77.5645599,14.2349306 78.8438933,14.0761447 78.8438933,14.0761447 C78.8438933,14.0761447 80.1983671,14.1197035 80.6893206,12.4002031 C80.7392701,12.1154615 80.8104102,11.7101284 80.8104102,11.7101284 C80.2690376,11.8177038 79.722538,11.8980931 79.1729975,11.9509894 L79.17343,11.9508821 Z M107.179403,9.35516281 L105.864175,16.8357997 L101.078757,16.8357997 L102.223594,10.4504632 C102.223594,10.4504632 102.604702,8.7852504 101.275419,8.7852504 C99.9461366,8.7852504 99.6279521,10.406368 99.6279521,10.406368 L98.4977103,16.8357997 L93.7454836,16.8357997 L94.8797257,10.3845886 C94.8797257,10.3845886 95.1824497,8.7852504 93.9201986,8.7852504 C92.6579475,8.7852504 92.2692715,10.36238 92.2692715,10.36238 L91.1315697,16.8357997 L86.3900465,16.8357997 L88.3562391,5.65255603 L93.0973298,5.65255603 L92.7930922,7.38321437 C92.7930922,7.38321437 94.3458502,5.35622732 96.9158691,5.35622732 C99.485888,5.35622732 100.027223,7.31755428 100.027223,7.31755428 C101.041453,6.06078102 102.582285,5.33736111 104.204707,5.35622732 C107.904427,5.35622732 107.179295,9.35516281 107.179295,9.35516281 L107.179403,9.35516281 Z M125.638649,5.17094141 C120.958428,5.76542272 120.405308,8.26833813 120.34606,8.56681259 C120.286813,8.86528705 120.377198,9.44303146 120.17794,10.4525017 C120.14064,10.6626784 119.850674,12.5756186 119.850674,12.5756186 L112.572864,12.5756186 C112.572864,12.5756186 112.793961,14.1527482 114.821022,14.1527482 C116.848084,14.1527482 118.253913,13.5284409 118.253913,13.5284409 L117.77896,16.420167 C117.77896,16.420167 116.355833,17.1428571 113.265237,17.1428571 C112.766499,17.1428571 107.185674,17.1321284 108.217746,11.2609147 C108.714322,8.43484868 111.254393,5.35612003 115.678488,5.35612003 C117.748472,5.34539126 117.851614,6.07301663 119.859648,6.07301663 C121.549929,6.02763392 122.961488,4.42947592 122.961488,4.42947592 C123.306324,3.87317888 123.617735,3.29714864 123.894094,2.70439654 C124.215954,2.2615128 124.811672,1.31491317 126.694291,1.50717278 C128.272024,1.79684965 128.270247,3.0045876 128.270247,3.11144618 C128.270247,3.21830476 128.319162,4.71003333 125.638433,5.17051226 L125.638649,5.17094141 Z M114.801994,8.21308495 C113.323079,8.21308495 112.98565,10.1354665 112.98565,10.1354665 L115.868447,10.1354665 C115.868447,10.1354665 116.281125,8.21308495 114.802318,8.21308495 L114.801994,8.21308495 Z M130.02512,1.92795698 C129.489047,1.92606063 129.055852,1.49359307 129.05716,0.961622818 C129.058475,0.429652561 129.493797,-0.000706492306 130.029873,8.70748292e-07 C130.56595,0.000709979597 131.000116,0.432217753 131,0.964189589 C130.999513,1.22028 130.896529,1.46568959 130.713704,1.64643081 C130.530878,1.82717203 130.283187,1.92843944 130.02512,1.92795698 Z" id="Trac\xE9_5" fill="#FFFFFF"></path><path d="M65.2217445,1.36158333 C68.550087,0.502208631 71.9311901,1.18477316 73.0738652,1.46812005 C73.0274835,1.73108227 72.345922,5.60867534 72.345922,5.60867534 L72.345922,5.60867534 C72.345922,5.60867534 71.1890838,4.75423588 67.8877701,4.75423588 C63.7006643,4.75423588 63.0584569,9.28918086 63.0584569,9.28918086 C63.0584569,9.28918086 62.777356,10.887768 63.1952233,11.7099139 C64.3025446,13.9335593 67.29908,13.14478 67.29908,13.14478 L67.8466861,9.90265209 L72.6735127,9.91981813 C72.6735127,9.91981813 71.6866323,15.5325756 71.640575,15.7955379 C68.6844749,17.1100271 65.2284476,17.1100271 65.2284476,17.1100271 C65.2284476,17.1100271 56.4666412,17.5479756 57.9068508,9.35505553 C59.0621754,4.30309098 62.1190394,2.16248623 65.2216363,1.36147605 M85.3869488,10.3189285 L84.2409221,16.8356924 L79.9429977,16.8356924 L80.241289,15.1386151 C80.241289,15.1386151 78.8308113,17.1143186 76.3934504,17.1143186 C72.8489845,17.1143186 73.5584399,13.5827285 73.5584399,13.5827285 C73.5584399,13.5827285 73.8460277,10.5594676 77.6584044,9.91981813 C78.1138959,9.8702512 81.1817877,9.53830297 81.1817877,9.53830297 C81.1817877,9.53830297 81.6097097,8.23743926 79.5276171,8.23743926 C77.4455245,8.23743926 75.3651617,9.35494824 75.3651617,9.35494824 L75.9121192,6.24360412 C75.9121192,6.24360412 78.725939,5.23595778 81.3395286,5.36738524 C86.8522412,5.38948652 85.3874894,10.3184993 85.3874894,10.3184993 L85.3869488,10.3189285 Z M79.17343,11.9508821 C77.9481545,12.1316619 77.7933328,12.9339596 77.7735476,13.0461825 C77.5645599,14.2349306 78.8438933,14.0761447 78.8438933,14.0761447 C78.8438933,14.0761447 80.1983671,14.1197035 80.6893206,12.4002031 C80.7392701,12.1154615 80.8104102,11.7101284 80.8104102,11.7101284 C80.2690376,11.8177038 79.722538,11.8980931 79.1729975,11.9509894 L79.17343,11.9508821 Z M107.179403,9.35516281 L105.864175,16.8357997 L101.078757,16.8357997 L102.223594,10.4504632 C102.223594,10.4504632 102.604702,8.7852504 101.275419,8.7852504 C99.9461366,8.7852504 99.6279521,10.406368 99.6279521,10.406368 L98.4977103,16.8357997 L93.7454836,16.8357997 L94.8797257,10.3845886 C94.8797257,10.3845886 95.1824497,8.7852504 93.9201986,8.7852504 C92.6579475,8.7852504 92.2692715,10.36238 92.2692715,10.36238 L91.1315697,16.8357997 L86.3900465,16.8357997 L88.3562391,5.65255603 L93.0973298,5.65255603 L92.7930922,7.38321437 C92.7930922,7.38321437 94.3458502,5.35622732 96.9158691,5.35622732 C99.485888,5.35622732 100.027223,7.31755428 100.027223,7.31755428 C101.041453,6.06078102 102.582285,5.33736111 104.204707,5.35622732 C107.904427,5.35622732 107.179295,9.35516281 107.179295,9.35516281 L107.179403,9.35516281 Z M125.638649,5.17094141 C120.958428,5.76542272 120.405308,8.26833813 120.34606,8.56681259 C120.286813,8.86528705 120.377198,9.44303146 120.17794,10.4525017 C120.14064,10.6626784 119.850674,12.5756186 119.850674,12.5756186 L112.572864,12.5756186 C112.572864,12.5756186 112.793961,14.1527482 114.821022,14.1527482 C116.848084,14.1527482 118.253913,13.5284409 118.253913,13.5284409 L117.77896,16.420167 C117.77896,16.420167 116.355833,17.1428571 113.265237,17.1428571 C112.766499,17.1428571 107.185674,17.1321284 108.217746,11.2609147 C108.714322,8.43484868 111.254393,5.35612003 115.678488,5.35612003 C117.748472,5.34539126 117.851614,6.07301663 119.859648,6.07301663 C121.549929,6.02763392 122.961488,4.42947592 122.961488,4.42947592 C123.306324,3.87317888 123.617735,3.29714864 123.894094,2.70439654 C124.215954,2.2615128 124.811672,1.31491317 126.694291,1.50717278 C128.272024,1.79684965 128.270247,3.0045876 128.270247,3.11144618 C128.270247,3.21830476 128.319162,4.71003333 125.638433,5.17051226 L125.638649,5.17094141 Z M114.801994,8.21308495 C113.323079,8.21308495 112.98565,10.1354665 112.98565,10.1354665 L115.868447,10.1354665 C115.868447,10.1354665 116.281125,8.21308495 114.802318,8.21308495 L114.801994,8.21308495 Z M130.02512,1.92795698 C129.489047,1.92606063 129.055852,1.49359307 129.05716,0.961622818 C129.058475,0.429652561 129.493797,-0.000706492306 130.029873,8.70748292e-07 C130.56595,0.000709979597 131.000116,0.432217753 131,0.964189589 C130.999513,1.22028 130.896529,1.46568959 130.713704,1.64643081 C130.530878,1.82717203 130.283187,1.92843944 130.02512,1.92795698 Z" id="Trac\xE9_6" fill="#FFFFFF"></path></g></g></g></g></svg></a><div class="linksContainer-0-1-40"><p class="codingameForWorkTitle-0-1-42">The #1 tech hiring platform</p><a class="linkContainer-0-1-41" href="https://www.codingame.com/work/offers/screening/?cg_referrer=https%3A%2F%2Fgithub.com%2F" target="_blank" rel="noopener noreferrer">SCREENING</a><a class="linkContainer-0-1-41" href="https://www.codingame.com/work/offers/interviewing/?cg_referrer=https%3A%2F%2Fgithub.com%2F" target="_blank" rel="noopener noreferrer">INTERVIEWING</a></div></div><div class="mobileBorder-0-1-32"></div><div class="codingameMobileContainer-0-1-34"><div class="linksContainer-0-1-40"><a href="https://www.codingame.com/about/team" class="linkContainer-0-1-41">ABOUT US</a><a href="https://www.codingame.com/careers/home" class="linkContainer-0-1-41">CAREERS</a><a href="https://www.codingame.com/legal/privacy-policy" class="linkContainer-0-1-41">PRIVACY</a><a href="https://www.codingame.com/faq" class="linkContainer-0-1-41">FAQ</a></div></div><div class="buttonsContainer-0-1-43"><div class="socialNetworksContainer-0-1-44"><a href="https://www.facebook.com/CodinGame" target="_blank" rel="noopener noreferrer"><svg width="24px" height="24px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="socialNetworkButton-0-1-45"><title>Facebook</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1017.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="follow"><g transform="translate(1017.000000, 23.000000)" id="facebook-(4)"><circle id="Oval" fill="#3A5A98" cx="11.9803453" cy="11.9730189" r="11.9730189"></circle><path d="M20.4501221,3.52441263 C25.1258779,8.20016842 25.12608,15.7813895 20.44992,20.4574989 C15.7739621,25.1332547 8.19258947,25.1332547 3.51683368,20.4574989 L20.4501221,3.52441263 Z" id="Path" fill="#345387"></path><path d="M23.8758568,13.3215663 L15.2149389,4.66044632 L10.7181979,9.15718737 L10.9860884,9.42507789 L8.42586947,11.9850947 L10.5213979,14.0806232 L10.2457768,14.3560926 L12.5144589,16.6247747 L9.89901474,19.2402189 L14.3670063,23.7082105 C19.4053895,22.6885895 23.2945011,18.5055158 23.8758568,13.3215663 Z" id="Path" fill="#2E4D72"></path><path d="M9.88709053,7.52523789 C9.88709053,7.89256421 9.88709053,9.53320421 9.88709053,9.53320421 L8.41601684,9.53320421 L8.41601684,11.9886821 L9.88709053,11.9886821 L9.88709053,19.2847832 L12.9089684,19.2847832 L12.9089684,11.9886821 L14.9367916,11.9886821 C14.9367916,11.9886821 15.1267705,10.8110653 15.2186779,9.52395789 C14.9547284,9.52395789 12.9204884,9.52395789 12.9204884,9.52395789 C12.9204884,9.52395789 12.9204884,8.09527579 12.9204884,7.84491789 C12.9204884,7.59420632 13.2498189,7.25674105 13.5755621,7.25674105 C13.9007495,7.25674105 14.5868463,7.25674105 15.2220632,7.25674105 C15.2220632,6.92210526 15.2220632,5.76717474 15.2220632,4.70051368 C14.3739284,4.70051368 13.4090274,4.70051368 12.9834442,4.70051368 C9.81226105,4.70036211 9.88709053,7.15811368 9.88709053,7.52523789 Z" id="Path" fill="#FFFFFF"></path></g></g></g></g></svg></a><a href="https://www.youtube.com/channel/UCJ6woCHjGCBXqpf91SsAcoQ" target="_blank" rel="noopener noreferrer"><svg width="24px" height="24px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="socialNetworkButton-0-1-45"><title>YouTube</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1051.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="follow"><g transform="translate(1017.000000, 23.000000)"><g id="youtube" transform="translate(34.000000, 0.000000)"><circle id="Oval" fill="#D42428" cx="11.9982785" cy="11.9982785" r="11.9982785"></circle><path d="M20.4819241,3.51291139 C25.1675443,8.19893671 25.1679494,15.7961013 20.4819241,20.4821266 C15.7963038,25.1677468 8.19873418,25.1679494 3.51270886,20.4821266 L20.4819241,3.51291139 Z" id="Path" fill="#CC202D"></path><path d="M23.7553418,14.4013165 L17.8170127,8.46318987 L10.8133671,9.26060759 L6.57696203,15.8191899 L14.4930127,23.735038 C19.1471899,22.750481 22.8061772,19.068962 23.7553418,14.4013165 Z" id="Path" fill="#BA202E"></path><path d="M18.2770127,9.68293671 C18.2770127,8.67711392 17.4621772,7.86187342 16.4569114,7.86187342 L7.91756962,7.86187342 C6.91250633,7.86187342 6.09782278,8.67731646 6.09782278,9.68293671 L6.09782278,14.5661772 C6.09782278,15.572 6.91265823,16.3872405 7.91756962,16.3872405 L16.4567595,16.3872405 C17.4622278,16.3872405 18.2768608,15.5717975 18.2768608,14.5661772 L18.2768608,9.68293671 L18.2770127,9.68293671 Z M10.9691139,14.1846076 L10.9691139,9.59807595 L14.4473418,11.891443 L10.9691139,14.1846076 Z" id="Shape" fill="#FFFFFF"></path></g></g></g></g></g></svg></a><a href="https://twitter.com/codingame" target="_blank" rel="noopener noreferrer"><svg width="24px" height="24px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="socialNetworkButton-0-1-45"><title>Twitter</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1085.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="follow"><g transform="translate(1017.000000, 23.000000)"><g id="twitter-(1)" transform="translate(68.000000, 0.000000)"><circle id="Oval" fill="#13B3CA" cx="11.9748884" cy="11.9748884" r="11.9748884"></circle><path d="M20.44128,3.50758737 C25.1172379,8.18334316 25.1175916,15.7647663 20.4410779,20.4410779 C15.76512,25.1172379 8.18334316,25.1172379 3.50758737,20.4414316 L20.44128,3.50758737 Z" id="Path" fill="#10ABB6"></path><path d="M23.8393768,13.5696 L20.6032674,10.3334905 L20.3364884,10.6000674 L16.2598232,6.52360421 L16.0484716,6.73480421 L15.5591747,6.24550737 L14.9613979,6.84328421 L14.4770526,6.35909053 L13.6979368,7.13800421 L14.6486905,8.08860632 L10.9978105,11.7398905 L7.43974737,8.18223158 L6.66083368,8.96094316 L7.68626526,9.98622316 L6.96464842,10.7076884 L8.14191158,11.8849516 L7.62295579,12.4039074 L9.05714526,13.8382989 L8.82310737,14.0725389 L10.13952,15.3891537 L8.59321263,16.9356632 L7.44126316,15.7839158 L6.32867368,16.8965053 L4.94819368,15.5158232 L4.67065263,15.7935663 L12.7946274,23.9175411 C18.4922779,23.5314189 23.0941137,19.1617011 23.8393768,13.5696 Z" id="Path" fill="#0EA2A4"></path><path d="M18.7193432,11.4589642 C19.6763621,11.3801432 20.3252211,10.9449095 20.5751242,10.3546611 C20.2297263,10.5667705 19.1581642,10.7979789 18.5664,10.5775832 C18.5374989,10.4388379 18.5051621,10.3064589 18.4733811,10.1875705 C18.0224842,8.53162105 16.4786526,7.19802947 14.8610526,7.35890526 C14.9918653,7.30615579 15.1250021,7.25679158 15.2571284,7.21278316 C15.4350316,7.14886737 16.4797642,6.97874526 16.3154526,6.61005474 C16.1767074,6.28582737 14.9003621,6.85525895 14.6600589,6.92973474 C14.9773137,6.81044211 15.5019284,6.60510316 15.5579116,6.24060632 C15.0718484,6.30714947 14.5948295,6.53704421 14.2263916,6.87132632 C14.3592758,6.72783158 14.4602779,6.55331368 14.4818021,6.36540632 C13.1850442,7.19348211 12.4277053,8.86302316 11.8151242,10.4826947 C11.3339621,10.0164884 10.9074695,9.64916211 10.5246316,9.44533895 C9.45135158,8.86949053 8.16803368,8.26883368 6.15344842,7.52109474 C6.09160421,8.18753684 6.48298105,9.07402105 7.61088,9.66330947 C7.36643368,9.63061895 6.92008421,9.70378105 6.56215579,9.78922105 C6.70792421,10.5528253 7.18302316,11.1818274 8.47068632,11.4861979 C7.88235789,11.5249516 7.57834105,11.6587958 7.30287158,11.9473011 C7.57040842,12.4783832 8.22432,13.1033937 9.39991579,12.9750063 C8.09295158,13.5383747 8.86731789,14.5823495 9.93114947,14.4265768 C8.11619368,16.3012547 5.25463579,16.1636211 3.61152,14.5957895 C7.90160842,20.4416337 17.2276042,18.0529011 18.6168253,12.4221979 C19.6581726,12.4308884 20.2702989,12.0614905 20.6497516,11.6542484 C20.0497011,11.75616 19.1802442,11.6510147 18.7193432,11.4589642 Z" id="Path" fill="#FFFFFF"></path></g></g></g></g></g></svg></a><a href="https://fr.linkedin.com/company/codingame" target="_blank" rel="noopener noreferrer"><svg width="24px" height="24px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="socialNetworkButton-0-1-45"><title>LinkedIn</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1119.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="follow"><g transform="translate(1017.000000, 23.000000)"><g id="linkedin-(1)" transform="translate(102.000000, 0.000000)"><circle id="Oval" fill="#4A86C5" cx="11.9982785" cy="11.9982785" r="11.9982785"></circle><path d="M20.4819241,3.51306329 C25.1675443,8.19908861 25.1679494,15.7961013 20.4819241,20.4820759 C15.7963038,25.1676962 8.19873418,25.1676962 3.51311392,20.4820759 L20.4819241,3.51306329 Z" id="Path" fill="#3D80B2"></path><path d="M23.4251139,15.6594937 C23.4690633,15.5221266 23.5090633,15.3832405 23.5482532,15.244 C23.5092152,15.383443 23.4681519,15.5221266 23.4251139,15.6594937 Z" id="Path" fill="#4A86C5"></path><g id="Group" transform="translate(6.227848, 4.860759)" fill="#377CA5"><polygon id="Path" points="17.3464209 10.4039829 17.3464209 10.4039829 17.3449209 10.4092829"></polygon><path d="M17.3213671,10.3806076 L10.8213165,3.88055696 L9.34263291,5.35924051 L8.31463291,4.33124051 L7.45660759,5.18926582 L2.432,0.164556962 L2.12035443,0.0457721519 L0.192253165,1.97387342 L2.51974684,4.30116456 L0.241367089,6.57939241 L2.46632911,8.80435443 L0.0335189873,11.2373671 L7.77088608,18.9665823 C12.2257722,18.2182278 15.8468354,15.0175696 17.1974684,10.7989367 C17.2404557,10.6614177 17.2814177,10.5228861 17.3206076,10.383443 C17.3206076,10.3825316 17.3210127,10.3813671 17.3213671,10.3806076 Z" id="Path"></path></g><path d="M18.1551899,11.6688101 L18.1551899,16.1185823 L15.5757468,16.1185823 L15.5757468,11.9668354 C15.5757468,10.9240506 15.2023291,10.2121013 14.2688608,10.2121013 C13.5557468,10.2121013 13.1317468,10.6917975 12.944962,11.1555949 C12.876962,11.3215696 12.8594937,11.5523038 12.8594937,11.7846076 L12.8594937,16.1184304 L10.2794937,16.1184304 C10.2794937,16.1184304 10.3139747,9.08678481 10.2794937,8.35848101 L12.8593418,8.35848101 L12.8593418,9.45822785 C12.8545823,9.46637975 12.8473924,9.47544304 12.8426835,9.48344304 L12.8593418,9.48344304 L12.8593418,9.45822785 C13.2020759,8.93037975 13.8143797,8.176 15.184557,8.176 C16.8826329,8.1761519 18.1551899,9.28526582 18.1551899,11.6688101 Z M7.57974684,4.61762025 C6.69726582,4.61762025 6.11959494,5.19681013 6.11959494,5.95802532 C6.11959494,6.70313924 6.68020253,7.2995443 7.54562025,7.2995443 L7.56303797,7.2995443 C8.46258228,7.2995443 9.02243038,6.70313924 9.02243038,5.95802532 C9.00541772,5.19675949 8.46263291,4.61762025 7.57974684,4.61762025 Z M6.27270886,16.1185316 L8.8521519,16.1185316 L8.8521519,8.35863291 L6.27270886,8.35863291 L6.27270886,16.1185316 L6.27270886,16.1185316 Z" id="Shape" fill="#FFFFFF"></path></g></g></g></g></g></svg></a></div><div class="langsContainer-0-1-46"><div class="container-0-1-47"><button><svg width="33px" height="24px" viewBox="0 0 33 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="langButton-0-1-48"><title>FR</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1203.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="languages"><g transform="translate(1203.000000, 23.000000)" id="france"><path d="M12.1905,23.9800714 L0.630571429,23.9800714 C0.282357143,23.9800714 -1.46549439e-13,23.6977143 -1.46549439e-13,23.3495 L-1.46549439e-13,0.65 C-1.46549439e-13,0.301785714 0.282357143,0.0194285714 0.630571429,0.0194285714 L12.1905,0.0194285714 L12.1905,23.9800714 Z" id="Path" fill="#41479B"></path><rect id="Rectangle" fill="#F5F5F5" x="10.1905" y="0.0197857143" width="12.1907143" height="23.9607143"></rect><path d="M31.9411429,23.9800714 L20.3812143,23.9800714 L20.3812143,0.0195 L31.9411429,0.0195 C32.2893571,0.0195 32.5717143,0.301857143 32.5717143,0.650071429 L32.5717143,23.3495714 C32.5717143,23.6978571 32.2893571,23.9800714 31.9411429,23.9800714 Z" id="Path" fill="#FF4B55"></path></g></g></g></g></svg></button><button><svg width="33px" height="24px" viewBox="0 0 33 24" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" class="langButton-0-1-48"><title>EN</title><g id="final" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><g id="footer" transform="translate(-1251.000000, -1036.000000)" fill-rule="nonzero"><g transform="translate(0.000000, 1013.000000)" id="languages"><g transform="translate(1203.000000, 23.000000)"><g id="united-states-of-america" transform="translate(48.000000, 0.000000)"><rect id="Rectangle" fill="#F0F0F0" x="0" y="0.0232280702" width="33" height="23.9534737"></rect><g id="Group" transform="translate(0.000000, 2.947368)" fill="#D80027"><rect id="Rectangle" x="0" y="0.069754386" width="33" height="2.99389474"></rect><rect id="Rectangle" x="0" y="6.05831579" width="33" height="2.99389474"></rect><rect id="Rectangle" x="0" y="12.0461053" width="33" height="2.99389474"></rect><rect id="Rectangle" x="0" y="18.0346667" width="33" height="2.99389474"></rect></g><rect id="Rectangle" fill="#2E52B2" x="0" y="0.0232280702" width="16.5" height="12.8980351"></rect><g id="Group" transform="translate(1.675781, 2.035088)" fill="#F0F0F0"><polygon id="Path" points="4.75805859 3.27185965 4.49231836 4.16196491 3.63277148 4.16196491 4.32828516 4.71178947 4.06254492 5.60182456 4.75805859 5.052 5.45312109 5.60182456 5.18744531 4.71178947 5.88295898 4.16196491 5.02334766 4.16196491"></polygon><polygon id="Path" points="5.02334766 7.37403509 4.75805859 6.484 4.49231836 7.37403509 3.63277148 7.37403509 4.32828516 7.92392982 4.06254492 8.81396491 4.75805859 8.26407018 5.45312109 8.81396491 5.18744531 7.92392982 5.88295898 7.37403509"></polygon><polygon id="Path" points="1.39070508 7.37403509 1.12535156 6.484 0.859611328 7.37403509 6.4453125e-05 7.37403509 0.695578125 7.92392982 0.429837891 8.81396491 1.12535156 8.26407018 1.82047852 8.81396491 1.55480273 7.92392982 2.2501875 7.37403509"></polygon><polygon id="Path" points="1.12535156 3.27185965 0.859611328 4.16196491 6.4453125e-05 4.16196491 0.695578125 4.71178947 0.429837891 5.60182456 1.12535156 5.052 1.82047852 5.60182456 1.55480273 4.71178947 2.2501875 4.16196491 1.39070508 4.16196491"></polygon><polygon id="Path" points="4.75805859 0.0596491228 4.49231836 0.949824561 3.63277148 0.949824561 4.32828516 1.4997193 4.06254492 2.38975439 4.75805859 1.83985965 5.45312109 2.38975439 5.18744531 1.4997193 5.88295898 0.949824561 5.02334766 0.949824561"></polygon><polygon id="Path" points="1.12535156 0.0596491228 0.859611328 0.949824561 6.4453125e-05 0.949824561 0.695578125 1.4997193 0.429837891 2.38975439 1.12535156 1.83985965 1.82047852 2.38975439 1.55480273 1.4997193 2.2501875 0.949824561 1.39070508 0.949824561"></polygon><polygon id="Path" points="8.39070117 3.27185965 8.12502539 4.16196491 7.26547852 4.16196491 7.96092773 4.71178947 7.69531641 5.60182456 8.39070117 5.052 9.08589258 5.60182456 8.82015234 4.71178947 9.51566602 4.16196491 8.65611914 4.16196491"></polygon><polygon id="Path" points="8.65611914 7.37403509 8.39070117 6.484 8.12502539 7.37403509 7.26547852 7.37403509 7.96092773 7.92392982 7.69531641 8.81396491 8.39070117 8.26407018 9.08589258 8.81396491 8.82015234 7.92392982 9.51566602 7.37403509"></polygon><polygon id="Path" points="12.2888262 7.37403509 12.0234727 6.484 11.7577324 7.37403509 10.89825 7.37403509 11.5936348 7.92392982 11.327959 8.81396491 12.0234727 8.26407018 12.7185996 8.81396491 12.4528594 7.92392982 13.148373 7.37403509"></polygon><polygon id="Path" points="12.0234727 3.27185965 11.7577324 4.16196491 10.89825 4.16196491 11.5936348 4.71178947 11.327959 5.60182456 12.0234727 5.052 12.7185996 5.60182456 12.4528594 4.71178947 13.148373 4.16196491 12.2888262 4.16196491"></polygon><polygon id="Path" points="8.39070117 0.0596491228 8.12502539 0.949824561 7.26547852 0.949824561 7.96092773 1.4997193 7.69531641 2.38975439 8.39070117 1.83985965 9.08589258 2.38975439 8.82015234 1.4997193 9.51566602 0.949824561 8.65611914 0.949824561"></polygon><polygon id="Path" points="12.0234727 0.0596491228 11.7577324 0.949824561 10.89825 0.949824561 11.5936348 1.4997193 11.327959 2.38975439 12.0234727 1.83985965 12.7185996 2.38975439 12.4528594 1.4997193 13.148373 0.949824561 12.2888262 0.949824561"></polygon></g></g></g></g></g></g></svg></button></div></div></div></div></div></div></cg-footer-new-react></cg-footer-new></div></div></div><script defer="defer" src="./Java_code_files/runtime_app.a6035ddc.js.download"></script><script defer="defer" src="./Java_code_files/app.fd5744e6.js.download"></script><script defer="defer" src="./Java_code_files/obsolete.3dbd97fa.js.download"></script>
<script type="text/javascript" id="">!function(b,e,f,g,a,c,d){b.fbq||(a=b.fbq=function(){a.callMethod?a.callMethod.apply(a,arguments):a.queue.push(arguments)},b._fbq||(b._fbq=a),a.push=a,a.loaded=!0,a.version="2.0",a.queue=[],c=e.createElement(f),c.async=!0,c.src=g,d=e.getElementsByTagName(f)[0],d.parentNode.insertBefore(c,d))}(window,document,"script","https://connect.facebook.net/en_US/fbevents.js");fbq("init","226638292107391");fbq("track","PageView");</script>
<noscript>
 <img height="1" width="1" style="display:none" src="https://www.facebook.com/tr?id=226638292107391&amp;ev=PageView&amp;noscript=1">
</noscript>
<script type="text/javascript" id="">(function(d,e,f,b,c,a){c="";b="https://tracking.g2crowd.com/attribution_tracking/conversions/"+d+".js?p\x3d"+encodeURI(e)+"\x26e\x3d"+c;a=document.createElement("script");a.type="application/javascript";a.async=!0;a.src=b;f.getElementsByTagName("head")[0].appendChild(a)})("2517",document.location.href,document);</script><script type="text/javascript" id="">var days=365,search_engines="google qwant yahoo msn bing baidu yandex".split(" "),kixdata_name="kixdata",kixdata="{}",gtm_cookie_ga=google_tag_manager["GTM-MXDVJH6"].macro(17),gtm_referrer=google_tag_manager["GTM-MXDVJH6"].macro(18),gtm_page_hostname=google_tag_manager["GTM-MXDVJH6"].macro(19);
function manageLocalStorageInitialSourceMedium(){if(gtm_cookie_ga){if(void 0!==kixdata.source&&void 0===kixdata.expiration){var a=gtm_cookie_ga.split(".");a=parseInt(a[a.length-1]);a=-1===days?a+63072E3:a+86400*days;kixdata.expiration=a;localStorage.setItem(kixdata_name,JSON.stringify(kixdata));kixdata.source}}else setInitialSourceMedium()}
function clearExpirationIfNeeded(){void 0!==kixdata.expiration&&Math.floor(Date.now()/1E3)>kixdata.expiration-1&&(localStorage.removeItem(kixdata_name),kixdata={})}
function setInitialSourceMedium(){clearExpirationIfNeeded();var a=gtm_referrer||"direct",b="referral",c=gtm_page_hostname,e=document.location.search.replace("?",""),f=document.location.hash.replace("#",""),g=new Date;g.setUTCHours(0,0,0,0);g=g.getTime()/1E3;var d=retrieve_utms(e+"#"+f);(a&&!a.includes(c)&&!1===d||!1!==d)&&void 0===kixdata.expiration&&(!1===d||void 0===d.utm_source&&void 0===d.utm_medium?(a=getHostname(a),c=getMediumTypeFromUrl(e+"#"+f),!1!==c&&(b=c),b=adjustMedium(a,b)):(a=d.utm_source,
b=d.utm_medium,void 0!==d.utm_campaign&&(kixdata.campaign=d.utm_campaign),void 0!==d.utm_term&&(kixdata.term=d.utm_term),void 0!==d.utm_content&&(kixdata.content=d.utm_content)),kixdata.source=a,kixdata.medium=b,kixdata.day=g,localStorage.setItem(kixdata_name,JSON.stringify(kixdata)))}function adjustMedium(a,b){return"referral"===b&&search_engines.includes(a)?b="organic":"direct"===a&&(b="none"),b}
function retrieve_utms(a){var b;var c=/(utm_(source|medium|campaign|term|content)=.*?([^&#]*|$))/gi;var e=a.match(c),f=!1;if(e)for(f={},a=e.length,c=0;c<a;c++)(b=e[c].split("\x3d"))&&(f[b[0]]=b[1]);return f}function getHostname(a){var b=a;if(a=(-1<a.indexOf("//")?a.split("/")[2]:a.split("/")[0]).split(":")[0].split("?")[0]){var c=a.match(/([^.]+)\.\w{2,3}(?:\.\w{2})?$/);c&&(a=1<c.length?c[1]:0<c.length?c[0]:null,c&&(b=a))}return b}
function getMediumTypeFromUrl(a){if((a=a.match(/(dclid|gclid|fbclid|msclkid)/))&&0<a.length&&(a=a[0])){if("dclid"===a)return"cpm";if("gclid"===a||"msclkid"===a)return"cpc";if("fbclid"===a)return"referral"}return!1}window.Storage&&(kixdata=localStorage.getItem(kixdata_name)||"{}",kixdata=JSON.parse(kixdata),manageLocalStorageInitialSourceMedium());</script><div class="ReactModalPortal"></div><div class="monaco-aria-container"><div class="monaco-alert" role="alert" aria-atomic="true" style="visibility: visible;">No results found for 'Y0'</div><div class="monaco-alert" role="alert" aria-atomic="true"></div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true" style="visibility: visible;">Cursors added: line 17 column 15, line 33 column 19, line 39 column 19, line 54 column 19, line 64 column 18, line 74 column 19, line 88 column 41</div><div class="monaco-status" role="complementary" aria-live="polite" aria-atomic="true"></div></div></body></html>