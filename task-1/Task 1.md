# Task 1

## How to use 'F12'

[Chrome 开发者工具](<https://developers.google.com/web/tools/chrome-devtools/?hl=zh-cn>) gives a detailed description  of  DevTools.  Let's follow it and analyze the home page loading of [SJTU](<https://www.sjtu.edu.cn/>).

### Compare with other website home page

Let's make a comparison between these three websites:

<img src="home1.jpg">

[上海交通大学中文主页门户网站](https://www.sjtu.edu.cn/)

<img src="home2.jpg">

[中国大学MOOC](https://www.icourse163.org/)

<img src="home3.jpg">

[淘宝](https://www.taobao.com/)

- Summary

Let's keep the reload page information of each website. Here is the summary part(they're from SJTU, MOOC and TaoBao):

<img src="summary1.jpg" width="30%">
<img src="summary2.jpg" width="30%">
<img src="summary3.jpg" width="30%">

The first image is from SJTU. We can see that it spent the longest time to load. Basically each event is much longer than the others.

*Scripting* and *Rendering* are typically longer than the others. Thus, let's pay more attention to events.

- Overview

Let's have a look at overview. The images bellow show FPS, CPU and NET(they're from SJTU, MOOC and TaoBao):

<img src="overview1.jpg">
<img src="overview2.jpg">
<img src="overview3.jpg">

**FPS**

We can see that the home page of SJTU exists long time red block, which means it's highly possibe to get stuck.

**CPU**

SJTU takes large CPU. Script and Style Sheet take a large part of CPU.

**NET**

SJTU has long blue line. It means that it will spend a long time to search. But the waiting time is short.




### Carry out optimization solution



