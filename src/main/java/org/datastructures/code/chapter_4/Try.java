package org.datastructures.code.chapter_4;

/**TRY MONAD*/

public  abstract class Try<E> {

    public abstract <R> Try<R> map(OneArgumentExpressionWithException<E, R> expression);

    public abstract <R> Try<R> flatMap(OneArgumentExpression<E, Try<R>> expression);

    public abstract E get();

    public abstract void forEach(OneArgumentStatement<E> statement);

    public abstract Try<E> processException(OneArgumentStatement<Exception> statement);

    public static <E> Try<E> of(NoArgumentExpressionWithException<E> expression){
        try{
            return new Success<>(expression.evaluate());
        }catch(Exception ex){
            return new Failure<>(ex);
        }
    }

    protected static class Success<E> extends Try<E> {
        protected E value;

        public Success(E value){
            this.value=value;
        }

        @Override
        public <R> Try<R> flatMap(OneArgumentExpression<E, Try<R>> expression){
            return expression.compute(value);
        }

        

        @Override
        public <R> Try<R> map(OneArgumentExpressionWithException<E, R> expression){
            try{
                return new Success<>(expression.compute(value));
            }catch(Exception ex){
                return new Failure<>(ex);
            }
        }
        
// The get() method returns the value as expected:
        @Override
        public E get(){
            return value;
        }

       @Override
       public void forEach(OneArgumentStatement <E> statement){
            statement.doSomething(value);
       } 

       @Override
       public Try<E> processException(OneArgumentStatement<Exception> statement){
            return this;
       }
    }

    protected static class Failure<E> extends Try<E> {
        protected Exception exception;

        public Failure(Exception exception){
            this.exception=exception;
        }

// Here, in both the flatMap() and map() methods, we just change the type of
// Failure, but return one with the same exception:
        @Override
        public <R> Try<R> flatMap(OneArgumentExpression<E, Try<R>> expression){
            return new Failure<>(exception);
        }

        @Override
        public <R> Try<R> map(OneArgumentExpressionWithException<E,R> expression){
            return new Failure<>(exception);
        }

        @Override
        public E get(){
            throw new NoValueException("get method invoked on Failure");
        }

        //It is a Failure:We don't do anything in the forEach() method because there is no value to be
// worked on, as follows:
        @Override
        public void forEach(OneArgumentStatement<E> statement){
            //.....
        }

//         The following method runs some code on the exception contained in the
// Failure instance:
        @Override
        public Try<E> processException(OneArgumentStatement<Exception> statement){
            statement.doSomething(exception);
            return this;
        }
    }
}
