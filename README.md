# TipDialog 提供一个加载提示对话框<br/>
这个库主要用来学习如何发布，代码不是我编的，从一个同事那里copy来的.<br>
界面：<br/>
![](https://github.com/huchenguang/TipDialog/tree/master/ui/1.gif)<br/>
![](https://github.com/huchenguang/TipDialog/tree/master/ui/2.gif)<br/>
##使用<br/>
```
new TipLoadDialog(mActivity, "加载中", TipLoadDialog
                        .ICON_TYPE_LOADING).show();<br/>
```
gradle 地址<br/>
1.先在根build.gradle添加
```
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2.在app moudle的build.gradle添加依赖
```
dependencies {
	        implementation 'com.github.huchenguang:TipDialog:1.0.1'
	}
```

