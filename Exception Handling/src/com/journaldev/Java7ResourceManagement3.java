package com.journaldev;

public class Java7ResourceManagement3 {
	 public static void main(String[] args) throws Exception {
	        try {
	            tryWithResourceException();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            normalTryException();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	 
	    private static void normalTryException() throws Exception {
	        MyResource mr = null;
	        try {
	            mr = new MyResource();
	            System.out.println("MyResource created in try block 1");
	            if (true)
	                throw new Exception("Exception in try 1");
	        } finally {
	            if (mr != null)
	                mr.close();
	        }
	 
	    }
	 
	    private static void tryWithResourceException() throws Exception {
	        try (MyResource mr = new MyResource()) {
	            System.out.println("MyResource created in try-with-resources 2");
	            if (true)
	                throw new Exception("Exception in try 2");
	        }
	    }
	 
	    static class MyResource implements AutoCloseable {
	 
	        @Override
	        public void close() throws Exception {
	            System.out.println("Closing MyResource");
	            throw new Exception("Exception in Closing");
	        }
	 
	    }
}
