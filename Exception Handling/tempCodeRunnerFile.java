  catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception occurs");
        }
        System.out.println("Rest of the code");
    }
}