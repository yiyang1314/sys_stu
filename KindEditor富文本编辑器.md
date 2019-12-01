# KindEditor富文本编辑器

## 1.KindEditor介绍

富文本编辑器，Rich Text Editor, 简称 RTE, 它提供类似于 Microsoft Word 的编辑功能，KindEditor是一套开源的HTML可视化编辑器，主要用于让用户在网站上获得所见即所得编辑效果，兼容IE、Firefox、Chrome、Safari、Opera等主流浏览器 。常用的富文本编辑器：

KindEditor   http://kindeditor.net/

UEditor    http://ueditor.baidu.com/website/

CKEditor   http://ckeditor.com/

> 特点：

1. 体积小，加载速度快，但功能十分丰富。
2. 内置自定义range，完美地支持span标记。

3. 基于插件的方式设计，所有功能都是插件，增加自定义和扩展功能非常简单。

4. 修改编辑器风格很容易，只需修改一个CSS文件。

5. 支持大部分主流浏览器，比如IE、Firefox、Safari、Chrome、Opera







## 2.如何使用

> ### 引入相关的js插件

```html
    <!-- 富文本编辑器 -->
	<link rel="stylesheet" href="../plugins/kindeditor/themes/default/default.css" />
	<script charset="utf-8" src="../plugins/kindeditor/kindeditor-min.js"></script>
	<script charset="utf-8" src="../plugins/kindeditor/lang/zh_CN.js"></script>
```



> 在页面中绑定富文本编辑器

```html
  <textarea name="content" style="width:800px;height:400px;visibility:hidden;" ></textarea>
```



> 如何操作富文本编辑器

### 1.初始化kindeditor编辑器

> 在页面中添加JS代码，用于初始化kindeditor



```js
<script type="text/javascript">

	var editor;
	KindEditor.ready(function(K) {
		editor = K.create('textarea[name="content"]', {
			allowFileManager : true
		});
	});

</script>
```



* allowFileManager 【是否允许浏览服务器已上传文件】 默认值是：false 



### 2.提取kindeditor编辑器的内容

> 



### 3.清空kindeditor编辑器的内容

```js
editor.html('');
```



## 3.更多使用

```tex
---------------------------------------------------------------------------------- 
allowFileManager 【是否允许浏览服务器已上传文件】 
默认值是：false 
------------------------------------------------------ 
allowImageUpload 【是否允许上传本地图片】 
默认值是：true 
---------------------------------------------- 
allowFlashUpload 【是否允许上传Flash】 
默认值是：true 
---------------------------------------------- 
allowMediaUpload 【是否允许上传多媒体文件】 
默认值是：true 
------------------------------------------------ 
pasteType 【设置粘贴类型】 
0:禁止粘贴, 1:纯文本粘贴, 2:HTML粘贴（默认） 
--------------------------------------------------- 
resizeType 【设置可否改变编辑器大小】 
0:不能改变 1:只能改变高度 2:宽度和高度都可以改变（默认） 
---------------------------------------------------------- 
themeType 【主题风格】 
可设置"default"、"simple"，指定simple时需要引入simple.css 
------------------------------------------------------------- 
------------------------------------------------------------- 
designMode 【可视化模式或代码模式】 
数据类型：Boolean 
默认值是：true(可视化) 
------------------------------------------ 
afterCreate:function(){} 【编辑器创建后】 
afterCreate:function(){ 
//alert('创建完成'); 
} 
```



> fontSizeTable 【制定文字大小】 
> 数据类型：Array 

* 默认值：['9px', '10px', '12px', '14px', '16px', '18px', '24px', '32px'] 

> colorTable 【指定取色器里的颜色值】 
> 数据类型：Array 

```js
[ 
    ['#E53333', '#E56600', '#FF9900', '#64451D', '#DFC5A4', '#FFE500'], 
    ['#009900', '#006600', '#99BB00', '#B8D100', '#60D978', '#00D5FF'], 
    ['#337FE5', '#003399', '#4C33E5', '#9933E5', '#CC33E5', '#EE33EE'], 
    ['#FFFFFF', '#CCCCCC', '#999999', '#666666', '#333333', '#000000'] 
] 
```



> 修改默认值
> ---------------------------------------------------------------------------------- 

```text
【Ctrl+Enter提交】 
afterCreate:function(){ 
var self=this; 
KindEditor.ctrl(self.edit.doc, 13, function() { 
self.sync(); 
//执行其他事件 
}); 
} 

var editor=KindEditor.create(‘#nr’); 
【编辑器获取焦点】 
editor.focus(); 
【取得编辑器HTML内容】 
var html=editor.html(); 
【取得编辑器纯文本内容】 
var text=editor.text(); 
【移除编辑器】 
editor.remove(); 
【设置编辑器HTML】 
editor.html(‘<strong>编辑器内容</strong>’); 
【设置编辑器纯文本内容，直接显示HTML代码】 
editor.text(‘<strong>编辑器内容</strong>’); 
【判断编辑器内容是否为空】 
if(editor.isEmpty()){ 
alert(‘请输入内容’); 
return false; 
} 
【将指定的HTML内容插入到编辑器区域里的光标处】 
editor.insertHtml(‘<strong>插入内容</strong>’); 
【将指定的HTML内容添加到编辑器区域的最后位置。】 
editor.appendHtml(‘<strong>追加内容</strong>’); 
【编辑器切换全屏模式】 
editor.fullscreen(); 
【设置编辑器的只读状态】 
editor.readonly(false); //true:只读，false:取消只读
```



