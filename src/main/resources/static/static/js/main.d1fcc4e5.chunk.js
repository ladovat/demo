(this.webpackJsonpfrontend=this.webpackJsonpfrontend||[]).push([[0],{430:function(e,t){function n(e){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}n.keys=function(){return[]},n.resolve=n,e.exports=n,n.id=430},494:function(e,t,n){e.exports=n(786)},499:function(e,t,n){},500:function(e,t,n){e.exports=n.p+"static/media/logo.ee7cd8ed.svg"},501:function(e,t,n){},786:function(e,t,n){"use strict";n.r(t);var o=n(0),a=n.n(o),i=n(18),c=n.n(i),r=(n(499),n(500),n(501),n(138)),u=n.n(r),s=n(164),l=n(332),d=n(324),f=n.n(d),p=function(){var e=Object(o.useState)([]),t=Object(l.a)(e,2),n=t[0],i=t[1],c=Object(o.useState)([]),r=Object(l.a)(c,2),d=(r[0],r[1]);Object(o.useEffect)((function(){u.a.get("/api/v1/person/get_all").then((function(e){console.log(e.data),i(e.data)})).catch((function(e){d(["Cannot load user data"])}))}),[]);return a.a.createElement("div",null,a.a.createElement(f.a,{title:"Persons",data:n,columns:[{title:"ID",field:"id",hidden:!0},{title:"Name",field:"name"},{title:"Age",field:"age"}],options:{search:!1,exportButton:!0,actionsColumnIndex:-1},editable:{onRowUpdate:function(e,t){return new Promise((function(o){!function(e,t,o){u.a.put("/api/v1/person/update",e).then((function(a){var c=Object(s.a)(n);c[t.tableData.id]=e,i(Object(s.a)(c)),o()}))}(e,t,o)}))},onRowAdd:function(e){return new Promise((function(t){!function(e,t){u.a.post("/api/v1/person/add",e).then((function(o){e.id=o.data;var a=Object(s.a)(n);a.push(e),i(a),t()}))}(e,t)}))},onRowDelete:function(e){return new Promise((function(t){!function(e,t){u.a.delete("/api/v1/person/delete",{params:{id:e.id}}).then((function(o){var a=Object(s.a)(n),c=e.tableData.id;a.splice(c,1),i(Object(s.a)(a)),t()}))}(e,t)}))}}}))};n(485),n(581);var m=function(){return a.a.createElement("div",{className:"App"},a.a.createElement(p,null))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));c.a.render(a.a.createElement(a.a.StrictMode,null,a.a.createElement(m,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[494,1,2]]]);
//# sourceMappingURL=main.d1fcc4e5.chunk.js.map