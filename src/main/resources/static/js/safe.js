$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(safe, status){
			$('#idEdit').val(safe.id);
			$('#nameEdit').val(safe.productName);
			$('#modelEdit').val(safe.productModel);
			$('#quantityEdit').val(safe.productQuantity)
			$('#priceEdit').val(safe.productPrice)
			$('#totalAmountEdit').val(safe.totalAmount)
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



