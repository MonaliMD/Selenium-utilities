# Selenium-utilities
This includes examples of selenium tests


Sometimes not compile all scripts without wait time between them
``Thread.sleep(3000);``

# Locate elements by link text and partial link text
The latest HTML5 standard allows the <a> tags to be placed inside and outside of block-level tags like 
  ```bash
<div>, <p>, <h3>
```
 By.linkText() and By.partialLinkText() methods can access a link located outside and inside these block-level elements. Consider the HTML code below.
  
  ```bash
  <body> 
      <p>
        <a href="https://www.google.com/"> Inside block level tag </a>
      </p>
      
      <a href="https://www.fb.com/">
        <div>
          <span>Outside a block level tag</span>
        </div>
      </a>
   </body>
 ```

Nagavidate back to 
```bash
driver.navigate().back();
```
