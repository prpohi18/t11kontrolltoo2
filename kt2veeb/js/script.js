function factorial(n) {
    if (n < 0) 
          return -1
    else if (n == 0) 
        return 1
    else {
        return (n * factorial(n - 1))
    }
}

window.onload = function(){
    document.getElementById("calc").addEventListener("click", function(){
        moodustis = document.getElementById("moodustis").value
        number = (document.getElementById("number").value).length
        if (number >= moodustis && number && moodustis) {
            vastus = factorial(number) / (factorial(moodustis)*factorial(number-moodustis))
            document.getElementById("ans").innerHTML = vastus
        }else{
            document.getElementById("ans").innerHTML = "Antud andmetes on midagi valesti"
        }
    })
}