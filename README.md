# eBee



<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/katex@0.10.0-beta/dist/katex.min.css" integrity="sha384-9tPv11A+glH/on/wEu99NVwDPwkMQESOocs/ZGXPoIiLE8MU/qkqUcZ3zzL+6DuH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/katex@0.10.0-beta/dist/katex.min.js" integrity="sha384-U8Vrjwb8fuHMt6ewaCy8uqeUXv4oitYACKdB0VziCerzt011iQ/0TqlSlv8MReCm" crossorigin="anonymous"></script>
<script>
 function render(tag){
       var eq = tag.innerHTML;
       var htmlEq = katex.renderToString(eq,{throwOnError: false});
       tag.innerHTML = htmlEq;
     }
function renderAll(classes){
       for(var i=0;i<classes.length;i++){
         var elts = document.getElementsByClassName(classes[i]);
         for(var j=0; j < elts.length; j++){
           render(elts[j]);
         }
       }
     }
</script>
<body onload="renderAll(['eq'])">

<span class='eq'>E=mc^2</span>


</body>
