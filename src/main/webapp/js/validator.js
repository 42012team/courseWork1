/**
 * Created by Adelya on 06.05.2018.
 */
function oclick(element) {
    alert(element);
   var parent=element.parentNode.parentNode;
    alert(parent);
    var children = parent.childNodes;
    alert(children.length)
    for (var c in children) {
        alert('YU')
        if((c(i)!=element)&&(c(i).value=true)){
            alert('pi');
        }
    }

}