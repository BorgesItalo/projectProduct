package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.ImportedProduct;
import entites.Product;
import entites.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> merc = new ArrayList<>();
		System.out.println("Digite a quantidade de produtos no sistemas");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + " data: ");
			
			System.out.print("Digite o nome do produto: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Digite o valor do produto: ");
			double price = sc.nextDouble();

			System.out.print("Produto comum, usado ou importado? [c/u/i]:  ");
			char perg = sc.next().charAt(0);
			if (perg == 'c') {
				
				Product p = new Product(name, price);
				
				merc.add(p);
			} else if (perg == 'i') {
				
				System.out.println("Digite o valor do frete");
				double valorfrete = sc.nextDouble();
				Product ip = new ImportedProduct(name, price, valorfrete);
				merc.add(ip);

			} else if (perg == 'u') {
				
				System.out.println("Digite a data da compra");
				Date manufactureDate = sdf.parse(sc.next());
				Product pu = new UsedProduct(name, price, manufactureDate);
				merc.add(pu);
			}
		}
		
		for (Product product : merc) {
			System.out.println(product.toString());
		}
		

		sc.close();
	}

}
