$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(tv, status){
			$('#idEdit').val(tv.id);
			$('#nameEdit').val(tv.productName);
			$('#modelEdit').val(tv.productModel);
			$('#quantityEdit').val(tv.productQuantity)
			$('#priceEdit').val(tv.productPrice)
			$('#totalAmountEdit').val(tv.totalAmount)
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



