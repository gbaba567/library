jQuery(document).ready(function($) {


});
function toggleBookTable(id, ctrl) {
    if ($('#row-' + id).css("display") === 'none') {
        $('#row-' + id).show();
        $(ctrl).val("Collapse");
    } else {
        $('#row-' + id).hide();
        $(ctrl).val("Expand");
    }
    $.get("/user/details",
            {userId: id},
    function(data) {
        var details = "";
        if (data.books.length === 0) {
            details += "No Book is currently being read by this user.";
        } else {
            data.books.forEach(function(book) {
                details += (" <strong> Title : </strong>" + book.title);
                details += (" <strong> Author : </strong>" + book.author);
                details += "<br/>";
            });
        }
        $("#details-" + id).html(details);
    }).done(function() {
    }).fail(function(xhr, textStatus, errorThrown) {
    }).complete(function() {
    });
}