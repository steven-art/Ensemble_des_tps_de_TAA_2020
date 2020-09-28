package sample.aop.aspetLog;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

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
	@AfterReturning("execution(* sample..*Store.*(..))") 
	public void logAfter (JoinPoint joinPoint) {

		System.out.println ("logAfter () est en cours d'exécution!");
		System.out.println ("piraté:" +joinPoint.getSignature().getName());
		System.out.println ("** ** ** ** ** ** ");

		}

	 @Around("execution(* sample..*Store.*(..))")
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

