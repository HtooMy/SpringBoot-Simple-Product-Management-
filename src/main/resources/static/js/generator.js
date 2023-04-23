$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(generator, status){
			$('#idEdit').val(generator.id);
			$('#nameEdit').val(generator.productName);
			$('#modelEdit').val(generator.productModel);
			$('#quantityEdit').val(generator.productQuantity)
			$('#priceEdit').val(generator.productPrice)
			$('#totalAmountEdit').val(generator.totalAmount)
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



