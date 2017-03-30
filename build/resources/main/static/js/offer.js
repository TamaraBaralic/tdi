var offer = {
    init : function () {
        if(window.location.href.indexOf("offersList") != -1)
            this.fillTable();
        else
            this.getOfferById();
    },
    fillTable : function () {

        $.ajax({
            url : '/offers/allOffers',
            contentType: false,
            processData: false,
            success : function (dat) {
                var offers = $("#allOffers").html("");

                offers.append("<tr><th>Title</th><th>Description</th><tr>");

                for(var i = 0; i < dat.length; i++) {
                    var id = i + 1;
                    offers.append("<tr><td><a href='/offers/getOfferById/" + id + "'>" + dat[i].title + "</a></td><td>" + dat[i].description +
                        "</td></tr>");
                }
            },
            error : function ()
            { console.log("error"); }
        });
    },

    getOfferById : function () {
        var id = window.location.href.substring(window.location.href.lastIndexOf("/"));
        $.ajax({
           url : '/offers' + id,
            contentType : false,
            processData : false,
            success : function (data) {
                $('#description').html(data.description);
                $('#offerTitle').html(data.title);
            },
            error : function () {
               console.log("Error");
            }
        });
    }
};

$(function () {
    offer.init();
});