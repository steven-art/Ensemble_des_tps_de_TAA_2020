 TP3 Partie 2. Spring AOP
====================================
 Objectif:
 Il faut mettre en place un systeme de logge grace a l'utilisation des annotation @Aspect.
 
-----------------------------------

Réalisation:
Mise en place d'une classe LogAspect qui est annotée @Aspect et @Component:
``` 
@Aspect
@Component
public class LogAspect {

	// creation de la methode appeler avant execution d'ajout d'un produit dans le panier
	
	@Before("execution(* sample..*Store.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());
        System.out.println("** ** ** ** ** ** ");
    }
	//s'exécute apres l'execution de la methode addItemToCart
	@AfterReturning("execution(* sample..*Client.*(..))") 
	public void logAfter (JoinPoint joinPoint) {

		System.out.println ("logAfter () est en cours d'exécution!");
		System.out.println ("piraté:" +joinPoint.getSignature().getName());
		System.out.println ("** ** ** ** ** ** ");

		}

	 @Around("execution(* sample..*Client.*(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

	    System.out.println("logAround() is running!");
	    System.out.println("hijacked method : " + joinPoint.getSignature().getName());
	    System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));

	    System.out.println("Around before is running!");
	    joinPoint.proceed();//continue on the intercepted method
	    System.out.println("Around after is running!");

	    System.out.println("** ** ** ** ** ** ");

	   }

}
```
Cette classe contien 3 methodes qui permettent de logger les methote executer par la classe Client, il aurait trés bien été possible de le faire sur l'appel des methode des interface ILane, IFastLane et IJusteHaveALook car elle sont a l'origine de l'execution des sénarios.

ce qui va apparaitre dans la console a l'execution est donc les log pour les methode executer de la classe client.
