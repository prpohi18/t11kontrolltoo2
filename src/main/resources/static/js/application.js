$( document ).ready(function() {
    //console.log( "ready!" );
    
    $("#add-button").on("click", function () {
        var name = $("#name").val();
        var momAllele1 = $("#mom-allele-1").val();
        var momAllele2 = $("#mom-allele-2").val();
        var dadAllele1 = $("#dad-allele-1").val();
        var dadAllele2 = $("#dad-allele-2").val();
        var url = "/Lisa?name=" + name + "&momAllele1=" + momAllele1 + "&momAllele2=" + momAllele2 +
            "&dadAllele1=" + dadAllele1 + "&dadAllele2=" + dadAllele2;

        //console.log("url", url);
        $.get( url, function( data ) {
            //console.log("data", data);
            $(".add").append("<h3>" + data + "</h3>");
        });
    });

    $("#search-button").on("click", function () {
        var search = $("#search").val();
        var url = "/Otsi?name=" + search;

        $.get(url, function (data) {
            $("#search-result").html(data);
        })
    });

    $("#generate-button").on("click", function () {
        var newGene = [];
        var newGeneName = false;

        $(".search-results table input").each(function () {
            var $this = $(this);

            if ($this.is(":checked")){
                var name = $this.parents("tr").find(".name").text();
                var Allele1 = $this.parents("tr").find(".allele-1").text();
                var Allele2 = $this.parents("tr").find(".allele-2").text();

                if (!newGeneName) newGeneName = name;
                newGene.push(Allele1, Allele2);
            }
        });

        if (newGene.length === 4){
            var url = "/Lisa?name=" + newGeneName + "&momAllele1=" + newGene[0] + "&momAllele2=" + newGene[1] +
                "&dadAllele1=" + newGene[2] + "&dadAllele2=" + newGene[3];

            console.log("url", url);
            $.get( url, function( data ) {
                console.log("data", data);
                $(".search-results").append("<h3>" + data + "</h3>");
            });
        }
    })
});