4. 最新版本

   > 目录结构

   ![image-20191130003232964](D:%5C20152203%5Cidea-workspace%5Cspring-boot-samples%5Cimages%5Cimage-20191130003232964.png)

   

   > [Kindeditor.官网地址]: http://kindeditor.net/down.php

   

   > 快速使用

   ```html
    <textarea id="content_1" name="content" 		style="width:700px;height:300px;visibility:hidden;"></textarea>
   <script type="text/javascript" charset="utf-8" src="/editor/kindeditor.js"></script>
   <script type="text/javascript">
   	KE.show({id : 'content_1'});
   </script>
   
   ```

   

# UEditor

## 1.UEditor 介绍

UEditor 是由百度「FEX前端研发团队」开发的所见即所得富文本web编辑器，具有轻量，可定制，注重用户体验等特点，开源基于MIT协议，允许自由使用和修改代码。

## 2. 快速体验

### 2.1 下载编辑器

UEditor 官网：[http://ueditor.baidu.com](http://ueditor.baidu.com/)

UEditor API 文档：http://ueditor.baidu.com/doc

UEditor Github 地址：http://github.com/fex-team/ueditor

### 2.2 创建demo文件

解压下载的包，在解压后的目录创建 demo.html 文件，填入下面的html代码



```html
<!DOCTYPE HTML>
<html lang="en-US">

<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
</head>

<body>
    <!-- 加载编辑器的容器 -->
    <script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
    <!-- 配置文件 -->
    <script type="text/javascript" src="ueditor.config.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container');
    </script>
</body>

</html>
```



### 2.3 在浏览器打开demo.html

如果看到了下面这样的编辑器，恭喜你，初次部署成功！

![部署成功](http://fex.baidu.com/ueditor/doc/images/demo.png)

### 2.4 传入自定义的参数

编辑器有很多可自定义的参数项，在实例化的时候可以传入给编辑器：

```javascript
var ue = UE.getEditor('container', {
    autoHeight: false
});
```



配置项也可以通过 ueditor.config.js 文件修改，具体的配置方法请看[前端配置项说明](http://fex.baidu.com/ueditor/#start-config)

### 2.5 设置和读取编辑器的内容

通 getContent 和 setContent 方法可以设置和读取编辑器的内容

```javascript
var ue = UE.getContent();
//对编辑器的操作最好在编辑器ready之后再做
ue.ready(function() {
    //设置编辑器的内容
    ue.setContent('hello');
    //获取html内容，返回: <p>hello</p>
    var html = ue.getContent();
    //获取纯文本内容，返回: hello
    var txt = ue.getContentTxt();
});
```



## 3.常用API



```reStructuredText
实例化编辑器到id为 container 的 dom 容器上：详细
var ue = UE.getEditor('container');
设置编辑器内容：详细
ue.ready(function() {
    ue.setContent('<p>hello!</p>');
});
追加编辑器内容：详细
ue.ready(function() {
    ue.setContent('<p>new text</p>', true);
});
获取编辑器html内容：详细
ue.ready(function() {
    var html = ue.getContent();
});
获取纯文本内容：详细
ue.getContentTxt();
获取保留格式的文本内容：详细
ue.getPlainTxt();
获取纯文本内容：详细
ue.getContentTxt();
判断编辑器是否有内容：详细
ue.hasContents();
让编辑器获得焦点：详细
ue.focus();
让编辑器获得焦点
ue.blur();
判断编辑器是否获得焦点：详细
ue.isFocus();
设置当前编辑区域不可编辑：详细
ue.setDisabled();
设置当前编辑区域可以编辑：详细
ue.setEnabled();
隐藏编辑器：详细
ue.setHide();
显示编辑器：详细
ue.setShow();
获得当前选中的文本：详细
ue.selection.getText();
常用命令：详细
在当前光标位置插入html内容
ue.execCommand('inserthtml', '<span>hello!</span>');
设置当前选区文本格式：详细
ue.execCommand('bold'); //加粗
ue.execCommand('italic'); //加斜线
ue.execCommand('subscript'); //设置上标
ue.execCommand('supscript'); //设置下标
ue.execCommand('forecolor', '#FF0000'); //设置字体颜色
ue.execCommand('backcolor', '#0000FF'); //设置字体背景颜色
回退编辑器内容：详细
ue.execCommand('undo');
撤销回退编辑器内容：详细
ue.execCommand('redo');
切换源码和可视化编辑模式：详细
ue.execCommand('source');
选中所有内容：详细
ue.execCommand('selectall');
清空内容：详细
ue.execCommand('cleardoc');
读取草稿箱
ue.execCommand('drafts');
清空草稿箱
ue.execCommand('clearlocaldata');
```





# CKEditor

## 1.介绍

通过从CDN加载CKEditor来**加速您的网站**：

- CKEditor托管在遍布全球的服务器上-脚本加载速度更快，因为它们是从最近的位置提供给最终用户的。
- 如果已经下载了相同版本的CKEditor（甚至在其他网站上），则从缓存中加载它。
- CDN减少了服务器处理的HTTP请求的数量，因此它也加快了速度！





## 2. CKEditor 4的使用

要在您的网站上开始使用CKEditor 4，请在HTML页面中添加一个<script>标签：

```html
<script src="https://cdn.ckeditor.com/4.13.0/standard/ckeditor.js"></script>
```

> 快速示例：

```html
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>CKEditor</title>
                <script src="https://cdn.ckeditor.com/4.13.0/standard/ckeditor.js"></script>
        </head>
        <body>
                <textarea name="editor1"></textarea>
                <script>
                        CKEDITOR.replace( 'editor1' );
                </script>
        </body>
</html>
```





> CKEditor 4结构：

- **基本** -基本预设
- **standard-**标准预设
- **standard-all** -Standard预设以及CKSource创建的所有其他插件*****
- **full-**完整预设
- **full-** all-完整预设以及CKSource创建的所有其他插件*****

*需要使用启用预设中未包含的插件[`config.extraPlugins`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-extraPlugins)。

**注意：**由于使用CKEditor 4.4.5的人为错误，应指定 **4.4.5.1**。指向4.4.5的路径实际上指向旧版本的CKEditor（4.3.5）。为避免现有安装出现问题，我们决定将（无效）旧版本保留在该路径下。

### 启用本地插件

要在使用CKEditor CDN时从**本地文件夹**启用额外的插件，[`CKEDITOR.plugins.addExternal()`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_plugins.html#method-addExternal)必须先调用它，以便CKEditor知道从何处加载插件。

该`CKEDITOR.plugins.addExternal()`方法接受三个参数：

- 插件的名称。
- 插件的位置。确保路径以斜杠字符（“ /”）开头。
- 文件名（通常是“ plugin.js”）。

```javascript
// Enable local "abbr" plugin from /myplugins/abbr/ folder.
CKEDITOR.plugins.addExternal( 'abbr', '/myplugins/abbr/', 'plugin.js' );

// extraPlugins needs to be set too.
CKEDITOR.replace( 'editor1', {
        extraPlugins: 'abbr'
} );
```

### 启用本地皮肤

从**本地文件夹**启用皮肤比启用插件更容易。要在使用CKEditor CDN时使用自定义CKEditor外观[`config.skin`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-skin)，请在逗号后使用并提供外观名称和完整URL：

```javascript
// Enable "moonocolor" skin from the /myskins/moonocolor/ folder.
CKEDITOR.replace( 'editor1', {
        skin: 'moonocolor,/myskins/moonocolor/'
} );
```

### 本地配置文件

默认情况下，CKEditor中的某些功能是通过JavaScript文件配置的。由于所有文件都是从远程CDN加载的，因此无法直接对其进行修改。但是，如果需要执行以下操作，则可以指示CKEditor加载本地文件：

- [`config.customConfig`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-customConfig)-CKEditor配置文件的路径。有关更多详细信息，请参见[设置CKEditor配置](https://ckeditor.com/docs/ckeditor4/latest/guide/dev_configuration.html)。
- [`config.contentsCss`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-contentsCss) -用于将样式应用于内容的CSS文件。
- [`config.stylesSet`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-stylesSet)-在样式下拉列表中使用的“样式定义集”。有关更多详细信息，请参见[设置样式](https://ckeditor.com/docs/ckeditor4/latest/guide/dev_styles.html)。
- [`config.templates_files`](https://ckeditor.com/docs/ckeditor4/latest/api/CKEDITOR_config.html#cfg-templates_files) -在模板对话框窗口中使用的模板文件列表。

如果设置上述任何选项，强烈建议在本地[下载](http://ckeditor.com/download)从CDN加载的相同CKEditor软件包，以便复制随附的配置文件并将其用作添加其他更改的基础文件。

```javascript
// Always provide paths that start with a slash character ("/").
CKEDITOR.replace( 'editor1', {
        customConfig: '/ckeditor_settings/config.js'
} );
```

## CKEditor 5



### js引用

```html
<script src="https://cdn.ckeditor.com/ckeditor5/15.0.0/classic/ckeditor.js"></script>
```

### 快速示例

```html
<!DOCTYPE html>
<html>
        <head>
                <meta charset="utf-8">
                <title>CKEditor</title>
                <script src="https://cdn.ckeditor.com/ckeditor5/15.0.0/classic/ckeditor.js"></script>
        </head>
        <body>
                <div id="editor">This is some sample content.</div>
                <script>
                        ClassicEditor
                                .create( document.querySelector( '#editor' ) )
                                .then( editor => {
                                        console.log( editor );
                                } )
                                .catch( error => {
                                        console.error( error );
                                } );
                </script>
        </body>
</html>
```



[^我的富文本]: https://i-beta.cnblogs.com/posts/edit 

