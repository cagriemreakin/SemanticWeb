package dom_xml_parser;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class myParser {
	
	public static void main(String[] args){
		
		
     	Scanner in = new Scanner(System.in);
		 
	    System.out.println("Enter a string");
	    String s = in.nextLine();
	    System.out.println("You entered string "+s);
	    String input_item = in.nextLine();
	    String nam = in.nextLine();
	    
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("shop.xml");
			//System.out.println(doc.getDocumentElement().getNodeName());
			NodeList customer_list = doc.getElementsByTagName("customer");
			
			//if(p.getNodeType()==Node.ELEMENT_NODE){
//				Element customer = (Element) p;
			
			/////////////////////Q1///////////////////
			
				for(int c=0; c<customer_list.getLength(); c++){
				
				Node customer_list_alt = customer_list.item(c);
				
				Element namme = (Element) customer_list_alt;
				
				NodeList iterate = namme.getElementsByTagName("cust_name");
				
				Node nme = iterate.item(0);
				
				Element actual_name = (Element)  nme;
				
				Node item_alt = customer_list.item(c);
				Element eItem = (Element) item_alt;
				NodeList itms = eItem.getElementsByTagName("items");
				
				String temp = actual_name.getAttribute("name");
				
				if(nam.equals(temp)){
					for(int k=0; k<iterate.getLength(); k++){
						
						System.out.println("Item = " + itms.item(k).getTextContent() + "\n");
						
					}
				}
			
			}
			
			
			
			
			
			//////////////////Q2//////////////////////
			
			for(int c=0; c<customer_list.getLength(); c++){
				
				Node customer_list_alt = customer_list.item(c);
				
				Element purchase = (Element) customer_list_alt;
				
				NodeList iterate = purchase.getElementsByTagName("purchase_order_num");
				
				Node pur = iterate.item(0);
				
				Element purchase_deep = (Element) pur;
				
				Node item_alt = customer_list.item(c);
				Element eItem = (Element) item_alt;
				NodeList itms = eItem.getElementsByTagName("items");
				
				String temp = purchase_deep.getAttribute("pun");
				
				if(s.equals(temp)){
					for(int k=0; k<iterate.getLength(); k++){
						
						System.out.println("Item = " + itms.item(k).getTextContent() + "\n");
						
					}
				}
			
			}
			
			//////////////////////////////Q3////////////////////////////
			
			String[] area_list = new String[customer_list.getLength()];
			
			for(int c=0; c<customer_list.getLength(); c++){
			
				Node customer_list_alt = customer_list.item(c);
				
				Element hola = (Element) customer_list_alt;
				
				NodeList iterate = hola.getElementsByTagName("delivery_addr");
				
				//System.out.println("HELLOOOO" + iterate.getLength());
				
				area_list[c]=iterate.item(0).getTextContent();
					
				}
				
		
			for(int c=0; c<customer_list.getLength(); c++){
				for(int j=c+1; j<customer_list.getLength(); j++){
					if(area_list[c].equals(area_list[j])){
						Node item_alt = customer_list.item(c);
						Node item_alt1 = customer_list.item(j);
						Element eItem = (Element) item_alt;
						Element eItem1 = (Element) item_alt1;
						
						NodeList iterate = eItem.getElementsByTagName("items");
						NodeList iterate1 = eItem1.getElementsByTagName("items");
						
						
						
						for(int k=0; k<iterate.getLength(); k++){
						
							//System.out.println("Item = " + iterate.item(k).getTextContent() + "\n");
							
						}
						
						for(int k=0; k<iterate1.getLength(); k++){
							//System.out.println("Item = " + iterate1.item(k).getTextContent() + "\n");
						}
					}
				}
			}
			
			/////////////////////////////////Q4/////////////////////////////
			
			for(int c=0; c<customer_list.getLength(); c++){
				
				Node customer_list_alt = customer_list.item(c);
					
				Element namme = (Element) customer_list_alt;
				
				NodeList itrte = namme.getElementsByTagName("cust_name");
				
				Node nme = itrte.item(0);
				
				Element actual_name = (Element)  nme;
				
				String temp = actual_name.getAttribute("name");
				
				Element hola = (Element) customer_list_alt;
				
				NodeList iterate = hola.getElementsByTagName("items");
				
				for(int k=0; k<iterate.getLength(); k++){
					
					// burda loopla beraber itemlere ulasiyo sirasi ile
					
					Node item_current = iterate.item(k);
					Element eItem = (Element) item_current;
					
					NodeList iterate2 = eItem.getElementsByTagName("item");
					
					Node current_final = iterate2.item(k);
					
					Element eeItem = (Element) current_final;
					
					
					
				 if(input_item.equals(eeItem.getAttribute("in"))){
						System.out.println("Customer who ordered the item = " + temp + "\n");
				}
			}
		}
			
			
			
				
			
			
			//if(a1.equals(a2)){
				
//				for(int c=0; c<customer_list.getLength(); c++) {
//					Node customer_list_alt = customer_list.item(c);
//					Element hola = (Element) customer_list_alt;
//					
//					NodeList iterate = hola.getElementsByTagName("items");
//					
//					for(int k=0; k<iterate.getLength(); k++){
//						System.out.println("Item = " + iterate.item(k).getTextContent() + "\n");
//					}
//				}
		//	}
			
			
			
			
			
//			System.out.println("\nCurrent Element : " + iterate.item(0).getNodeName() + iterate.item(0).getTextContent());
//			
//			//Node current_alt = customer_list_alt.item(0);
//			
//			System.out.println("\nCurrent Element: " + customer_list_alt);
//			
//			Node current = customer_list.item(0);
//			
//			System.out.println("\nCurrent Element: " + current.getNodeName());
//			
//			Node first = customer_list.item(0);
//			
//			System.out.println("\nCurrent Element: " + first.getNodeName());
			
			
			
//			for(int i=0;i<customer_list.getLength();i++){
//				Node p = customer_list.item(i);
//				if(p.getNodeType()==Node.ELEMENT_NODE){
//					Element customer = (Element) p;
//					String id = customer.getAttribute("id");
//					
//					
//					
//					
//					
//					NodeList nameList = customer.getChildNodes();
//					for(int j=0;j<nameList.getLength();j++){
//					Node n = nameList.item(j);
//						if(n.getNodeType()==Node.ELEMENT_NODE){
//							Element name = (Element) n;
//							//System.out.println("Customer" + id + ":" + name.getTagName() + "=" + name.getTextContent());
//						if(name.getTextContent().equals("Lars Ulrich"))
//						{
//							System.out.println("asds");
//							
//						}
//						}
//					}
//				}
//			}
			
			
			
			
			
			
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
