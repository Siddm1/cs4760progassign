// Show Last Book - Simple Ajax
console.log("Hello showLastBook");
$(document).ready( function(){
    console.log("In document ready");
    $('#lastBook').load("/cs4760progassign/home/showLastBook");
    $('#lastBookLink').click(function(){
        $('#lastBook').load(this.href);
        return false;
    });
});



