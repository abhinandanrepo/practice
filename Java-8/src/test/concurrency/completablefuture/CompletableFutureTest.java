package test.concurrency.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		completableFuture.complete("Future Value....");
		System.out.println(" Executed.. "+completableFuture.get());
		
		String[] arr = new String[10];
		arr = new String[]{"a","b"};
		
		List<Integer> l = new ArrayList<>();
		l.add(1);
		 
		String[] arr1 = {};
	}

}
