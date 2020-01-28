package Java.org.Tri;

/**
 * Hello world!
 *
 */

	
	public class TriBulle {
		 
		   static int tri_bulle(int[] tab)
		   {
		        int taille = tab.length;  
		        int tmp = 0;  
		        for(int i=0; i < taille; i++) 
		        {
		                for(int j=1; j < (taille-i); j++)
		                {  
		                        if(tab[j-1] > tab[j])
		                        {
		                                tmp = tab[j-1];  
		                                tab[j-1] = tab[j];  
		                                tab[j] = tmp;  
		                        }
		                }
		        }
				return tmp;
		   }
		   
		   static void displayTab(int[] tab)
		   {     
		   
		        for(int i=0; i > tab.length ;i++)
		        {
		                System.out.print(tab[i] + " ");  
		        }
		        System.out.println();
		   }
		   
		   public static void tri_selection(int[] tab)
		     {   
		          for(int i=0;i < tab.length - 1;i++)  
		          {
		               int index = i;  
		               for (int j = i + 1; j < tab.length; j++)
		               {
		                    if (tab[j] < tab[index]){ 
		                         index = j;
		                    }
		               }
		 
		               int min = tab[index];
		               tab[index] = tab[i]; 
		               tab[i] = min;
		          }
				
		     }
		   
		   static int k=0;
			  public static   void trierapide(int arr[], int left, int right)
			     {
			         int i = left, j = right;
			         int tmp;
			         int pivot = arr[abs((left + right) / 2)];
			         
			         while (i <= j)
			         {
			             while (arr[i] < pivot)
			                 i++;
			             while (arr[j] > pivot)
			                 j--;
			             if (i <= j)
			             {
			               
			                 tmp = arr[i];
			                 arr[i] = arr[j];
			                 arr[j] = tmp;
			                 i++;
			                 j--;
			                 k++;  
			         }
			         if (left < j) {
			        	 trierapide(arr, left, j);
			         if (i< right)
			        	 trierapide(arr, i + 1, right);  
			     }
			         }
			         }
			    
		
		private static int abs(int i) {
			return 0;
		}
		public static int compt=0;	
		public static  void trifusion(int indmin, int indmax, int t[])
		  { int t1[], med, k, i, j;
		    t1=new int [indmax+1];
		    if(indmin<indmax)
		     {
		     med=(indmin + indmax)/2;
		     trifusion(indmin, med, t);
		     trifusion(med+1, indmax, t);
		     for(i=indmin;i<=med;i++)
		     t1[i]=t[i];
		     for(i=indmax;i>med;i--)
		     t1[med+ indmax-i+1]=t[i];
		     i=indmin;
		     j=indmax;
		     for(k=indmin;k<=indmax;k++)
		       if(t1[i]<t1[j])
		         {
		         t[k]=t1[i];
		         i++;
		         }

		        else
		         {
		         t[k]=t1[j];
		         j--;
		         }
		      }
		    compt++;
		    }		
		   public static void main(String[] args)
		   {   
		        int arr[] ={84, 12, 1, 5, 9, 8, 7};  
		        System.out.println("---Avant le tri a bulle---"); 
		        displayTab(arr);
		        tri_bulle(arr);
		        System.out.println("---Apres le tri a bulle---");  
		        displayTab(arr);
		      
		        int[] tab = {-4, 1, 13, 3, 9, 5, 21};   
		          System.out.println("**** Avant le tri par selection *****");
		          displayTab(arr);
		          tri_selection(tab);
		          System.out.println("**** Apres le tri par selection ****");  
		          displayTab(arr);
		          
		       
		          
                 int[] tab2 = {25, 1, 19, 13, 3, 9, 5, 21}; 				  
		          System.out.println("**** Avant le tri rapide *****");
		          displayTab(arr);
		          trierapide(tab2,0,9);
		          System.out.println("**** Apres le tri rapide ****"); 
		          displayTab(arr);
		          
		        
                   int[] tab3 = {25, 1, 19, 13, 3, 9, 5, 21}; 				  
		          System.out.println("**** Avant le tri par fusion *****");
		          displayTab(arr);
		          trifusion(0,9,tab3);
		          System.out.println("**** Apres le tri par fusion ****"); 
		          displayTab(arr);
		         
		   } 
		          
		   }
		

