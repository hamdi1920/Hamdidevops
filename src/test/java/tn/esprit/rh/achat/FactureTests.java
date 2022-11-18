
package tn.esprit.rh.achat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.*;
import tn.esprit.rh.achat.repositories.*;
import tn.esprit.rh.achat.services.*;

@ExtendWith(MockitoExtension.class)
public class FactureTests {
	
		@Mock
	StockRepository StockRepo;
	@InjectMocks
	StockServiceImpl ss;
    @Test
    @Order('1')
    public void Add() 
    {
    	
    	//StockServiceImpl ss=mock(StockServiceImpl.class);
    	Stock st =  new Stock();
		st.setLibelleStock("gjhgjh");
		st.setQte(180);
		st.setQteMin(10);
		st.setIdStock((long) 4);
		when(ss.addStock(st)).thenReturn(st);
	//	assertNotEquals(st.getIdStock(), null);
       // System.out.print(ss.addStock(st).getIdStock());
    }
	
	
}
