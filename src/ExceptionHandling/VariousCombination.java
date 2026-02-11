package ExceptionHandling;

public class VariousCombination {

    public static void main(String[] args) {
        

    }
    

    /*
    1. try{} catch (X e) (valid)
    2.  (Invalid CE: )
    try{
    }catch(X e){
    }catch(X e){
    }

    3. try{ (valie)
    } catch(X e){
    }catch (Y e){
    }

    4. 

    try{
    }catch(X e) {}
    finaly{}

    5.  (valid)
    try{ }
    catch(X e) { }
    try{} catch (X e) { }

    6. (Valid)
    try{}
    finally {}

    7. try{} (Invalid: Either catch or finnally is required)

    8. catch() { } (Invalid)  CE: try is required

    9. finally {} (Invlaid: CE: try is required)

    10. 

    try{}
    finally {}

    catch(X e) { } (CE : catch without try)

    11. 
    try{} (CE: either catch or finnaly required)
    try{}
    catch(X e){}
    finally {}

    12. (Valid)
    try{}
    catch(X e){}
    catch(Y e) {}
    finally {}

    13.  (invalid : CE : finally without try)
    try{}
    catch(X e) {}
    finally {}
    finally {} (CE)

    14. 
    try{} (either catch or finally requiredd)
    sop("hello");
    catch(X e){
    } (catch without try)

    15. try{}
    catch(X e) {}
    sop("helo")
    catch(X e) {} (CE: catch without try)






    

    */
}
