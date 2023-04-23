$('document').ready(function(){
	$('table #editButton').on('click', function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(bathproduct, status){
			$('#idEdit').val(bathproduct.id);
			$('#nameEdit').val(bathproduct.productName);
			$('#modelEdit').val(bathproduct.productModel);
			$('#quantityEdit').val(bathproduct.productQuantity)
			$('#priceEdit').val(bathproduct.productPrice)
			$('#totalAmountEdit').val(bathproduct.totalAmount)
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



