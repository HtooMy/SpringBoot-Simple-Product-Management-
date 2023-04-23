$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(furniture, status){
			$('#idEdit').val(furniture.id);
			$('#nameEdit').val(furniture.productName);
			$('#modelEdit').val(furniture.productModel);
			$('#quantityEdit').val(furniture.productQuantity)
			$('#priceEdit').val(furniture.productPrice)
			$('#totalAmountEdit').val(furniture.totalAmount)
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



