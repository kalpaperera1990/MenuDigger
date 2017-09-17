function getMenuItems(search){
    if(search.length==0){
        $("#autocomplete").html("");
        //$("#autocomplete").removeClass("form-control");
        $("#autocomplete").css({"border-color": "#0498fe",
            "border-width":"0px",
            "border-style":"solid"});
    }
    else {
        req=new XMLHttpRequest();
        req.onreadystatechange=function () {
            //var html="<a href=\"#\" onClick=\"select(this.text)\">Test</a><br><a href=\"#\" onClick=\"select(this.text)\">Test3</a>";

            if(this.readyState==4 && this.status==200){
                $("#autocomplete").css({"border-color": "#0498fe",
                    "border-width":"1px",
                    "border-style":"solid"});
                $("#autocomplete").html(this.responseText);
            }
        }
        req.open("GET","https://s3628144-cc2017.appspot.com/_ah/api/menuitemendpoint/v1/menuitem?search="+search,true);
        req.send();
    }
}

function select(value){
    alert(value);
}