$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(kitchenProduct, status){
			$('#idEdit').val(kitchenProduct.id);
			$('#nameEdit').val(kitchenProduct.productName);
			$('#modelEdit').val(kitchenProduct.productModel);
			$('#quantityEdit').val(kitchenProduct.productQuantity)
			$('#priceEdit').val(kitchenProduct.productPrice)
			$('#totalAmountEdit').val(kitchenProduct.totalAmount)
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



