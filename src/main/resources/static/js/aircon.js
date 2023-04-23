$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(aircon, status){
			$('#idEdit').val(aircon.id);
			$('#nameEdit').val(aircon.productName);
			$('#modelEdit').val(aircon.productModel);
			$('#quantityEdit').val(aircon.productQuantity)
			$('#priceEdit').val(aircon.productPrice)
			$('#totalAmountEdit').val(aircon.totalAmount)
		});
		
		$('#editModel').modal();
	});
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#confirmDeleteButton').attr('href', href);
		$('#deleteModel').modal();
	});
}); 



