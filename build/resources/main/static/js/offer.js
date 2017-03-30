var offer = {
    init : function () {
        this.fillTable();

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
                    offers.append("<tr><td>" + dat[i].title + "</a></td><td>" + dat[i].description +
                        "</td></tr>");
                }
            },
            error : function ()
            { console.log("error"); }
        });
    }
};

$(function () {
    offer.init();
});