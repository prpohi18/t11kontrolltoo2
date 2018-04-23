let moodustis, number, vastus

function faktoriaal(num) {
    if (num < 0) 
          return -1
    else if (num == 0) 
        return 1
    else {
        return (num * faktoriaal(num - 1))
    }
  }

window.onload = function(){
    let button = document.getElementById("arvuta")

    button.addEventListener("click", function(){
        moodustis = document.getElementById("moodustis").value
        number = (document.getElementById("number").value).length
        if (number >= moodustis && number && moodustis) {
            vastus = faktoriaal(number) / (faktoriaal(moodustis)*faktoriaal(number-moodustis))
            document.getElementById("vastus").innerHTML = vastus
        }else{
            document.getElementById("vastus").innerHTML = "Kontrolli andmeid"
        }
        
    })
}



